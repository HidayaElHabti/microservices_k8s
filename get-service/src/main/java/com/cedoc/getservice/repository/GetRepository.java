package com.cedoc.getservice.repository;

import com.cedoc.getservice.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetRepository extends JpaRepository<Candidate, Long> {
    Candidate findByCandidateId(Long candidateId);
}
