package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;

/**
 * @author yetanotherx
 */
public class FurnaceBurnEvent extends BlockEvent implements Cancellable {

    private int burnedItemId;
    private boolean cancel;

    public FurnaceBurnEvent(Block theBlock, int item) {
	super(Type.FURNACE_BURN, theBlock);

        this.cancel = false;
        this.burnedItemId = item;

    }

    /**
     * Gets the burned item for this event
     *
     * @return Item burnedItem
     */
    public int getItemId() {
        return burnedItemId;
    }


    /**
     * Gets the cancellation state of this event. A cancelled event will not
     * be executed in the server, but will still pass to other plugins
     *
     * @return true if this event is cancelled
     */
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * Sets the cancellation state of this event. A cancelled event will not
     * be executed in the server, but will still pass to other plugins
     *
     * @param cancel true if you wish to cancel this event
     */
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

}