package fr.univ_amu.iut;

import fr.univ_amu.iut.EmployeOrdinaire;

import java.time.LocalDate;

public class Représentant extends Commerciaux {
    public Représentant(int num, int num_Secu, String nom, String prenom, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures, double chiffreaffaire, double tauxcommision) {
        super(num, num_Secu, nom, prenom, echelon, date_naissance, date_embauche, base, nbHeures, chiffreaffaire, tauxcommision);
        salaire_brut = getSalaireEmployeOrdinaire(base, nbHeures, echelon);
        salaire_net = CalculSalaireNet(salaire_brut);
    }


    public int getSalaireEmployeOrdinaire(double base, double nbHeure, int echelon){
        return salaire_brut = (int)base * (int)nbHeure + echelon * 100 +100;
    }

    @Override
    public String toString() {
        return "Représentant{" +
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
