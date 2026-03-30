import java.util.function.*;

class Testerr {
    public String hello(int a) {
        return "Value=" +a;
    }
    Function <Integar,String> hello2 = (i)-> "Value"+i;
    public static void main(String[] args) {
        Testerr t = new Testerr();
        System.out.println(t.hello(25));
    }
}
