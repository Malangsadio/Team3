package com.example.geschool;

public class Post {
    private String classe;
    private String prix;

    public Post(String classe, String prix) {
        this.classe = classe;
        this.prix = prix;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getPrix() {

        return prix;
    }

    public void setPrix(String prix) {

        this.prix = prix;
    }
}
