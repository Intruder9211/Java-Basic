public class concatenation {
    public static void main(String[] args) {
        //concatenation add two or more strings
        String first ="tony";
        String last ="stark";
        String full = first + " " +last;
        System.out.println(full);
         System.out.println(full.length());

         //charAt for all invidual letter print 
         for (int i=0;i<full.length();i++){
            System.out.println(full.charAt(i));
         }
    }
    
}
