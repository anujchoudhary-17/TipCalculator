public class Mainyyyy
{
public static void main(String[] args)
{
System.out.printf("COIN      VALUE\n");
 for(ENUMS c:ENUMS.values())
 {
  System.out.println(c.name()+"           "+c.getName());
  System.out.println();
  System.out.println("WINS OVER       "+c.getWinsOver());
  System.out.println(ENUMS.ROCK.getWinsOver());
 }

}
}

enum ENUMS
{
 ROCK("rock","scissors"),
  PAPER("paper","rock"),
SCISSORS("scissor","paper");
 
private String name,winsOver;
 
 private ENUMS(String name,String winsOver)
 {
  this.name=name;
  this.winsOver=winsOver;
 }

 
 public String getName()
 {
  return name;
  
 }
public String getWinsOver()
{
 return winsOver;
}


}