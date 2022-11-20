package com.alexm.flowerstore.reboot.item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ItemDecorator extends Item {
    protected Item item;
}
