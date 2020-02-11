package com.example.geschool;

public class User {
    private String idUser;
    private String nom;
    private String prenom;
    private String adresse;
    private String niveau;
    private String phone;

    public User(){

    }

    public User( String nom, String prenom, String adresse, String niveau, String phone) {

        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.niveau = niveau;
        this.phone = phone;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
