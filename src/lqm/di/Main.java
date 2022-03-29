package lqm.di;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ejercicio semana 1 de PSP: Haz un ping y saca el valor medio, minimo y maximo , tambien utilizaremos
//Api Stream para leer las lineas
public class Main {

    public static void main(String[] args) throws IOException {

    ProcessBuilder processBuilder = new ProcessBuilder();

    processBuilder.command("bash","-c","ping -c google.com ");

    try {

        Process process = processBuilder.start();

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;

    }catch (IOException e){
        e.printStackTrace();
    }

    }
}
