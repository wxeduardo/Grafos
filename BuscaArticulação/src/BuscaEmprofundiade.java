
import java.util.ArrayList;

public class BuscaEmprofundiade {
    

    private vertice[] grafo;
    
    public BuscaEmprofundiade(vertice[] grafo ,int tamanho) {
        this.grafo = grafo;
        
    }
    
    public void buscaEmProfundidadeNoGrafo(){
        
        this.grafo[0].setTipo('R');
        this.grafo[0].setAntecessorNaArvore(0);
        this.grafo[0].setVisitadoNaBusca(true);
        this.grafo[0].getArastas().get(0).setPercorridoNaBusca(true);
        
        for(int i = this.grafo[0].getArastas().get(0).getV2(),j=0,contador = 1;i<this.grafo.length;contador++){
            
            this.grafo[i].setAntecessorNaArvore(j);
            this.grafo[i].setVisitadoNaBusca(true);
            
            int contaAresta = 1;
            
            for(Aresta item : this.grafo[i].getArastas()){
                if(!this.grafo[item.getV2()].isVisitadoNaBusca()){
                    this.grafo[item.getV1()].setTipo('I');
                    j=i;
                    i = item.getV2();
                    break;
                }else if(this.grafo[i].getArastas().size() == contaAresta ){
                    this.grafo[i].setTipo('F');
                    i = this.grafo[item.getV1()].getAntecessorNaArvore();
                    j = this.grafo[i].getAntecessorNaArvore();
                }
                contaAresta++;
            }
        }
        
        
    }

    public ArrayList<vertice> articulacoes(){
        
        ArrayList<vertice> articulacao = new ArrayList<vertice>();
        
        for(int i=0;i<this.grafo.length;i++){
            if(this.grafo[i].getTipo()== 'I'){
                ArrayList<Integer> lista = this.buscaAdjacentes(this.grafo[i].getArastas());
                for(int j=0;j<lista.size();j++){
                    
                    for(int k = this.grafo[lista.get(j)].getAntecessorNaArvore();k != 0;k = this.grafo[k].getAntecessorNaArvore()){
                        this.grafo[k].setVisitadoNaArticulacao(true);
                    }
                }
            }
        }
        
        for(vertice item : this.grafo){
            if(item.isVisitadoNaArticulacao()){
                this.grafo[item.getAntecessorNaArvore()].setTipo('A');
                articulacao.add(this.grafo[item.getAntecessorNaArvore()]);
            }
        }
        
        return articulacao;
    }
    public ArrayList<Integer> buscaAdjacentes(ArrayList<Aresta> arestas){
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        for(int i=0;i<arestas.size();i++){
            if(!arestas.get(i).getPercorridoNaBusca()){
                lista.add(arestas.get(i).getV2());
            }
        }
        
        return lista;
    } 
    
    
    
}
