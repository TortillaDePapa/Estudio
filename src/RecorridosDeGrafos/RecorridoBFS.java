package RecorridosDeGrafos;

import java.util.*;

public class RecorridoBFS {



    public void recorridoBFS(Map<String, List<String>> redMetro, String inicio){

        // Cola
        Queue<String> q = new LinkedList<String>();
        //Set
        Set<String> visitados = new LinkedHashSet<>();

        q.add(inicio);
        visitados.add(inicio);
        while(!q.isEmpty()){
            String estacionActual = q.poll();
            System.out.print(estacionActual+ " -> ");
            List<String> conexiones = redMetro.get(estacionActual);

            if(conexiones == null){
                conexiones = new LinkedList<>();
            }
            for(String conexion : conexiones){
                if(!visitados.contains(conexion)){
                    visitados.add(conexion);
                    q.add(conexion);
                }
            }
        }

    }
}
