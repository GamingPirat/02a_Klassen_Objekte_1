package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        //Instanziierung --> Erzeugen eines neuen Objekts
        // System.out.println(new Cat());

        //cat --> Referenzvariable
        // --> Referenztyp(Klasse)
      Cat cat = new Cat();
      output("Blick von aussen: " + cat); 
      cat.tellYourAddress(); // Methodenaufruf

      System.out.println("-------------------------------------------");

      Cat cat2 = new Cat();
      output("Blick von aussen: " + cat2);
      cat2.tellYourAddress();

    }
//  // Statische Methode, die in der Klasse ausgeführt wird ...
   public static void output(String outputStr){
    System.out.println(outputStr);

   }



}

