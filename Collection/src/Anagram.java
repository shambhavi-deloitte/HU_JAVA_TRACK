import java.util.*;
class Anagram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String str1 = scanner.nextLine();
        System.out.println("Enter Second String: ");
        String str2 = scanner.nextLine();

        int i, j , k=0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        for(i=0; i<str2.length(); i++)
        {
            char n = str2.charAt(i);
            for(j=0; j<str1.length(); j++)
            {
                char m = str1.charAt(j);
                if(n == m)
                {
                    k++;
                    break;
                }
            }
        }

        if(k == str1.length())
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

    }
}