class swapwiththird{
 public static void main(String args[]){
  int a = 7, b = 3, temp = 0;
  System.out.println("before swapping a =" + a + ", b =" + b);
  
  temp = a; //temp=7
  a = b;  //a=3
  b = temp;
 System.out.println("after swapping a =" + a + ", b =" + b) ;
}
}