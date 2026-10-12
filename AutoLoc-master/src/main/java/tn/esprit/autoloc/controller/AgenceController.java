package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agences")

public class AgenceController {
    private final IAgenceService agenceService;
    @GetMapping("/afficherAllAgences")

    public List<Agence> getAllAgence(){
        return agenceService.afficherAllAgences();
    }

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence){
        return agenceService.ajouterAgence(agence);
    }

}
