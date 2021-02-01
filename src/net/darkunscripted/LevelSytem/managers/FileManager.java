package net.darkunscripted.LevelSytem.managers;

import net.darkunscripted.LevelSytem.Main;
import net.darkunscripted.LevelSytem.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FileManager {

    private Main plugin = Main.getPlugin(Main.class);

    //Files & File Configs

    public FileConfiguration playerscfg;
    public File playersfile;

    //--------------------

    public void setupPlayers(){
        if(!plugin.getDataFolder().exists()){
            plugin.getDataFolder().mkdir();
        }

        playersfile = new File(plugin.getDataFolder(), "players.yml");

        if(!playersfile.exists()){
            try{
                playersfile.createNewFile();
            }catch (IOException e){
                Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&cCould not create players.yml file!"));
            }
        }

        playerscfg = YamlConfiguration.loadConfiguration(playersfile);
        Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&aplayers.yml file has been created!!"));
    }

    public FileConfiguration getPlayers(){
        return playerscfg;
    }

    public void savePlayers(){
        try{
            playerscfg.save(playersfile);
            Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&aplayers.yml has been saved"));
        }catch (IOException e){
            Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&cCould not save the players.yml file"));
        }
    }

    public void reloadPlayers(){
        playerscfg = YamlConfiguration.loadConfiguration(playersfile);
        Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&aplayers.yml has been reloaded"));
    }

}
