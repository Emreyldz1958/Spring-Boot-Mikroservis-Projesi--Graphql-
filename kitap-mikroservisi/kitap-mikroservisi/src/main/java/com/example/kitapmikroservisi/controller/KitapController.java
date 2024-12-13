package com.example.kitapmikroservisi.controller;

import com.example.kitapmikroservisi.entity.Kitap;
import com.example.kitapmikroservisi.service.KitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitaplar")
public class KitapController {

    @Autowired
    private KitapService kitapService;

    
    @GetMapping("/findall")
    public List<Kitap> getAllBooks() {
        return kitapService.getAllBooks();
    }

    // ID'ye göre tek bir kitabı getiren endpoint
    @GetMapping("/{id}")
    public Kitap getBookById(@PathVariable Long id) {
        return kitapService.getBookById(id);
    }

    
    @PostMapping("/add")
    public Kitap addBook(@RequestBody Kitap kitap) {
        return kitapService.saveBook(kitap);
    }

    // Belirli bir ID'ye göre kitabı silen endpoint
    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        kitapService.deleteBook(id);
    }
}
