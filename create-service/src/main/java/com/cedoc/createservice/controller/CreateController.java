package com.cedoc.createservice.controller;

import com.cedoc.createservice.entity.Candidate;
import com.cedoc.createservice.service.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/create")
@Slf4j
public class CreateController {
    @Autowired
    private CreateService createService;
    @PostMapping("/")
    public Candidate createCandidate(@RequestBody Candidate candidate) {
        log.info("Inside createCandidate method of CreateController");
        return  createService.saveCandidate(candidate);
    }
}
