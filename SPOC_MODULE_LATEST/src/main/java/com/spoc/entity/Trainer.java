package com.spoc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainer")
public class Trainer {

	@Id
	private int trainerId;
	private String trainerName;
	private int technologyId;
	private int trainerStatus;
	
	
	
	
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public int getTechnologyId() {
		return technologyId;
	}
	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}
	
	
	public int getTrainerStatus() {
		return trainerStatus;
	}
	public void setTrainerStatus(int trainerStatus) {
		this.trainerStatus = trainerStatus;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", technologyId=" + technologyId
				+ ", trainerStatus=" + trainerStatus + "]";
	}
	
}
