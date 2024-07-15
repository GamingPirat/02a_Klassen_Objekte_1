package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        //Instanziierung --> Erzeugen eines neuen Objekts
        // System.out.println(new Cat());

        //cat --> Referenzvariable
        // --> Referenztyp(Klasse)
      Cat cat = new Cat();
      // IMPLIZITE Typumwandlung  Cat --> String
      output("Blick von aussen: " + cat); 
      output("Blick von innen: " + cat.getInstanceVariable());

      System.out.println("-------------------------------------------");

      Cat cat2 = new Cat();
      output("Blick von aussen: " + cat2);
      output("Blick von innen: " + cat2.getInstanceVariable());

    }


//  // Statische Methode, die in der Klasse ausgeführt wird ...
   public static void output(String outputStr){
    System.out.println(outputStr);

   }

}

