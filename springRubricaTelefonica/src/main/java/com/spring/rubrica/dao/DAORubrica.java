package com.spring.rubrica.dao;

import java.util.List;

import com.spring.rubrica.entity.Contatto;
import com.spring.rubrica.entity.Rubrica;

public interface DAORubrica {
	public boolean insert(Rubrica rubrica);
	public List<Rubrica> selectAll();
	public Rubrica selectById(Integer idRubrica);
	public void delete(Integer idRubrica);
	public void update(Rubrica rubrica);
	public boolean insert(int idRubrica ,Contatto contatto);

}
