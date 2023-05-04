package com.cedoc.createservice.service;

import com.cedoc.createservice.entity.Candidate;
import com.cedoc.createservice.repository.CreateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateService {
    @Autowired
    private CreateRepository createRepository;

    public Candidate saveCandidate(Candidate candidate) {
        return createRepository.save(candidate);
    }
}
