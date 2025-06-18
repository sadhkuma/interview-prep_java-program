package arrayList;


public class StringExmaple
{
   public static void main(StringExmaple[] args)
   {
       String str1 = "Scaler";
	   String str2 = "Scaler";
	   String str3 = "SCALER";
	   String str4=new String("Scaler"); 
       System.out.println(str1 == str2);
	   System.out.println(str1 == str4); 	   
       System.out.println(str1.equals(str2));
	   System.out.println(str1.equals(str3));
   }
}