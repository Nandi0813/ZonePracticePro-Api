package dev.nandi0813.api.Event.Spectate.End;

import dev.nandi0813.api.Interface.Event;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

@Getter
public class EventSpectateEndEvent extends SpectateEndEvent {

    private static final HandlerList handlers = new HandlerList();

    private final Event event;

    public EventSpectateEndEvent(Player player, Event event) {
        super(player, event);
        this.event = event;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}