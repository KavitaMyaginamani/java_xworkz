public class Table
{
public static void holding(String thing)
{
System.out.println("invoked main");
System.out.println("arg thing: "+thing);
}
public static void holding(String something,String noOfPlates)
{
System.out.println("invoked main");
System.out.println("String and String");
System.out.println("arg1 something "+something);
System.out.println("arg2 noOfPlates "+noOfPlates);
}
public static void holding(String something,int noOfPlates)
{
System.out.println("invoked main");
System.out.println("String and int");
System.out.println("arg1 something "+something);
System.out.println("arg2 noOfPlates "+noOfPlates);
}
}