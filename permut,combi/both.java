import java.util.*;

// public class both {
//     static int n = 2; // number of boxes
//     static int m = 4; // number of balls

//     public static void main(String[] args) {
//         List<List<Integer>> permutations = new ArrayList<>();
//         boolean[] vis = new boolean[n];
//         permute(n,permutations,new ArrayList<Integer>(),vis);
//         List<List<Integer>> combinations = new ArrayList<>();
//         combine(m,n,combinations,new ArrayList<Integer>(),0);
//         System.out.println(permutations);
//         System.out.println(combinations);
//         for(List<Integer> combination:combinations){
//           String[] arr = new String[m];
//           Arrays.fill(arr,"Empty");
//           for(List<Integer> per:permutations){
//             int i = 0;
//             int j = 0;
//             while(i<n){
//               arr[combination.get(i)] =String.valueOf(per.get(j));
//               i++;
//               j++;
//             }
//             System.out.println(Arrays.toString(arr));
//           }
//         }
//     }


//     public static void permute(int n,List<List<Integer>> permutations,ArrayList<Integer> curr,boolean[] vis){
//       if(curr.size()==n){
//         permutations.add(new ArrayList<>(curr));
//         return;
//       }
//       for(int i=0;i<n;i++){
//         if(!vis[i]){
//           vis[i]=true;
//           curr.add(i);
//           permute(n,permutations,curr,vis);
//           vis[i] = false;
//           curr.remove(curr.size()-1);
//         }
//       }
//       return;
//     }
    
//     public static void combine(int m,int n,List<List<Integer>> combinations,ArrayList<Integer> curr,int start){
//         if(curr.size()==n){
//           combinations.add(new ArrayList<>(curr));
//           return;
//         }
//         for(int i=start;i<m;i++){
//           curr.add(i);
//           combine(m,n,combinations,curr,i+1);
//           curr.remove(curr.size()-1);
//         }
//         return;
//     }
// }
   
public class both {
    static int n = 4; // number of boxes
    static int m = 2; // number of balls

    public static void main(String[] args) {
        boolean[] usedBoxes = new boolean[n];
        String[] arrangement = new String[n];
        Arrays.fill(arrangement, "Empty");
        placeBalls(0, arrangement, usedBoxes);
    }

    // Recursive function to place balls
    static void placeBalls(int ballNumber, String[] arrangement, boolean[] usedBoxes) {
        if (ballNumber == m) {
            System.out.println(Arrays.toString(arrangement));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!usedBoxes[i]) {
                usedBoxes[i] = true;
                arrangement[i] = String.valueOf(ballNumber + 1);

                placeBalls(ballNumber + 1, arrangement, usedBoxes);

                // backtrack
                usedBoxes[i] = false;
                arrangement[i] = "Empty";
            }
        }
    }
}
