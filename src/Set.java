import java.util.HashMap;
import java.util.Iterator;
public class Set<E> implements Iterable<E> {
    private HashMap<E, Object> map;

    private Object Value= new Object();

    public Set() {
        this.map = new HashMap<>();
    }

    public boolean add(E e) {
        return map.put(e, Value) == null;
    }

    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    public int size() {
        return map.size();
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean addAll(Set<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            if (add(e)) {
                modified = true;
            }
        }
        return modified;
    }

    public boolean removeAll(Set<?> c) {
        boolean modified = false;
        for (Object o : c) {
            if (remove(o)) {
                modified = true;
            }
        }
        return modified;
    }

    public boolean containsAll(Set<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    public boolean retainAll(Set<?> c){
        boolean modified = false;
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            if (!c.contains(element)) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }

    public void clear(){
        map.clear();
    }
}
