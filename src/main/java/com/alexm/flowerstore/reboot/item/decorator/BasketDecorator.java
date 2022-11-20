package com.alexm.flowerstore.reboot.item.decorator;

import com.alexm.flowerstore.reboot.item.Item;
import com.alexm.flowerstore.reboot.item.ItemDecorator;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Flowers decorated by basket";
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}
