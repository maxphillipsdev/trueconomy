package com.maxphillipsdev.trueconomy;

import org.bukkit.plugin.java.JavaPlugin;

public final class Trueconomy extends JavaPlugin
{
	private static Trueconomy plugin;

	@Override
	public void onEnable()
	{
		// I used a singleton and I'm not proud of it.
		plugin = this;
		instanceClasses();
	}

	private void instanceClasses()
	{
	}

	public static Trueconomy getPlugin() { return plugin; }

	@Override
	public void onDisable()
	{
		// Plugin shutdown logic
	}
}