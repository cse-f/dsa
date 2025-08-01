import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class ceil{
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  public static int toi(String s){
    return Integer.parseInt(s);
  }
  public static Node insert(Node root,int k){
    if(root == null)return new Node(k);
    if(root.data>k){
      root.left = insert(root.left,k);
    }
    else root.right = insert(root.right,k);
    return root;
  }
  public static void inorder(Node root){
    if(root ==null)return;
    inorder(root.right);
    out.print(root.data+" ");
    inorder(root.left);
  }
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    out.println("ENter n:");
    int n = toi(br.readLine());
    Node root = null; 
    while(n-->0){
      int k = toi(br.readLine());
      root = insert(root,k);
    }
    inorder(root);
    out.println("Enter ceil:");
    int c = toi(br.readLine());
    out.println(ceil(root,c));
    
  }
  public static int ceil(Node root,int k){
    int ceil = -1;
    while(root!=null){
      if(k<root.data){
        ceil = root.data;
        root = root.left;
      }
      else{
        root = root.right;
      }
    }
    return ceil;
  }
}