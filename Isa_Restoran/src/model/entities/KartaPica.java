/***********************************************************************
 * Module:  KartaPica.java
 * Author:  milan
 * Purpose: Defines the Class KartaPica
 ***********************************************************************/

package model.entities;

import java.util.*;

public class KartaPica {
   private String naziv;
   private Date vaziOd;
   private Date vaziDo;
   
   public java.util.List<Pice> pica;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Pice> getPica() {
      if (pica == null)
         pica = new java.util.ArrayList<Pice>();
      return pica;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPica() {
      if (pica == null)
         pica = new java.util.ArrayList<Pice>();
      return pica.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPica */
   public void setPica(java.util.List<Pice> newPica) {
      removeAllPica();
      for (java.util.Iterator iter = newPica.iterator(); iter.hasNext();)
         addPica((Pice)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPice */
   public void addPica(Pice newPice) {
      if (newPice == null)
         return;
      if (this.pica == null)
         this.pica = new java.util.ArrayList<Pice>();
      if (!this.pica.contains(newPice))
         this.pica.add(newPice);
   }
   
   /** @pdGenerated default remove
     * @param oldPice */
   public void removePica(Pice oldPice) {
      if (oldPice == null)
         return;
      if (this.pica != null)
         if (this.pica.contains(oldPice))
            this.pica.remove(oldPice);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPica() {
      if (pica != null)
         pica.clear();
   }

}