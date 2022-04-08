
class C{
public static void main(String[] args) {
  try
    {
        int i1=3/0;
      }
    catch(Exception e)
    {
     System.out.println("exception1");
     }
    catch(NullPointerException e)
    {
    System.out.println("exception2");
        }
     finally
    {
              System.out.println("finally");
 
      }
}}
