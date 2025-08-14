import java.util.*;
public class activitySelection{
    public static void main(String args[]){
        int start []={0,1,3,5,5,8};
        int end []= {6,2,4,7,9,9};
        if(start.length!=end.length){
            System.out.println("Check start and end lists they are not equal");
            return;
        }
        int act [][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            act[i][0] = i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }
        Arrays.sort(act,Comparator.comparingDouble(a->a[2]));
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        maxAct =1;
        ans.add(act[0][0]);//taking first activity
        int lastEnd = act[0][2];
        for(int i=1;i<end.length;i++){
            if(act[i][1]>=lastEnd){
                //activity selection
                maxAct++;
                ans.add(act[i][0]);
                lastEnd = act[i][2];
            }
        }
        System.out.println("max Activites: "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}