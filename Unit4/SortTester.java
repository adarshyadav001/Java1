void show(int[] nums ) {
    for(var a : nums )
        System.out.println(a + " ");
    System.out.println();
}

void main() {

int[] nums = { 2,3,-1,0,90,45};
show(nums);
Array.sort (nums);
show(nums);
}