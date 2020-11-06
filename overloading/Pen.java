public class Pen
{
public static void main(String[] notes)
{
System.out.println("invoked main");
writing("novel");
writing("novel","parva");
writing(1,"novel",50.0f,'A');
}
public static void writing(String stories)
{
System.out.println("invoked writing");
System.out.println("arg stories:"+stories);
}
public static void writing(String stories,String novels)
{
System.out.println("invoked holding with two parameters");
System.out.println("String and String");
System.out.println("arg1 stories "+stories);
System.out.println("arg2 novels "+novels);
}
public static void writing(int indexNo,String Stories,float percentageOfInk,char grade);
{
System.out.println("invoked holding with two parameter");
System.out.println("int and String and float and charecter");
System.out.println("arg1 indexNo "+indexNo);
System.out.println("arg2 stories "+stories);
System.out.println("arg3 percentageOfInk "+percentageOfInk);
System.out.println("arg4 grade "+grade);
}
}
