/***********************************************************************
 * Module:  Ponudjac.java
 * Author:  milan
 * Purpose: Defines the Class Ponudjac
 ***********************************************************************/

package model.users;

import model.entities.PonudaNamirnica;
import java.util.*;

public class Ponudjac {
   private String lozinka;
   private String naziv;
   private String email;
   
   public java.util.List<PonudaNamirnica> ponude;
   
   
   /** @pdGenerated default getter */
   public java.util.List<PonudaNamirnica> getPonude() {
      if (ponude == null)
         ponude = new java.util.ArrayList<PonudaNamirnica>();
      return ponude;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPonude() {
      if (ponude == null)
         ponude = new java.util.ArrayList<PonudaNamirnica>();
      return ponude.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPonude */
   public void setPonude(java.util.List<PonudaNamirnica> newPonude) {
      removeAllPonude();
      for (java.util.Iterator iter = newPonude.iterator(); iter.hasNext();)
         addPonude((PonudaNamirnica)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPonudaNamirnica */
   public void addPonude(PonudaNamirnica newPonudaNamirnica) {
      if (newPonudaNamirnica == null)
         return;
      if (this.ponude == null)
         this.ponude = new java.util.ArrayList<PonudaNamirnica>();
      if (!this.ponude.contains(newPonudaNamirnica))
      {
         this.ponude.add(newPonudaNamirnica);
         newPonudaNamirnica.setPonudjac(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldPonudaNamirnica */
   public void removePonude(PonudaNamirnica oldPonudaNamirnica) {
      if (oldPonudaNamirnica == null)
         return;
      if (this.ponude != null)
         if (this.ponude.contains(oldPonudaNamirnica))
         {
            this.ponude.remove(oldPonudaNamirnica);
            oldPonudaNamirnica.setPonudjac((Ponudjac)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPonude() {
      if (ponude != null)
      {
         PonudaNamirnica oldPonudaNamirnica;
         for (java.util.Iterator iter = getIteratorPonude(); iter.hasNext();)
         {
            oldPonudaNamirnica = (PonudaNamirnica)iter.next();
            iter.remove();
            oldPonudaNamirnica.setPonudjac((Ponudjac)null);
         }
      }
   }

}