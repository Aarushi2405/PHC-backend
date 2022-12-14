package com.phc.phc.repository;

import com.phc.phc.entity.Anm;
import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.DischargeChildDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AshaWorkerRepository extends JpaRepository<AshaWorker, Integer> {

    @Override
    @Query("Select u from AshaWorker u where u.status='ACTIVE'")
    List<AshaWorker> findAll();

    @Query(value="Select u from AshaWorker u where u.ashaId=?1")
    AshaWorker getAshaById(int ashaId);
    List<AshaWorker> findByWardOrAreaOrPincode(String ward, String area, String pincode);
}
