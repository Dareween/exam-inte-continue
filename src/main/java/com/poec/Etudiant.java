package com.poec;

public class Etudiant {

    private String nom;

    private String prenom;

    private String adresse;

    private String anneeNaissance;



    public Etudiant(String nom, String prenom, String adresse, String anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.anneeNaissance = anneeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
