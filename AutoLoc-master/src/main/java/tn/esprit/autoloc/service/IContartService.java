package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.domain.Contrat;

import java.util.List;

public interface IContartService {
    Contrat ajouterContart(Contrat contrat);
    Contrat modifierContrat (Contrat contrat);
    Contrat  afficherContratById(Long id);
    List<Contrat> afficherAllContrats();
    void supprimerContrat(Long id);
}
