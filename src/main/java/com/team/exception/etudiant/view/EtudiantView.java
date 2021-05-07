package com.team.exception.etudiant.view;

import java.io.Serializable;

import com.team.exception.entities.Etudiant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EtudiantView implements Serializable {

	
    private Long id;
	
	private String firstName;
	
	private String lastName;
	
	
	public static EtudiantView from(Etudiant etudiant) {
		return EtudiantView.builder()
				.id(etudiant.getId())
				.firstName(etudiant.getFirstName())
				.lastName(etudiant.getLastName())
				.build();
	}
	
	public static Etudiant to(EtudiantView etudiantView) {
		return Etudiant.builder()
				.id(etudiantView.getId())
				.firstName(etudiantView.getFirstName())
				.lastName(etudiantView.getLastName())
				.build();
	}
}
