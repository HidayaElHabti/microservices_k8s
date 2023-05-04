package com.cedoc.getservice.service;

import com.cedoc.getservice.entity.Candidate;
import com.cedoc.getservice.repository.GetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetService {
    @Autowired
    private GetRepository getRepository;

    public Candidate getCandidate(Long candidateId) {
        return getRepository.findByCandidateId(candidateId);
    }
}
