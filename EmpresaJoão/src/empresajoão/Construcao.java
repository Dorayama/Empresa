package empresajoão;
//import java.util.ArrayList;
public class Construcao {
    public String nome;
    //private ArrayList<String> erros = new ArrayList();
    private String datasInicioFim[] = new String[1];
    private int tipo;

    public Construcao(String nomeProjeto, String dataCriacao, String prazoConclusao, int tipoProjeto) {
        this.nome = nomeProjeto;
        this.datasInicioFim[0] = dataCriacao;
        this.datasInicioFim[1] = prazoConclusao;
        this.tipo = tipoProjeto;
    }
    
    /*public void addErro(String erro) {
        this.erros.add(erro);
    }
    
    public void remErro(String erro) {
        for(this.erros : String a) {
            
        }
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
