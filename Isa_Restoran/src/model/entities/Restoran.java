/***********************************************************************
 * Module:  Restoran.java
 * Author:  milan
 * Purpose: Defines the Class Restoran
 ***********************************************************************/

package model.entities;

import model.users.MenadzerRestorana;
import model.users.Konobar;
import model.users.Kuvar;
import model.users.Sanker;
import model.users.Ponudjac;
import java.util.*;

public class Restoran {
   private String naziv;
   private String opis;
   private String adresa;
   private String email;
   private Number telefon;
   private Number ocena;
   
   public java.util.List<MenadzerRestorana> menadzeriRestorana;
   public java.util.List<Konobar> konobari;
   public java.util.List<Kuvar> kuvari;
   public java.util.List<Sanker> sankeri;
   public java.util.List<Ponudjac> ponudjaci;
   public Jelovnik jelovnik;
   public KartaPica kartaPica;
   public java.util.List<SegmentRestorana> segmentiRestorana;
   public java.util.Collection<RasporedRada> rasporedi;
   public java.util.List<PotraznjaNamirnica> potraznje;
   
   
   /** @pdGenerated default getter */
   public java.util.List<MenadzerRestorana> getMenadzeriRestorana() {
      if (menadzeriRestorana == null)
         menadzeriRestorana = new java.util.ArrayList<MenadzerRestorana>();
      return menadzeriRestorana;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMenadzeriRestorana() {
      if (menadzeriRestorana == null)
         menadzeriRestorana = new java.util.ArrayList<MenadzerRestorana>();
      return menadzeriRestorana.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMenadzeriRestorana */
   public void setMenadzeriRestorana(java.util.List<MenadzerRestorana> newMenadzeriRestorana) {
      removeAllMenadzeriRestorana();
      for (java.util.Iterator iter = newMenadzeriRestorana.iterator(); iter.hasNext();)
         addMenadzeriRestorana((MenadzerRestorana)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMenadzerRestorana */
   public void addMenadzeriRestorana(MenadzerRestorana newMenadzerRestorana) {
      if (newMenadzerRestorana == null)
         return;
      if (this.menadzeriRestorana == null)
         this.menadzeriRestorana = new java.util.ArrayList<MenadzerRestorana>();
      if (!this.menadzeriRestorana.contains(newMenadzerRestorana))
         this.menadzeriRestorana.add(newMenadzerRestorana);
   }
   
   /** @pdGenerated default remove
     * @param oldMenadzerRestorana */
   public void removeMenadzeriRestorana(MenadzerRestorana oldMenadzerRestorana) {
      if (oldMenadzerRestorana == null)
         return;
      if (this.menadzeriRestorana != null)
         if (this.menadzeriRestorana.contains(oldMenadzerRestorana))
            this.menadzeriRestorana.remove(oldMenadzerRestorana);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMenadzeriRestorana() {
      if (menadzeriRestorana != null)
         menadzeriRestorana.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Konobar> getKonobari() {
      if (konobari == null)
         konobari = new java.util.ArrayList<Konobar>();
      return konobari;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKonobari() {
      if (konobari == null)
         konobari = new java.util.ArrayList<Konobar>();
      return konobari.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKonobari */
   public void setKonobari(java.util.List<Konobar> newKonobari) {
      removeAllKonobari();
      for (java.util.Iterator iter = newKonobari.iterator(); iter.hasNext();)
         addKonobari((Konobar)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKonobar */
   public void addKonobari(Konobar newKonobar) {
      if (newKonobar == null)
         return;
      if (this.konobari == null)
         this.konobari = new java.util.ArrayList<Konobar>();
      if (!this.konobari.contains(newKonobar))
         this.konobari.add(newKonobar);
   }
   
   /** @pdGenerated default remove
     * @param oldKonobar */
   public void removeKonobari(Konobar oldKonobar) {
      if (oldKonobar == null)
         return;
      if (this.konobari != null)
         if (this.konobari.contains(oldKonobar))
            this.konobari.remove(oldKonobar);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKonobari() {
      if (konobari != null)
         konobari.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Kuvar> getKuvari() {
      if (kuvari == null)
         kuvari = new java.util.ArrayList<Kuvar>();
      return kuvari;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKuvari() {
      if (kuvari == null)
         kuvari = new java.util.ArrayList<Kuvar>();
      return kuvari.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKuvari */
   public void setKuvari(java.util.List<Kuvar> newKuvari) {
      removeAllKuvari();
      for (java.util.Iterator iter = newKuvari.iterator(); iter.hasNext();)
         addKuvari((Kuvar)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKuvar */
   public void addKuvari(Kuvar newKuvar) {
      if (newKuvar == null)
         return;
      if (this.kuvari == null)
         this.kuvari = new java.util.ArrayList<Kuvar>();
      if (!this.kuvari.contains(newKuvar))
         this.kuvari.add(newKuvar);
   }
   
   /** @pdGenerated default remove
     * @param oldKuvar */
   public void removeKuvari(Kuvar oldKuvar) {
      if (oldKuvar == null)
         return;
      if (this.kuvari != null)
         if (this.kuvari.contains(oldKuvar))
            this.kuvari.remove(oldKuvar);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKuvari() {
      if (kuvari != null)
         kuvari.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Sanker> getSankeri() {
      if (sankeri == null)
         sankeri = new java.util.ArrayList<Sanker>();
      return sankeri;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSankeri() {
      if (sankeri == null)
         sankeri = new java.util.ArrayList<Sanker>();
      return sankeri.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSankeri */
   public void setSankeri(java.util.List<Sanker> newSankeri) {
      removeAllSankeri();
      for (java.util.Iterator iter = newSankeri.iterator(); iter.hasNext();)
         addSankeri((Sanker)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSanker */
   public void addSankeri(Sanker newSanker) {
      if (newSanker == null)
         return;
      if (this.sankeri == null)
         this.sankeri = new java.util.ArrayList<Sanker>();
      if (!this.sankeri.contains(newSanker))
         this.sankeri.add(newSanker);
   }
   
   /** @pdGenerated default remove
     * @param oldSanker */
   public void removeSankeri(Sanker oldSanker) {
      if (oldSanker == null)
         return;
      if (this.sankeri != null)
         if (this.sankeri.contains(oldSanker))
            this.sankeri.remove(oldSanker);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSankeri() {
      if (sankeri != null)
         sankeri.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Ponudjac> getPonudjaci() {
      if (ponudjaci == null)
         ponudjaci = new java.util.ArrayList<Ponudjac>();
      return ponudjaci;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPonudjaci() {
      if (ponudjaci == null)
         ponudjaci = new java.util.ArrayList<Ponudjac>();
      return ponudjaci.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPonudjaci */
   public void setPonudjaci(java.util.List<Ponudjac> newPonudjaci) {
      removeAllPonudjaci();
      for (java.util.Iterator iter = newPonudjaci.iterator(); iter.hasNext();)
         addPonudjaci((Ponudjac)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPonudjac */
   public void addPonudjaci(Ponudjac newPonudjac) {
      if (newPonudjac == null)
         return;
      if (this.ponudjaci == null)
         this.ponudjaci = new java.util.ArrayList<Ponudjac>();
      if (!this.ponudjaci.contains(newPonudjac))
         this.ponudjaci.add(newPonudjac);
   }
   
   /** @pdGenerated default remove
     * @param oldPonudjac */
   public void removePonudjaci(Ponudjac oldPonudjac) {
      if (oldPonudjac == null)
         return;
      if (this.ponudjaci != null)
         if (this.ponudjaci.contains(oldPonudjac))
            this.ponudjaci.remove(oldPonudjac);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPonudjaci() {
      if (ponudjaci != null)
         ponudjaci.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<SegmentRestorana> getSegmentiRestorana() {
      if (segmentiRestorana == null)
         segmentiRestorana = new java.util.ArrayList<SegmentRestorana>();
      return segmentiRestorana;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSegmentiRestorana() {
      if (segmentiRestorana == null)
         segmentiRestorana = new java.util.ArrayList<SegmentRestorana>();
      return segmentiRestorana.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSegmentiRestorana */
   public void setSegmentiRestorana(java.util.List<SegmentRestorana> newSegmentiRestorana) {
      removeAllSegmentiRestorana();
      for (java.util.Iterator iter = newSegmentiRestorana.iterator(); iter.hasNext();)
         addSegmentiRestorana((SegmentRestorana)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSegmentRestorana */
   public void addSegmentiRestorana(SegmentRestorana newSegmentRestorana) {
      if (newSegmentRestorana == null)
         return;
      if (this.segmentiRestorana == null)
         this.segmentiRestorana = new java.util.ArrayList<SegmentRestorana>();
      if (!this.segmentiRestorana.contains(newSegmentRestorana))
         this.segmentiRestorana.add(newSegmentRestorana);
   }
   
   /** @pdGenerated default remove
     * @param oldSegmentRestorana */
   public void removeSegmentiRestorana(SegmentRestorana oldSegmentRestorana) {
      if (oldSegmentRestorana == null)
         return;
      if (this.segmentiRestorana != null)
         if (this.segmentiRestorana.contains(oldSegmentRestorana))
            this.segmentiRestorana.remove(oldSegmentRestorana);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSegmentiRestorana() {
      if (segmentiRestorana != null)
         segmentiRestorana.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<RasporedRada> getRasporedi() {
      if (rasporedi == null)
         rasporedi = new java.util.HashSet<RasporedRada>();
      return rasporedi;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRasporedi() {
      if (rasporedi == null)
         rasporedi = new java.util.HashSet<RasporedRada>();
      return rasporedi.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRasporedi */
   public void setRasporedi(java.util.Collection<RasporedRada> newRasporedi) {
      removeAllRasporedi();
      for (java.util.Iterator iter = newRasporedi.iterator(); iter.hasNext();)
         addRasporedi((RasporedRada)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRasporedRada */
   public void addRasporedi(RasporedRada newRasporedRada) {
      if (newRasporedRada == null)
         return;
      if (this.rasporedi == null)
         this.rasporedi = new java.util.HashSet<RasporedRada>();
      if (!this.rasporedi.contains(newRasporedRada))
         this.rasporedi.add(newRasporedRada);
   }
   
   /** @pdGenerated default remove
     * @param oldRasporedRada */
   public void removeRasporedi(RasporedRada oldRasporedRada) {
      if (oldRasporedRada == null)
         return;
      if (this.rasporedi != null)
         if (this.rasporedi.contains(oldRasporedRada))
            this.rasporedi.remove(oldRasporedRada);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRasporedi() {
      if (rasporedi != null)
         rasporedi.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<PotraznjaNamirnica> getPotraznje() {
      if (potraznje == null)
         potraznje = new java.util.ArrayList<PotraznjaNamirnica>();
      return potraznje;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPotraznje() {
      if (potraznje == null)
         potraznje = new java.util.ArrayList<PotraznjaNamirnica>();
      return potraznje.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPotraznje */
   public void setPotraznje(java.util.List<PotraznjaNamirnica> newPotraznje) {
      removeAllPotraznje();
      for (java.util.Iterator iter = newPotraznje.iterator(); iter.hasNext();)
         addPotraznje((PotraznjaNamirnica)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPotraznjaNamirnica */
   public void addPotraznje(PotraznjaNamirnica newPotraznjaNamirnica) {
      if (newPotraznjaNamirnica == null)
         return;
      if (this.potraznje == null)
         this.potraznje = new java.util.ArrayList<PotraznjaNamirnica>();
      if (!this.potraznje.contains(newPotraznjaNamirnica))
         this.potraznje.add(newPotraznjaNamirnica);
   }
   
   /** @pdGenerated default remove
     * @param oldPotraznjaNamirnica */
   public void removePotraznje(PotraznjaNamirnica oldPotraznjaNamirnica) {
      if (oldPotraznjaNamirnica == null)
         return;
      if (this.potraznje != null)
         if (this.potraznje.contains(oldPotraznjaNamirnica))
            this.potraznje.remove(oldPotraznjaNamirnica);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPotraznje() {
      if (potraznje != null)
         potraznje.clear();
   }

}