public class Placetester
{
 public static void main(String[] find)
 {
	 System.out.println("JVM invoked main");
	 int sizeOfMainParam=find.length;
	 String distInString=find[0];
	 int fromDistance=Integer.parseInt(distInString);
	 String placeDist=Place.finder(fromDistance);
	 System.out.println("placeDist "+placeDist);
	 
	 System.out.println("Exit:: main");
 }
}