package fr.univ_amu.iut.exo3;

import fr.univ_amu.iut.*;
import fr.univ_amu.iut.Entreprise;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {
        ArrayList<Employe> ListEmploye = new ArrayList<Employe>();
        ArrayList<EmployeOrdinaire> ListEmployeOrdinaire = new ArrayList<EmployeOrdinaire>();
        Employe Employe1 = new Employe(1, 2, "George", "Didier", 1, LocalDate.of(1999, 10, 25), LocalDate.of(2015, 10,25), 4,7);
        Employe Employe2 = new Employe(2, 3, "maude", "latour", 3, LocalDate.of(1997, 05, 23), LocalDate.of(2014, 12,26), 3.2,6.1);
        EmployeOrdinaire EmployeOrdinaire1 = new EmployeOrdinaire(3, 4, "Jean", "Neymar", 2, LocalDate.of(1997, 05, 23), LocalDate.of(2013, 11,25), 3,6);
        Techniciens techniciens1 = new Techniciens(5, 6, "patrick", "leon", 2, LocalDate.of(1993, 06, 13), LocalDate.of(2015, 10,30), 2.5,4, 6, 3);
        Commerciaux commerciaux1 = new Commerciaux(4,5,"lol", "papaa", 4, LocalDate.of(1997, 05, 23), LocalDate.of(2013, 1,6), 2,5, 200, 4);
        Vendeur vendeur1 = new Vendeur(4,5,"mdre", "gdqf", 4, LocalDate.of(1997, 05, 23), LocalDate.of(2014, 10,25), 2,5, 150, 4);
        Représentant représentant1 = new Représentant(4,5,"gaga", "fafa", 3, LocalDate.of(1997, 05, 23), LocalDate.of(2015, 9,23), 2,5, 170, 4);

        ListEmploye.add(Employe1);
        ListEmploye.add(Employe2);
        ListEmploye.add(EmployeOrdinaire1);
        ListEmploye.add(commerciaux1);
        ListEmploye.add(techniciens1);
        ListEmploye.add(vendeur1);
        ListEmploye.add(représentant1);
        Entreprise entreprise = new Entreprise("maBoiteInfo", ListEmploye);
        System.out.println(entreprise);

    }
}