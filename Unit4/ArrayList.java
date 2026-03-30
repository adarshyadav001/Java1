
public class ArrayList {
    public static void main(String[] args) {
        Class<?> c = java.util.ArrayList.class;

        System.out.println("All the methods declared in " + c.getName());
        int count = 0;
        for (var m : c.getDeclaredMethods()) {
            System.out.println(m);
            count++;
        }
        System.out.println("Total declared methods: " + count);
    }
}
