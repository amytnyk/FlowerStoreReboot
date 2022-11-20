package com.alexm.flowerstore.reboot.item.flower;

import com.alexm.flowerstore.reboot.item.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower extends Item {
    private double sepalLength;
    private String color;
    private double price;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
