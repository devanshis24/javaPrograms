public class Solution {
    public boolean isHappy(int n) {
    List<Integer> list = new ArrayList<>();
		while (n != 1) {
			if (list.contains(n)) {
				return false;
			}
			list.add(n);
			int sum = 0;
    		while (n > 0) {
    			int x = n % 10;
    			n = n / 10;
    			sum = sum + x * x;
    		}
		
			n = sum;
		}
		return true;
    }
}