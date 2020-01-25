package net.imyeyu.imchp;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.imyeyu.imchp.listener.LevelListener;

public class IMCHP extends JavaPlugin {
	
	public static Logger log;

	public void onEnable() {
		log = getLogger();
		Bukkit.getPluginManager().registerEvents(new LevelListener(), this);
	}
}