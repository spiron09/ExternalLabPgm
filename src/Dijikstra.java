public class Dijikstra {
    void readMatrix(){

    }
   public int findMinDistance(int[] d, int[] visited){
        int minDistance = 999;
        int minDistanceVertex = -1;
        for (int i = 1; i <= n ; i++) {
            if(visited[i] == 0 && d[i]<minDistance){
                minDistance = d[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex
    }

    void Algo(){
        int[] visited = new int[10];
        int[] d= new int[10];
        for (int i = 1; i <= n; i++) {
            visited[i] = 0;
            d[i] = 999;
        }
        d[src] = 0;

        for (int i = 1; i <= n ; i++) {
            int u = findMinDistance(d,visited);
            for (int v = 1; v <=n ; v++) {
                if (visited[v] == 0 && d[u] + a[u][v] < d[v]){
                    d[v] = d[u] + a[u][v];
                }
            }
        }

        //print x matrix
    }

}
