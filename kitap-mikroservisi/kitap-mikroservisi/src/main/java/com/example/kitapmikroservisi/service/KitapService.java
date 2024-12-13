package com.example.kitapmikroservisi.service;

import com.example.kitapmikroservisi.entity.Kitap;
import com.example.kitapmikroservisi.repository.KitapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitapService {
    @Autowired
    private KitapRepository kitapRepository;

    // Tüm kitapları getiren metot
    public List<Kitap> getAllBooks() {
        return kitapRepository.findAll();
    }

    // ID'ye göre tek bir kitabı getiren metot
    public Kitap getBookById(Long id) {
        return kitapRepository.findById(id).orElse(null);
    }

    // Yeni bir kitap kaydeden veya mevcut bir kitabı güncelleyen metot
    public Kitap saveBook(Kitap kitap) {
        return kitapRepository.save(kitap);
    }

    // Belirli bir ID'ye göre kitabı silen metot
    public void deleteBook(Long id) {
        kitapRepository.deleteById(id);
    }
}
