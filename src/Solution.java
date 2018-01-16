import java.util.ArrayList;

public class Solution {
	public List<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        	
        for(int i = 0; i < Math.pow(2, n); i++)
        {
        	res.add((i >> 1) ^ i);
        }
        
        return res;
    }
}
