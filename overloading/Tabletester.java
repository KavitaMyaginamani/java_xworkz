public class Tabletester{

public static void main(String[] something)
{
System.out.println("invoked main");
System.out.println("main method args length "+something.length);
String book="Comic";
Table.holding(book);
Table.holding(book,6);
System.out.println("exit:: main");
}
}