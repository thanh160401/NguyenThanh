package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.InsertDTO;
import com.laptrinhjavaweb.service.IService;
@CrossOrigin
@RestController
public class InstAPI {
	
		@Autowired
		private IService istService;
	
		@PostMapping(value="/insert")
		public InsertDTO addStd(@RequestBody InsertDTO model) {
			return istService.save(model);
		}
}
