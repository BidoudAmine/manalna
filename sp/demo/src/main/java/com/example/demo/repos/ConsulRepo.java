package com.example.demo.repos;

import com.example.demo.classes.Consultation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConsulRepo extends JpaRepository<Consultation, Integer> {
    List<Consultation> findByMedecinId(int medecinId);

}
