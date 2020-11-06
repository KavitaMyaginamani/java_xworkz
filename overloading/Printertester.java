public class Printertester
{
public static void main(Stirng[] pages)
{
System.out.println("invoked main");
System.out.println("main method args length "+pages.length);

String notes="Java";
Printer.printing(notes);
Printer.printing(notes,6);
Printer.printing(notes,"Adharcard");
Printer.printing(10,'B',notes);
System.out.println("Exit:: main");
}
}