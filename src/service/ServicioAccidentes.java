package service;

import lqm.di.model.AccidentesLeganes;
import util.Constantes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServicioAccidentes {

    public List<AccidentesLeganes> lecturaAccidentes(String rutaArchivo) {
        List<AccidentesLeganes> accidentes = new ArrayList<AccidentesLeganes>();
        BufferedReader bufferLectura = null;
        try {
            bufferLectura = new BufferedReader(new FileReader(rutaArchivo));
            String linea = bufferLectura.readLine();
            int i = 0;
            while (linea != null) {
                String[] camposAux = new String[25];
                String[] campos = linea.split(Constantes.SEPARADOR);
                for (int h = 0; h < camposAux.length; h++) {
                    if (campos.length > h) {
                        camposAux[h] = campos[h];
                    } else {
                        camposAux[h] = "";
                    }
                }
/*                if (i != 0) {
                    AccidentesLeganes estacionesAux = new AccidentesLeganes(camposAux);
                    accidentes.add(estacionesAux);
                }*/
                linea = bufferLectura.readLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accidentes;
    }
}
