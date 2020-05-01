package com.testintegration.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testintegration.model.IncomingRequests;
@Repository
public interface IncomingRequestsDao extends CrudRepository<IncomingRequests, Integer>{

}
