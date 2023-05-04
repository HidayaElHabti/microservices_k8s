package com.cedoc.createservice.repository;

import com.cedoc.createservice.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateRepository extends JpaRepository<Candidate, Long> {
}
