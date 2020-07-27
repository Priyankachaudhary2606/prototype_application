package com.scgj.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:applicationConstants.properties")
@ConfigurationProperties(prefix="constant")
public class ReadApplicationConstants
{

	private static String trainingPrefix;

	public static String getTrainingPrefix() {
		return trainingPrefix;
	}

	public static void setTrainingPrefix(String trainingPrefix) {
		ReadApplicationConstants.trainingPrefix = trainingPrefix;
	}
	
}
