package refinado;


import java.io.Serializable;

@Cabecalho (
        instituicao = "Universidade XTI",
        projeto = "Sistema de Avaliações",
        dataCriacao = "15/04/2022",
        criador = "Mateus Dias Herculano",
        revisao = 2
)
@ErrosCorrigidos(erros = {"0001","0002"})
@SuppressWarnings("Serial")
public class Anotacao implements Serializable {
    
    @Deprecated
    public void anotar() {}

    @Override
    public String toString(){
        return null;
    }
}
