/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.shininet.bukkit.itemrenamer.merchant;

import org.bukkit.inventory.ItemStack;

public class MerchantRecipe {
    private ItemStack itemToBuy;
    private ItemStack secondItemToBuy;
    private ItemStack itemToSell;

    // Whether or not this recipe can be used
    private final boolean canUse;

    public MerchantRecipe(ItemStack itemToBuy, ItemStack secondItemToBuy, ItemStack itemToSell, boolean canUse) {
        this.itemToBuy = itemToBuy;
        this.secondItemToBuy = secondItemToBuy;
        this.itemToSell = itemToSell;
        this.canUse = canUse;
    }

    /**
     * Retrieve the first item the villager buys.
     * @return The first item.
     */
    public ItemStack getItemToBuy() {
        return itemToBuy;
    }

    public void setItemToBuy(ItemStack itemToBuy) {
        this.itemToBuy = itemToBuy;
    }

    /**
     * Retrieve the second item the villager buys.
     * @return The second item.
     */
    public ItemStack getSecondItemToBuy() {
        return secondItemToBuy;
    }

    public void setSecondItemToBuy(ItemStack secondItemToBuy) {
        this.secondItemToBuy = secondItemToBuy;
    }

    /**
     * Retrieve the item the villager sells.
     * @return The item for sale.
     */
    public ItemStack getItemToSell() {
        return itemToSell;
    }

    public void setItemToSell(ItemStack itemToSell) {
        this.itemToSell = itemToSell;
    }

    public boolean isCanUse() {
        return canUse;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s) => %s", itemToBuy, secondItemToBuy, itemToSell);
    }
}