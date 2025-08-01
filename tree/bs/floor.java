import java.util.*;
import java.io.*;
import static java.lang.System.out;
public class floor{
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
    if(root == null){
      return new Node(k);
    }
    if(k>root.data){
      root.right = insert(root.right,k);
    }
    else root.left = insert(root.left,k);
    return root;
  }
  public static void inorder(Node root){
    if(root == null)return;
    inorder(root.left);
    out.println(root.data);
    inorder(root.right);
  }
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    out.println("enter number");
    int n = toi(br.readLine());
    Node root = null;
    while(n-->0){
      int k = toi(br.readLine());
      root = insert(root,k);
    }
    inorder(root);
    out.println("enter the key to find floor");
    int k = toi(br.readLine());
    int fl = floor(root,k);
    out.println(fl);
  }
  public static int floor(Node root,int k){
    int floor = -1;
    while(root!=null){
      if(root.data<k){
        floor = root.data;
        root = root.right;
      }
      else{
        root = root.left;
      }
    }
    return floor;
  }
}