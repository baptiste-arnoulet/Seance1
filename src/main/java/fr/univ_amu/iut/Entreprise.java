package fr.univ_amu.iut;

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
        return "Entreprise{" +
                "nom='" + nom + '\'' +
                ", list_employe=" + list_employe +
                '}';
    }
}

