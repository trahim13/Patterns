package patterns;

import java.util.LinkedList;
import java.util.List;

import patterns.*;


public class Pattern8_ObjectPool {
    ObjectPool objectPool = new ObjectPool();
    PooledObject pooledObject = objectPool.getPooledObject();
    

}

class PooledObject {}

class ObjectPool {
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();

    public PooledObject getPooledObject() {
        if (free.isEmpty()) {
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        } else {
            PooledObject pooledObject = free.get(0);
            used.add(pooledObject);
            free.remove(pooledObject);
            return pooledObject;
        }

    }

    public void releasePooledObject(PooledObject pooledObject) {
        used.remove(pooledObject);
        free.add(pooledObject);
    }
}
