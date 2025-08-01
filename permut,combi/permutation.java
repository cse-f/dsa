// Safer value of n is 8



// public class permuation {
//   public static void main(String args[]){
//        int n = 3;
//         boolean[] vis = new boolean[n];
//         permute(n,vis,new StringBuffer(""));
//     }
//     public static void permute(int n,boolean[] vis,StringBuffer sb){
//         if(sb.length()==n){
//             System.out.println(sb);
//         }
//         for(int i=0;i<n;i++){
//             if(!vis[i]){
//                 vis[i]=true;
//                 sb.append((char)((i+1)+'0'));
//                 permute(n,vis,sb);
//                 sb.deleteCharAt(sb.length()-1);
//                 vis[i]=false;
//             }
//         }
//         return;
//     }
    
// }

import java.util.*;
public class permutation {
    public static void main(String args[]){
       List<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3}));
       List<List<Integer>> result = new ArrayList<>();
       permute(arr,0,result);
       System.out.println(result);

    }
    static void permute(List<Integer> arr, int index, List<List<Integer>> result) {
        if (index == arr.size()) {
            result.add(new ArrayList<>(arr));
            return;
        }
        for(int i = index;i<arr.size();i++){
            Collections.swap(arr,i,index);
            permute(arr,index+1,result);
            Collections.swap(arr,i,index);
        }
    }
}

