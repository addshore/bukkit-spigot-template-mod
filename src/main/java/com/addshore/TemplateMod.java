package com.addshore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class TemplateMod extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("TemplateMod has been enabled! :)");
    }

    @Override
    public void onDisable() {
        getLogger().info("TemplateMod has been disabled! :(");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("testcommand")) {
            getLogger().info("Test command run! :D");
            return true;
        }
        return false;
    }

}
