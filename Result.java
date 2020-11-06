public class Result{
public static String report(double percentage)
{
System.out.println("report method invoked");
System.out.println("percentage "+percentage);
if(percentage<100 && percentage>=90)
{
System.out.println("outstanding");
return "outstanding";
}
if(percentage>=80 && percentage<90)
{
System.out.println("Excellent");
return "Excellent";
}
if(percentage>=70 && percentage<80)
{
System.out.println("very good");
return "very good";
}
if(percentage>=60 && percentage<70)
{
System.out.println("good");
return "good";
}
if(percentage>=50 && percentage<60)
{
System.out.println("Average");
return "Average";
}
if(percentage>=40 && percentage<50)
{
System.out.println("poor");
return "poor";
}
return "fail";
}
}