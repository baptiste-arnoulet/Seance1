package fr.univ_amu.iut;

import java.time.LocalDate;

public class Techniciens extends Employe {
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Techniciens(int num, int num_Secu, String nom, String prenom, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures, int nbunitesproduit, double tauxcommisionunite) {
        super(num, num_Secu, nom, prenom, echelon, date_naissance, date_embauche, base, nbHeures);
        this.nbUnitesProduites = nbunitesproduit;
        this.tauxCommissionUnite = tauxcommisionunite;
        this.salaire_brut = getSalaireBrutTechniciens(base, nbHeures, nbUnitesProduites, tauxCommissionUnite);
        this.salaire_net = CalculSalaireNet(salaire_brut);
    }

    public int getSalaireBrutTechniciens(double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite){
        return salaire_brut = (int)base * (int)nbHeures + nbUnitesProduites * (int)tauxCommissionUnite +100;
    }

    public void fabriquerProduit(){
        System.out.println("Il fabrique un produit");
    }

    @Override
    public String toString() {
        return "Techniciens{" +
                "nbUnitesProduites=" + nbUnitesProduites +
                ", tauxCommissionUnite=" + tauxCommissionUnite +
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
