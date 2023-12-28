package org.cubeville.cvflags.flags;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.cubeville.cvflags.CVFlags;
import org.cubeville.cvflags.Flags;

public class NaturalSpawningFlag implements Listener {

    @EventHandler
    public void onEntitySpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason() != CreatureSpawnEvent.SpawnReason.NATURAL) return;
        if (CVFlags.isFlagTrue(Flags.NATURAL_SPAWNING, event.getLocation())) return;
        event.setCancelled(true);
    }
}
