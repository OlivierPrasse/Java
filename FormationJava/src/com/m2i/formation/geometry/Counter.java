package com.m2i.formation.geometry;

public class Counter {

// private int i =0; pour rendre les objets étanches entre eux
 private static int i =0; // avec static nous avons désactivé l'aspect objet

//private int increment() pour rendre les objets étanches entre eux
 public static int increment(){ // avec static nous avons désactivé l'aspect objet
	 return i++;
 }

}
