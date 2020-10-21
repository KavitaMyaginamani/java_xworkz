public class Detail
{
	public static void main(String[] hjk)
	{
		System.out.println("invoked main method by Jvm");
		arrayEmail();
		
	}
public static void arrayEmail()
{
System.out.println("invoked arrayOfEmail");
String contactEmail="contact@x-workz.in";
String subscribeEmail="subscribe@xworkz.in";
String hrEmail="abc@xworkz.in";
String[] emails={contactEmail,subscribeEmail,hrEmail,"ksm@xworkz.in"};
int sizeOfArray=emails.length;
System.out.println("Total elements "+sizeOfArray);
String elementAtIndex3=emails[3];
System.out.println("Element at index three "+elementAtIndex3);
}
 }