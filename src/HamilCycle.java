import java.util.Scanner;

public class HamilCycle {
    private int adj[][], x[], n;
    public HamilCycle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nodes: ");
        n = sc.nextInt();
        adj = new int[n][n];
        System.out.println("ENter matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }
        x= new int[n];
        x[0] = 0;
        for (int i = 1; i < n; i++) {
            x[i] = -1;
        }
    }

    public void nextValue(int k){
        int i = 0;
        while (true){
            x[k] = x[k] + 1;
            if (x[k] == n)
                x[k] = -1;
            if (x[k] == -1)
                return;
            if(adj[x[k-1]][x[k]] == 1){
                for (i = 0; i<k; i++){
                    if(x[i] == x[k])
                        break;
                }
            }
            if (i == k)
                if(k<n-1 || k == n-1 && adj[x[k-1]][0] == 1){
                    return;
                }
        }
    }

    public void getCycle(int k){
        while(true){
            nextValue(k);
            if(x[k] == -1)
                return;
            if (k == n-1){
                System.out.println("\nSoltion:");
                for (int i = 0; i < n; i++) {
                    System.out.print( (x[i]+1) + " ");
//
                }
                System.out.print(1);
            }
            else
                getCycle(k+1);
        }
    }

    public static void main(String[] args) {
        HamilCycle h = new HamilCycle();
        h.getCycle(1);
    }
}
