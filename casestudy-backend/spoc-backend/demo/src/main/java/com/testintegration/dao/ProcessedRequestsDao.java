package com.testintegration.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.testintegration.model.ProcessedRequests;

@Repository
public interface ProcessedRequestsDao extends JpaRepository<ProcessedRequests, Integer>{

}
