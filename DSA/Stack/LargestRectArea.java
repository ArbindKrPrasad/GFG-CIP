import java.util.ArrayList;
import java.util.Arrays;

public class LargestRectArea {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(2,1,5,6,2,3));
        int res = largestRectArea(arr);
        System.out.println(res);
    }

    public static int largestRectArea(ArrayList<Integer> arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.size(); i++){
            int start = i;
            int end = i;
            while(start>=0 && arr.get(start)>=arr.get(i)){
                start--;
            }
            while(end<arr.size() && arr.get(end)>=arr.get(i)){
                end++;
            }

            int tempMax = (end-start-1)*arr.get(i);
            max = tempMax>max?tempMax:max;
        }
        return max;
    }
}
