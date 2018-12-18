package types;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spertch9a
 */
public class Etudiant extends Abonné{
    int ninscription;
    String specialité;
    void afficherParSpecialité(){
        
    }

    public Etudiant(int ninscription, String specialité, String nom, String prenom, String adresse) {
        super(nom, prenom, adresse);
        this.ninscription = ninscription;
        this.specialité = specialité;
    }
    
}
