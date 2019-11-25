import java.util.Scanner;

public class Grafo_articulação {
    public static int tamanho = 5;
    public static vertice[] verticesDoGrafo = new vertice[tamanho];
    public static void inicialização(){
        Scanner sc1 = new Scanner(System.in);
        for(int i=0;i<tamanho;i++){
            verticesDoGrafo[i] = new vertice();
            System.out.println("Vertice - "+i+"\n");            
            System.out.println("qual quantidade de arestas do vertice?\n");
            int QuantidadeArestas = sc1.nextInt();
            for(int j=0;j<QuantidadeArestas;j++){
                Aresta aresta = new Aresta();
                aresta.setV1(i);
                System.out.println("qual o vertice que essa aresta liga?\n");
                aresta.setV2(sc1.nextInt());
            }
            
        }
    }
    public static void main(String[] args) {
        inicialização();
        BuscaEmprofundiade busca = new BuscaEmprofundiade(verticesDoGrafo, tamanho);
        busca.buscaEmProfundidadeNoGrafo();
        busca.articulacoes();
    }
   
}