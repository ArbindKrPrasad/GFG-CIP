import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LargestRectArea2 {
    // public static void main(String[] args) {
    //     ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,1,5,6,2,3));
    //     int res = largestRectArea(arr);
    //     System.out.println(res);
    // } 

    public int largestRectArea(ArrayList<Integer> arr){
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for(int i=0; i<arr.size(); i++){
            while(!s.empty() && arr.get(s.peek())>=arr.get(i)){
                int top = s.pop();
                int curr = arr.get(top) * (s.empty()?i:(i-s.peek()-1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }

        while(s.empty()==false){
            int top = s.pop();
            int n = arr.size();
            int curr = arr.get(top) * (s.empty()?n:(n-s.peek()-1));
            res = Math.max(res, curr);
        }
        return res;
    } 
}
