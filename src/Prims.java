public class Prims {
    int n;
    int a[][] = new int[][];

    void readList(){

    }
    void findTree(){
        int min, u = 0, v = 0, count = 0, cost = 0;
        int visted[] = new int[10];
        int t[][] = new int [10][3];
        visted[1] = 1;
        while(count != n-1){
            for (int i = 0, min = 999; i <= n ; i++) {
                for (int j = 0; j <= n; j++) {
                    if (visted[i] == 1 && visted[j] == 0 && min>a[i][j]){
                        min = a[i][j];
                        u = i;
                        v = j
                    }
                }
            }
            if (min == 999)
                break;
            t[k][0] = u;
            t[k][1] = v;
            t[k][2] = min;
            visted[v] = 1;
            cost+= min;
            k++;
            count++;
        }
    }
}
