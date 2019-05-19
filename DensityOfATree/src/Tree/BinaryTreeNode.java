package Tree;

public class BinaryTreeNode {

	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
	
	public BinaryTreeNode(int data) {
		this.data = data;
	}
	
	public void SetBinaryTreeNodeData(int data) {
		this.data = data;
	}
	
	public void SetBinaryTreeNodeLeft(BinaryTreeNode left) {
		this.leftNode = left;
	}
	
	public void SetBinaryTreeNodeRight(BinaryTreeNode right) {
		this.rightNode = right;
	}
	
	public int GetBinaryTreeNodeData() {
		return this.data;
	}
	
	public BinaryTreeNode GetBinaryTreeNodeLeft() {
		return this.leftNode;
	}
	
	public BinaryTreeNode GetBinaryTreeNodeRight() {
		return this.rightNode;
	}
}
