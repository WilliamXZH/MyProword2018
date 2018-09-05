package pers.zeky.main;

import java.util.concurrent.ConcurrentHashMap;

public class Color {
	
	private final String code;
	private final String codeLowerCase;
	//private static final ConcurrentHashMap<String, Color> cache = new ConcurrentHashMap()();
	
	private Color(final String code){
		this.code = code.intern();
		this.codeLowerCase = this.code.toLowerCase().intern();
	}
	
	public static Color valueOf(final String code){
		//Color c = cache.get(code);
		
		return null;
	}

}
