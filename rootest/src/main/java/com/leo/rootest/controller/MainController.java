package com.leo.rootest.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leo.rootest.model.Rootest;
import com.leo.rootest.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@RequestMapping(value = "/rootests", method = RequestMethod.GET )
	public String getAllRootests(ModelMap model, HttpServletRequest request, HttpServletResponse response){
		List<Rootest> rootestList = mainService.getAllRootest();
		model.addAttribute("rootestList", rootestList);
		return "rootests.jsp";
	}
	
//	@RequestMapping(method = RequestMethod.GET )
//	public String getIndex(HttpServletRequest request, HttpServletResponse response){
//		String res="yo";
//		return "index";
//	}
	
}
