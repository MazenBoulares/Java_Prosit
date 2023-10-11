
import tn.tuniprob.gestionemploye.Caissier;
import tn.tuniprob.gestionemploye.Responsable;
import tn.tuniprob.gestionemploye.Vendeur;
import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionproduit.Produit;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        // Prosit 4 : ********************************************************


// Question 1 :

        Magasin g2 = new Magasin(2, "Carrefour", "Centre-Ville");
        Magasin g3 = new Magasin(3, "Monoprix", "Menzah 6");


//Question 2 :
// Créer 2 caissiers, un vendeur et un responsable pour le premier magasin


        g2.ajoutEmploye(new Caissier(3, "Mazen", "Boulares", 23, 1024));
        g2.ajoutEmploye(new Caissier(3, "Mark", "Zuccerburg", 20, 1300));
        g2.ajoutEmploye(new Vendeur(4, "Fartass", "Ahmed", 56, 56.3f));
        g2.ajoutEmploye(new Responsable(5, "kortass", "moahamed", 65, 120f));


//un caissier, 3 vendeurs et un responsable pour le deuxième magasin.

        Vendeur v1 = new Vendeur(6, "Feleh", "Mariem", 59, 56.3f);

        g3.ajoutEmploye(v1);
        g3.ajoutEmploye(new Vendeur(7, "Yaich", "Zeineb", 23, 69.3f));
        g3.ajoutEmploye(new Vendeur(8, "dridi", "Ahmed", 71, 89.1f));
        g3.ajoutEmploye(new Responsable(9, "masmoudi", "May", 67, 1201f));

//Questions 3 :

//        Afficher les caractéristiques des employés déjà créés )

        System.out.println(v1.toString());

 //Questions 4 :

//Créer et ajouter quelques produits pour chaque magasin
        Produit p1 = new Produit(1021, "Lait", "Delice", 1.200f);

        Produit p2 = new Produit(2510, "Yaourt", "Vitalait", 1.200f);

        Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.200f);

        Produit p4 = new Produit(5489, "7lib", "delcie", 900f);

        p1.afficher();

        g2.ajouterProduit(p1);

        g2.ajouterProduit(p2);

        g3.ajouterProduit(p3);

        g3.ajouterProduit(p4);

//Question 5:

//Afficher tous les détails de chaque magasin (id, nom, adresse, capacité, les produits et les employés).

       System.out.println("magasin 1");
        g2.afficherCaracter();

        System.out.println("");
        System.out.println("");

        System.out.println("magasin 2");
        g3.afficherCaracter();

//prosit 5 *


        //Mise à jour de la méthode toString dans la classe Magasin // equivalant a to string

       g2.afficherCaracter();


       //Afficher les salaires de tous les employés dans un magasin public void afficheSalaire()

        g2.afficherSalaire();

//        -Afficher la prime que des responsable dans le magasin
//        public void affichePrimeResponsable ()
        g2.affichePrimeResponsable();
        g3.affichePrimeResponsable();


        //Afficher le nombre des employés par type dans le magasin
        g2.afficheParType();

    }
}


//Ajouter la méthode public boolean equals(Object o) dans la classe Employe qui permet de comparer les employes selon l'identifiant et le nom.
