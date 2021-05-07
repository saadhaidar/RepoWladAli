package com.team.exception.services;

import java.util.List;

import com.team.exception.BusinessException;
import com.team.exception.entities.Etudiant;

public interface EtudiantService {
	
	List<Etudiant> findAllEtudiant();
	
	Etudiant findEtudiantById(Long id) throws BusinessException;
	
	Etudiant createEtudiant(Etudiant etudiant);
	
	void updateEtudiant(Etudiant etudiant);
	
	void deleteEtudiant(Long id);

}
