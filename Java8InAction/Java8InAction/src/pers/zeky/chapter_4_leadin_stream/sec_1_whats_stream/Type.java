package pers.zeky.chapter_4_leadin_stream.sec_1_whats_stream;

public enum Type {

	MEAT("1"),
	GREENS("2"),
	FISH("3"),
	OTHER("3");
	
	private String code;
	private Type(String c){
		code = c;
	}
	
}
