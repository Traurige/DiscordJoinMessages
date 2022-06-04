package auraoflove.discordjoinmessages;

import auraoflove.discordjoinmessages.listeners.PlayerJoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordJoinMessages extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }
}
