package org.flex;

import org.bukkit.plugin.java.JavaPlugin;

public final class ServerGuardPlugin extends JavaPlugin {

    private static ServerGuardPlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getCommand("sg").setExecutor(new your.package.commands.ReloadCommand());
        getServer().getPluginManager().registerEvents(new your.package.listeners.JoinListener(), this);

        getLogger().info("ServerGuardPlugin enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("ServerGuardPlugin disabled.");
    }

    public static ServerGuardPlugin getInstance() {
        return instance;
    }
}
