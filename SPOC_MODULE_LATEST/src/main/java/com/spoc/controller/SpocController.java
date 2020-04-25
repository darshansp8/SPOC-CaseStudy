package com.spoc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spoc.service.SpocService;

@Controller
public class SpocController {
	@Autowired
	private SpocService spocService;
	/*
	 * @RequestMapping("/") public String home() { return "welcomepage"; }
	 */
	
	/*
	 * @RequestMapping("/status") public String getStatus() {
	 * spocService.getStatus(); return "welcomepage"; }
	 */
	 
	@RequestMapping("/")
	public String showAllList(HttpServletRequest request) 
	{
		request.setAttribute("requests",spocService.showAllUsers());
		request.setAttribute("trainer", spocService.showTrainerList());
		request.setAttribute("techno", spocService.showTechnologyList());
		request.setAttribute("vertical", spocService.showVerticalList());
		request.setAttribute("room", spocService.showRoomList());
		return "welcomepage";
	}
	
	
	
		
}