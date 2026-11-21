class Solution {
public:
    vector<int> findSubtreeSizes(vector<int>& parent, string& s) {
        int n = parent.size();
        vector<vector<int>> adj(n);

        for (int i = 1; i < n; ++i) {
            adj[parent[i]].push_back(i);
        }

        vector<int> newParent = parent;
        unordered_map<char, stack<int>> lastSeen;

        dfsUpdateParents(0, s, lastSeen, newParent, adj);

        adj.assign(n, vector<int>());
        for (int i = 1; i < n; ++i) {
            adj[newParent[i]].push_back(i);
        }

        vector<int> subtreeSizes(n, 0);
        dfsCalculateSubtreeSizes(0, adj, subtreeSizes);

        return subtreeSizes;
    }

private:
    void dfsUpdateParents(int node, const string& s, unordered_map<char, stack<int>>& lastSeen,
                          vector<int>& newParent, vector<vector<int>>& adj) {
        char c = s[node];
        
        if (!lastSeen[c].empty()) {
            int ancestor = lastSeen[c].top();
            newParent[node] = ancestor;
        }
        
        lastSeen[c].push(node);

        for (int child : adj[node]) {
            dfsUpdateParents(child, s, lastSeen, newParent, adj);
        }

        lastSeen[c].pop();
    }

    int dfsCalculateSubtreeSizes(int node, vector<vector<int>>& adj, vector<int>& subtreeSizes) {
        int size = 1;
        for (int child : adj[node]) {
            size += dfsCalculateSubtreeSizes(child, adj, subtreeSizes);
        }
        subtreeSizes[node] = size;
        return size;
    }
};