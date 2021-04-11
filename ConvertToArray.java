import java.util.*; 
class ConvertToArray { 
  
    public static void main(String args[]) 
    { 
        String str = "kanchan"; 
        char[] ch = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) 
       { 
            ch[i] = str.charAt(i); 
        } 
        for (int i = 0; i < ch.length; i++) 
       { 
            System.out.print(ch[i]+" ");
        } 
    } 
} 