package net.darkunscripted.LevelSytem.domain;

import java.util.UUID;

public class PlayerProfile {

    private final UUID player;
    private int level;
    private int exp;

    public PlayerProfile(UUID player){
        this.player = player;
        this.level = 0;
        this.exp = 0;
    }

    public UUID getPlayer() {
        return player;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

}
