package estudoJava;

public class StringOperacoes {

    public static void main(String[] args) {

       String s1 = "Write Once";
        String s2 = s1 + "Run AnyWhere";
        String s3 = new String("Java virtual Machine");

   char[] array = {'J', 'a', 'v','a'};
        String s4 = new String(array);

        //OPERAÇÕES

        int tamanho = s1.length();
        char letra = s1.charAt(0);//0 a length()-1
        String texto = s1.toString();

        //LOCALIZAÇÃO

        int posicao = s3.indexOf("Virtual");
        int ultima = s3.lastIndexOf('a');
        boolean vazia = s3.isEmpty();

        //COMPARAÇÃO

        String xti = "XTI";
        //boolean x = xti.equals("xti");
        //boolean x = xti.equalsIgnoreCase("xti");
        //boolean x = xti.startsWith("TI");
        boolean x = xti.endsWith("TI");
        //System.out.println(x);

        //int c = "amor".compareTo("bola");//-1
        //int c = "123".compareTo("234");
       //System.out.println(c);

        String so = "olhe, olhe!";
        boolean o =  so.regionMatches(6, "olhe", 0,4);
        //System.out.println(o);

       String l = "O Brasil é lindo";
       String sl = l.substring(11);
       sl = l.substring(2,8);

       sl = l.concat(" que maravilha");
       sl = l.replace('s','z');
       sl = l.toUpperCase();
       sl = l.toLowerCase();

        System.out.println("    espaços    ".trim());

    }
}
