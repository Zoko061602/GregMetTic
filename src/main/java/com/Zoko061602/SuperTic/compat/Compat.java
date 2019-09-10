package com.Zoko061602.SuperTic.compat;

import WayofTime.alchemicalWizardry.api.rituals.Rituals;
import com.Zoko061602.SuperTic.Config;
import net.minecraft.item.ItemStack;
import tconstruct.tools.TinkerTools;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class Compat {


    public static void bloody() {
        try {
            Rituals.registerRitual("SuperTiC_Modifier", 1, Config.BM_LP, new RitualTinkerer(), "Spell of the diligent Tinkerer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void thaumic() {
        Thaumcraft.registerRecipes();
        AspectList al = new AspectList().add(Aspect.TOOL, 20).add(Aspect.MAGIC, 20);
        new ResearchItem("TINKERSAUGUMENTATION", "ARTIFICE", al, 7, 6, 7, new ItemStack(TinkerTools.titleIcon, 1, 4099))
                .setPages(new ResearchPage("By using your infusion matrix you were able to add an additional modifier to your TConstruct Tools. Sadly the matrix is only capable of doing this once per tool."),
                        new ResearchPage(Thaumcraft.infusion))
                .setParents("RUNICAUGMENTATION")
                .setSpecial()
                .setHidden()
                .registerResearchItem();
    }

}
