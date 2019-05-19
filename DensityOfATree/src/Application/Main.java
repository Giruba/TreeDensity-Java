package Application;

import java.util.Scanner;

import Tree.BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		System.out.println("Density of a Tree");
		System.out.println("-----------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of elements in the tree");
			int noElements = scanner.nextInt();
			BinarySearchTree tree = new BinarySearchTree(null); 
			for(int index = 0; index < noElements; index++) {
				System.out.println("Element "+(index+1)+":");
				tree.SetBinaryTreeRoot(
						tree.Insert(tree.GetBinarySearchTreeRoot(), scanner.nextInt()));
			}
			SizeHeightWrapper wrapper = tree.GetHeightSize(
					tree.GetBinarySearchTreeRoot(), new SizeHeightWrapper(0,0));
			System.out.println("Density of the constructed binary search tree is "+(wrapper.GetSize()/wrapper.GetHeight()));
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
}
