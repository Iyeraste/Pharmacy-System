package com.example.PharmacySystem.controller;

import com.example.PharmacySystem.entity.Insurance;
import com.example.PharmacySystem.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InsuranceController {
    @Autowired
    private InsuranceRepository repository;

    @GetMapping("/Insurance")
    public String viewInsurance(Model model) {
        model.addAttribute("insurance", repository.findAll());
        return "Insurance";
    }

    @PostMapping("/addIns")
    public String addIns(Insurance insurance, Model model) {
        model.addAttribute("rance", new Insurance());
        repository.save(insurance);
        return "redirect:/Insurance";
    }

    @GetMapping("/delete3/{id}")
    public String delClient(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return "redirect:/Insurance";
    }

    @GetMapping("/edit3/{id}")
    public String editClient(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("rance", repository.findById(id).get());
        model.addAttribute("insurance", repository.findAll());
        return "editInsurance";
    }
}

