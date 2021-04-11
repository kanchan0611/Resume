class SumSquare 
{ 
    public boolean sumSquare(int n) 
    { 
        for (long i = 1; i * i <= n; i++) 
            for (long j = 1; j * j <= n; j++) 
                if (i * i + j * j == n) { 
                    System.out.println(i + "^2 + "
                                       + j + "^2"); 
                    return true; 
     } 
  
        return false; 
    } 
       
     
    public static void main(String args[]) 
    { 
        SumSquare s=new SumSquare();
        int n = 17; 
        if (s.sumSquare(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 