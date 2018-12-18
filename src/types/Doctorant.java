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
public class Doctorant extends Etudiant{
    String thémedethése;
    int annéeinscriptionthése;
    Enseignant directeurdethése;

    public Doctorant(int ninscription, String specialité, String nom, String prenom, String adresse) {
        super(ninscription, specialité, nom, prenom, adresse);
    }
    void afficherParDirecteurDeThése(){
        
    }
}
