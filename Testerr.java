 class Testerr {
    public String hello(int a) {
        return a + "";
    }
    
    public static void main(String[] args) {
        Testerr t = new Testerr();
        System.out.println(t.hello(25));
    }
}
