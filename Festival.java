public class Festival 
{
public static void main(String[] dress)
{
System.out.println("Jvm invoked main method");
String[] ministersArray={"BSY","HDK","Jagadish shettar","sm krishna","siddaramayya"};
chiefMinisters(ministersArray);
System.out.println("exit main method");
}
public static void chiefMinisters(String[] names)
{
System.out.println("chiefMinisters "+names);
int size=names.length;
System.out.println(size);
System.out.println("chief Ministers at index 1 "+names[1]);
System.out.println("chief Ministers at index 3 "+names[3]);
System.out.println("chief Ministers at index 4 "+names[4]);
System.out.println("chief Ministers at index 0 "+names[0]);
}
}