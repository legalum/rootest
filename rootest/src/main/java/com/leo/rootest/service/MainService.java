package com.leo.rootest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leo.rootest.model.Rootest;

@Service
public interface MainService{
	
	public List<Rootest> getAllRootest();
	
}