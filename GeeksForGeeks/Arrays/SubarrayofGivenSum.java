class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
   static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
      
        ArrayList<Integer> ans = new ArrayList<>();
        
        int sum = 0;
        int start = 0;
        for(int end = 0;end<n;end++)
        {
            sum += arr[end];
            while(sum>s)
            {
                sum -= arr[start];
                start++;
            }
            if(sum == s && start<=end)
            {
                ans.add(start+1);
                ans.add(end+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
