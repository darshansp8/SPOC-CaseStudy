package com.testintegration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vertical")
public class Vertical {
	
		@Id
		private int verticalId;
		private String verticalName;


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


		@Override
		public String toString() {
			return "Vertical [verticalId=" + verticalId + ", verticalName=" + verticalName + "]";
		}
		
		
		
}