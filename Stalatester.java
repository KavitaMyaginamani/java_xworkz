public class Stalatester{

public static void main(String[] stala)
{
System.out.println("invoked main");
String stalaAtIndex0=stala[0];
int distance=Integer.parseInt(stalaAtIndex0);
String place=stalaFinder.finder(distance);
System.out.println("place "+place);
System.out.println("Exit:: main");}
}