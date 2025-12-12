package miniprojet_cadenas_nom;

public class CadenasJeu {

    private int[] combinaisonSecrete;   
    private int nbEssaisMax;            
    private int nbEssaisCourants;       
    private boolean partieTerminee;

    // ---- Constructeur ----
    public CadenasJeu(int nbEssaisMax) {
        this.nbEssaisMax = nbEssaisMax;
        this.nbEssaisCourants = 0;
        this.partieTerminee = false;
        genererCombinaison();
    }

    // ---- Génération aléatoire ----
    private void genererCombinaison() {
        combinaisonSecrete = new int[4];
        for(int i=0; i<4; i++){
            combinaisonSecrete[i] = (int)(Math.random() * 10);
        }
    }

    // ---- Tester une proposition ----
    public ResultatEssai tester(int[] proposition) {

        nbEssaisCourants++;

        int exact = 0;
        int tropHaut = 0;
        int tropBas = 0;

        for(int i=0; i<4; i++){
            if(proposition[i] == combinaisonSecrete[i]) exact++;
            else if(proposition[i] > combinaisonSecrete[i]) tropHaut++;
            else tropBas++;
        }

        if(exact == 4) partieTerminee = true;
        if(nbEssaisCourants >= nbEssaisMax) partieTerminee = true;

        return new ResultatEssai(exact, tropHaut, tropBas);
    }

    // ---- Getters ----
    public boolean isPartieTerminee() { return partieTerminee; }
    public int getNbEssaisCourants() { return nbEssaisCourants; }
    public int getNbEssaisMax() { return nbEssaisMax; }
}