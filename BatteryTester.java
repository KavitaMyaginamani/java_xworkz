public class BatteryTester
{
public static void main(String[] bat)
{
System.out.println("invoked main");
byte chargeValue=IPhone.charging(-45);
System.out.println("return value from charging "+chargeValue);
System.out.println("Exit:: main");
}
}