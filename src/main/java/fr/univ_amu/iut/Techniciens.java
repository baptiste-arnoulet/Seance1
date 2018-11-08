package fr.univ_amu.iut;

import java.time.LocalDate;

public class Techniciens extends Employe {
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Techniciens(int num, int num_Secu, String nom, String prenom, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures, int nbunitesproduit, double tauxcommisionunite) {
        super(num, num_Secu, nom, prenom, echelon, date_naissance, date_embauche, base, nbHeures);
        this.nbUnitesProduites = nbunitesproduit;
        this.tauxCommissionUnite = tauxcommisionunite;
    }

    public void fabriquerProduit(){
        System.out.println("Il fabrique un produit");
    }


}
