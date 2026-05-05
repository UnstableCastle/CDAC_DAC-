package Hash;

class Employee {
    private int eno, age;
    private String name;
    private float salary;

    
    public Employee(int eno, String name, float salary, int age) {
        this.eno = eno;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getEno() {
        return eno;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return eno + " | " + name + " | " + age + " | " + salary;
    }
}


class Node {
    Employee data;
    Node next;

    public Node(Employee data) {
        this.data = data;
        this.next = null;
    }
}


class HashTable {
    private Node[] table;
    private int size = 10;

    public HashTable() {
        table = new Node[size]; 
    }

    private int hash(int key) {
        return key % size;
    }

    
    public void insert(Employee emp) {
        int key = emp.getEno();

        if (search(key) != null) {
            System.out.println("Duplicate key: " + key);
            return;
        }

        int h = hash(key);

        Node newNode = new Node(emp);
        newNode.next = table[h];
        table[h] = newNode;
    }


    public Employee search(int key) {
        int h = hash(key);
        Node curr = table[h];

        while (curr != null) {
            if (curr.data.getEno() == key) {
                return curr.data;
            }
            curr = curr.next;
        }
        return null;
    }


    public void delete(int key) {
        int h = hash(key);
        Node curr = table[h];
        Node prev = null;

        while (curr != null) {
            if (curr.data.getEno() == key) {
                if (prev == null) {
                    table[h] = curr.next; 
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Deleted: " + key);
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Key not found: " + key);
    }

    
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("[" + i + "] -> ");
            Node curr = table[i];

            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }
}


public class Hash_Seperate_Chaining_Main {
    public static void main(String[] args) {

        HashTable ht = new HashTable();

        ht.insert(new Employee(1009, "Janhavi", 55000f, 51));
        ht.insert(new Employee(9889, "Pooja", 45000f, 52));
        ht.insert(new Employee(1999, "Jayant", 45000f, 54));
        ht.insert(new Employee(2334, "Jaya", 35000f, 54));
        ht.insert(new Employee(1994, "Sonal", 25000f, 54));

        System.out.println("\n--- Hash Table ---");
        ht.display();

        System.out.println("\n--- Search 1999 ---");
        System.out.println(ht.search(1999));

        System.out.println("\n--- Delete 9889 ---");
        ht.delete(9889);
        ht.display();

        System.out.println("\n--- Insert Again ---");
        ht.insert(new Employee(9889, "Palu", 56000f, 56));
        ht.display();
    }
}