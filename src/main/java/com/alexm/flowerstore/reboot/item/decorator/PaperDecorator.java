package com.alexm.flowerstore.reboot.item.decorator;

import com.alexm.flowerstore.reboot.item.Item;
import com.alexm.flowerstore.reboot.item.ItemDecorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Flowers decorated by paper";
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}