package com.cedoc.getAllservice.service;

import com.cedoc.getAllservice.entity.Candidate;
import com.cedoc.getAllservice.repository.GetAllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllService {
    @Autowired
    private GetAllRepository getAllRepository;


    public List<Candidate> getAllCandidates() {
        return getAllRepository.findAll();
    }
}
