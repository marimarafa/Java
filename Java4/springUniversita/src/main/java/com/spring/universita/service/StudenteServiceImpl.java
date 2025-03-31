package com.spring.universita.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.universita.dao.DAOStudente;
import com.spring.universita.dto.StudCognomeAnnoDTO;
import com.spring.universita.dto.StudCognomeAnnoIscrizioneDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Studente;
import com.spring.universita.utility.ConversioniStudente;
@Service
public class StudenteServiceImpl implements StudenteService {
	@Autowired
	private DAOStudente dao;

	public boolean inserisciStudente(StudenteDTO dto) {
		Studente stud = ConversioniStudente.daStudenteDTOAStudente(dto);
		return dao.insert(stud);
	}

	public StudenteDTO cercaPerMatricola(int matricola) {
		Studente stud = dao.selectById(matricola);
		if (stud != null) {

			StudenteDTO dto = ConversioniStudente.daStudenteAStudenteDTO(stud);
			return dto;
		}
		return null;
	}

	public List<StudenteDTO> visualizzaStudenti() {
		ArrayList<StudenteDTO> studentiDTO = new ArrayList<>();
		ArrayList<Studente> studenti = new ArrayList<>(dao.selectAll());
		for (Studente stud : studenti) {
			StudenteDTO dto = ConversioniStudente.daStudenteAStudenteDTO(stud);
			studentiDTO.add(dto);
		}
		return studentiDTO;
	}

	public StudenteDTO elimina(int matricola) {
		Studente stud = dao.selectById(matricola);
		dao.delete(matricola);
		StudenteDTO dto = ConversioniStudente.daStudenteAStudenteDTO(stud);
		return dto;

	}

	public StudenteDTO modificaIndirizzo(int matricola, String nuovoindirizzo) {
		Studente stud = dao.selectById(matricola);
		stud.setIndirizzo(nuovoindirizzo);
		StudenteDTO dto = ConversioniStudente.daStudenteAStudenteDTO(stud);
		return dto;
	}

	public List<String> NomeStudenti() {
		ArrayList<Studente> studenti = new ArrayList<>(dao.selectAll());
		ArrayList<String> studentidto = new ArrayList<String>();
		for (Studente stud : studenti) {
			if (stud != null) {
				studentidto.add(stud.getNome());
			}
		}
		return studentidto;
	}

	public StudCognomeAnnoDTO StudentePiuGiovane() {
		ArrayList<Studente> studenti = new ArrayList<>(dao.selectAll());
		ArrayList<Integer> anni_nascita_studenti = new ArrayList<Integer>();

		for (Studente stud : studenti) {
			anni_nascita_studenti.add(stud.getAnno_nascita());
			int max = Collections.max(anni_nascita_studenti);

			return (new StudCognomeAnnoDTO(stud.getCognome(), max));
		}
		return null;
	}

	public StudCognomeAnnoIscrizioneDTO StudenteIscrittoDaPiuTempo() {
		ArrayList<Studente> studenti = new ArrayList<>(dao.selectAll());
		ArrayList<Integer> anni_iscrizione_studenti = new ArrayList<Integer>();

		for (Studente stud : studenti) {
			anni_iscrizione_studenti.add(stud.getAnno_immatricolazione());
			int min = Collections.min(anni_iscrizione_studenti);

			return (new StudCognomeAnnoIscrizioneDTO(stud.getCognome(), min));
		}
		return null;
	}

}
