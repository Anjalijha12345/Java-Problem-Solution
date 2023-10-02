/*
Ceaser cypher is a technique which is implemented as ROT13(rotate by 13).It is a simple letter
substitutuion cipher tht replaces a letter with the letter 13 places after it in the alphabet,with the
other character remains unchanged.

ROT13

A/a B/b C/c D/d E/e F/f G/g H/h I/i J/j K/k L/l M/m
↕    ↕   ↕   ↕    ↕   ↕   ↕   ↕   ↕   ↕   ↕   ↕   ↕
N/n O/o P/p Q/q R/r S/s T/t U/u V/v W/w X/x Y/y Z/z
Write a program to accept a plain text of length L where L must be greater thahn 3 and less
than 100.

Encrypt the text if valid as per the Ceaser Cipher.
Test your program with rthe sample data and some random data
Input: Hello! How are you?
Output: The cipher text is:
Uryyb? Ubj ner lbn?
Input:Encryption helps to secure data.
Rapelcgvba Urycf gb frpher qnqn.
Input : You
Output: INVALID LENGTH
*/
import java.util.*;
public class Caesar
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        System.out.println("Enter a string:");
        while(true) //taking a string of valid length as input 
        {
            s=sc.nextLine();
            sc.close();
            if(s.length()<=3||s.length()>=100)
            {
                System.out.println("INVALID LENGTH");
                System.out.println("Give input of correct length again:");
                continue;
            }
            else
            break;
        }
        int l=s.length();
        Caesar ob=new Caesar();
        System.out.println("Output : "+ob.caesar(s,l));
    }
    public String caesar(String st,int len) //function to encrypt the given string 
    {
        String res="";
        for(int i=0;i<len;i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                ch=(char)(ch+13);
                if(ch>'Z')
                {
                    ch=(char)(ch-13);
                    int diff='Z'-ch;
                    ch=(char)('A'+13-(diff+1));
                }
            }
            else
            if(ch>='a'&& ch<='z')
            {
                ch=(char)(ch+13);
                if(ch>'z')
                {
                    ch=(char)(ch-13);
                    int diff='z'-ch;
                    ch=(char)('a'+13-(diff+1));
                }
            }
            res=res+ch;
        }
        return res;
    }
}                
                
        