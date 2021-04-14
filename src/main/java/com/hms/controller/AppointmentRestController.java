package com.hms.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.AppointmentInfo;

@RestController
@RequestMapping("/appointment")
public class AppointmentRestController {

	@RequestMapping("/checkAvailability")
	Boolean checkAppointment(@PathVariable String date){
		if(date.equalsIgnoreCase("14/05/2021"))
		return true;
		else 
			return false;
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.POST) 
	AppointmentInfo register(@RequestBody AppointmentInfo appointmentInfo) {
		appointmentInfo.setRegistrationNo("14042021001");
		return appointmentInfo;		
	}
	
}
