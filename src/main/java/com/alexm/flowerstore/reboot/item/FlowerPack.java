package com.alexm.flowerstore.reboot.item;

import com.alexm.flowerstore.reboot.item.flower.Flower;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerPack extends Item {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        this(flower, 1);
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}

