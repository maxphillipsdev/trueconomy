package com.maxphillipsdev.trueconomy.bank;

import org.bukkit.entity.Player;

import java.util.ArrayList;

/**
 * Represents a single bank account.
 */
public class Account
{
	private ArrayList<Player> holders;

	private double balance = 0;

	public Account(ArrayList<Player> holders)
	{
		this.holders = holders;
	}

	/**
	 * Get the balance of the account.
	 * Note: Use the Transaction class instead of this where possible.
	 * @return
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * Set the balance of the account.
	 * Note: Use the Transaction class instead of this where possible.
	 */
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public void performTransaction()
	{

	}
}
