package com.maxphillipsdev.trueconomy.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class MessageManager
{
	/**
	 * Happy console message
	 * @param s
	 */
	public static void consoleGood(String s)
	{
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + s);
	}

	/**
	 * Ambivalent console message
	 * @param s
	 */
	public static void consoleWarn(String s)
	{
		Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + s);
	}

	/**
	 * Unhappy console message
	 * @param s
	 */
	public static void consoleBad(String s)
	{
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + s);
	}
}
