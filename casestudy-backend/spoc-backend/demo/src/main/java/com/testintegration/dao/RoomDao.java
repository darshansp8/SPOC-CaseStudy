package com.testintegration.dao;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testintegration.model.Room;

@Repository
public interface RoomDao extends CrudRepository<Room, Integer>{


	@Query("Select r.roomId,r.roomNo,r.Capacity,r.roomAvailFromDate,r.roomAvailTillDate,r.roomAvailFromTime,r.roomAvailTillTime,r.alreadyAssigned from room r where r.roomAvailFromDate<= ?1 and r.roomAvailTillDate>= ?2 and r.roomAvailFromTime<=?3 and r.roomAvailTillTime>= ?4 and r.Capacity>= ?5")
	public List<String> findByQuery(Date dt1,Date dt2, Time t3, Time t4, Integer c5);

}
