package com.onlinejudge.security.service.impl;


import com.onlinejudge.security.repository.TestcaseRepository;
import com.onlinejudge.security.entities.Problem;
import com.onlinejudge.security.repository.ProblemRepository;
import com.onlinejudge.security.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    private ProblemRepository problemRepository;

    @Autowired
    private TestcaseRepository testcaseRepository;
    @Override
    public Problem createProblem(Problem problem) {
//        Testcase savedTestcase = testcaseRepository.save(problem.getTestcase()); // Save the testcase
//        problem.setTestcase(savedTestcase);
        return problemRepository.save(problem);
    }

    @Override
    public List<Problem> getAllProblem() {
        return problemRepository.findAll();
    }

    @Override
    public Problem getProblemById(Long id) {
        return problemRepository.getReferenceById(id);
    }

    @Override
    public String deleteProblem(Long id) {
        problemRepository.deleteById(id);
        return "Problem has been deleted from the server";
    }
}
