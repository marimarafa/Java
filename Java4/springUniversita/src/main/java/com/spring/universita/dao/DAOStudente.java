package com.spring.universita.dao;

import java.util.List;

import com.spring.universita.entity.Studente;

public interface DAOStudente {
	public boolean insert(Studente stud);
	public List<Studente> selectAll();
	public Studente selectById(Integer MatricolaStud);
	public boolean delete(Integer MatricolaStud);

}
