public class Marks
{
public static void main(String[] asx)
{
System.out.println("invoked main method by Jvm");
arrayPercentage();
}
public static void arrayPercentage()
{
	System.out.println("invoked arrayOfPercentage");
float sslcPercentage=84;
float pucPercentage=75;
float degreePercentage=70;
float[] percentages={sslcPercentage,pucPercentage,degreePercentage};
int sizeOfArray=percentages.length;
System.out.println("Total element "+sizeOfArray );

float elementsAtIndex2=percentages[2];
System.out.println("Elements at index two "+elementsAtIndex2);
}
}
