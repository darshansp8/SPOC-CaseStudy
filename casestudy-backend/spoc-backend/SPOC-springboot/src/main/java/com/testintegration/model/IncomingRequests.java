package com.testintegration.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@SuppressWarnings("serial")
@Entity(name="incoming_requests") 
public class IncomingRequests implements Serializable{
	@Id	
	private int requestId ; 
	private int verticalId; 
	private int technologyId; 
	private String pmName ; 
	private int candidateCount;
	private String trainingMode;  
	private Date trainingStartDate;
	private Date trainingEndDate;
	private Time trainingStartTime;
	private Time trainingEndTime;
	private String comment ;
	private int requestStatus;

	@OneToMany
	@JoinColumn(name="verticalId",referencedColumnName="verticalId")
	private List<Vertical> vertical;
	public List<Vertical> getVertical() {
		return vertical;
	}
	
	
	@OneToMany
	@JoinColumn(name="technologyId",referencedColumnName="technologyId")
	private List<Technology> technology;
	public List<Technology> getTechnology() {
		return technology;
	}
	
	
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getVerticalId() {
		return verticalId;
	}
	public void setVerticalId(int verticalId) {
		this.verticalId = verticalId;
	}
	public int getTechnologyId() {
		return technologyId;
	}
	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}
	public String getPmName() {
		return pmName;
	}
	public void setPmName(String pmName) {
		this.pmName = pmName;
	}
	public int getCandidateCount() {
		return candidateCount;
	}
	public void setCandidateCount(int candidateCount) {
		this.candidateCount = candidateCount;
	}
	public String getTrainingMode() {
		return trainingMode;
	}
	public void setTrainingMode(String trainingMode) {
		this.trainingMode = trainingMode;
	}
	public Date getTrainingStartDate() {
		return trainingStartDate;
	}
	public void setTrainingStartDate(Date trainingStartDate) {
		this.trainingStartDate = trainingStartDate;
	}
	public Date getTrainingEndDate() {
		return trainingEndDate;
	}
	public void setTrainingEndDate(Date trainingEndDate) {
		this.trainingEndDate = trainingEndDate;
	}
	public Time getTrainingStartTime() {
		return trainingStartTime;
	}
	public void setTrainingStartTime(Time trainingStartTime) {
		this.trainingStartTime = trainingStartTime;
	}
	public Time getTrainingEndTime() {
		return trainingEndTime;
	}
	public void setTrainingEndTime(Time trainingEndTime) {
		this.trainingEndTime = trainingEndTime;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(int requestStatus) {
		this.requestStatus = requestStatus;
	}
	@Override
	public String toString() {
		return "IncomingRequests [requestId=" + requestId + ", verticalId=" + verticalId + ", technologyId="
				+ technologyId + ", pmName=" + pmName + ", candidateCount=" + candidateCount + ", trainingMode="
				+ trainingMode + ", trainingStartDate=" + trainingStartDate + ", trainingEndDate=" + trainingEndDate
				+ ", trainingStartTime=" + trainingStartTime + ", trainingEndTime=" + trainingEndTime + ", comment="
				+ comment + ", requestStatus=" + requestStatus + "]";
	}
	
	
}
