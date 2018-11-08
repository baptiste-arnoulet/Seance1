package fr.univ_amu.iut;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Entreprise {
    private String nom;
    private ArrayList<Employe> list_employe;

    public Entreprise(String nom, ArrayList<Employe> list_employe) {
        this.nom = nom;
        this.list_employe = list_employe;
    }

    @Override
    public String toString() {
        distribueBonus();
        return "Entreprise{" +
                "nom='" + nom + '\'' +
                ", list_employe=" + list_employe +
                '}';
    }

    public void distribueBonus(){
        for (Employe employe: list_employe){
            long nbMois = ChronoUnit.MONTHS.between(employe.getDate_embauche(), LocalDate.now());
            System.out.println(employe + "Prime : " + nbMois*10);
        }
    }
}

