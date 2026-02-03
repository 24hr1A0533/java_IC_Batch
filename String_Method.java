public class String_Method {
   public static void main(String[] args){
       String s="HELLO";
       String s1="hello";
       String s2="world";
       // charAt
       System.out.println(s.charAt(3));
       // length method
       System.out.println(s.length());
       //indexOf
       System.out.println(s.indexOf("E"));
       System.out.println(s.indexOf("LL"));
       System.out.println(s.indexOf("wor"));
       //equals method
       System.out.println(s1==s2);
       System.out.println(s1.equals(s2));
       //cointains
       System.out.println(s1.contains("ello"));
       System.out.println(s1.contains("ery"));
       //toLowerCase
       System.out.println(s.toLowerCase());
       // toUpperCase
       System.out.println(s2.toUpperCase());
       System.out.println(s1);
       //replace
       String str=" i love program";
       String str1=(str.replace("program","java"));
    }
}
