package erros;

public class senhaTest {

    static  void autenticar (String senha)
            throws senhaInvalidaException
    {
        if ("123".equals(senha)){
            System.out.println("Autenticado");
        }else {
            throw new senhaInvalidaException("Senha incorreta");
        }
    }

    public static void main(String[] args) {
       try{
           autenticar("123");
       }catch (senhaInvalidaException e){
           System.out.println(e.getMessage());
       }
    }
}
