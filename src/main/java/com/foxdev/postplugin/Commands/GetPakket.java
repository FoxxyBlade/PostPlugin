package com.foxdev.postplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GetPakket implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        Player p = (Player) sender;

        ItemStack item = new ItemStack(Material.ENDER_PORTAL_FRAME);

        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GOLD + "PostNL" + ChatColor.BOLD + ChatColor.WHITE + "Pakket");

        ArrayList<String> lore = new ArrayList<String>();


        lore.add("");

                itemMeta.setLore(lore);

        item.setItemMeta(itemMeta);

        p.sendMessage(ChatColor.GOLD + "U heeft een pakketje gekregen!");


        p.getInventory().addItem(item);


        return false;
    }
}
