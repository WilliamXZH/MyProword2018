package pers.zeky.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomRangeExpansion {

	public interface RandomFunction<T>{
		public T get();
	}
	
	public static RandomFunction<Integer> getIntRandomFunction(Integer bound){
		return ()->new Random().nextInt(bound);
	}
	/**
	 * 
	 * @param rf 原随机函数
	 * @param s 原随机函数范围0~s
	 * @param t 目标随机函数范围0~t
	 * @return 目标随机函数  
	 */
	public static <T> RandomFunction<Integer> convertRandomFunction(RandomFunction<Integer> rf,
			Integer s,Integer t){
		return ()->{
			if (s==t){
				return rf.get();
			}else if(s>t){
				Integer res ;
				do{
					res = rf.get();
				}while(s-res<=s%t);
				return res%t;
			}
			
			RandomFunction<Integer> rf1 = convertRandomFunction(rf, s, t/s+1);
			//RandomFunction<Integer> rf2 = convertRandomFunction(rf, s, t%s);
			
			Integer s1 ;
			Integer s2 ;
			do{
				s1 = rf1.get();
				s2 = rf.get();
			}while(s1*s+s2>=t);			
			return s1*s+s2;
		};
	}
	
	public static void main(String[] args) {
		
		Integer sourceBound = 4;
		Integer targetBound = 4;
		Integer testingAmount = targetBound*10000000;
		
		RandomFunction<Integer> rf1 = getIntRandomFunction(sourceBound); 
		
		RandomFunction<Integer> rf2 = convertRandomFunction(rf1, sourceBound, targetBound);
		
		Long t1 = System.currentTimeMillis();
		testRandomFunction(rf2, testingAmount,targetBound);
		System.out.println(System.currentTimeMillis()-t1);
		
		RandomFunction<Integer> rf2_v2 = getIntRandomFunction(targetBound);
		Long t2 = System.currentTimeMillis();
		testRandomFunction(rf2_v2, testingAmount, targetBound);
		System.out.println(System.currentTimeMillis()-t2);
		
	}
	
	public static void testRandomFunction(RandomFunction<Integer> rf,Integer c,Integer b){
		if (null==rf){
			System.out.println("RandomFunction is null!");
			return;
		}
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<c;i++){
			int tmp = rf.get();
			if(map.containsKey(tmp)){
				map.put(tmp, map.get(tmp)+1);
			}else{
				map.put(tmp, 1);
			}
		}
		for(int i=0;i<b;i++){
			System.out.println(i+"\t:"+map.get(i));
		}
		/*for (Integer i:map.keySet()){
			System.out.println(i+"\t:"+map.get(i));
		}*/
		
	}
}
