package com.codecrafter.indie.theguardiangate.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.codecrafter.indie.theguardiangate.model.article.ApiResponse;


@Service
public class GaurdianServiceImpl implements GuardianService{

	private RestTemplate restTemplate = new RestTemplate();
	
	
	public ApiResponse guardianCall() {

		ResponseEntity<ApiResponse> response =  null;
		try {
			response = this.restTemplate.getForEntity("https://content.guardianapis.com/search?section=news&page=1&api-key=test&show-fields=all&page-size=200", ApiResponse.class);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return response.getBody();
	}
	
	

}
