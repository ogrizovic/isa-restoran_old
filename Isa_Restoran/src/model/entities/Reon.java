/***********************************************************************
 * Module:  Reon.java
 * Author:  milan
 * Purpose: Defines the Class Reon
 ***********************************************************************/

package model.entities;

import java.util.*;

public class Reon {
   public java.util.List<Sto> stolovi;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Sto> getStolovi() {
      if (stolovi == null)
         stolovi = new java.util.ArrayList<Sto>();
      return stolovi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStolovi() {
      if (stolovi == null)
         stolovi = new java.util.ArrayList<Sto>();
      return stolovi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStolovi */
   public void setStolovi(java.util.List<Sto> newStolovi) {
      removeAllStolovi();
      for (java.util.Iterator iter = newStolovi.iterator(); iter.hasNext();)
         addStolovi((Sto)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSto */
   public void addStolovi(Sto newSto) {
      if (newSto == null)
         return;
      if (this.stolovi == null)
         this.stolovi = new java.util.ArrayList<Sto>();
      if (!this.stolovi.contains(newSto))
         this.stolovi.add(newSto);
   }
   
   /** @pdGenerated default remove
     * @param oldSto */
   public void removeStolovi(Sto oldSto) {
      if (oldSto == null)
         return;
      if (this.stolovi != null)
         if (this.stolovi.contains(oldSto))
            this.stolovi.remove(oldSto);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStolovi() {
      if (stolovi != null)
         stolovi.clear();
   }

}