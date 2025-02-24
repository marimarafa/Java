package com.spring.universita.service;

import java.util.List;

import com.spring.universita.dto.ProfessoreDTO;

public interface ProfessoreService {
	public boolean inserisciProfessore(ProfessoreDTO dto);
	public ProfessoreDTO cercaPerId(int id);
	public List<ProfessoreDTO> visualizzaProfessori();
	public ProfessoreDTO elimina(int id);
	public ProfessoreDTO modificaMateria(int id, String materia);
	public List<ProfessoreDTO> ProfessoriDiMateria(String materia);
	public List<ProfessoreDTO> OrdinaPerCognome();
	public List<String> ListaMaterie();

}
