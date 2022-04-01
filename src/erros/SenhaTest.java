package erros;

public class SenhaTest {

    static  void autenticar (String senha)
            throws SenhaInvalidaException
    {
        if ("123".equals(senha)){
            System.out.println("Autenticado");
        }else {
            throw new SenhaInvalidaException("Senha incorreta");
        }
    }

    public static void main(String[] args) {
       try{
           autenticar("123");
       }catch (SenhaInvalidaException e){
           System.out.println(e.getMessage());
       }
    }
}
