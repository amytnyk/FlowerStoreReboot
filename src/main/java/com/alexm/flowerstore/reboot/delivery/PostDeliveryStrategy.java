package com.alexm.flowerstore.reboot.delivery;

import com.alexm.flowerstore.reboot.item.Item;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        // Some delivering process
    }

    @Override
    public String toString() {
        return "PostDeliveryStrategy";
    }
}
