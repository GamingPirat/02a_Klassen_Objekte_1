package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        //Instanziierung --> Erzeugen eines neuen Objekts
        // System.out.println(new Cat());

        //cat --> Referenzvariable
        // --> Referenztyp(Klasse)
      Cat cat = new Cat();
      System.out.println("Blick von aussen: " + cat); 
      cat.tellYourAddress(); // Methodenaufruf

      System.out.println("-------------------------------------------");

      Cat cat2 = new Cat();
      System.out.println("Blick von aussen: " + cat2);
      cat2.tellYourAddress();

    }

   

}

