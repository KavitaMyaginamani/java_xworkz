public class Birds
{
public static void main(String[] parrot)
{
System.out.println("invoked main");
eating("Guava","earthworm");
eating("mango",1);
eating(1,"mango",25.5f);
}
public static void eating(String nuts)
{
System.out.println("invoked eating");
System.out.println("arg nuts:"+nuts);
}
public static void eating(String fruits,String insects)
{
System.out.println("invoked holding with two parameter");
System.out.println("String and String");
System.out.println("arg1 fruits "+fruits);
System.out.println("arg2 insects "+insects);
}
public static void eating(String fruits,int noOfFruits)
{
System.out.println("invoked holding with two parameter");
System.out.println("String and int");
System.out.println("arg1 fruits "+fruits);
System.out.println("arg2 noOfFruits "+noOfFruits);
}
public static void eating(int noOfFruits,String fruits,float percentageOfEating)
{
System.out.println("invoked holding with two parameter");
System.out.println("int and String and float");
System.out.println("arg1 noOfFruits "+noOfFruits);
System.out.println("arg2 fruits "+fruits);
System.out.println("arg3 percentageOfEating "+percentageOfEating);
}
}