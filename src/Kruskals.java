public class Kruskals {
    void readMatrix(){

    }
    void Algo(){
        int[] parent = new parent[10];
        int [] [] t = new int[10][3];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        int u,v,sum, count, min,k = 0;
        while (count != n-1){
            min = 999;
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=n ; j++) {
                    if(a[i][j] != 0 && a[i][j] < min ){
                        min = a[i][j];
                        u = i;
                        v = j;
                    }
                }
            }
            if (min == 999)
                break;
            int i = u;
            while(parent[i]!=i)
                i = parent[i];
            int j = v;
            while (parent[j] != j)
                j = parent[j];

            if(i!=j){
                t[k][0] = u;
                t[k][1] = v;
                t[k][2] = min;
                k++;
                sum = sum+min;
                count++;
                parent[j] = i;
            }
            a[u][v] = a[v][u] = 999;
        }
        if(count = n-1){
            //print the t table
        }
    }
}
