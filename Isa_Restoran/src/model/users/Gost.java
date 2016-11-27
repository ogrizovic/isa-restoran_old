/***********************************************************************
 * Module:  Gost.java
 * Author:  milan
 * Purpose: Defines the Class Gost
 ***********************************************************************/

package model.users;

import java.util.*;

public class Gost {
   private String email;
   private String lozinka;
   private String ime;
   private String prezime;
   
   public java.util.List<Gost> prijatelji;
   
   public String getEmail() {
      return email;
   }
   
   /** @param newEmail */
   public void setEmail(String newEmail) {
      email = newEmail;
   }
   
   public String getLozinka() {
      return lozinka;
   }
   
   /** @param newLozinka */
   public void setLozinka(String newLozinka) {
      lozinka = newLozinka;
   }
   
   public String getIme() {
      return ime;
   }
   
   /** @param newIme */
   public void setIme(String newIme) {
      ime = newIme;
   }
   
   public String getPrezime() {
      return prezime;
   }
   
   /** @param newPrezime */
   public void setPrezime(String newPrezime) {
      prezime = newPrezime;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Gost> getPrijatelji() {
      if (prijatelji == null)
         prijatelji = new java.util.ArrayList<Gost>();
      return prijatelji;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPrijatelji() {
      if (prijatelji == null)
         prijatelji = new java.util.ArrayList<Gost>();
      return prijatelji.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPrijatelji */
   public void setPrijatelji(java.util.List<Gost> newPrijatelji) {
      removeAllPrijatelji();
      for (java.util.Iterator iter = newPrijatelji.iterator(); iter.hasNext();)
         addPrijatelji((Gost)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGost */
   public void addPrijatelji(Gost newGost) {
      if (newGost == null)
         return;
      if (this.prijatelji == null)
         this.prijatelji = new java.util.ArrayList<Gost>();
      if (!this.prijatelji.contains(newGost))
         this.prijatelji.add(newGost);
   }
   
   /** @pdGenerated default remove
     * @param oldGost */
   public void removePrijatelji(Gost oldGost) {
      if (oldGost == null)
         return;
      if (this.prijatelji != null)
         if (this.prijatelji.contains(oldGost))
            this.prijatelji.remove(oldGost);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPrijatelji() {
      if (prijatelji != null)
         prijatelji.clear();
   }

}