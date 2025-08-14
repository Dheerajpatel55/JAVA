import java.util.*;
public class Storing_Graph {
    public static void main(String args[]){
        int v=4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(2);

        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(1);
        graph.get(2).add(3);

        graph.get(3).add(1);
        graph.get(3).add(2);

        for(int i=0;i<v;i++){
            System.out.print("vertex "+ i +" : ");
            for(int neighbour: graph.get(i)){
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
    }
}
