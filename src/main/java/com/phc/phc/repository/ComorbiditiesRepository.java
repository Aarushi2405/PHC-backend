package com.phc.phc.repository;

import com.phc.phc.entity.ComorbidConditionValue;
import com.phc.phc.entity.PhcDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComorbiditiesRepository extends JpaRepository<ComorbidConditionValue, Integer> {
}
