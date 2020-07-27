package com.scgj.dto;

/**
 * Class to store training details
 * Update the data-members as per the requirement
 *
 */
public class ViewTrainingDetailsDto {

	private int trainingId;
	private String trainingName;
	
	
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	
	/**
	 * Parameterized Constructor
	 * @param trainingId
	 * @param trainingName
	 */
	public ViewTrainingDetailsDto(int trainingId, String trainingName) {
		super();
		this.trainingId = trainingId;
		this.trainingName = trainingName;
	}
	
	/**
	 * Default Constructor
	 */
	public ViewTrainingDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
