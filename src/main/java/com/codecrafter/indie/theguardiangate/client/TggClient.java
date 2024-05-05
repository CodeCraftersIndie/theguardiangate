package com.codecrafter.indie.theguardiangate.client;

import com.codecrafter.indie.theguardiangate.model.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class TggClient {

	private static final Logger logger = LoggerFactory.getLogger(TggClient.class);

	public ResponseWrapper guardianCall(String connectionString) {
		try {
			return new RestTemplate().getForEntity(connectionString, ResponseWrapper.class).getBody();
		} catch (RestClientException e) {
			logger.error(Arrays.toString(e.getStackTrace()));
		}
		return null;
	}
}
