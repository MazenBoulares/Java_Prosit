
import tn.tuniprob.gestionemploye.Caissier;
import tn.tuniprob.gestionemploye.Responsable;
import tn.tuniprob.gestionemploye.Vendeur;
import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionproduit.Produit;

import java.util.Date;

public class Main2 {

    public static void main(String[] args) {

        //Produit p1= new Produit("Lait","Delice",Integer.floatValue(1021);

        Produit p1 = new Produit(1021, "Lait", "Delice");

        Produit p2 = new Produit(2510, "Yaourt", "Vitalait");


        Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.200f);


        p1.afficher();

        p2.afficher();


        p3.afficher();


        //Question 4: Attribuer le prix 0.700 au produit lait, afficher le produit modifié.

        p1.setPrix(0.700f);

        p1.afficher();

        //Question 5: Compléter les informations manquantes pour chaque produit

        p2.setPrix(0.700f);


        p2.afficher();


        //Question 7 : Afficher les produits déjà crées avec la méthode toString().
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p3);


        //Question 8 : ajout date

        p1.setDate(new Date(1234567890123L));

        System.out.println(p1);


// partie 2 : magasgin


        Magasin g1 = new Magasin(1, " Hammam chatt", 30);
        System.out.println(("avant"));

        g1.ajouterProduit(p2);


        g1.ajouterProduit(p3);

        System.out.println(("aprés"));


        g1.ajouterProduit(p1);

        g1.afficherCaracter();

        System.out.println((g1));

        // Afficher le nombre totale de tous les produits dans les magasins

        System.out.println(("prod globale " + g1.getnbProdGlobale()));

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

        g3.ajoutEmploye(new Vendeur(6, "Feleh", "Mariem", 59, 56.3f));
        g3.ajoutEmploye(new Vendeur(7, "Yaich", "Zeineb", 23, 69.3f));
        g3.ajoutEmploye(new Vendeur(8, "dridi", "Ahmed", 71, 89.1f));
        g3.ajoutEmploye(new Responsable(9, "masmoudi", "May", 67, 1201f));


        System.out.println(g2.toString());

    }


}
