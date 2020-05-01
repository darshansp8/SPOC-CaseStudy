package com.testintegration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="technology")
public class Technology {
	
		@Id
		private int technologyId;
		private String technologyName;
		
				
		public int getTechnologyId() {
			return technologyId;
		}

		public void setTechnologyId(int technologyId) {
			this.technologyId = technologyId;
		}

		public String getTechnologyName() {
			return technologyName;
		}

		public void setTechnologyName(String technologyName) {
			this.technologyName = technologyName;
		}

		@Override
		public String toString() {
			return "Technology [technologyId=" + technologyId + ", technologyName=" + technologyName + "]";
		}
		
		
		
}