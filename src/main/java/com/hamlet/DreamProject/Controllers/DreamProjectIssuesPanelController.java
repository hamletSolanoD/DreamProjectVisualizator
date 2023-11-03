package com.hamlet.DreamProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DreamProjectIssuesPanelController { 


    @GetMapping("/candidatospoliticos/{id}") 
    public String verDetallesCandidato(@PathVariable Long id, Model model) {
        
        return "dreamProjectIssues/mainPanel"; 
    }
    
}
