import java.util.Scanner;
class AddressBookMain
{
	public static void main(String args[])
	{
		System.out.println("Enter to address book system");	
		AddressBook book=new AddressBook();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many contacts do u want to add");
		book.addContact();

		System.out.println("Do you want to edit the contact? yes or no ");
		String option=sc.next();
		if(option.equals("yes"))
		{
			System.out.println();
			System.out.println("Enter first name to edit:");
			book.editContact();
		}

		System.out.println();
		System.out.println("Do u want to delete a contact? yes or no");
		option=sc.next();
		if(option.equals("yes"))
		{
			book.deleteContact();
		}
	}
}