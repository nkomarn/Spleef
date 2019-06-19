package fr.naruse.spleef.v1_13.api.event.cancellable.game;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;

public class SpleefDisablingEvent extends SpleefCancellableEvent {
    public SpleefDisablingEvent(SpleefPluginV1_13 pl, String eventName) {
        super(pl, eventName);
    }

    @SpleefCancellable
    public static class Pre extends SpleefDisablingEvent {
        public Pre(SpleefPluginV1_13 pl) {
            super(pl, "SpleefDisablingEvent.Pre");
        }
    }

    public static class Post extends SpleefDisablingEvent {
        public Post(SpleefPluginV1_13 pl) {
            super(pl, "SpleefDisablingEvent.Post");
        }
    }
}
