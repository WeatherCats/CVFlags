package org.cubeville.cvflags;

import com.sk89q.worldguard.protection.flags.StateFlag;
import com.sk89q.worldguard.protection.flags.StringFlag;

public final class Flags {
        public final static StateFlag DROPPER = new StateFlag("dropper", false);
        public final static StateFlag ELYTRA_PVP = new StateFlag("elytra-pvp", false);
        public final static StateFlag LOCAL_DEATH_MESSAGE = new StateFlag("local-death-message", false);
        public final static StateFlag ENDER_CHEST = new StateFlag("ender-chest", true);
        public final static StringFlag PLAYER_CHECK = new StringFlag("pcheck");
        public final static StateFlag EXPLOSION_DAMAGE = new StateFlag("explosion-damage", true);
        public final static StateFlag ABNORMAL_ENTITY_RIDE = new StateFlag("abnormal-entity-ride", false);
        public final static StateFlag SPAWN_EGGS = new StateFlag("spawn-eggs", false);
        public final static StateFlag NATURAL_SPAWNING = new StateFlag("natural-spawning", true);
        public final static StateFlag ICE_LIQUIFY = new StateFlag("ice-liquify", true);
//        public final static StateFlag HARVEST_HIVE = new StateFlag("harvest-hive", false);
}
