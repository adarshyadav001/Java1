interface parent{
    default void hello(){
        System.out.println("Hello default Method");
        
    }
}
    class child implements parent{
        public void bye(){
            System.out.println("i am child method");
            hello();

        }
    }
    class child2 implements  parent{
         @Override
    }
     public class DefaultTester { 
    public static void main(String[] args) {
        child c = new child();
        c.hello();
        c.bye();
        parent p = new child();
        p.hello();

    }

}