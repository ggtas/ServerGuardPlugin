package org.flex.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import your.package.ServerGuardPlugin;

public class ReloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!sender.hasPermission("serverguard.reload")) {
            sender.sendMessage("No permission.");
            return true;
        }

        ServerGuardPlugin.getInstance().reloadConfig();
        sender.sendMessage("Config reloaded.");

        return true;
    }
}
