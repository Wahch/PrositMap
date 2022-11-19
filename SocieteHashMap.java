/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Wahch
 */
public class SocieteHashMap implements InterfaceSociete {
    Map<Employe,Departement> Hm  ;

    public SocieteHashMap() {
        this.Hm= new HashMap (); 
    }
    

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        Hm.put(e, d) ; 
    }

    @Override
    public void supprimerEmploye(Employe e) {
        Hm.remove(e) ;  
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        System.out.println(Hm);
    }

    @Override
    public void afficherLesEmployes() {
       System.out.println(Hm.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(Hm.values());
    }
    @Override
    public void afficherDepartement(Employe e) {
         System.out.println(Hm.get(e));  
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        if ( Hm.containsKey(e)) 
       {return true ; }
       else return false ; 
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
         if ( Hm.containsValue(e)) 
       {return true ; }
       else return false ; 
    }
    }
    
}
