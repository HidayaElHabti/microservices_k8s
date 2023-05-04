package com.cedoc.getAllservice.controller;

import com.cedoc.getAllservice.entity.Candidate;
import com.cedoc.getAllservice.service.GetAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getAll")
public class GetAllController {
    @Autowired
    private GetAllService getAllService;

    @GetMapping("/")
    public List<Candidate> getAllCandidates(){
        return getAllService.getAllCandidates();
    }
}
