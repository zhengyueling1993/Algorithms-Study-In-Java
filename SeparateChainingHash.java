/**
 * Created by yuelingzheng on 16/3/24.
 */
public class SeparateChainingHash<Key,Value> {
    private int N;
    private int M;
    private SequentialSearchST<Key,Value>[] st;

    public SeparateChainingHash(){
        this(997);
    }
    public SeparateChainingHash(int M)
    {  // Create M linked lists.
        this.M = M;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[M];
        for (int i = 0; i < M; i++)
            st[i] = new SequentialSearchST();
    }
    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }
    public Value get(Key key) {
        return (Value) st[hash(key)].get(key);
    }
    public void put(Key key, Value val) {
        st[hash(key)].put(key, val);
    }

}
