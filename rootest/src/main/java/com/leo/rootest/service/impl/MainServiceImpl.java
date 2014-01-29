package com.leo.rootest.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.leo.rootest.model.Rootest;
import com.leo.rootest.service.MainService;

@Component
public class MainServiceImpl implements MainService{
	
	@PersistenceContext
	EntityManager em;
	
	public List<Rootest> getAllRootest(){
		List<Rootest> rootestList = (List<Rootest>) em.createQuery("FROM Rootest").getResultList();
		return rootestList;
	}
	
}