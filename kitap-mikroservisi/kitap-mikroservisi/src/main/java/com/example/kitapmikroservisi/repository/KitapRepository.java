package com.example.kitapmikroservisi.repository;

import com.example.kitapmikroservisi.entity.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitapRepository extends JpaRepository<Kitap, Long> {
}
