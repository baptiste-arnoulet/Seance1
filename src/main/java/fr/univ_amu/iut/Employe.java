package fr.univ_amu.iut;

import java.time.LocalDate;

public class Employe {
    protected int num;
    protected int num_Secu;
    protected String nom;
    protected String prenom;
    protected int echelon;
    protected LocalDate date_naissance;
    protected LocalDate date_embauche;
    protected double base;
    protected double nbHeures;
    protected int salaire_brut;
    protected int salaire_net;


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

    protected int CalculSalaireNet(int salaire_brut){
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
