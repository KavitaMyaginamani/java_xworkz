public class Stalafinder{
public static void finder(int distInKms)
{
System.out.println("invoked finder method");
int distance=distInKms;
int minimumDist=50;
if(distance<=minimumDist)
{
System.out.println("minimum distance has to be "+minimumDist +"Kms");
return "Not available";
}
if(distance>70 && distance<100)
{
System.out.println("haveri");
return "haveri";
}
if(distance>100 && distance<150)
{
System.out.println("distance bet 100 and 150");
return "gadag";
}
if(distance>150 && distance<200)
{
System.out.println("distance bet 150 and 200");
return "hasan";
}
System.out.println("Exit:: finder method");
return "place not found";
}

}