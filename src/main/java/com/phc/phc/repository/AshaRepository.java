package com.phc.phc.repository;

import com.phc.phc.entity.Asha;
import com.phc.phc.entity.AshaWorker;
import com.phc.phc.entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AshaRepository extends JpaRepository<Asha, Integer> {

    Asha findByUsername(String username);

}
