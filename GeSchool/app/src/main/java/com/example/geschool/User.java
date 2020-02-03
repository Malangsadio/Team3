package com.example.geschool;

public class User {
    private String idUser;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Niveau;

    public User() {

    }


    public User(String id, String nom, String prenom, String adresse, String niveau ) {
        idUser = id;
        Nom = nom;
        Prenom = prenom;
        Adresse = adresse;
        Niveau = niveau;

    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setNiveau(String niveau) {
        Niveau = niveau;
    }


}