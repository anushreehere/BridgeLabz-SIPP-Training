
class CustomHashMap<K, V> {
    class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 16;
    private Entry<K, V>[] table = new Entry[SIZE];

    public void put(K key, V value) {
        int index = key.hashCode() % SIZE;
        Entry<K, V> head = table[index];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Entry<K, V> newNode = new Entry<>(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    public V get(K key) {
        int index = key.hashCode() % SIZE;
        Entry<K, V> head = table[index];

        while (head != null) {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = key.hashCode() % SIZE;
        Entry<K, V> head = table[index], prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null)
                    table[index] = head.next;
                else
                    prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("Get A: " + map.get("A"));
        map.remove("A");
        System.out.println("Get A after removal: " + map.get("A"));
    }
}

