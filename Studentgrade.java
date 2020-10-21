public class Studentgrade
{
public static void main(String[] hj)
{
System.out.println("invoked main method by Jvm");
arrayGrade();
}
public static void arrayGrade()
{
System.out.println("invoked by arrayOfGrade");
char gradeOfKavita='A';
char gradeOfSavita='B';
char gradeOfShrii='C';
char gradeOfAkshata='A';
char gradeOfBindu='B';
char gradeOfKavya='A';
char gradeOfArchana='B';
char gradeOfBhagya='A';
char gradeOfSudha='C';
char gradeOfSoumya='A';
char[] grades={gradeOfKavita, gradeOfSavita, gradeOfShrii, gradeOfAkshata, gradeOfBindu, gradeOfKavya, gradeOfArchana gradeOfBhagya, gradeOfSudha, gradeOfSoumya};
int sizeOfArray=grades.length;
System.out.println("size of array "+sizeOfArray);
char elementsAtIndex5=grades[5];
System.out.println("elements at index five "+elementsAtIndex5);																																																																																																																																																																																																																																																																																																																																																																																														

}
}