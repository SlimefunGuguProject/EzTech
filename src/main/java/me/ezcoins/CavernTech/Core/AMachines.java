package me.ezcoins.CavernTech.Core;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemState;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ItemStackWrapper;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AMachines extends SlimefunItem implements EnergyNetComponent {

    public static Map<Block, MachineRecipe> processing = new HashMap<>();
    public static Map<Block, Integer> progress = new HashMap<>();
    
    protected final List<MachineRecipe> recipes = new ArrayList<>();

    private int energyConsumedPerTick = -1;
    private int energyCapacity = -1;
    private int processingSpeed = -1;

    private static final int[] BORDER = new int[] {0,1,7,8,
            9,10,16,17,
            18,19,25,26,
            27,28,29,33,34,35,
            36,37,38,42,43,44,
            45,46,47,51,52,53};
    private static final int[] BORDER_IN = new int[] {
            2,3,4,5,6,
            11,     15,
            20,21,23,24};
    private static final int[] BORDER_OUT = new int[] {
            30,31,32,
            39,41,
            48,49,50};
    private static final int PROGRESS_BAR_SLOT = 22;

    private static final int[] INPUT_SLOTS = new int[] {12,13,14};
    private static final int[] OUTPUT_SLOTS = new int[] {40};

    @ParametersAreNonnullByDefault
    public AMachines(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        if (isGraphical()) {
            new BlockMenuPreset(getMachineIdentifier(), getInventoryTitle()) {

                @Override
                public void init() {
                    constructMenu(this);
                }
    
                @Override
                public void newInstance(BlockMenu menu, Block b) {
                        newMachineInstance(menu, b);
    
                }
    
                @Override
                public boolean canOpen(Block b, Player p) {
                    return p.hasPermission("slimefun.inventory.bypass") ||
                            Slimefun.getProtectionManager().hasPermission(p, b.getLocation(), Interaction.INTERACT_BLOCK);
                }
    
                @Override
                public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                    return new int[0];
                }
    
                @Override
                public int[] getSlotsAccessedByItemTransport(DirtyChestMenu menu, ItemTransportFlow flow, ItemStack item) {
                    if (flow == ItemTransportFlow.INSERT) {
                        return getInputSlots();
                    } else {
                        return getOutputSlots();
                    }
                }
    
            };
        }
        
        addItemHandler(onBreak());
    
    }

    private BlockBreakHandler onBreak() {
        return new SimpleBlockBreakHandler() {

            @Override
            public void onBlockBreak(Block b) {
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
    
                }
    
                processing.remove(b);
                progress.remove(b);
                blockExtras(b);
            }
            
        };
    }
    
    public void blockExtras(Block b) { }

    public void newMachineInstance(BlockMenu menu, Block b) { }

    @ParametersAreNonnullByDefault
    public AMachines(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, ItemStack recipeOutput) {
        super(itemGroup, item, recipeType, recipe);
        this.recipeOutput = recipeOutput;
    }

    public void constructMenu(BlockMenuPreset preset) {
        List<int[]> borders = getBorders();
        
        preset.drawBackground(borders.get(0));
        preset.drawBackground(ChestMenuUtils.getInputSlotTexture(), borders.get(1));
        preset.drawBackground(ChestMenuUtils.getOutputSlotTexture(), borders.get(2));
        
        preset.addItem(getProgressBarSlot(), new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "));
        preset.addMenuClickHandler(getProgressBarSlot(), ChestMenuUtils.getEmptyClickHandler());   
    }

    public boolean isGraphical() {
        return true;
    }

    public List<int[]> getBorders() {
        List<int[]> borders = new ArrayList<>();
        borders.add(BORDER); //BORDER
        borders.add(BORDER_IN); //BORDER_IN
        borders.add(BORDER_OUT); //BORDER_OUT

        return borders;
    }

    public int getProgressBarSlot() {
        return PROGRESS_BAR_SLOT;
    }


    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {

            @Override
            public void tick(Block b, SlimefunItem  sfItem, Config data) {
                AMachines.this.tick(b);
            }

            @Override
            public boolean isSynchronized() {
                return false;
            }
        });
    }

    //Processing Stuff
    public MachineRecipe getProcessing(Block b) {
        return processing.get(b);
    }

    public boolean isProcessing(Block b) {
        return processing.get(b) != null;
    }

    protected void tick(Block b) {
        if (getCharge(b.getLocation()) < getEnergyConsumption()) {
            return;
        }
        BlockMenu inv = BlockStorage.getInventory(b);

        if (isProcessing(b)) {
            int timeLeft = progress.get(b);

            if (timeLeft > 0) {
                //dont check if it extends ChestMenu since it already does.
                ChestMenuUtils.updateProgressbar(inv, getProgressBarSlot(), timeLeft, processing.get(b).getTicks(), getProgressBar());

                if (isChargeable()) {
                    if (getCharge(b.getLocation()) < getEnergyConsumption()) {
                        return;
                    }

                    removeCharge(b.getLocation(), getEnergyConsumption());
                }

                progress.put(b, timeLeft - 1);

            } else {
                inv.replaceExistingItem(getProgressBarSlot(),new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "));

                for (ItemStack output : processing.get(b).getOutput()) {
                    inv.pushItem(output.clone(), getOutputSlots());
                }

                processing.remove(b);
                progress.remove(b);

            }
        } else {
            MachineRecipe next = findNextRecipe(inv);

            if (next != null) {
                processing.put(b, next);
                progress.put(b, next.getTicks());
            }
        }
    }

    public MachineRecipe findNextRecipe(BlockMenu inv) {
        Map<Integer, ItemStack> inventory = new HashMap<>();

        for (int slot : getInputSlots()) {
            ItemStack item = inv.getItemInSlot(slot);

            if (item != null) {
                inventory.put(slot, ItemStackWrapper.wrap(item));
            }
        }

        Map<Integer, Integer> found = new HashMap<>();

        for (MachineRecipe recipe : recipes) {
            for (ItemStack input : recipe.getInput()) {
                for (int slot : getInputSlots()) {
                    if (SlimefunUtils.isItemSimilar(inventory.get(slot), input, true)) {
                        found.put(slot, input.getAmount());
                        break;
                    }
                }
            }

            if (found.size() == recipe.getInput().length) {
                if (!InvUtils.fitAll(inv.toInventory(), recipe.getOutput(), getOutputSlots())) {
                    return null;
                }

                if (isInputConsumed()) {
                    for (Map.Entry<Integer, Integer> entry : found.entrySet()) {
                        inv.consumeItem(entry.getKey(), entry.getValue());
                    }
                }

                return recipe;
            } else {
                found.clear();
            }
        }
        return null;
    }

    public boolean isInputConsumed() {
        return true;
    }

    //Recipe Related Shenanigans
    protected void registerDefaultRecipes() {}

    public List<MachineRecipe> getMachineRecipes() {
        return recipes;
    }

    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>();

        for (MachineRecipe recipe : recipes) {
            if (recipe.getInput().length != 1 ) {
                continue;
            }

            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[0]);

        }

        return displayRecipes;
    }

    public void registerRecipe(MachineRecipe recipe) {
        recipe.setTicks(recipe.getTicks() / this.getSpeed());
        recipes.add(recipe);
    }

    public void registerRecipe(int seconds, ItemStack[] input, ItemStack[] output) {
        registerRecipe(new MachineRecipe(seconds, input, output));
    }

    public void registerRecipe(int seconds, ItemStack input, ItemStack output) {
        registerRecipe(new MachineRecipe(seconds, new ItemStack[] {input}, new ItemStack[] {output}));
    }

    //Generic Getters
    public String getInventoryTitle() {
        return getItemName();
    }

    public abstract String getMachineIdentifier();

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    public abstract ItemStack getProgressBar();

    public int[] getInputSlots() {
        return INPUT_SLOTS;
    }

    public int[] getOutputSlots() {
        return OUTPUT_SLOTS;
    }


    //Registry Stuff.
    public int getCapacity() {
        return energyCapacity;
    }

    public int getEnergyConsumption() {
        return energyConsumedPerTick;
    }

    public int getSpeed() {
        return this.processingSpeed;
    }

    public final AMachines setEnergyCapacity(int capacity) {
        Validate.isTrue(capacity > 0, "Energy capacity must be greater then 0");

        if(getState() == ItemState.UNREGISTERED) {
            this.energyCapacity = capacity;
            return this;
        } else {
            throw new IllegalStateException("You cannot modify already registered items.");
        }

    }

    public final AMachines setEnergyConsumption(int energyConsumption) {
        Validate.isTrue(energyConsumption > 0, "Energy consumption must be greater then 0");
        Validate.isTrue(energyCapacity > 0, "Energy capacity must be specified before energy consumption");
        Validate.isTrue(energyConsumption <= energyCapacity, "Energy consumption can not be greater the energy capacity.");

        this.energyConsumedPerTick = energyConsumption;
        return this;

    }

    public final AMachines setProcessingSpeed(int processingSpeed) {
        Validate.isTrue(processingSpeed > 0, "Processing speed must be greater then 0");

        this.processingSpeed = processingSpeed;
        return this;

    }

    @Override
    public void register(@Nonnull SlimefunAddon slimefunAddon) {
        this.addon = slimefunAddon;

        if (getCapacity() <= 0) {
            warn("The capacity has not been configured correctly. The Item was disabled.");
            warn("Make sure to call '" + getClass().getSimpleName() + "#setEnergyCapacity(...)' before registering!");
        }

        if (getEnergyConsumption() <= 0) {
            warn("The energy consumption has not been configured correctly. The Item was disabled.");
            warn("Make sure to call '" + getClass().getSimpleName() + "#setEnergyConsumption(...)' before registering!");
        }

        if (getSpeed() <= 0) {
            warn("The processing speed has not been configured correctly. The Item was disabled.");
            warn("Make sure to call '" + getClass().getSimpleName() + "#setProcessingSpeed(...)' before registering!");
        }

        registerDefaultRecipes();

        if (getCapacity() > 0 && getEnergyConsumption() > 0 && getSpeed() > 0) {
            super.register(addon);
        }

    }
}