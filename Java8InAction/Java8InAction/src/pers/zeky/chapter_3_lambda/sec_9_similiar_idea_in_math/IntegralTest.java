package pers.zeky.chapter_3_lambda.sec_9_similiar_idea_in_math;

import java.util.function.Function;

/* »ý·Ö */
public class IntegralTest {
	
	public static double integrate(Function<Double,Double> f,double x1,double x2){
		//return (f.apply(x1)+f.apply(x2))*(x2-x1)/2;
		double res = 0.0;
		double mx = (x2-x1)/100;
		double s = mx/2+x1;
		for (;s<x2;s+=mx){
			res += f.apply(s)*mx;
		}
		return res;
		
	}

	public static void main(String[] args) {
	
		/* f(x)=x+10 */
		System.out.println(integrate(C::f,3,7));
		System.out.println(integrate(C::g, 0, 5));
		System.out.println(integrate(C::h,0, 5));
		
	}
	
}
