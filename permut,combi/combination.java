// safer n is 20

import java.util.*;
// public class combination {
//   public static void main(String args[]){
//     List<List<Integer>> ans = new ArrayList<>();
//     combine(5,ans,new ArrayList<Integer>(),0);
//     System.out.println(ans);
//   }
//   public static void combine(int n,List<List<Integer>> ans,ArrayList<Integer> curr,int start){
//     ans.add(new ArrayList<>(curr));
//     for(int i=start;i<n;i++){
//       curr.add(i+1);
//       combine(n,ans,curr,i+1);
//       curr.remove(curr.size()-1);
//     }
//     return;
//   }
// }

import java.util.*;
public class combination {
  public static void main(String args[]){
    List<List<Integer>> ans = new ArrayList<>();
    System.out.println(combine(5,ans,0,0));
  }
  public static boolean combine(int n,List<List<Integer>> ans,int sum,int start){
    if(sum==80)return true;
    for(int i=start;i<n;i++){
      sum+=(i+1);
      if(combine(n,ans,sum,i+1))return true;
      sum-=(i+1);
    }
    return false;
  }
}
