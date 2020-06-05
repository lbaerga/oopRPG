public class Person {
//attributes of class 
  String name;
  int age;
  String designation;
  int strength;
  int intelligence;

  public double getIntelligence() {
    return intelligence;
  }

   // The constructor of the class Person, could have user choose character names
  public void Person(String name) {
      this.name = name;
  }
  
   // Assign the age of the person to the variable age.
  public void perAge(int perAge) {
      age = perAge;
  }

   /* Assign the designation to the variable designation.*/
  public void perDesignation(String perDesig) {
      designation = perDesig;
   }

   // Prints  Player info 
  public void printPerson() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Intelligence:" + intelligence);
      System.out.println("Strength:" + strength);
   }
}
