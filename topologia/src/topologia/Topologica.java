package topologia;

import java.util.HashSet;
import java.util.Set;

public class Topologica {

    private int[][] grafo;
    private Set<Integer> removidos;

    public Topologica(Grafo grafo) {
        this.grafo = grafo.matrizAdjacencia();
        this.removidos = new HashSet();
    }

    /*
        O met�do seguinte pegar� um v�rtice que possui grau de entreda igual a zero.
        O grafo est� sendo representado por uma matriz de adejac�ncia.
        Tendo como as colunas as arestas que diverge de um v�rtice e as linhas as arestas
        que convergem nesse mesmo v�rtice. A ideia � ter um contador para somar todas as 
        linhas de uma respectiva coluna que � igual a zero, se essa var�vel apresentar um valor
        igual a quantidade de linhas, temos que aquele v�rtice possui grau de entreda igual a zero
     */
    private int BuscarVertice() {

        for (int j = 0; j < this.grafo.length; j++) {
            int cont = 0;
            //Verificando se o v�rtice j� foi removido do grafo
            if (!this.removidos.contains(j)) {
                for (int i = 0; i < this.grafo.length; i++) {

                    if (grafo[i][j] == 0) {
                        cont++;
                    }
                }
                if (cont == grafo.length) {
                    return j;
                }
            }
        }

        return -1;
    }

    /*
        M�todo rrespons�vel por fazer a remo��o do v�rtice de um grafo
     */
    public void Remover() {

        while (this.removidos.size() < this.grafo.length) {

            int v = this.BuscarVertice();
            if (v != -1) {

                //Garantimos que as arestas que divergem do v�rtice v sejam removidas inserindo 0 
                for (int j = 0; j < this.grafo.length; j++) {
                    this.grafo[v][j] = 0;
                }
                //Para garantir que o met�do BuscarVertice() n�o retorne mais o mesmo v�rtice,
                //inserimos ele no conjunto 
                System.out.println(" [" + this.Print(v) + "]");
                this.removidos.add(v);
            }
        }

    }

    private char Print(int numero) {
        switch (numero) {
            case 0:
                return 'm';
            case 1:
                return 'n';
            case 2:
                return 'o';
            case 3:
                return 'p';
            case 4:
                return 'q';
            case 5:
                return 'r';
            case 6:
                return 's';
            case 7:
                return 't';
            case 8:
                return 'u';
            case 9:
                return 'v';
            case 10:
                return 'w';
            case 11:
                return 'x';
            case 12:
                return 'y';
            case 13:
                return 'z';
            default:
                return '!';
        }
    }

}
