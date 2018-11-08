package fr.univ_amu.iut;

import java.time.LocalDate;

public class Commerciaux extends Employe {
    protected double chiffreAffaire;
    protected double tauxCommission;

    public Commerciaux(int num, int num_Secu, String nom, String prenom, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures, double chiffreaffaire, double tauxcommision) {
        super(num, num_Secu, nom, prenom, echelon, date_naissance, date_embauche, base, nbHeures);
        this.chiffreAffaire = chiffreaffaire;
        this.tauxCommission = tauxcommision;
        salaire_brut = getSalaireBrutCommerciaux(base, chiffreAffaire, tauxCommission);
        salaire_net = CalculSalaireNet(salaire_brut);
    }

    public int getSalaireBrutCommerciaux(double base, double chiffreAffaire, double tauxCommission) {
        return salaire_brut = (int)base + (int)chiffreAffaire * (int)tauxCommission + 100;
    }

    public void negocierTransaction(){
        System.out.println("Il negocie une transaction");
    }

    @Override
    public String toString() {
        return "Commerciaux{" +
                "chiffreAffaire=" + chiffreAffaire +
                ", tauxCommission=" + tauxCommission +
                ", num=" + num +
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
                '}' + "\n";
    }


}
