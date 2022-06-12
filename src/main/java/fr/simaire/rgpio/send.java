package fr.simaire.rgpio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import fr.simaire.rgpio.Rgpio;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
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


public class send {

    @SubscribeEvent
    public static void led() {


        //Rgpio.LOGGER.info("ACCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCIYON OK");



        final String serverHost = "192.168.1.40";

        Socket socketOfClient = null;
        BufferedWriter os = null;

        try {
            socketOfClient = new Socket(serverHost, 5566);
            os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));


        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " + serverHost);
            return;
        }

        try {

            os.write("led");

            os.close();
            socketOfClient.close();

        } catch (IOException e) {
            System.err.println("IOException:  " + e);
        }



    }

    public static void song() {


        //Rgpio.LOGGER.info("ACCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCIYON OK");



        final String serverHost = "192.168.1.40";

        Socket socketOfClient = null;
        BufferedWriter os = null;

        try {
            socketOfClient = new Socket(serverHost, 5566);
            os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));


        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " + serverHost);
            return;
        }

        try {

            os.write("song");

            os.close();
            socketOfClient.close();

        } catch (IOException e) {
            System.err.println("IOException:  " + e);
        }


    }

}
