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

    public enum WeightClass {
        UNRANKED,
        RANKED
    }

    /**
     * Get the player's division
     * @param player The player
     * @param divisionName Short or Full name of the division
     * @return The player's division
     */
    public abstract String getPlayerDivision(Player player, DivisionName divisionName);

    /**
     * Get the amount of unranked matches left for the player
     * @param player The player
     * @return The amount of unranked matches left
     */
    public abstract int getPlayerUnRankedLeft(Player player);

    /**
     * Get the amount of ranked matches left for the player
     * @param player The player
     * @return The amount of ranked matches left
     */
    public abstract int getPlayerRankedLeft(Player player);

    /**
     * Reset the player's unranked matches
     * @param player The player
     */
    public abstract void resetPlayerUnRanked(Player player);

    /**
     * Reset the player's ranked matches
     * @param player The player
     */
    public abstract void resetPlayerRanked(Player player);

    /**
     * Add unranked matches to the player
     * @param player The player
     * @param amount The amount of unranked matches to add
     */
    public abstract void addPlayerUnRanked(Player player, int amount);

    /**
     * Add ranked matches to the player
     * @param player The player
     * @param amount The amount of ranked matches to add
     */
    public abstract void addPlayerRanked(Player player, int amount);

    /**
     * End the match for the player
     * @param player The player
     * @param endMessage The message to send to the match
     */
    public abstract void endMatch(Player player, String endMessage);

    /**
     * Get the player's elo for a specific ladder
     * @param player The player
     * @param ladder The ladder
     * @return The player's elo
     */
    public abstract int getElo(Player player, String ladder);

    /**
     * Get the player's experience points
     * @param player The player
     * @return The player's experience
     */
    public abstract int getExperience(Player player);

    /**
     * Get the player's wins for a specific ladder
     * @param player The player
     * @param ladder The ladder's name
     * @return The player's wins
     */
    public abstract int getLadderWins(Player player, String ladder);

    /**
     * Get the player's losses for a specific ladder
     * @param player The player
     * @param ladder The ladder's name
     * @return The player's losses
     */
    public abstract int getLadderLosses(Player player, String ladder);

    /**
     * Get the player's wins for a specific weight class
     * @param player The player
     * @param weightClass The weight class
     * @return The player's wins
     */
    public abstract int getWins(Player player, WeightClass weightClass);

    /**
     * Get the player's losses for a specific weight class
     * @param player The player
     * @param weightClass The weight class
     * @return The player's losses
     */
    public abstract int getLosses(Player player, WeightClass weightClass);

    /**
     * Get the player's global wins
     * @param player The player
     * @return The player's global wins (unranked + ranked)
     */
    public abstract int getGlobalWins(Player player);

}
