package dev.nandi0813;

import org.bukkit.entity.Player;

public abstract class ZonePracticeApi
{

    public static ZonePracticeApi instance = null;

    public static ZonePracticeApi getInstance() {
        return instance;
    }

    public enum DivisionName {
        SHORT,
        FULL
    }

    public abstract String getPlayerDivision(Player player, DivisionName divisionName);

    public abstract int getPlayerUnRankedLeft(Player player);

    public abstract int getPlayerRankedLeft(Player player);

    public abstract void resetPlayerUnRanked(Player player);

    public abstract void resetPlayerRanked(Player player);

    public abstract void addPlayerUnRanked(Player player, int amount);

    public abstract void addPlayerRanked(Player player, int amount);

    public abstract void endMatch(Player player, String endMessage);

}
