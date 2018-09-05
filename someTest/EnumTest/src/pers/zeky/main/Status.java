package pers.zeky.main;

public enum Status {
	
	/*private static final Status */
	START("123"),
	RUNNING("456"),
	FINISHED("789");
	
	
	private final String code;
	
	private Status(final String code){
		this.code = code.intern();
	}
	
	public String getCode(){
		return this.code;
	}

}
