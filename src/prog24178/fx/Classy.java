public class Classy
{
public static void main(String[] args)
{

  int[] b={2,3};
  
  int c[] =TheArray.change(b);
  System.out.println(b[1]);
}
}
class TheArray
{
public static int[] change(int a[])
{
for(int sub=0;sub < a.length;sub++)
{
a[sub]=sub;
}

return a;
}
}