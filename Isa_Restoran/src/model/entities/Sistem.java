/***********************************************************************
 * Module:  Sistem.java
 * Author:  milan
 * Purpose: Defines the Class Sistem
 ***********************************************************************/

package model.entities;

import model.users.MenadzerSistema;
import model.users.Gost;
import java.util.*;

public class Sistem {
   public java.util.List<MenadzerSistema> menadzeriSistema;
   public java.util.List<Restoran> restorani;
   public java.util.List<Gost> gosti;
   
   
   /** @pdGenerated default getter */
   public java.util.List<MenadzerSistema> getMenadzeriSistema() {
      if (menadzeriSistema == null)
         menadzeriSistema = new java.util.ArrayList<MenadzerSistema>();
      return menadzeriSistema;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMenadzeriSistema() {
      if (menadzeriSistema == null)
         menadzeriSistema = new java.util.ArrayList<MenadzerSistema>();
      return menadzeriSistema.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMenadzeriSistema */
   public void setMenadzeriSistema(java.util.List<MenadzerSistema> newMenadzeriSistema) {
      removeAllMenadzeriSistema();
      for (java.util.Iterator iter = newMenadzeriSistema.iterator(); iter.hasNext();)
         addMenadzeriSistema((MenadzerSistema)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMenadzerSistema */
   public void addMenadzeriSistema(MenadzerSistema newMenadzerSistema) {
      if (newMenadzerSistema == null)
         return;
      if (this.menadzeriSistema == null)
         this.menadzeriSistema = new java.util.ArrayList<MenadzerSistema>();
      if (!this.menadzeriSistema.contains(newMenadzerSistema))
         this.menadzeriSistema.add(newMenadzerSistema);
   }
   
   /** @pdGenerated default remove
     * @param oldMenadzerSistema */
   public void removeMenadzeriSistema(MenadzerSistema oldMenadzerSistema) {
      if (oldMenadzerSistema == null)
         return;
      if (this.menadzeriSistema != null)
         if (this.menadzeriSistema.contains(oldMenadzerSistema))
            this.menadzeriSistema.remove(oldMenadzerSistema);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMenadzeriSistema() {
      if (menadzeriSistema != null)
         menadzeriSistema.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Restoran> getRestorani() {
      if (restorani == null)
         restorani = new java.util.ArrayList<Restoran>();
      return restorani;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRestorani() {
      if (restorani == null)
         restorani = new java.util.ArrayList<Restoran>();
      return restorani.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRestorani */
   public void setRestorani(java.util.List<Restoran> newRestorani) {
      removeAllRestorani();
      for (java.util.Iterator iter = newRestorani.iterator(); iter.hasNext();)
         addRestorani((Restoran)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRestoran */
   public void addRestorani(Restoran newRestoran) {
      if (newRestoran == null)
         return;
      if (this.restorani == null)
         this.restorani = new java.util.ArrayList<Restoran>();
      if (!this.restorani.contains(newRestoran))
         this.restorani.add(newRestoran);
   }
   
   /** @pdGenerated default remove
     * @param oldRestoran */
   public void removeRestorani(Restoran oldRestoran) {
      if (oldRestoran == null)
         return;
      if (this.restorani != null)
         if (this.restorani.contains(oldRestoran))
            this.restorani.remove(oldRestoran);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRestorani() {
      if (restorani != null)
         restorani.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Gost> getGosti() {
      if (gosti == null)
         gosti = new java.util.ArrayList<Gost>();
      return gosti;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGosti() {
      if (gosti == null)
         gosti = new java.util.ArrayList<Gost>();
      return gosti.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGosti */
   public void setGosti(java.util.List<Gost> newGosti) {
      removeAllGosti();
      for (java.util.Iterator iter = newGosti.iterator(); iter.hasNext();)
         addGosti((Gost)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGost */
   public void addGosti(Gost newGost) {
      if (newGost == null)
         return;
      if (this.gosti == null)
         this.gosti = new java.util.ArrayList<Gost>();
      if (!this.gosti.contains(newGost))
         this.gosti.add(newGost);
   }
   
   /** @pdGenerated default remove
     * @param oldGost */
   public void removeGosti(Gost oldGost) {
      if (oldGost == null)
         return;
      if (this.gosti != null)
         if (this.gosti.contains(oldGost))
            this.gosti.remove(oldGost);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGosti() {
      if (gosti != null)
         gosti.clear();
   }

}