/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositmap;

/**
 *
 * @author Wahch
 */
public class PrositMap {

   
    public static void main(String[] args) {
        Employe E1 = new Employe(3,  4 , "wahch", "mohamed");
        Employe E2 = new Employe(1, 50 , "yacine", "kh");
        Employe E3 = new Employe(2, 25 ,"majdi", "tebssi");
        Departement D1 = new Departement(1, "finance") ;
        Departement D2 = new Departement(2, "RH") ; 
        SocieteHashMap Esprit = new SocieteHashMap(); 
        System.out.println("ajout des employe au departements : ");
        Esprit.ajouterEmployeDepartement(E1,D1) ;
        Esprit.ajouterEmployeDepartement(E2,D2) ;
        Esprit.ajouterEmployeDepartement(E3,D2) ;
        Esprit.supprimerEmploye(E2); 
        Esprit.afficherLesEmployesLeursDepartements() ; 
        Esprit.afficherLesEmployes(); 
        Esprit.afficherLesDepartements();
        Esprit.afficherDepartement(E3); 
        Esprit.rechercherEmploye(E3) ; 
        Esprit.rechercherDepartement(D2) ; 
    }
    
}
