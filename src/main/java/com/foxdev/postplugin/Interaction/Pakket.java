package com.foxdev.postplugin.Interaction;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Pakket implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {

        Player p = e.getPlayer();

        if (p.getInventory().getItemInMainHand().getType().equals(Material.ENDER_PORTAL_FRAME)) {
            if (e.getClickedBlock().getType() == Material.HOPPER) {
                if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                    p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
                    p.sendMessage(ChatColor.GOLD + "U heeft een pakketje afgeleverd");


                }


            }
        }
    }
}
