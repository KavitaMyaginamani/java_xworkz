public class Booleanstatement
{
public static void main(String[] ghj)
{
System.out.println("invoked main method by Jvm");
arrayBoolean();
}
public static void arrayBoolean()
{
System.out.println("invoked arrayOfBoolean");
boolean isSkyBlue=true;
boolean isPizzaTasty=true;
boolean isEggIsWhite=true;
boolean isEarthIsFlat=false;
boolean isDogIsAnimal=true;
boolean isIamFromBangloore=false;
boolean[] trueOrFalse={isSkyBlue,isPizzaTasty,isEggIsWhite,isEarthIsFlat,isDogIsAnimal,isIamFromBangloore};
int sizeOfArray=trueOrFalse.length;
System.out.println("Total elements "+sizeOfArray);
boolean elementsAtIndex5=trueOrFalse[5];
System.out.println("elements at index five "+elementsAtIndex5);
}
}