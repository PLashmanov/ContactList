
public class ContactNode {
   private String contactName;
   private String contactPhoneNumber;
   private ContactNode nextNodePtr;
   
   public ContactNode(String contactName, String contactPhoneNumber) {
      super();
      this.contactName = contactName;
      this.contactPhoneNumber = contactPhoneNumber;
   }
   public String getName() {
      return contactName;
   }
   public String getPhoneNumber() {
      return contactPhoneNumber;
   }
   public void insertAfter(ContactNode nextNodePtr) {
      this.nextNodePtr = nextNodePtr;
   }
   public ContactNode getNext() {
      return nextNodePtr;
   }
   public void printContactNode() {
      System.out.println("Name: " + contactName);
      System.out.println("Phone number: " + contactPhoneNumber);
   }
}