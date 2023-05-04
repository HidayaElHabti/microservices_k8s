package com.cedoc.getservice.controller;

import com.cedoc.getservice.entity.Candidate;
import com.cedoc.getservice.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/get")
@Slf4j
public class GetController {
    @Autowired
    private GetService getService;
    @GetMapping("/{id}")
    public Candidate getCandidate(@PathVariable("id") Long candidateId) {
        log.info("Inside getCandidate method of GetController");
        return  getService.getCandidate(candidateId);
    }
}