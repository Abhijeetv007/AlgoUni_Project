package com.onlinejudge.security.service;



import com.onlinejudge.security.entities.Problem;

import java.util.List;

public interface ProblemService {

    Problem createProblem(Problem problem);
    List<Problem> getAllProblem();
    Problem getProblemById(Long id);
    String deleteProblem(Long id);

}
