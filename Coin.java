public class Coin
{
   
    static int minCoins(int coins[], int m, int V)
    {
            int count=0;
            if (V == 0)
                return 0;
            for(int i=0;i<m;i++)
            {
                if(coins[i]<=V)
                {
                    count++;
                    V= V-coins[i];
                        if(V==0)
                            break;
                }
               
            }
            return count;
    }
    public static void main(String args[])
    {
       int coins[] =  {9, 6, 5, 1};
       int m = coins.length;
       int V = 11;
       System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
    }
}