package com.example.PharmacySystem.controller;

import com.example.PharmacySystem.entity.Medicine;
import com.example.PharmacySystem.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicineController {
    @Autowired
    private MedicineRepository repository;

    @GetMapping("/Medicines")
    public String viewMedicine(Model model) {
        model.addAttribute("MedicinesList", repository.findAll());
        return "Medicines";
    }

    @PostMapping("/addMed")
    public String addMed(Medicine medicine, Model model) {
        model.addAttribute("medicine", new Medicine());
        repository.save(medicine);
        return "redirect:/Medicines";
    }

    @GetMapping("/delete1/{id}")
    public String delMed(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return "redirect:/Medicines";
    }

    @GetMapping("/edit1/{id}")
    public String editMedicines(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("medicine", repository.findById(id).get());
        model.addAttribute("MedicinesList", repository.findAll());
        return "editMedicines";
    }
}

