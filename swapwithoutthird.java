class swapwithoutthird{
 public static void main(String args[]){
  int a = 10,b = 20;
   System.out.println("before swapping a =" +  " " + a + ", b =" + " " + b);
   
     a = a+b;  //a=30
     b = a-b;  //b=10
     a = a-b;  //a=20
   System.out.println("after swapping a =" +  " " + a + ", b =" + " " + b);
}
}