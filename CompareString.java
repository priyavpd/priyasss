# priyasss
import java.util.Scanner;
public class CompareStrings
{
    public static void main(String args[])
    {
        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string");
        s1 = in.nextLine();

        System.out.println("Enter the second string");
        s2 = in.nextLine();

        //convert both string to same case,If case sensitivity is not important
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.compareTo(s2)>0)
        System.out.println("First string is greater than second.");

        else if(s1.compareTo(s2)<0)
        System.out.println("First string is smaller than second.");

        else    System.out.println("Both strings are equal.");

        //This is also another approach,But it cannot check which one is greater

        if(s1.startsWith(s2) && s1.length()==s2.length())
                System.out.println("Equal string");

        else System.out.println("unEqual String");
    }
    }
