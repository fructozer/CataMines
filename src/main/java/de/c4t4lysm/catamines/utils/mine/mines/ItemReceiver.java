package de.c4t4lysm.catamines.utils.mine.mines;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ItemReceiver {
    /**
     * Add item that player dig from catamine to custom vault or something
     *
     * @param player who will receive thís item
     * @param item reward item that player dig
     * @return Yes if the player has received the item.
     * It is wrong if the player does not receive the item for any reason.
     * For example, the custom vault is full.
     */
    boolean addItem(Player player, ItemStack item);
}
