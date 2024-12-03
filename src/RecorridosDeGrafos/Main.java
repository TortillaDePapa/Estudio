package RecorridosDeGrafos;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> redMetro= new HashMap<>();
        redMetro.put("A", Arrays.asList("B","C"));
        redMetro.put("B", Arrays.asList("D","E"));
        redMetro.put("C", Arrays.asList("F"));
        redMetro.put("F", Arrays.asList());

        RecorridoBFS recorridoBFS = new RecorridoBFS();
        recorridoBFS.recorridoBFS(redMetro, "A");

        System.out.println();

        Map<String, List<String>> grafo= new HashMap<>();
        grafo.put("Montevideo", Arrays.asList("Durazno","Canelones"));
        grafo.put("Durazno", Arrays.asList("Rivera","Flores"));
        grafo.put("Canelones", Arrays.asList("Florida","Montevideo"));
        grafo.put("Rivera", Arrays.asList());

        DFSCarreteras carreteras  = new DFSCarreteras();
        carreteras.dfsIterativa(grafo, "Montevideo");
    }


}