package pers.zeky.chapter_3_lambda.sec_6_method_citation;

public class Color {

	private Integer red;
	private Integer green;
	private Integer blue;

	public Color(Integer red, Integer green, Integer blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getGreen() {
		return green;
	}

	public void setGreen(Integer green) {
		this.green = green;
	}

	public Integer getBlue() {
		return blue;
	}

	public void setBlue(Integer blue) {
		this.blue = blue;
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}

}
