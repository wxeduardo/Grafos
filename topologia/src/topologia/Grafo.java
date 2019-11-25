package topologia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Grafo {

    private String path = "grafo.txt";

    public int[][] matrizAdjacencia() {
       
        int[][] matriz = null;
        
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader buffered = new BufferedReader(fileReader);
            
            try {
                String line = buffered.readLine();
                int i = 0;
                //Ler a primeira linha do arquivo para saber a dimensão da matriz
                String vetor[] = line.split(" ");
                
                int tam = Integer.parseInt(vetor[0]);
                matriz = new int[tam][tam];
                
                line = buffered.readLine();
                while(line != null){
                    
                    vetor = line.split("  ");
                    
                    for(int j = 0; j < vetor.length; j++){
                        matriz[i][j] = Integer.parseInt(vetor[j]);
                    }
                    
                    line = buffered.readLine();
                    i++;
                }
                return matriz;
                
            } catch (IOException ex) {
                Logger.getLogger(Grafo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Grafo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return matriz;
    }
}
