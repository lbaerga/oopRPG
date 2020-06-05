import java.io.*; 
import java.lang.*; 
import java.util.*; 
import java.util.Scanner;

public class Main {

public static void main(String[] args){

  //declare variables & create arraylists for later use
  int player = 0;
  int choiceWakeUp = 0;
  ArrayList<String> numList = new ArrayList<String>();
  numList.add("1");
  numList.add("2");
  numList.add("3");
  String userChoice = "y";
  ArrayList<Integer> intelList = new ArrayList<Integer>();
  ArrayList<Integer> strengthList = new ArrayList<Integer>();

//create object from class person
  Person Karina = new Person();
  Karina.name = "Karina"; 
  Karina.age = 20;
  Karina.designation = "Mage";
  Karina.strength = 5;
  Karina.intelligence = 10;
//create object from class person
  Person Rafael = new Person();
  Rafael.name = "Rafael"; 
  Rafael.age = 30;
  Rafael.designation = "Warrior";
  Rafael.strength = 10;
  Rafael.intelligence = 8;

//create object from class person
  Person Thene = new Person();
  Thene.name = "Thene"; 
  Thene.age = 67;
  Thene.designation = "Troll";
  Thene.strength = 15;
  Thene.intelligence = 5;

//add object attributes to arraylists for easier processing
  intelList.add(Rafael.intelligence);
  intelList.add(Karina.intelligence);
  intelList.add(Thene.intelligence);

  strengthList.add(Rafael.strength);
  strengthList.add(Karina.strength);
  strengthList.add(Thene.strength);

// Check user input for player type
    Scanner textScanner = new Scanner(System.in);
    System.out.println("Enter a player type: Warrior, Troll, or Mage");
//while player has not yet been set ask for player type until met break once condition is met, advise player of choice if I kept building, I could add a  condition inside each case to allow the user to be prompted to type in y or n or 0 or 1 and define player only after confirmation
    while (player == 0){
      String input = textScanner.nextLine();
      switch(input) 
      { 
        case "Warrior": 
          System.out.println("You entered Warrior");
          player = 1;
          break; 
        case "Mage": 
          System.out.println("You entered Mage"); 
          player = 2;
          break; 
        case "Troll": 
          System.out.println("You entered Troll"); 
          player = 3;
          break; 
        default: 
          System.out.println("Enter a player type: Warrior, Troll, or Mage");    
      }
      //gives player stats, if I kept building, I'd add an ongoing way to check stats 
    }
    if (player == 1) {
      System.out.println("Your stats are: ");
      Rafael.printPerson();
      System.out.println(Rafael.getIntelligence());
    } else if (player == 2){
      System.out.println("Your stats are: ");
      Karina.printPerson();
    } else if (player == 3) {
      System.out.println("Your stats are: ");
      Thene.printPerson();
    }
    //checks that choice is valid before moving forward
    while (true) {
      Scanner wakeUpChoice = new Scanner(System.in);
      System.out.println("You wake up in a tavern, you don't remember where you are. Do you... ");    
      System.out.println("Choose 1 to get something to eat, Choose 2 to talk with the patrons, or Choose 3 to leave the tavern and find your horse?");
      userChoice = wakeUpChoice.nextLine();
      //if choice is valid//
      if ((numList.contains(userChoice))) {
        //if choice is 1, check intelligence level to determine outcome//
        if (userChoice.equals("1")) {
          System.out.println("You decide to get something to eat...");
          if (intelList.get(player-1)<=5){
          System.out.println("You eat the food...shortly after, you get violently ill");  
          break;  
          }
          else if (intelList.get(player-1)>5 && intelList.get(player-1)<=8) {
          System.out.println("You notice that the food doesn't look good. You don't eat it and decide to leave.");
          break;
          } else {
          System.out.println("You notice the food looks bad, so you ask for another plate. The innkeeper apologizes and brings something delicious.");
          break;
          }
          } // if choice is 2, use strength level to determine outcome
          else if (userChoice.equals("2")) {
          System.out.println("You decide to go to talk to the patrons...");
          if (strengthList.get(player-1)<=5){
          System.out.println("You notice a suspicious character in the corner and decide to speak with him. Unfortunately, he is a thief. He robs you and leaves you destitute.");  
          break;  
          }
          else if (strengthList.get(player-1)>5 && strengthList.get(player-1)<=10) {
          System.out.println("You notice a suspicious character in the corner and decide to speak with him. Unfortunately he is a thief. You are able to fight him and prevent him from taking your posessions. He runs away.");
          break;
          } else {
          System.out.println("You notice a suspicious character in the corner and decide to speak with him. You notice him moving furtively, but he scampers away after seeing you look his way.");
          break;
            } 
            //if choice 3, use combination of intelligence and strength levels to determine interaction outcome
          } else if (userChoice.equals("3")) {
          System.out.println("You decide to go find your horse...");
          if (intelList.get(player-1)<=5 && strengthList.get(player-1)>10){
          System.out.println("You see someone near your horse. Thinking it's the suspicious character from the tavern. You get so angry you throw a rock. Unfortunately, it's just the tavern-keeper's son. Now the tavern-keeper is upset.");  
          break;  
          }
          else if (intelList.get(player-1)>5 && strengthList.get(player-1)<=10) {
          System.out.println("You see someone near your horse. Thinking it's the suspicious character from the tavern, you hang back to observe before deciding what to do. Luckily, you see it's the tavern-keeper's son. He's been caring for your horse.");
          break;
          }
          } 
      } 
    }

  }
}


