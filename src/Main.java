import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    ArrayList<Person> people = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    String addPeople = "";

    do{
      System.out.print("Enter name: ");
      String name = in.nextLine();

      System.out.print("Does this person like French fries (true or false): ");
      boolean fries = in.nextBoolean();

      System.out.print("Does this person like to sleep (true or false): ");
      boolean sleep = in.nextBoolean();

      System.out.print("Is this person adventurous (true or false): ");
      boolean adventurous = in.nextBoolean();
      in.nextLine();

      people.add(new Person(name, fries, sleep, adventurous));

      System.out.print("Add another person Y(yes) or N(no)? ");
      addPeople = in.nextLine();

      System.out.println();

    } while(addPeople.equalsIgnoreCase("y"));

    for(Person p : people){
      System.out.println("\nName: " + p.getName());
      System.out.println("Likes French fries: " + p.likeFrenchFries());
      System.out.println("Likes sleeping: " + p.likeSleeping());
      System.out.println("Is adventurous: " + p.isAdventurous());
    }
  }
}
