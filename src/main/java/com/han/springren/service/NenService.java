package com.han.springren.service;

import com.han.springren.entity.Nen;
import com.han.springren.repository.NenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NenService {
    @Autowired
    NenRepository nenRepository;

    public List<Nen> findAll() {
        return nenRepository.findAll();
    }

    public List<Nen> findById(int id) {
        return nenRepository.findById(id);
    }

    public void save(Nen nen) {
        nenRepository.save(nen);
    }

    public void deleteById(int id) {
        nenRepository.deleteById(id);
    }
}
