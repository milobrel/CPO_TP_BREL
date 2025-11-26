/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_brel;

/**
 *
 * @author milob
 */
public class Epee extends Arme {
    int finesse;

    public Epee(String nom, int finesse, int attaque) {
        super(nom, attaque);
        this.finesse = Math.min(finesse, 100);
    }
    
    public int getFinesse() {
        return finesse;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}