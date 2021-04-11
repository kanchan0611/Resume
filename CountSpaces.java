class CountSpaces  
{  
    public static void main(String[] args) 
   {  
        String string = "The sun rises in the East";  
        int count = 0;  
        for(int i = 0; i < string.length(); i++) 
       {  
            if(string.charAt(i) == ' ')  
                count++;  
        }   
        System.out.println("Total number of spaces in a string: " + count);  
    }  
}  