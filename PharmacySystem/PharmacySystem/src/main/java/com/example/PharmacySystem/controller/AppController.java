package com.example.PharmacySystem.controller;

import com.example.PharmacySystem.entity.Medicine;
import com.example.PharmacySystem.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
   private MedicineRepository MedicineRepository;

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("medicine", new Medicine());
        model.addAttribute("MedicinesList", MedicineRepository.findAll());
        return "index";
    }
}
