package com.alexm.flowerstore.reboot.service;

import com.alexm.flowerstore.reboot.item.flower.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
