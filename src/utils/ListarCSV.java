package utils;

import lqm.di.AccidentesLeganes;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ListarCSV {
    public static List<AccidentesLeganes> getAccidentes() throws IOException {
        // Cargamos el archivo ubicado en la carpeta data
        String DATA_FILE = "01-EjercicioAD.csv";
        String WORKING_DIRECTORY = System.getProperty("user.dir");
        Path path = Paths.get(WORKING_DIRECTORY + File.separator + "data" + File.separator + DATA_FILE);
        final List<String> lines = Files.readAllLines(Paths.get("data/01-EjercicioAD.csv"), StandardCharsets.UTF_8);
        // lines.forEach(System.out::println);
        List<AccidentesLeganes> accidentes = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            // System.out.println("Proceso la linea: " + (i-1));
            StringTokenizer tokenizer = new StringTokenizer(lines.get(i), ",");
            AccidentesLeganes accidente = new AccidentesLeganes();
            accidente.setNum_Expediente(Integer.parseInt(tokenizer.nextToken()));
            accidente.setLocalizacion(tokenizer.nextToken());
            accidente.setDistrito(String.valueOf(Integer.parseInt(tokenizer.nextToken())));
            accidente.setLocalizacion(String.valueOf(Integer.parseInt(tokenizer.nextToken())));
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit
            /*accidente.setUnitPrice(Double.parseDouble(tokenizer.nextToken()));
            accidente.setUnitsInStock(Integer.parseInt(tokenizer.nextToken()));
            */// System.out.println(accidentes.toString());
            accidentes.add(accidente);
        }// products.forEach(System.out::println);
        return accidentes;
    }
}
