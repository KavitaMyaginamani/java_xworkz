public class IPhoneTester
{
public static void main(String[] models)
{
System.out.println("JVM invoked main");
boolean connect=IPhone.call();
System.out.println("return value from call "+connect
);
String msg=IPhone.message();
System.out.println("return value from msg "+msg);
System.out.println("Exit:: main");
}
}