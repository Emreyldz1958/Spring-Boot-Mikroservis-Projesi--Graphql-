package com.example.siparismikroservisi.service;

import com.example.siparismikroservisi.entity.Siparis;
import com.example.siparismikroservisi.repository.SiparisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiparisService {

    @Autowired
    private SiparisRepository siparisRepository;

    // Tüm siparişleri getiren metot
    public List<Siparis> getAllOrders() {
        return siparisRepository.findAll();
    }

    // Yeni bir sipariş kaydeden metot
    public Siparis saveOrder(Siparis siparis) {
        return siparisRepository.save(siparis);
    }

    /*
     // Kitap mikroservisinden kitap detaylarını getiren metot
     public Kitap getBookDetails(Long kitapId) {
        String url = "http://localhost:8081/kitaplar/" + kitapId; // Kitap Mikroservisinin adresi
        return restTemplate.getForObject(url, Kitap.class);
    }
        */
}
