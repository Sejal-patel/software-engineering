package inventory;

import java.util.HashMap;
import java.util.Collection;

public class Inventory<T extends Item> {
    
    private HashMap<String, T> inventory;

    public Inventory() {
        this.inventory = new HashMap<>();
    }

    public void addItem(T item) {
        inventory.put(item.getId(), item);
    }

    public void removeItem(String id) {
        inventory.remove(id);
    }

    public T getItem(String id) {
        return inventory.get(id);
    }

    public Collection<T> getAllItems() {
        return inventory.values();
    }

}
