package net.customjoin;

import net.redstonelamp.Server;
import net.redstonelamp.plugin.java.JavaPlugin;
import net.redstonelamp.ui.Logger;
import net.redstonelamp.event.player.PlayerLoginEvent;

public class Main extends JavaPlugin {
	public Main(Server server, Logger logger, String name, String version, String[] authors, String website) {
		super(server, logger, name, version, authors, website);
	}
	
	@Override
	public void onEnable() {
		this.getLogger().info("SimplePlugin has been enabled!");
	}
	
	@Override
	public void onDisable() {
		this.getLogger().info("SimplePlugin is no longer enabled! Did the server stop?");
	}
	
	public void onPlayerLogin(PlayerLoginEvent player){
	player.sendPopup("HOI");
	
}
}
