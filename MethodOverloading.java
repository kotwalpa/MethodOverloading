class MethodOverloading
{
  public static void main(String[] args)
  {
    System.out.println(MethodOverloading.add(2,'b'));//100
    System.out.println(MethodOverloading.add(1,2,3));//6
    System.out.println(MethodOverloading.add(1,2,3,'a'));//103
     
  }
  public static int add(int x,int y)
  {
    return x+y;
  }
  public static int add(int a,int b,int c)
  {
    return a+b+c;
  }
  public static int add(int p,int q,int r,int s)
  {
    return p+q+r+s;
  }
 

}