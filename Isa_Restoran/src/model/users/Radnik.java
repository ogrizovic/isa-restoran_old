/***********************************************************************
 * Module:  Radnik.java
 * Author:  milan
 * Purpose: Defines the Class Radnik
 ***********************************************************************/

package model.users;

import java.util.*;

public class Radnik {
   protected String ime;
   protected String prezime;
   protected int brojOdece;
   protected int brojObuce;
   
   public String getIme() {
      return ime;
   }
   
   /** @param newIme */
   public void setIme(String newIme) {
      ime = newIme;
   }

}