package topic01;

public class StringBox {

	private String content;

	public StringBox(String content) {
		this.content = content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}
	
	public static void main(String[] args) {
		
		StringBox stringBox = new StringBox("HelloWorld");
		String str = stringBox.getContent();
		
	}
}