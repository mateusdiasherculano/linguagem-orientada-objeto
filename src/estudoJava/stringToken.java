package estudoJava;

public class stringToken {
    public static void main(String[] args) {

        String s = "XHTML; CSS; JavaScript; jQuery; Java";
        String[] tokens = s.split(";");
        System.out.println(tokens.length + " tokens");
        for (String token : tokens){
            System.out.println(token);
        }
    }
}
