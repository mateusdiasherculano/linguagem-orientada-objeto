package estudoJava;

public class stringMutavel {

    public static void main(String[] args) {

    StringBuilder s0 = new StringBuilder();
    StringBuffer s1 = new StringBuffer("Java");

     s1.toString();
     s1.length();
     s1.capacity();

      //System.out.println(s1);
      //s1.reverse();

        s1.append(" Trabalhando ");
        char[] c ={'c', 'o', 'm'};
        s1.append(c).append(" Textos. ");
        System.out.println(s1);

        String url = new StringBuffer("www.mateus.com.br").delete(0, 4).toString();
        System.out.println(url);
    }
}
