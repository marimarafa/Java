package com.spring.universita.utility;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.entity.Professore;

public class ConversioniProfessore {
		public static Professore daProfessoreDTOAProfessore(ProfessoreDTO dto) {
			return new Professore(dto.getId(), dto.getNome(), dto.getCognome(), dto.getMateria_insegnamento());
			
		}
		
		public static ProfessoreDTO daProfessoreAProfessoreDTO(Professore prof) {
			return new ProfessoreDTO(prof.getId(), prof.getNome(), prof.getCognome(), prof.getMateria_insegnamento());
			
		}


	}



