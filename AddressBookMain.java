import java.util.Scanner;
class AddressBookMain
{
	public static void main(String args[])
	{
		System.out.println("Enter to address book system");	
		AddressBook book=new AddressBook();
		System.out.println("Enter how many contacts do u want to add");
		book.addContact();
	}
}