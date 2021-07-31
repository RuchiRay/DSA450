public class kadane
{
    
    int maxSubarraySum(int arr[], int n){
        
        int sum = 0;
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
                max = Math.max(max,sum);
            if(sum<0)
            {
                sum = 0;
            }
            
        }
        return max;
    }
}