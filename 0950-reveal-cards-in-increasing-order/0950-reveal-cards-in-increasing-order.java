class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        if(n <= 2) return deck;
        int[] ans = new int[n];
        Deque<Integer> idxs = new LinkedList<>();
        for(int i = 0; i < n; i++){
            idxs.add(i);
        };

        for(int crd : deck){
            int idx = idxs.poll();
            ans[idx] = crd;
            if(!idxs.isEmpty()){
                idxs.add(idxs.poll());
            }
        }
        return ans;
    }
}