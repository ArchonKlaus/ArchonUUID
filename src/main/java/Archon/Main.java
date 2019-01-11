package Archon;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.Server;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.player.PlayerMoveEvent;

import java.text.DecimalFormat;


public class Main extends PluginBase implements Listener{

    @Override
    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("ArchonUUID Enabled");
        this.saveDefaultConfig();

    }

    @Override
    public void onDisable(){
        getLogger().info("ArchonUUID Disabilited");
    }

    Server server = this.getServer();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String uuid = player.getUniqueId().toString();
        player.sendMessage(TextFormat.AQUA + "Your UUID: ".concat(uuid));
    }

}
