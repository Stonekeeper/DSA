public class HashTable {
    HashNode[] buckets;
    int numOfBuckets; // size of HashTable
    int size; //Number of Hashnodes

    HashTable(){
        this(10);
    }

    HashTable(int capacity){
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    public class HashNode{
        Integer key;
        String value;
        HashNode next;

        HashNode(Integer key,String value){
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }

    public Boolean isEmpty(){
        return size == 0;
    }

    public int getBucketIndex(Integer key){
        return key % numOfBuckets;
    }

    public void put(Integer key, String value){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node; 
    }

    public String get(Integer key){
        if(key == null)
            throw new IllegalArgumentException("Please pass key");
        
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key){
        if(key == null)
            throw new IllegalArgumentException("Please pass key");

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode prev = null;

        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            prev = head;
            head = head.next;
        }
        if(head == null)
            return null;
        
        size--;

        if(prev != null){
            prev.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }

        return head.value;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put(10,"Bruce Wayne");
        ht.put(21 ,"Clark Kent");
        ht.put(34,"Barry Allen");
        System.out.println(ht.size());
        System.out.println(ht.get(10));
        System.out.println(ht.remove(10));
        System.out.println(ht.size());
        System.out.println(ht.get(10));


    }
}
