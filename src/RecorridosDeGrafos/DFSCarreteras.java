package RecorridosDeGrafos;

import java.util.*;

public class DFSCarreteras {

    public void dfsIterativa(Map<String,List<String>> grafo, String inicio){


        Stack<String> ciudad = new Stack<>();
        Set<String> visitados = new HashSet<>();

        ciudad.push(inicio);

        while(!ciudad.empty()){
            String c = ciudad.pop();
            if(!visitados.contains(c)){
                System.out.print(c+" ");
                visitados.add(c);

                List<String> conexciones = grafo.get(c);

                if (conexciones == null){
                    conexciones = new LinkedList<>();
                }
                for (String conexion : conexciones) {
                    ciudad.push(conexion);
                }
            }

        }
    }
}
