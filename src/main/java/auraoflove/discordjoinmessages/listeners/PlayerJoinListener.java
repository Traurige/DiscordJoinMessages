package auraoflove.discordjoinmessages.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    private final String[] messages = {
            "{Player} is here.",
            "{Player} hopped into the server.",
            "Glad you're here, {Player}.",
            "Everyone welcome {Player}!",
            "{Player} just slid into the server.",
            "Welcome {Player}. Say hi!",
            "{Player} just landed.",
            "A wild {Player} appeared.",
            "Yay you made it, {Player}!",
            "{Player} joined the party.",
            "Welcome {Player}. We hope you've brought pizza.",
            "Good to see you, {Player}.",
            "{Player} just showed up!",
    };

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String message = messages[(int)(Math.random() * messages.length)].replace("{Player}", event.getPlayer().getName());
        event.setJoinMessage(message);
    }
}
