package com.techelevator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Survey;

@Controller
public class SurveyController {

	@RequestMapping(path="/surveyInput", method=RequestMethod.GET)
	public String showSurveyInput() {
		return "surveyInput";
	}
	
	@RequestMapping(path="/surveyInput", method=RequestMethod.POST)
	public String processSurveyInput(@ModelAttribute Survey currentSurvey) {
		
		// here we could do something useful with the survey object

		return "redirect:/surveyResult";
	}
	
	@RequestMapping(path="/surveyResult", method=RequestMethod.GET)
	public String showSurveyResult() {
		return "surveyResult";
	}
}
