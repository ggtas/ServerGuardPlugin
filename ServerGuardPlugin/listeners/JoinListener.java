package your.package.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;
import your.package.ServerGuardPlugin;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        String msg = ServerGuardPlugin.getInstance()
                .getConfig()
                .getString("join-message", "Welcome!");

        event.setJoinMessage(msg.replace("{player}", player.getName()));
    }
}
