package Application;

public class SizeHeightWrapper {
	private int size;
	private int height;
	
	public SizeHeightWrapper(int size, int height) {
		this.size = size;
		this.height = height;
	}
	
	public void SetSize(int size) {
		this.size = size;
	}
	
	public void SetHeight(int height) {
		this.height = height;
	}
	
	public int GetSize() {
		return size;
	}
	
	public int GetHeight() {
		return height;
	}
}
