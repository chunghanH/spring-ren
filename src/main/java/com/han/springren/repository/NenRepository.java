package com.han.springren.repository;

import com.han.springren.entity.Nen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NenRepository extends JpaRepository<Nen, Long> {
    public List<Nen> findAll();
    public List<Nen> findById(int id);
    public void deleteById(int id);
}
