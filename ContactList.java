import java.util.Scanner;

public class ContactList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Person 1: ");
      ContactNode c1 = readContactNode(scnr);
      System.out.println("\nPerson 2: ");
      ContactNode c2 = readContactNode(scnr);
      System.out.println("\nPerson 3: ");
      ContactNode c3 = readContactNode(scnr);
      c1.insertAfter(c2);
      c2.insertAfter(c3);
      ContactNode temp = c1;
      System.out.println("\nCONTACT LIST");
      
      while(temp != null) {
         temp.printContactNode();
         System.out.println();
         temp = temp.getNext();
      }
      scnr.close();
      
      
   }
   
   public static ContactNode readContactNode(Scanner sc) {
      System.out.println("Enter name:");
      String name = sc.nextLine();
      System.out.println("Enter Phone Number:");
      String phoneNumber = sc.nextLine();
      ContactNode node = new ContactNode(name, phoneNumber);
      System.out.println("You entered: " + name + ", " + phoneNumber);
      return node;
   }
   
}
