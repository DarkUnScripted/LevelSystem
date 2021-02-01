package net.darkunscripted.LevelSytem;

import net.darkunscripted.LevelSytem.managers.FileManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private FileManager cfgm;

    @Override
    public void onEnable() {
        loadConfigManager();
        registerCommands();
        registerEvents();
        registerManagers();
        loadConfig();
    }

    @Override
    public void onDisable() {

    }

    public void registerCommands(){

    }

    public void registerEvents(){

    }

    public void registerManagers(){

    }

    public void loadConfigManager(){
        cfgm = new FileManager();
        cfgm.setupPlayers();
        cfgm.savePlayers();
        cfgm.reloadPlayers();
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public FileManager getManager(){
        return cfgm;
    }

}
