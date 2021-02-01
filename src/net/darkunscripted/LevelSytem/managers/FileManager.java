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
    public FileConfiguration arenascfg;
    public File arenasfile;

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

    public void setupArenas(){
        if(!plugin.getDataFolder().exists()){
            plugin.getDataFolder().mkdir();
        }

        arenasfile = new File(plugin.getDataFolder(), "arenas.yml");

        if(!arenasfile.exists()){
            try{
                arenasfile.createNewFile();
            }catch (IOException e){
                Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&cCould not create arenas.yml file!"));
            }
        }

        arenascfg = YamlConfiguration.loadConfiguration(arenasfile);
        Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&aArenas.yml file has been created!!"));
    }

    public FileConfiguration getArenas(){
        return arenascfg;
    }

    public void saveArenas(){
        try{
            arenascfg.save(arenasfile);
            Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&aArenas.yml has been saved"));
        }catch (IOException e){
            Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&cCould not save the arenas.yml file"));
        }
    }

    public void reloadArenas(){
        arenascfg = YamlConfiguration.loadConfiguration(arenasfile);
        Bukkit.getServer().getConsoleSender().sendMessage(Utils.chat("&aArenas.yml has been reloaded"));
    }

}
