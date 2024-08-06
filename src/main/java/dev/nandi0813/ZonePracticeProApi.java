package dev.nandi0813;

import org.bukkit.entity.Player;

public interface ZonePracticeProApi
{

    enum DivisionName {
        SHORT,
        FULL
    }

    String getPlayerDivision(Player player, DivisionName divisionName);

    int getPlayerUnRankedLeft(Player player);

    int getPlayerRankedLeft(Player player);

    void resetPlayerUnRanked(Player player);

    void resetPlayerRanked(Player player);

    void addPlayerRanked(Player player, int amount);

    void endMatch(Player player, String endMessage);

}
