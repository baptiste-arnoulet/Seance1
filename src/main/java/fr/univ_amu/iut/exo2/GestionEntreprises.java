package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.Commerciaux;
import fr.univ_amu.iut.Employe;
import fr.univ_amu.iut.EmployeOrdinaire;
import fr.univ_amu.iut.Entreprise;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {
        ArrayList<Employe> ListEmploye = new ArrayList<Employe>();
        ArrayList<EmployeOrdinaire> ListEmployeOrdinaire = new ArrayList<EmployeOrdinaire>();
        Employe Employe1 = new Employe(1, 2, "George", "Didier", 1, LocalDate.of(1999, 10, 25), LocalDate.of(2015, 10,25), 4,7);
        Employe Employe2 = new Employe(2, 3, "Jean", "Neymar", 3, LocalDate.of(1997, 05, 23), LocalDate.of(2015, 10,25), 3.2,6.1);
        EmployeOrdinaire EmployeOrdinaire1 = new EmployeOrdinaire(3, 4, "Jean", "Neymar", 2, LocalDate.of(1997, 05, 23), LocalDate.of(2015, 10,25), 3,6);
        Commerciaux commerciaux1 = new Commerciaux(4,5,"lol", "papaa", 4, LocalDate.of(1997, 05, 23), LocalDate.of(2015, 10,25), 2,5, 200, 4);
        ListEmploye.add(Employe1);
        ListEmploye.add(Employe2);
        ListEmploye.add(EmployeOrdinaire1);
        ListEmploye.add(commerciaux1);
        Entreprise entreprise = new Entreprise("maBoiteInfo", ListEmploye);
        System.out.println(entreprise);
    }
}