package com.example.registrationlogindemo.controller;


import com.example.registrationlogindemo.entity.Contact;
import com.example.registrationlogindemo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping
    public String showContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contactForm";
    }

    @PostMapping
    public String processContactForm(Contact contact) {
        contactRepository.save(contact);
        return "contactSuccess";
    }
}
