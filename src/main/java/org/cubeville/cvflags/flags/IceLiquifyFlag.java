package org.cubeville.cvflags.flags;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.cubeville.cvflags.CVFlags;
import org.cubeville.cvflags.Flags;

public class IceLiquifyFlag implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (!event.getBlock().getType().equals(Material.ICE)) return;
        if (CVFlags.isFlagTrue(Flags.ICE_LIQUIFY, event.getBlock().getLocation())) return;
        event.getBlock().setType(Material.AIR);
    }
}
