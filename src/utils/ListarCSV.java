package utils;

import lqm.di.AccidentesLeganes;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
//import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
           /* System.out.println("Proceso la linea: " + (i-1));*/
            StringTokenizer tokenizer = new StringTokenizer(lines.get(i), ";");
            AccidentesLeganes accidente = new AccidentesLeganes();
            accidente.setNum_Expediente(tokenizer.nextToken());
            accidente.setFecha(LocalDate.parse(tokenizer.nextToken(), DateTimeFormatter.ofPattern("d/MM/yyy")));
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna hora hasta que averiguemos
           // accidente.setHora(LocalTime.parse(tokenizer.nextToken(), DateTimeFormatter.ofPattern("HH:mmss")));
            accidente.setLocalizacion(tokenizer.nextToken());
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna numero
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna cod_distrito
            accidente.setDistrito(tokenizer.nextToken());
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna tipo_acccidente
           // tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna tipo_acccidente si no pongo este me dice qeu voy por estadometerologi
            accidente.setEstadoMeterologico(tokenizer.nextToken());
            accidente.setTipoVehiculo(tokenizer.nextToken());
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna tipo_persona
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna rango_Edad
            accidente.setSexo(tokenizer.nextToken());
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna cod_lesividad
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna lesividad
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna coordenada x
            tokenizer.nextToken(); //saltamos la columna quantityPerUnit->columna coordenada y
            accidente.setPositivaAlcohol(Boolean.parseBoolean(tokenizer.nextToken()));
            accidente.setPositivaDrogas(Boolean.parseBoolean(tokenizer.nextToken()));

            accidentes.add(accidente);
        }

        return accidentes;
    }}