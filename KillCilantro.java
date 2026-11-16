public class KillCilantro {
   public static void main (String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
 
   }
   
   public static String killCilantro(String str) {
      String message = str;
      for (int i = 0; i <= str.length(); i++) {
 
         if (message.indexOf("cilantro") >= 0) {
            String firstPart = message.substring(0, message.indexOf("cilantro"));
            String lastPart = message.substring(message.indexOf("cilantro") + 8, message.length());
            message = firstPart + "parsley" + lastPart;

          }
      }
   return message;
   }
}