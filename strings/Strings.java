import java.util.*;
 
class Demo01
{
public static void main(String []args)
{
String str = new String();
Scanner sc = new Scanner(System.in);
System.out.println("Enter text:");
str=sc.nextLine();
System.out.println(str);
int l = str.length();
int digit=0,upper=0,lower=0,words=0, special=0;


for(int i=0;i<=l-1;i++)
{
if(str.charAt(i)>='0' && str.charAt(i)<='9')
  digit++;
else
if(str.charAt(i)>='A' && str.charAt(i)<='Z')
  upper++;
else
if(str.charAt(i)>='a' && str.charAt(i)<='z')
 lower++;
else
if(str.charAt(i)>=' ')
  words++;
else
 special++;
}

System.out.println("\ndigit  " +digit+"\nupper  " +upper+"\nlower  " +lower+"\nwords  " +(words+1)+"\nspecial symbols  " +special);
}}

