package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenace(Maintenance maintenance);
    Maintenance modifierMaintenance(Maintenance maintenance);
    Maintenance afficherMaintenanceById(Long id);
    List<Maintenance> afficherAllMaintenance();
    void supprimerMaintenance(Long id);
}
