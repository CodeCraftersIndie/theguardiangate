package com.codecrafter.indie.theguardiangate.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codecrafter.indie.theguardiangate.model.article.ApiResponse;
import com.codecrafter.indie.theguardiangate.service.GuardianService;
import com.codecrafter.indie.theguardiangate.utils.ResponseHelper;

@RestController
@RequestMapping(path = "/fornitura")
@Validated
public class GuardianController {
	
	private static final Logger logger = LoggerFactory.getLogger(GuardianController.class);
	
	@Autowired
	private GuardianService service;
	
	@GetMapping(value = "/guardianCall", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getAllImpiantiRegioni() {

		ApiResponse response = null;

		Date startTS = new Date();

		try {

			response = service.guardianCall();

		} catch (Exception ex) {

			return ResponseHelper.generateExceptionResponse(ex);
		}

		Date endTS = new Date();
		logger.debug("getAllImpiantiRegioni (msec) : {} ", endTS.getTime() - startTS.getTime());

		return ResponseHelper.generateSuccesResponse(response);
	}


}
