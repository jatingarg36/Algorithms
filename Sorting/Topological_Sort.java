package Sorting;

import java.util.*;

import static java.lang.Math.sqrt;


public class Topological_Sort {
    private static int V = 6;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj;
        adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < V; i++) {
            int a,b;
            a = input.nextInt();
            b = input.nextInt();
            adj.get(a).add(b);
        }
        topological_sort(adj);
    }

    private static void topological_sort(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i])
                dfs(adj,i,visited,stack);
        }
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj, int src, boolean[] visited, Stack<Integer> stack) {
        visited[src] = true;
        Iterator<Integer> it = adj.get(src).iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(!visited[i]){
                dfs(adj,i,visited,stack);
            }
        }
        stack.push(src);
    }
}
