package com.team.exception.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.team.exception.BusinessException;
import com.team.exception.entities.Etudiant;
import com.team.exception.etudiant.view.EtudiantView;
import com.team.exception.services.EtudiantService;

@Component
public class EtudiantControllerImpl implements EtudiantController {

	@Autowired
	private EtudiantService etudiantService;
	
	@Override
	public EtudiantView getEtudiantById(Long id) throws BusinessException {
		return EtudiantView.from(etudiantService.findEtudiantById(id));
	}

	@Override
	public EtudiantView createEtudiant(EtudiantView etudiantView) {
		// TODO Auto-generated method stub
		return EtudiantView.from(etudiantService.createEtudiant(EtudiantView.to(etudiantView)));
	}

	@Override
	public void updateEtudiant(EtudiantView etudiantView) {
		etudiantService.updateEtudiant(EtudiantView.to(etudiantView));
		
	}

	@Override
	public void deleteEtudiant(Long id) {
		etudiantService.deleteEtudiant(id);
	}

	@Override
	public List<EtudiantView> findAll() {
		return etudiantService.findAllEtudiant().stream().map(EtudiantView::from).collect(Collectors.toList());
	}

}
