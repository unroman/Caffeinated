package com.chikoritalover.caffeinated.registry;

import com.chikoritalover.caffeinated.Caffeinated;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSoundEvents {
    public static final SoundEvent ITEM_COFFEE_BOTTLE_DRINK = register("item.coffee_bottle.drink");

    private static SoundEvent register(String id) {
        return Registry.register(Registry.SOUND_EVENT, new Identifier(Caffeinated.MODID, id), new SoundEvent(new Identifier(Caffeinated.MODID, id)));
    }

    public static void register() {}
}
