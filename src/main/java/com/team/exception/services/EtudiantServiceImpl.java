package com.team.exception.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.exception.BusinessException;
import com.team.exception.entities.Etudiant;
import com.team.exception.repository.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService {

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Override
	public Etudiant findEtudiantById(Long id) throws BusinessException {
		
		return etudiantRepository.findById(id).orElseThrow(()-> new BusinessException("etudiant not found"));
	}

	@Override
	public Etudiant createEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return etudiantRepository.save(etudiant);
	}

	@Override
	public void updateEtudiant(Etudiant etudiant) {
		etudiantRepository.save(etudiant);
		
	}

	@Override
	public void deleteEtudiant(Long id) {
		etudiantRepository.deleteById(id);
		
	}

	@Override
	public List<Etudiant> findAllEtudiant() {
		throw new NullPointerException("Null pointer exception in findAll");
	}

}
