import java.util.*;
import java.io.*;
public class pangramString 
{
	public static int size = 26;  
	 
	public static boolean isLetter(char ch)  
	{  
	if (!Character.isLetter(ch))  
	{
	  
	return false;  
	}
	
	return true;  
	}  
	
	public static boolean containsAllLetters(String str, int len)  
	{  
	
	str = str.toLowerCase();  
	
	boolean[] present = new boolean[size];  
	
	for (int i = 0; i < len; i++)   
	{  
	 
	 if (isLetter(str.charAt(i)))   
	  {  
	    int letter = str.charAt(i) - 'a';   
	    present[letter] = true;  
	  }  
	}  
	
	for (int i = 0; i < size; i++)   
	{  
	if (!present[i])  
	
	return false;  
	}  
	
	return true;  
	}  
	 
	public static void main(String args[])  
	{  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String s=sc.next();
	  
	   
	int len = s.length();  
	//function calling  
	if (containsAllLetters(s, len))  
	System.out.println("The given string is a pangram string.");  
	else  
	System.out.println("The given string is not a pangram string.");  
	}  
