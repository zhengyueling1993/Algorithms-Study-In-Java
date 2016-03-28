/**
 * Created by yuelingzheng on 16/3/28.
 */
public class DirectedGraph {
    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    public DirectedGraph(int V){
        this.V = V;
        this.E = 0;
        adj =(Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<Integer>();
    }
    public int V(){
        return V;
    }
    public int E(){
        return E;
    }

    public void addEdge(int v,int w){
           adj[v].add(w);
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
    public DirectedGraph reverse(){
        DirectedGraph R = new DirectedGraph(V);
        for (int v = 0; v < V; v++)
            for (int w:adj(v))
                R.addEdge(w, v);
        return R;
    }
}
