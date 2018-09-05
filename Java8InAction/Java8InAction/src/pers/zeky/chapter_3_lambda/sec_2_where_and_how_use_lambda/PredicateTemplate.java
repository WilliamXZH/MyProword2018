package pers.zeky.chapter_3_lambda.sec_2_where_and_how_use_lambda;

public interface PredicateTemplate {
	
	<P,R> R apply(P p); 

}
