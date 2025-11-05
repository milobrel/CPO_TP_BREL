/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_brel;

/**
 *
 * @author milob
 */
public class BouteilleBiere {
    String nom;
    String brasserie;
    double degreAlcool;
    boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " deszres) \nBrasserie : " + brasserie);

    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;

    }

    public void decapsuler() {
        if (ouverte == true)
                System.out.print("erreur : biere deja ouverte");
        if (ouverte == false)
                ouverte = true;

    }
    @Override
    public String toString(){
        String chaine_a_retourner;
        chaine_a_retourner = nom + "("+ degreAlcool +" degres) Ouverte ?";
        
        if (ouverte == true) chaine_a_retourner += " oui";
        else chaine_a_retourner += "non";
        return chaine_a_retourner;
    }
}
