package Tree;

import Application.SizeHeightWrapper;

public class BinarySearchTree {
	BinaryTreeNode root;
	
	public BinarySearchTree(BinaryTreeNode binaryTreeNode) {
		root = binaryTreeNode;
	}
	
	public void SetBinaryTreeRoot(BinaryTreeNode binaryTreeNode) {
		root = binaryTreeNode;
	}
	
	public BinaryTreeNode GetBinarySearchTreeRoot() {
		return root;
	}
	
	public BinaryTreeNode Insert(BinaryTreeNode binaryTreeNode, int data) {
		if(binaryTreeNode == null) {
			binaryTreeNode = new BinaryTreeNode(data);
			return binaryTreeNode;
		}
		if(binaryTreeNode.GetBinaryTreeNodeData() < data) {
			binaryTreeNode.SetBinaryTreeNodeRight(Insert(binaryTreeNode.GetBinaryTreeNodeRight(), data));
		}else {
			binaryTreeNode.SetBinaryTreeNodeLeft(Insert(binaryTreeNode.GetBinaryTreeNodeLeft(), data));			
		}
			
		return binaryTreeNode;
	}
	
	public SizeHeightWrapper GetHeightSize(BinaryTreeNode binarySearchTree, SizeHeightWrapper sizeWrapper) {
		
		if(binarySearchTree == null) {
			sizeWrapper.SetHeight(0);
			sizeWrapper.SetSize(0);
			return sizeWrapper;
		}
		
		if(binarySearchTree.GetBinaryTreeNodeLeft() == null && binarySearchTree.GetBinaryTreeNodeRight() == null) {
			sizeWrapper.SetHeight(1);
			sizeWrapper.SetSize(1);
			return sizeWrapper;
		}
		
		SizeHeightWrapper left = GetHeightSize(binarySearchTree.GetBinaryTreeNodeLeft(), sizeWrapper);
		SizeHeightWrapper right = GetHeightSize(binarySearchTree.GetBinaryTreeNodeRight(), sizeWrapper);
		sizeWrapper.SetSize(left.GetSize()+1+right.GetSize());
		
		if(left.GetHeight() < right.GetHeight()) {
			sizeWrapper.SetHeight(right.GetHeight()+1);
		}else {
			sizeWrapper.SetHeight(left.GetHeight()+1);
		}
		return sizeWrapper;
	}
}
