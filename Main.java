package me.Quan.Combat_system;

import org.bukkit.plugin.java.JavaPlugin;
import me.Quan.Combat_system.commands.Combat_commands;

public class Main extends JavaPlugin {
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	new Combat_commands(this);
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}