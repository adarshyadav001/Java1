import java.util.*;
void main(){
    Set<Integer> list = new HashSet<>();
    list.add(1);
    list.add(2);
    list.add(null);
    list.add(-5);
    list.add(0);

    System.out.println(list);
    list.addAll(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(list);
}