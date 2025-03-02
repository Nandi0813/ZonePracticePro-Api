package dev.nandi0813.api.Event;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class NewPlayerJoin extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;

    public NewPlayerJoin(Player player) {
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}