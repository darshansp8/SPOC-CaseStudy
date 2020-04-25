package com.spoc.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="room")
public class Room {
		@Id
		private int roomId;
		private int roomNo;
		private boolean roomStatus;
		public int getRoomId() {
			return roomId;
		}
		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}
		public int getRoomNo() {
			return roomNo;
		}
		public void setRoomNo(int roomNo) {
			this.roomNo = roomNo;
		}
		public boolean isRoomStatus() {
			return roomStatus;
		}
		public void setRoomStatus(boolean roomStatus) {
			this.roomStatus = roomStatus;
		}
		@Override
		public String toString() {
			return "Room [roomId=" + roomId + ", roomNo=" + roomNo + ", roomStatus=" + roomStatus + "]";
		}
		
		
		
		
	
}
