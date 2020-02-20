package ContactList;

public class ContactNode {
	private String name;
	private String phoneNumber;
	ContactNode nextNode;
	public ContactNode(){
	}
	public ContactNode(String name, String phoneNumber){
		this.name = name;
	    this.phoneNumber = phoneNumber;
	    this.nextNode = null;
	}
	public String getName(){
		return name;
	}
	public void setName(String nameFinal){
		this.name = nameFinal;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumberFin){
		this.phoneNumber = phoneNumberFin;
	}
	public ContactNode getNext(){
		return this.nextNode;
	}
	public ContactNode setNext(ContactNode nextNodeFinal){
		nextNode = nextNodeFinal;
	    return nextNodeFinal;
	}
	public String toString(){
		ContactNode temp = nextNode;
	    return "Name: " + temp.getName() +"\nPhone number: " + temp.getPhoneNumber();
	}

}
