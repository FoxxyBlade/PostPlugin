package com.foxdev.postplugin;

import com.foxdev.postplugin.Commands.GetPakket;
import com.foxdev.postplugin.Interaction.Pakket;
import org.bukkit.plugin.java.JavaPlugin;

public final class PostPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("krijgpakket").setExecutor(new GetPakket());

        getServer().getPluginManager().registerEvents(new Pakket(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
