package com.spring.universita.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.universita.dao.DAOProfessore;
import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.entity.Professore;
import com.spring.universita.utility.ConversioniProfessore;


public class ProfessoreService {
	
	private DAOProfessore dao = new DAOProfessore();
	
	public boolean inserisciProfessore(ProfessoreDTO dto) {
		Professore prof = ConversioniProfessore.daProfessoreDTOAProfessore(dto);
		return dao.insert(prof);
	}

	public ProfessoreDTO cercaPerId(int id) {
		Professore prof = dao.selectById(id);
		if (prof != null) {

			ProfessoreDTO dto = ConversioniProfessore.daProfessoreAProfessoreDTO(prof);
			return dto;
		}
		return null;
	}

	public List<ProfessoreDTO> visualizzaProfessori() {
		ArrayList<ProfessoreDTO> professoriDTO = new ArrayList<ProfessoreDTO>();
		ArrayList<Professore> professori = new ArrayList<Professore>(dao.selectAll());
		for (Professore prof : professori) {
			ProfessoreDTO dto = ConversioniProfessore.daProfessoreAProfessoreDTO(prof);
			professoriDTO.add(dto);
		}
		return professoriDTO;
	}
	
	public ProfessoreDTO elimina(int id) {
		Professore prof = dao.selectById(id);
		dao.delete(id);
		ProfessoreDTO dto = ConversioniProfessore.daProfessoreAProfessoreDTO(prof);
		return dto;

	}
	
	public ProfessoreDTO modificaMateria(int id, String materia) {
		Professore prof = dao.selectById(id);
		prof.setMateria_insegnamento(materia);
		ProfessoreDTO dto = ConversioniProfessore.daProfessoreAProfessoreDTO(prof);
		return dto;
	}
	
	public List<ProfessoreDTO> ProfessoriDiMateria(String materia){
		ArrayList<ProfessoreDTO> professoriDTO = new ArrayList<ProfessoreDTO>();
		ArrayList<Professore> professori = new ArrayList<Professore>(dao.selectAll());
		for(Professore prof :professori) {
			if(prof.getMateria_insegnamento() == materia) {
				ProfessoreDTO dto = ConversioniProfessore.daProfessoreAProfessoreDTO(prof);
				professoriDTO.add(dto);
			}
		} return professoriDTO;
	}
}
