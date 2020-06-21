package composition;

public class Bed {
	private String style;
	private String height;

	public Bed(String style, String height) {
		this.style = style;
		this.height = height;
	}

	public String getStyle() {
		return style;
	}

	public String getHeight() {
		return height;
	}
	
	public void make() {
		System.out.println("making the bed");
	}

}
