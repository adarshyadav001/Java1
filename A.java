 class A {
    void f1(){
        System.out.println("f1 of A");
    }
    final void f2(){
        System.out.println("f2 of A as final");
    }
}
class B extends A
{
    void f3()
    {
        
    }
}