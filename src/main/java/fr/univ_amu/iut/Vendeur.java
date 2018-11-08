package fr.univ_amu.iut;

import java.time.LocalDate;

public class Vendeur extends Commerciaux{

    public Vendeur(int num, int num_Secu, String nom, String prenom, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures, double chiffreaffaire, double tauxcommision) {
        super(num, num_Secu, nom, prenom, echelon, date_naissance, date_embauche, base, nbHeures, chiffreaffaire, tauxcommision);
        salaire_brut = getSalaireBrutCommerciaux(base, chiffreaffaire, tauxcommision);
        salaire_net = CalculSalaireNet(salaire_brut);
    }

    @Override
    public String toString() {
        return "Vendeur{" +
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
