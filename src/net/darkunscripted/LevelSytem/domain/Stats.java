package net.darkunscripted.LevelSytem.domain;

import java.util.UUID;

public class Stats {

    private final UUID player;
    private int kills;
    private int deaths;
    private int blocksbroken;
    private int blockswalked;

    public Stats(UUID player){
        this.player = player;
        this.kills = 0;
        this.deaths = 0;
        this.blocksbroken = 0;
        this.blockswalked = 0;
    }

    public UUID getPlayer() {
        return player;
    }

    public int getBlocksbroken() {
        return blocksbroken;
    }

    public int getBlockswalked() {
        return blockswalked;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getKills() {
        return kills;
    }

    public void setBlocksbroken(int blocksbroken) {
        this.blocksbroken = blocksbroken;
    }

    public void setBlockswalked(int blockswalked) {
        this.blockswalked = blockswalked;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }
}


