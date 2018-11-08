package fr.univ_amu.iut;

import java.io.*;
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
    public void sauvegarder() {
        try {
            FileOutputStream fos = new FileOutputStream("sauv.data");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.list_employe);
            System.out.println("Données sauvegardées..");
            oos.close();
            fos.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void charger() throws ClassNotFoundException{
        try{
            FileInputStream fis = new FileInputStream("sauv.data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Employe> liste = (ArrayList<Employe>) ois.readObject();
            System.out.println(liste);
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

