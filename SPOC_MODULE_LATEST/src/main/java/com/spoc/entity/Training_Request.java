package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="training_request")
public class Training_Request {
	@Id
	private int requestId;
	private String verticalName;
	private String technologyName;
	private int requestStatus;
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getVerticalName() {
		return verticalName;
	}
	public void setVerticalName(String verticalName) {
		this.verticalName = verticalName;
	}
	public String getTechnologyName() {
		return technologyName;
	}
	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	public int getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(int requestStatus) {
		this.requestStatus = requestStatus;
	}
	@Override
	public String toString() {
		return "Training_Request [requestId=" + requestId + ", verticalName=" + verticalName + ", technologyName="
				+ technologyName + ", requestStatus=" + requestStatus + "]";
	}
	
}
