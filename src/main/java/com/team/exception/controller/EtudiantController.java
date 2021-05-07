package com.team.exception.controller;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.exception.BusinessException;
import com.team.exception.etudiant.view.EtudiantView;

@RestController
@RequestMapping("/etudiant")
public interface EtudiantController {
	
	@GetMapping
	@RequestMapping("/findAll")
	List<EtudiantView> findAll();
	
	@GetMapping
	@RequestMapping("/find/{id}")
	EtudiantView getEtudiantById(@PathVariable Long id) throws BusinessException ;
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping("/create")
	EtudiantView createEtudiant(@RequestBody EtudiantView etudiantView);
	
	@PutMapping
	@RequestMapping("/update")
	void updateEtudiant(@RequestBody EtudiantView etudiantView);
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	void deleteEtudiant(@PathVariable Long id);
}
