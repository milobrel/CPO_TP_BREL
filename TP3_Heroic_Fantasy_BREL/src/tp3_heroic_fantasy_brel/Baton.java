package tp3_heroic_fantasy_brel;

/**
 *
 * @author milob
 */
public class Baton extends Arme {
    private final int age;

   
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appelle le constructeur de Arme
        this.age = (age < 100) ? age : 99; // Limite l'âge à 99
    }

    
    public int getAge() {
        return age;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Âge : " + age;
    }
}

    