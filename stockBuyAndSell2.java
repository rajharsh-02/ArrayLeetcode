public class stockBuyAndSell2
{
    public static void main(String[] args) {
        int arr [] = {5,2,6,4,1,7};
        System.out.println(stockBuyAndSell2(arr));
        
    }   
    public static int stockBuyAndSell2(int arr[])
    {
        int profit = 0 ;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) 
            {
                profit=profit+arr[i] - arr[i-1];    
            }
        }
        return profit;
    } 
}
