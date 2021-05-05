import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;



public class PrevGreater {

    public static ArrayList<Integer> prevGrtr(ArrayList<Integer> list){
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        s.push(list.get(0));

        for(int i=1; i<list.size(); i++){
            while(!s.empty() && s.peek()<list.get(i)){
                s.pop();
            }
            int next = s.empty()?-1:s.peek();
            s.push(list.get(i));
            res.add(next);
        }
        return res;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(15, 10, 18, 12, 4, 6, 2, 8));
        ArrayList<Integer> res = prevGrtr(l);
        System.out.println(res);

    }

    
}
