package com.scgj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scgj.service.ViewTrainingService;

@RestController
public class ViewTrainingController {

	@Autowired
	private ViewTrainingService viewTrainingService;
	
	private static final Logger Log = LoggerFactory.getLogger(ViewTrainingController.class);
	
	
	/**
	 * This is a sample method
	 * @apiNote Controller to receive request from frontend to fetch list of trainings
	 * @param Mention parameters received in request 
	 * @return Mention the returned values here
	 */
	@GetMapping("/viewTrainings")
	private String viewTrainings() {
		Log.debug("Request received in controller to fetch upcoming trainings to be displayed");
		Log.debug("Calling Service --");
		//Modify this method as per requirement
		return null;
	}
	
}
