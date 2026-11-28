class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] frees = new int[n];

        for(int i = 0; i < n; i++){
            int fact = items[i][0];

            int ct = 0;
            for(int j = 0; j < n; j++){
                if(i != j && items[j][0] % fact == 0) ct++;
            }

            frees[i] = ct;
        }

        int NEG = -1000000000;
        int[] freq = new int[budget + 1];
        for(int b = 1; b <= budget; b++) freq[b] = NEG;

        for(int i = 0; i < n; i++){
            int cost = items[i][1];
            int free = frees[i];

            int[] newfreq = freq.clone();

            for(int r = 0; r < cost; r++){
                int max = (budget - r) / cost;
                if(max < 0) continue;
                
                int best = NEG;

                for(int k = 0; k <= max; k++){
                    int idx = r + k * cost;

                    if(idx > budget) break;

                    if(k > 0 && best > NEG / 2){
                        newfreq[idx] = Math.max(newfreq[idx], free + k + best);
                    }
                    if(freq[idx] > NEG/2){
                        best = Math.max(best, freq[idx] - k);
                    }
                }
                
            }
            freq = newfreq;
            
        }

        int ans = 0;
        for(int i = 0; i <= budget; i++){
            ans = Math.max(ans, freq[i]);
        }

        return ans;
    }
}