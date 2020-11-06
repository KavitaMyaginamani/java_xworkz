public class Resulttester{
public static void main(String[] marks)
{
System.out.println("JVM invoked main");
String score=Result.report(40);
System.out.println("performance based on percentage is "+score);
System.out.println("exit:: main");
}
}