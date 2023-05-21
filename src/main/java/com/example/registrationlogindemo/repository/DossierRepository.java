package com.example.registrationlogindemo.repository;

import com.example.registrationlogindemo.entity.Dossier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierRepository extends JpaRepository<Dossier, Long> {

}
