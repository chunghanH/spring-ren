package com.han.springren.controller;

import com.han.springren.entity.Nen;
import com.han.springren.service.NenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NenController {

    @Autowired
    NenService nenService;

    @GetMapping("/nens")
    public List<?> findAll() {
        return nenService.findAll();
    }

    @GetMapping("/nens/{id}")
    public List<?> findById(@PathVariable("id") int id) {
        return nenService.findById(id);
    }

    @PostMapping("/nens/{name}")
    public void save(@PathVariable("name") String name) {
        Nen nen = new Nen();
        nen.setName(name);
        nenService.save(nen);
    }

    @DeleteMapping("/nens/{id}")
    public void deleteById(@PathVariable("id") int id) {
        nenService.deleteById(id);
    }



}
