package com.spring.universita.utility;

import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Studente;

public class ConversioniStudente {
	public static Studente daStudenteDTOAStudente(StudenteDTO dto) {
		return new Studente(dto.getMatricola(),dto.getNome(), dto.getCognome(), dto.getIndirizzo(), dto.getAnno_nascita(), dto.getAnno_immatricolazione());
		
	}
	
	public static StudenteDTO daStudenteAStudenteDTO(Studente stud) {
		return new StudenteDTO(stud.getMatricola(),stud.getNome(), stud.getCognome(), stud.getIndirizzo(), stud.getAnno_nascita(), stud.getAnno_immatricolazione());
		
	}

}
