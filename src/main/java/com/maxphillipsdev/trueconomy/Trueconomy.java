package com.maxphillipsdev.trueconomy;

import com.maxphillipsdev.trueconomy.utils.MessageManager;
import com.maxphillipsdev.trueconomy.utils.MongoConnect;
import org.bukkit.plugin.java.JavaPlugin;

public final class Trueconomy extends JavaPlugin
{
	private static Trueconomy plugin;
	public MongoConnect mongoConnect;

	@Override
	public void onEnable()
	{
		// I used a singleton and I'm not proud of it.
		plugin = this;
		instanceClasses();
		MessageManager.consoleGood("Trueconomy enabled!");
	}

	private void instanceClasses()
	{
		mongoConnect = new MongoConnect();
	}

	public static Trueconomy getPlugin() { return plugin; }

	@Override
	public void onDisable()
	{
		// Plugin shutdown logic
	}
}