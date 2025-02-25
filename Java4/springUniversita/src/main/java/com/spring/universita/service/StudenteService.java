package com.spring.universita.service;

import java.util.List;

import com.spring.universita.dto.StudCognomeAnnoDTO;
import com.spring.universita.dto.StudCognomeAnnoIscrizioneDTO;
import com.spring.universita.dto.StudenteDTO;

public interface StudenteService {
	public boolean inserisciStudente(StudenteDTO dto);
	public StudenteDTO cercaPerMatricola(int matricola);
	public List<StudenteDTO> visualizzaStudenti();
	public StudenteDTO elimina(int matricola);
	public StudenteDTO modificaIndirizzo(int matricola, String nuovoindirizzo);
	public List<String> NomeStudenti();
	public StudCognomeAnnoDTO StudentePiuGiovane();
	public StudCognomeAnnoIscrizioneDTO StudenteIscrittoDaPiuTempo();
	

}
