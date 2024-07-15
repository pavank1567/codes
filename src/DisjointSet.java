import java.util.Arrays;

class DisjointSet {
    int[] rank;
    int[] parent;
    int[] size;

    public DisjointSet(int n){
        rank = new int[n];
        parent = new int[n];
        size = new int[n];
        for(int i=0; i<parent.length; i++){
            parent[i]=i;
        }
    }

    public void union(int u, int v){

        int pu = findParent(u);
        int pv = findParent(v);

        if(rank[pu]==rank[pv]){
            rank[pu]++;
            parent[pv]=pu;
        } else if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
        } else {
            parent[pu] = pv;
        }

    }
    public void unionBySize(int u, int v){

        int pu = findParent(u);
        int pv = findParent(v);
        if(pu==pv)
            return;

        if(size[pu]>=size[pv]){
            parent[pv] = pu;
            size[pu] += size[pv];
        } else {
            parent[pu] = pv;
            size[pv] += size[pu];
        }

    }

    public int findParent(int u) {
        if(u == parent[u])
            return u;
        parent[u] = findParent(parent[u]);
        return parent[u];
    }
}
