import org.w3c.dom.ls.LSException;

public class LargestRectWith1 extends LargestRectArea2{
    public static void main(String[] args) {
        int [][] arr = {{0, 1, 1, 0},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 0}};
        int res = 0;
        for(int i=0; i<arr.length; i++){
            if(i==0){
                int curr = largestRectArea2(arr[0]);
                res = Math.max(res, curr);
            }
            else{
                for(int j=0; j<arr[0].length; j++){
                    if(arr[i][j]!=0){
                        arr[i][j] +=arr[i-1][j];
                    }
                }
                int curr = largestRectArea2(arr[i]);
                res = Math.max(res, curr);
            }
        }

        System.out.println(res);
        
    }
}
