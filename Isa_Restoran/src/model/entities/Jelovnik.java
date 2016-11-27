/***********************************************************************
 * Module:  Jelovnik.java
 * Author:  milan
 * Purpose: Defines the Class Jelovnik
 ***********************************************************************/

package model.entities;

import java.util.*;

public class Jelovnik {
   private String naziv;
   private Date vaziOd;
   private Date vaziDo;
   
   public java.util.List<Jelo> jela;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Jelo> getJela() {
      if (jela == null)
         jela = new java.util.ArrayList<Jelo>();
      return jela;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorJela() {
      if (jela == null)
         jela = new java.util.ArrayList<Jelo>();
      return jela.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newJela */
   public void setJela(java.util.List<Jelo> newJela) {
      removeAllJela();
      for (java.util.Iterator iter = newJela.iterator(); iter.hasNext();)
         addJela((Jelo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newJelo */
   public void addJela(Jelo newJelo) {
      if (newJelo == null)
         return;
      if (this.jela == null)
         this.jela = new java.util.ArrayList<Jelo>();
      if (!this.jela.contains(newJelo))
         this.jela.add(newJelo);
   }
   
   /** @pdGenerated default remove
     * @param oldJelo */
   public void removeJela(Jelo oldJelo) {
      if (oldJelo == null)
         return;
      if (this.jela != null)
         if (this.jela.contains(oldJelo))
            this.jela.remove(oldJelo);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllJela() {
      if (jela != null)
         jela.clear();
   }

}