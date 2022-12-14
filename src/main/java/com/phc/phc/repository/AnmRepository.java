package com.phc.phc.repository;

import com.phc.phc.entity.Anm;
import com.phc.phc.entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//import javax.print.Doc;

public interface AnmRepository extends JpaRepository<Anm, Integer> {

    @Override
    @Query("Select u from Anm u where u.status='ACTIVE'")
    List<Anm> findAll();

    Anm findByUsername(String username);
}
