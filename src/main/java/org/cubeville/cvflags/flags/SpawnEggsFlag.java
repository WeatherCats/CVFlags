package org.cubeville.cvflags.flags;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.cubeville.cvflags.CVFlags;
import org.cubeville.cvflags.Flags;

public class SpawnEggsFlag implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason() != CreatureSpawnEvent.SpawnReason.SPAWNER_EGG && event.getSpawnReason() != CreatureSpawnEvent.SpawnReason.DISPENSE_EGG)  return;
        if (!CVFlags.isFlagTrue(Flags.SPAWN_EGGS, event.getLocation()) || !event.isCancelled()) return;
        event.setCancelled(false);
    }
}
