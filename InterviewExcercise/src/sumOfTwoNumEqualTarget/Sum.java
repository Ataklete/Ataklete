package sumOfTwoNumEqualTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sum {
  
	
	public static int[] sumToTraget(int[] nums, int target) {
		int[] res = new int[2];
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
			mp.put(nums[i],i);
		}
		for (int i = 0; i < nums.length; i++) {
			if(mp.get(nums[i] - target) != null) {
				System.out.println("=====");
				res[0]=i;
				res[1]=mp.get(nums[i] - target);
				return res;
			}
		}
		return res;
	}
//		List<Integer> list = new ArrayList<>();
//		for (int i =0; i<nums.length; i++) {
//			int a = nums[i];
//			for (int j =1; j<nums.length; j++) {
//				if( a + nums[j] == target) {
//					System.out.println(a);
//					res[0]=a;
//					System.out.println(nums[0]);
//					res[1]=nums[j];
//					System.out.println(nums[1]);
//				    System.out.println(res);
//					res[0]=a;
//					System.out.println("a is " + a);
//					res[1]=nums[j];
//					System.out.println("---");
//					System.out.println(res);
//					list.add(a);
//					list.add(nums[j]);
//					break;
//				}
//			}
//			
//			System.out.println(res);
//		}
//		
//       return list;
//	}
  
	public static void main(String[] args) {
//		Sum sum = new Sum();
		int[] num = new int[]{1,2,2,3,0};
		int[] res1 = sumToTraget(num, 4);
		System.out.println(res1);

	}

}
