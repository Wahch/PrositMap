/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Wahch
 */
public class SocieteTreeMap implements InterfaceSociete {
Map<Employe,Departement> Tm  ;

    public SocieteTreeMap() {
        this.Tm= new TreeMap (); 
    }
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        Tm.put(e, d) ; 
    }

    @Override
    public void supprimerEmploye(Employe e) {
        Tm.remove(e) ; 
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        System.out.println(Tm);
    }
    @Override
    public void afficherLesEmployes() {
        System.out.println(Tm.keySet());
    }

    @Override
    public void afficherLesDepartements() {
        System.out.println(Tm.values());   
    }

    @Override
    public void afficherDepartement(Employe e) {
        
         System.out.println(Tm.get(e));   
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
       if ( Tm.containsKey(e)) 
       {return true ; }
       else return false ; 
       
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
         if ( Tm.containsValue(e)) 
       {return true ; }
       else return false ; 
    }
    
}
