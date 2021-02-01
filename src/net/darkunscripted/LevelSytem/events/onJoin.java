package net.darkunscripted.LevelSytem.events;

import net.darkunscripted.LevelSytem.Main;
import net.darkunscripted.LevelSytem.data.PlayerData;
import net.darkunscripted.LevelSytem.domain.PlayerProfile;
import net.darkunscripted.LevelSytem.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.IOException;

public class onJoin implements Listener {

    Main plugin = Main.getPlugin(Main.class);

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        if(!PlayerData.playerData.containsKey(player.getUniqueId())){
            PlayerProfile profile = new PlayerProfile(player.getUniqueId());
            PlayerData.playerData.put(player.getUniqueId(), profile);
            try{
                plugin.getManager().playerscfg.set("players." + player.getUniqueId() + ".name", player.getName());
                plugin.getManager().playerscfg.set("players." + player.getUniqueId() + ".level", profile.getLevel());
                plugin.getManager().playerscfg.set("players." + player.getUniqueId() + ".exp", profile.getExp());
                plugin.getManager().playerscfg.save(plugin.getManager().playersfile);
            }catch (IOException exception){
                plugin.getServer().getConsoleSender().sendMessage(Utils.chat("&c[ERROR] Could not save player profile to file!"));
            }
        }
    }

}
