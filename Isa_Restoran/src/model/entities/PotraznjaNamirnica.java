/***********************************************************************
 * Module:  PotraznjaNamirnica.java
 * Author:  milan
 * Purpose: Defines the Class PotraznjaNamirnica
 ***********************************************************************/

package model.entities;

import java.util.*;

public class PotraznjaNamirnica {
   private Date vaziOd;
   private Date vaziDo;
   
   public java.util.List<Namirnica> spisakPotrebnihNamirnica;
   public java.util.List<PonudaNamirnica> listaPonuda;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Namirnica> getSpisakPotrebnihNamirnica() {
      if (spisakPotrebnihNamirnica == null)
         spisakPotrebnihNamirnica = new java.util.ArrayList<Namirnica>();
      return spisakPotrebnihNamirnica;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSpisakPotrebnihNamirnica() {
      if (spisakPotrebnihNamirnica == null)
         spisakPotrebnihNamirnica = new java.util.ArrayList<Namirnica>();
      return spisakPotrebnihNamirnica.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSpisakPotrebnihNamirnica */
   public void setSpisakPotrebnihNamirnica(java.util.List<Namirnica> newSpisakPotrebnihNamirnica) {
      removeAllSpisakPotrebnihNamirnica();
      for (java.util.Iterator iter = newSpisakPotrebnihNamirnica.iterator(); iter.hasNext();)
         addSpisakPotrebnihNamirnica((Namirnica)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNamirnica */
   public void addSpisakPotrebnihNamirnica(Namirnica newNamirnica) {
      if (newNamirnica == null)
         return;
      if (this.spisakPotrebnihNamirnica == null)
         this.spisakPotrebnihNamirnica = new java.util.ArrayList<Namirnica>();
      if (!this.spisakPotrebnihNamirnica.contains(newNamirnica))
         this.spisakPotrebnihNamirnica.add(newNamirnica);
   }
   
   /** @pdGenerated default remove
     * @param oldNamirnica */
   public void removeSpisakPotrebnihNamirnica(Namirnica oldNamirnica) {
      if (oldNamirnica == null)
         return;
      if (this.spisakPotrebnihNamirnica != null)
         if (this.spisakPotrebnihNamirnica.contains(oldNamirnica))
            this.spisakPotrebnihNamirnica.remove(oldNamirnica);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSpisakPotrebnihNamirnica() {
      if (spisakPotrebnihNamirnica != null)
         spisakPotrebnihNamirnica.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<PonudaNamirnica> getListaPonuda() {
      if (listaPonuda == null)
         listaPonuda = new java.util.ArrayList<PonudaNamirnica>();
      return listaPonuda;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorListaPonuda() {
      if (listaPonuda == null)
         listaPonuda = new java.util.ArrayList<PonudaNamirnica>();
      return listaPonuda.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newListaPonuda */
   public void setListaPonuda(java.util.List<PonudaNamirnica> newListaPonuda) {
      removeAllListaPonuda();
      for (java.util.Iterator iter = newListaPonuda.iterator(); iter.hasNext();)
         addListaPonuda((PonudaNamirnica)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPonudaNamirnica */
   public void addListaPonuda(PonudaNamirnica newPonudaNamirnica) {
      if (newPonudaNamirnica == null)
         return;
      if (this.listaPonuda == null)
         this.listaPonuda = new java.util.ArrayList<PonudaNamirnica>();
      if (!this.listaPonuda.contains(newPonudaNamirnica))
      {
         this.listaPonuda.add(newPonudaNamirnica);
         newPonudaNamirnica.setPotraznjaNamirnica(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldPonudaNamirnica */
   public void removeListaPonuda(PonudaNamirnica oldPonudaNamirnica) {
      if (oldPonudaNamirnica == null)
         return;
      if (this.listaPonuda != null)
         if (this.listaPonuda.contains(oldPonudaNamirnica))
         {
            this.listaPonuda.remove(oldPonudaNamirnica);
            oldPonudaNamirnica.setPotraznjaNamirnica((PotraznjaNamirnica)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllListaPonuda() {
      if (listaPonuda != null)
      {
         PonudaNamirnica oldPonudaNamirnica;
         for (java.util.Iterator iter = getIteratorListaPonuda(); iter.hasNext();)
         {
            oldPonudaNamirnica = (PonudaNamirnica)iter.next();
            iter.remove();
            oldPonudaNamirnica.setPotraznjaNamirnica((PotraznjaNamirnica)null);
         }
      }
   }

}