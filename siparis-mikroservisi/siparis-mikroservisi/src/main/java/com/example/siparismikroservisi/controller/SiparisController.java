package com.example.siparismikroservisi.controller;

import com.example.siparismikroservisi.entity.Siparis;
import com.example.siparismikroservisi.service.SiparisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/siparisler")
public class SiparisController {

    @Autowired
    private SiparisService siparisService;

    // Tüm siparişleri getiren endpoint
    @GetMapping("/get")
    public List<Siparis> getAllOrders() {
        return siparisService.getAllOrders();
    }

    // Yeni bir sipariş ekleyen endpoint
    @PostMapping("/add")
    public Siparis addOrder(@RequestBody Siparis siparis) {
        return siparisService.saveOrder(siparis);
    }
}
