package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vertical")
public class Vertical {

	@Id
	private int verticalId;
	private String verticalName;
	public Vertical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vertical(int verticalId, String verticalName) {
		super();
		this.verticalId = verticalId;
		this.verticalName = verticalName;
	}
	public int getVerticalId() {
		return verticalId;
	}
	public void setVerticalId(int verticalId) {
		this.verticalId = verticalId;
	}
	public String getVerticalName() {
		return verticalName;
	}
	public void setVerticalName(String verticalName) {
		this.verticalName = verticalName;
	}
	
}