package com.scgj.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * This is a sample configuration class
 * to configure SQL queries
 *
 */
@Component
@PropertySource("classpath:sql/viewTraining.yml")
@ConfigurationProperties(prefix="training")
public class ViewTrainingConfig {

	@Value("${viewTrainingSql}")
	private String viewTrainingSql;

	public String getViewTrainingSql() {
		return viewTrainingSql;
	}

	public void setViewTrainingSql(String viewTrainingSql) {
		this.viewTrainingSql = viewTrainingSql;
	}
	
}
