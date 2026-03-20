void main(){
 var x=10;
 var y=20.5f;
 var z=x+y;
 System.out.println(x + "," + y + "," + z);
 int[]arr={1,2,3,4,5,7};
 for(var j:arr){
    System.out.print(j+",");
 }
 System.out.println();
 var names=List.of("aa","bb");
 for(var name :names){
    System.out.print(name+",");
 }
}