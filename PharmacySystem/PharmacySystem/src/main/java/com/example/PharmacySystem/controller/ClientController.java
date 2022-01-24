package com.example.PharmacySystem.controller;

import com.example.PharmacySystem.entity.Client;
import com.example.PharmacySystem.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ClientController {
    @Autowired
    private ClientRepository repository;

    @GetMapping("/Clients")
    public String viewClient(Model model) {
        model.addAttribute("client", repository.findAll());
        return "Clients";
    }

    @PostMapping("/addCl")
    public String addCl(Client client, Model model) {
        model.addAttribute("clientsList", new Client());
        repository.save(client);
        return "redirect:/Clients";
    }

    @GetMapping("/delete2/{id}")
    public String delClient(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return "redirect:/Clients";
    }

    @GetMapping("/edit2/{id}")
    public String editClient(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("client", repository.findById(id).get());
        model.addAttribute("clientsList", repository.findAll());
        return "editClients";
    }
}

