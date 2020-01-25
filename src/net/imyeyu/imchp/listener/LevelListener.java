package net.imyeyu.imchp.listener;

import org.bukkit.Particle;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

import net.imyeyu.imchp.IMCHP;

public class LevelListener implements Listener {
	
	@EventHandler
	public void onPlayerExpChangeEvent(PlayerLevelChangeEvent event){
		int level = event.getNewLevel();
		if (level % 5 == 0) {
			Player player = event.getPlayer();
			AttributeInstance ai = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
			ai.setBaseValue(20 + event.getNewLevel() / 2);
			player.sendMessage("[ IMCHP ] 升级! 最大生命值 : " + ai.getValue());
			player.spawnParticle(Particle.HEART, player.getLocation(), 20);
			
			IMCHP.log.info("[IMCHP] Player " + player.getName() + " HP changed to " + ai.getValue());
		}
	}
}