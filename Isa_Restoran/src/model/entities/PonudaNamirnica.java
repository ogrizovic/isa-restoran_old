/***********************************************************************
 * Module:  PonudaNamirnica.java
 * Author:  milan
 * Purpose: Defines the Class PonudaNamirnica
 ***********************************************************************/

package model.entities;

import model.users.Ponudjac;
import java.util.*;

public class PonudaNamirnica {
   private Float cena;
   
   public java.util.List<Namirnica> spisakNamirnica;
   public Ponudjac ponudjac;
   public PotraznjaNamirnica potraznjaNamirnica;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Namirnica> getSpisakNamirnica() {
      if (spisakNamirnica == null)
         spisakNamirnica = new java.util.ArrayList<Namirnica>();
      return spisakNamirnica;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSpisakNamirnica() {
      if (spisakNamirnica == null)
         spisakNamirnica = new java.util.ArrayList<Namirnica>();
      return spisakNamirnica.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSpisakNamirnica */
   public void setSpisakNamirnica(java.util.List<Namirnica> newSpisakNamirnica) {
      removeAllSpisakNamirnica();
      for (java.util.Iterator iter = newSpisakNamirnica.iterator(); iter.hasNext();)
         addSpisakNamirnica((Namirnica)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNamirnica */
   public void addSpisakNamirnica(Namirnica newNamirnica) {
      if (newNamirnica == null)
         return;
      if (this.spisakNamirnica == null)
         this.spisakNamirnica = new java.util.ArrayList<Namirnica>();
      if (!this.spisakNamirnica.contains(newNamirnica))
         this.spisakNamirnica.add(newNamirnica);
   }
   
   /** @pdGenerated default remove
     * @param oldNamirnica */
   public void removeSpisakNamirnica(Namirnica oldNamirnica) {
      if (oldNamirnica == null)
         return;
      if (this.spisakNamirnica != null)
         if (this.spisakNamirnica.contains(oldNamirnica))
            this.spisakNamirnica.remove(oldNamirnica);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSpisakNamirnica() {
      if (spisakNamirnica != null)
         spisakNamirnica.clear();
   }
   /** @pdGenerated default parent getter */
   public Ponudjac getPonudjac() {
      return ponudjac;
   }
   
   /** @pdGenerated default parent setter
     * @param newPonudjac */
   public void setPonudjac(Ponudjac newPonudjac) {
      if (this.ponudjac == null || !this.ponudjac.equals(newPonudjac))
      {
         if (this.ponudjac != null)
         {
            Ponudjac oldPonudjac = this.ponudjac;
            this.ponudjac = null;
            oldPonudjac.removePonude(this);
         }
         if (newPonudjac != null)
         {
            this.ponudjac = newPonudjac;
            this.ponudjac.addPonude(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public PotraznjaNamirnica getPotraznjaNamirnica() {
      return potraznjaNamirnica;
   }
   
   /** @pdGenerated default parent setter
     * @param newPotraznjaNamirnica */
   public void setPotraznjaNamirnica(PotraznjaNamirnica newPotraznjaNamirnica) {
      if (this.potraznjaNamirnica == null || !this.potraznjaNamirnica.equals(newPotraznjaNamirnica))
      {
         if (this.potraznjaNamirnica != null)
         {
            PotraznjaNamirnica oldPotraznjaNamirnica = this.potraznjaNamirnica;
            this.potraznjaNamirnica = null;
            oldPotraznjaNamirnica.removeListaPonuda(this);
         }
         if (newPotraznjaNamirnica != null)
         {
            this.potraznjaNamirnica = newPotraznjaNamirnica;
            this.potraznjaNamirnica.addListaPonuda(this);
         }
      }
   }

}