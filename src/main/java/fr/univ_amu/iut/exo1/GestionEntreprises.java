package fr.univ_amu.iut.exo1;

import fr.univ_amu.iut.Employe;
import fr.univ_amu.iut.Entreprise;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {
        ArrayList<Employe> ListEmploye = new ArrayList<>();
        Employe Employe1 = new Employe(1, 2, "George", "Didier", 1, LocalDate.of(1999, 10, 25), LocalDate.of(2015, 10,25), 4,7);
        Employe Employe2 = new Employe(2, 3, "Jean", "Neymar", 3, LocalDate.of(1997, 05, 23), LocalDate.of(2015, 10,25), 3.2,6.1);
        ListEmploye.add(Employe1);
        ListEmploye.add(Employe2);
        Entreprise entreprise = new Entreprise("maBoiteInfo", ListEmploye);
        System.out.println(entreprise);
    }
}