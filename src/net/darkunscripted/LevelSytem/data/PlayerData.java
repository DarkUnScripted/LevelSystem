package net.darkunscripted.LevelSytem.data;

import net.darkunscripted.LevelSytem.domain.Pass;
import net.darkunscripted.LevelSytem.domain.PlayerProfile;

import java.util.HashMap;
import java.util.UUID;

public class PlayerData {

    public static HashMap<UUID, PlayerProfile> playerData = new HashMap<UUID, PlayerProfile>();
    public static HashMap<UUID, Pass> playerPass = new HashMap<UUID, Pass>();

}
