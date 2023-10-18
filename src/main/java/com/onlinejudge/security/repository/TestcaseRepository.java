package com.onlinejudge.security.repository;

import com.onlinejudge.security.entities.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TestcaseRepository  extends JpaRepository<Problem,Long> {
}
