package algorithm.d_dataStructure.bst;

public class Run {

	public static void main(String[] args) {
		
		Integer[] nums = {8, 3, 10, 1, 6, 14, 4, 7, 13};
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
		for (Integer integer : nums) {
			bst.insert(integer);
		}
		
		System.out.println(bst.bfs());
		System.out.println("size : " + bst.size());
		System.out.println("--------------------------------------------");
		//bst.delete(14);
		//System.out.println(bst.bfs());
		//System.out.println("size : " + bst.size());

		System.out.println("전위순회 : " + bst.preOrderRecursive());
		System.out.println("전위순회 : " + bst.preOrder());
		System.out.println("--------------------------------------------");
		System.out.println("후위순회 : " + bst.postOrderRecursive());
		System.out.println("후위순회 : " + bst.postOrder());
		System.out.println("--------------------------------------------");
		System.out.println("중위순회 : " + bst.inOrderRecursive());
		System.out.println("중위순회 : " + bst.inOrder());
	}

}
