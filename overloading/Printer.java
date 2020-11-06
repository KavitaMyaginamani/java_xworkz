public class Printer
{
public static void printing(String[] notes)
{
System.out.println("invoked printing");
System.out.println("arg notes: "+notes);
}
public static void printing(String notes,String documents)
{
	System.out.println("invoked printing with two parameter");
	System.out.println("String and String");
	System.out.println("arg1 notes "+notes);
	System.out.println("arg2 documents "+documents);
}
public static void printing(String notes,int noOfCopies)
{
	System.out.println("invoked printing with two parameter");
	System.out.println("int and String");
	System.out.println("arg1 notes "+notes);
	System.out.println("arg2 noOfCopies "+noOfCopies);
	
}	
	
}