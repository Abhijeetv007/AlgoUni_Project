package com.onlinejudge.security.controller;


import com.onlinejudge.security.service.ProblemService;
import com.onlinejudge.security.entities.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/online-judge")
public class ProblemController {

    @Autowired
    private ProblemService problemService;

    //Creating problem
    @PostMapping("/problem")
    public ResponseEntity<Problem> createProblem(@RequestBody Problem problem){
        return new ResponseEntity<>(problemService.createProblem(problem), HttpStatus.CREATED);
    }

    //Getting problem list
    @GetMapping("/problems")
    public ResponseEntity<List<Problem>> getAllProblem(){
        return new ResponseEntity<>(problemService.getAllProblem(),HttpStatus.OK);
    }

    //Getting problem details using id
    @GetMapping("/problem/{id}")
    public ResponseEntity<Problem> getProblem(@PathVariable Long id){
        return new ResponseEntity<>(problemService.getProblemById(id),HttpStatus.OK);
    }

    //Deleting problem by id
    @DeleteMapping("/problem/{id}")
    public ResponseEntity<String> deleteProblem(@PathVariable Long id){
        return new ResponseEntity<>(problemService.deleteProblem(id),HttpStatus.OK);
    }


}
