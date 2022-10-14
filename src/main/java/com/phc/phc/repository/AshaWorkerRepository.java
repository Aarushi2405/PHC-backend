package com.phc.phc.repository;

import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.DischargeChildDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AshaWorkerRepository extends JpaRepository<AshaWorker, Long> {
}
