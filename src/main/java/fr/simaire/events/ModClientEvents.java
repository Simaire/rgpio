package fr.simaire.events;


import fr.simaire.rgpio.Rgpio;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.UUID;
import java.io.*;
import java.net.*;

@Mod.EventBusSubscriber(modid = Rgpio.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void dommage(LivingDamageEvent event) {

        //LivingEntity player = event.getEntityLiving();

        //Rgpio.LOGGER.info("ACCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCIYON OK");

        fr.simaire.rgpio.send.led();



    }

    @SubscribeEvent
    public  static void jump(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();

        if (player.getMainHandItem().getItem() == Items.STICK) {
            fr.simaire.rgpio.send.song();
        }

    }



}
