
import java.util.ArrayList;

public class vertice {
    
    
    private char tipo;
    private ArrayList<Aresta> arastas = new ArrayList<Aresta>();
    private boolean visitadoNaBusca;
    private boolean visitadoNaArticulacao;

    public boolean isVisitadoNaBusca() {
        return visitadoNaBusca;
    }

    public void setVisitadoNaBusca(boolean visitadoNaBusca) {
        this.visitadoNaBusca = visitadoNaBusca;
    }

    public boolean isVisitadoNaArticulacao() {
        return visitadoNaArticulacao;
    }

    public void setVisitadoNaArticulacao(boolean visitadoNaArticulacao) {
        this.visitadoNaArticulacao = visitadoNaArticulacao;
    }

    public int getNumeroDoVertice() {
        return numeroDoVertice;
    }

    public void setNumeroDoVertice(int numeroDoVertice) {
        this.numeroDoVertice = numeroDoVertice;
    }

    public int getAntecessorNaArvore() {
        return antecessorNaArvore;
    }

    public void setAntecessorNaArvore(int antecessorNaArvore) {
        this.antecessorNaArvore = antecessorNaArvore;
    }
    private int numeroDoVertice;
    private int antecessorNaArvore;
    
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Aresta> getArastas() {
        return arastas;
    }

    public void setArastas(ArrayList<Aresta> arastas) {
        this.arastas = arastas;
    }
    
}
