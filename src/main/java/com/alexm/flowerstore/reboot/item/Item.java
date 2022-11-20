package com.alexm.flowerstore.reboot.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    protected String description = "Standard item";
    abstract public double getPrice();
}
