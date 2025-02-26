package com.spring.rubrica.dao;

import java.util.List;

import com.spring.rubrica.entity.Rubrica;

public interface DAORubrica {
	public boolean insert(Rubrica rubrica);
	public List<Rubrica> selectAll();
	public Rubrica selectById(Integer idRubrica);
	public boolean delete(Integer idRubrica);

}
