package com.team.exception.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team.exception.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	
	 Optional<Etudiant> findById(Long id);

}
