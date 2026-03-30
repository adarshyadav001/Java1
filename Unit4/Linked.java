// ...existing code...
public class Linked {
    public static void main(String[] args) {
        Class<?> c = java.util.LinkedList.class;

        System.out.println("All the methods declared in " + c.getName());
        int methodCount = 0;
        for (var m : c.getDeclaredMethods()) {
            System.out.println(m);
            methodCount++;
        }
        System.out.println("Total declared methods: " + methodCount);

        System.out.println("All the fields declared in " + c.getName());
        int fieldCount = 0;
        for (var f : c.getDeclaredFields()) {
            System.out.println(f);
            fieldCount++;
        }
        System.out.println("Total declared fields: " + fieldCount);
    }
}
// ...existing code...