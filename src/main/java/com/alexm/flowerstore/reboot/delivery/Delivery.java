package com.alexm.flowerstore.reboot.delivery;

import com.alexm.flowerstore.reboot.item.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
