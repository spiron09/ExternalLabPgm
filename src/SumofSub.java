public class SumofSub {
    void Subset(int S, int k, int r){
        x[k] = 1;
        if ((S + s[k]) == d){
            for (int i = 1; i <= n ; i++) {
                if (x[i] == n){
                    System.out.println(s[i]);
                }
            }
        }

        else {
            if (S + s[k]+ s[k+1] <= d){

                Subset(S+s[k], k+1, r-s[k]);

            }
        }

        if (S + s[k] >= d && S+s[k+1] <= d){
            x[k] = 0;
            Subset(S,k+1,r-s[k]);
        }
    }
}
