
class delete{
  static class Node{
    Node left,right;
    int data;
    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  public static void inorder(Node root){
    if(root==null)return;
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
  public static void main(String[] args){
    int[] a = new int[]{9,55,4,3,23,34,12,35,54};
    Node root = null;
    for(int i:a){
      root = insert(root,i);
    }
    inorder(root);
    System.out.println();
    root = deleteNode(root,34);
    inorder(root);
    System.out.println();
  }
  public static Node insert(Node root,int data){
    if(root==null){
      return new Node(data);
    }
    if(data>root.data)root.right = insert(root.right,data);
    if(data<root.data)root.left = insert(root.left,data);
    return root;
  }
  public static Node deleteNode(Node root, int key) {
    if (root == null) return null;
    
    if (key < root.data) {
        root.left = deleteNode(root.left, key);
    } else if (key > root.data) {
        root.right = deleteNode(root.right, key);
    } else {
        // Node found
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;
        
        // Find inorder predecessor (max in left subtree)
        Node maxNode = rightMost(root.left);
        root.data = maxNode.data;
        
        // Delete the inorder predecessor
        root.left = deleteNode(root.left, maxNode.data);
    }
    return root;
}

public static Node rightMost(Node node) {
    while (node.right != null) node = node.right;
    return node;
}

}

//leetcode solution
// --------------------------------------------------------------------------------------------------------------------------------------

// class Solution {
//     public TreeNode deleteNode(TreeNode root, int key) {
//         root = delete(root,key);
//         return root;
//     }
//     public TreeNode delete(TreeNode root,int key){
//         if(root == null)return root;
//         if(key<root.val)root.left = delete(root.left,key);
//         else if(key>root.val)root.right = delete(root.right,key);
//         else{
//             if(root.left == null)return root.right;
//             if(root.right == null)return root.left;

//             TreeNode max = findMax(root.left);
//             root.val = max.val;
//             root.left = delete(root.left,max.val);
//         }
//         return root;
//     }
//     public TreeNode findMax(TreeNode root){
//         while(root.right!=null){
//             root = root.right;
//         }
//         return root;
//     }
// }