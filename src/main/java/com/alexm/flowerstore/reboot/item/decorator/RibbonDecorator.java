package com.alexm.flowerstore.reboot.item.decorator;

import com.alexm.flowerstore.reboot.item.Item;
import com.alexm.flowerstore.reboot.item.ItemDecorator;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Flowers decorated by ribbon";
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }
}