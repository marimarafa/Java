package com.spring.universita.dao;

import java.util.List;

import com.spring.universita.entity.Professore;

public interface DAOProfessore {
	public boolean insert(Professore prof);
	public List<Professore> selectAll();
	public Professore selectById(Integer idProfessore);
	public boolean delete(Integer idProfessore);

}
