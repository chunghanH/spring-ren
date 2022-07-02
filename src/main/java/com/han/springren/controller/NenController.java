package com.han.springren.controller;

import com.han.springren.entity.Nen;
import com.han.springren.service.NenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NenController {

    @Autowired
    NenService nenService;

    @GetMapping("/nen")
    public List<?> getNen() {
        return nenService.findAll();
    }

    @GetMapping(value="/nen/{name}")
    public void setNen(@PathVariable("name") String name) {
        Nen nen = new Nen();
        nen.setName(name);
        nenService.save(nen);
    }
}
