public class JavaTest
{

public static void main(String[] args)
{
  for(Paise p:Paise.values())
  System.out.println("HEY THIS IS "+p.name()+"  Value is "+ p.getPaise()+"  Position is  "+(p.ordinal()+1)+"  !!!!    \n" +p.values());
  
}
}
 enum Paise
 {
 PACHEES(25),
 PACHAAS(50),
 SOO(100),
 RUPAYE(500);
 
 private int paisa;
 public int getPaise()
 {
   return paisa;
 }
 private Paise(int pais)
 {
   paisa=pais;
 }
 }
