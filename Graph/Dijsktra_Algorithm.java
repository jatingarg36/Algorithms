package Graph;
//for minimum spanning tree;
public class Dijsktra_Algorithm {
    private static int INF = (int) 1e9;
    public static void main(String[] args) {
        Dijsktra_Algorithm pa = new Dijsktra_Algorithm();
        int graph[][] = new int[][] { {0,4,0,0,0,0,0,8,0},
                {4,0,8,0,0,0,0,11,0},
                {0,8,0,7,0,4,0,0,2},
                {0,0,7,0,9,14,0,0,0},
                {0,0,0,9,0,10,0,0,0},
                {0,0,4,14,10,0,2,0,0},
                {0,0,0,0,0,2,0,1,6},
                {8,11,0,0,0,0,1,0,7},
                {0,0,2,0,0,0,6,7,0}};
        pa.sortest_path(graph,0);
    }

    private void sortest_path(int[][] graph, int src) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];
        for(int i=0;i<n;i++){
            dist[i]=INF;
            visited[i]=false;
        }
        dist[src]=0;        //starting index;


        for(int i=0;i<n-1;i++){
            int min = min_dis(visited,dist);
            visited[min] = true;
            for(int j=0;j<n;j++){
                if(graph[min][j]!=0 && !visited[j] && dist[min]!=INF && dist[j]>graph[min][j]+dist[min]) {
                    dist[j] = graph[min][j] + dist[min];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(i +" = " +dist[i]);
        }
    }

    private int min_dis(boolean[] visited, int[] dist) {
        int min = INF;
        int ind=-1;
        for(int i=0;i<dist.length;i++){
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                ind = i;
            }
        }
        return ind;
    }
}
