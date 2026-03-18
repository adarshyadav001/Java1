class Item<T> {
    T a,b;
    public Item(T p,T q){
        a=p;
        b=q;

    }
    void swap(){
        System.out.println("Before swap");
        T c = a;
        a=b ;
        b=c;
        System.out.println("After swap");
        show();
    }
    void show(){
        System.out.println("a" +a+","+"b:"+b);
    }
}

void main(){
    Item<Integer> num = new Item<>(12,44);
    Item<Float> real = new Item<>(12.55f, 44.25f);
    Item<String> names = new Item<>("Amar", "Ravi");

    num.swap();
    real.swap();
    names.swap();
}
