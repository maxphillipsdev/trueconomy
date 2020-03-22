package com.maxphillipsdev.trueconomy.guis;

import com.sun.istack.internal.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class TradeProposalInventory implements InventoryHolder, Listener
{

	private Inventory inv;
	Player sender;
	Player reciever;

	public TradeProposalInventory(Player s, Player r)
	{
		//
		inv = Bukkit.createInventory(this, 9, ChatColor.translateAlternateColorCodes('&',
				"Trade from "+sender.getDisplayName()));
	}

	/**
	 * Get the trade's inventory.
	 *
	 * @return The inventory.
	 */
	@NotNull
	@Override
	public Inventory getInventory()
	{
		return inv;
	}

	/**
	 * Handle clicks inside the trade GUI
	 * @param e
	 */
	@EventHandler
	public void onPlayerClickInventory(InventoryClickEvent e)
	{

	}
}
