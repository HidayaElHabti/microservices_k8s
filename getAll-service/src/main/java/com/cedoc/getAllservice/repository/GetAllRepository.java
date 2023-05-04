package com.cedoc.getAllservice.repository;

import com.cedoc.getAllservice.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetAllRepository extends JpaRepository<Candidate, Long> {

}
