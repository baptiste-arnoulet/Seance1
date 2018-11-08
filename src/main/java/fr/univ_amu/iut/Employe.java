package fr.univ_amu.iut;

import java.time.LocalDate;

public class Employe {
    private int num;
    private int num_Secu;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate date_naissance;
    private LocalDate date_embauche;
    private double base;
    private double nbHeures;
    private int salaire_brut;
    private int salaire_net;


    public Employe(int num, int num_Secu, String nom, String prenom, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures) {
        this.num = num;
        this.num_Secu = num_Secu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.date_naissance = date_naissance;
        this.date_embauche = date_embauche;
        this.base = base;
        this.nbHeures = nbHeures;
        this.salaire_brut = CalculSalaireBrut(this.base, this.nbHeures);
        this.salaire_net = CalculSalaireNet(this.salaire_brut);
    }

    public int CalculSalaireBrut(double base, double nbHeures){
        salaire_brut = (int)base * (int)nbHeures;
        return salaire_brut;
    }

    public int CalculSalaireNet(int salaire_brut){
        return salaire_net = salaire_brut * 80 / 100;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "num=" + num +
                ", num_Secu=" + num_Secu +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", date_naissance=" + date_naissance +
                ", date_embauche=" + date_embauche +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                ", salaire_brut=" + salaire_brut +
                ", salaire_net=" + salaire_net +
                '}';
    }
}
