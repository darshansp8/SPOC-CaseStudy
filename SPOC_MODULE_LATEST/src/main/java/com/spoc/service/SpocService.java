package com.spoc.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoc.entity.Room;
import com.spoc.entity.Technology;
import com.spoc.entity.Trainer;
import com.spoc.entity.Training_Request;
import com.spoc.entity.Vertical;
import com.spoc.repository.RoomRepository;
import com.spoc.repository.SpocRepository;
import com.spoc.repository.TechnologyRepository;
import com.spoc.repository.TrainerRepository;
import com.spoc.repository.VerticalRepository;


@Service
@Transactional
public class SpocService 
{
	/*
	 * @Autowired private EntityManager entityManager;
	 * 
	 * public String getStatus() { return "HI"; }
	 */
	@Autowired
	private final SpocRepository spocRepository;
	
	@Autowired
	private final TechnologyRepository technoRepo;
	
	@Autowired
	private final VerticalRepository verticalRepo;
	
	@Autowired
	private final TrainerRepository trainerRepo;
	
	@Autowired
	private final RoomRepository roomRepo;
	
	public SpocService(SpocRepository spocRepository,TechnologyRepository technoRepo,VerticalRepository verticalRepo,TrainerRepository trainerRepo,RoomRepository roomRepo) {
		super();
		this.spocRepository = spocRepository;
		this.technoRepo=technoRepo;
		this.verticalRepo=verticalRepo;
		this.trainerRepo=trainerRepo;
		this.roomRepo=roomRepo;
	}

	
	/*
	 * public Collection<Training_Request> findAllRequests() {
	 * List<Training_Request> requests = new ArrayList<>();
	 * Iterable<Training_Request> requestList = spocRepository.findAll();
	 * requestList.forEach(requests::add); return requests; }
	 */
	
	public List<Training_Request> showAllUsers(){
		List<Training_Request> users = new ArrayList<Training_Request>();
		for(Training_Request user:spocRepository.findAll()){
			users.add(user);
			
		}
		return users;
	}
	public List<Trainer> showTrainerList(){
		List<Trainer> trainer= new ArrayList<Trainer>();
		for(Trainer t:trainerRepo.findAll()) {
			trainer.add(t);
		}
		return trainer;
		
	}
	public List<Technology> showTechnologyList(){
		List<Technology> tech = new ArrayList<Technology>();
		for(Technology technology:technoRepo.findAll()) {
			tech.add(technology);
		}		
		return tech;
	}
	public List<Vertical> showVerticalList(){
		List<Vertical> vertical=new ArrayList<Vertical>();
		for(Vertical v:verticalRepo.findAll()) {
			vertical.add(v);
		}
		return vertical;
	}
	public List<Room> showRoomList(){
		List<Room> room=new ArrayList<Room>();
		for(Room r:roomRepo.findAll()) {
			room.add(r);
		}
		System.out.println(room);
		return room;
	}
	
	/*
	 * public List<Technology> showTechnologyList() { List<Technology> list = new
	 * ArrayList<Technology>(); list = technoRepo.findByTechnologyId(301);
	 * System.out.println(list); return list; }
	 * 
	 * public List<Vertical> showVerticalList(){ List<Vertical> list= new
	 * ArrayList<Vertical>(); list = verticalRepo.findByVerticalId(201);
	 * System.out.println(list); return list; }
	 */
	
}
