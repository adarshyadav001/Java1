interface A{
    static void fun(){
        System.out.println("I am static method");

    }
}
class child implements A {
    public void hello(){
    A.fun();}
}

