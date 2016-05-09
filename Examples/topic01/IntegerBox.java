package topic01;

public class IntegerBox {

	private Integer content;

	public IntegerBox(Integer content) {
		this.content = content;
	}

	public void setContent(Integer content) {
		this.content = content;
	}

	public Integer getContent() {
		return this.content;
	}
	
	public static void main(String[] args) {
		
		IntegerBox integerBox = new IntegerBox(100);
		int i = integerBox.getContent();
		
	}
}