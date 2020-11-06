public class Age
{
public static String Agedefine(int age)
{
System.out.println("agedefine method invoked");
System.out.println("age "+age);
if(age>1 && age<=5)
{
System.out.println("Kid");
return "Kid";
}
if(age>5 && age<=12)
{
System.out.println("child");
return "child";
}
if(age>12 && age<=19)
{
System.out.println("Teenage");
return "Teenage";
}
if(age>19 && age<=50)
{
System.out.println("Adult");
return "Adult";
}
if(age>50 && age<=100)
{
System.out.println("old");
return "old";
}
return "centenerian";
}
}