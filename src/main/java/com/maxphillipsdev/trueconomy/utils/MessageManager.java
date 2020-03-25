package com.maxphillipsdev.trueconomy.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

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
	public static void playerBad(String s)
	{
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + s);
	}

	/**
	 * Happy console message
	 * @param s
	 */
	public static void playerGood(Player p, String s)
	{
		p.sendMessage(ChatColor.GREEN + "[Trueconomy] " + s);
	}

	/**
	 * Ambivalent console message
	 * @param s
	 */
	public static void playerWarn(Player p, String s)
	{
		p.sendMessage(ChatColor.YELLOW + "[Trueconomy] " + s);
	}

	/**
	 * Unhappy console message
	 * @param s
	 */
	public static void playerBad(Player p, String s)
	{
		p.sendMessage(ChatColor.RED + "[Trueconomy] " + s);
	}
}
