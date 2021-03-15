package me.rigamortis.seppuku.api.event.world;

import me.rigamortis.seppuku.api.event.EventCancellable;
import net.minecraft.entity.Entity;

/**
 * Author Seth
 * 11/10/2019 @ 3:30 PM.
 */
public class EventAddEntity extends EventCancellable {

    private Entity entity;

    public EventAddEntity(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
