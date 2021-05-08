import java.util.Stack;

import javax.sql.rowset.spi.SyncFactory;

public class LargestRectArea2{
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        
        System.out.println(largestRectArea2(arr));
    }

    public static  int largestRectArea2(int[] arr){
        int res = 0;
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(s.empty()==false && arr[s.peek()]>=arr[i]){
                int top = s.pop();
                int curr = arr[top] * (s.empty()?i:i-s.peek()-1);
                res = Math.max(res, curr);
            }
            s.push(i);
        }

        while(s.empty()==false){
            int top = s.pop();
            int curr = arr[top] * (s.empty()?arr.length:arr.length-s.peek()-1);
            res = Math.max(res, curr);
        }
        return res;
    }
    
}