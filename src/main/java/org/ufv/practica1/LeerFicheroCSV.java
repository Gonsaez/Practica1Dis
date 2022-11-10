package org.ufv.practica1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LeerFicheroCSV {

    public void leerFicheroCSV(String file){

        AEMET aemet = new AEMET();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        String fechaA;
        String indicativoA;

        BufferedReader br = null;
        String line;
        String cvsSplitBy = ";";
        try {
            br = new BufferedReader(new FileReader(file));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(cvsSplitBy);
                //Imprime datos.
                //System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] + ", " + datos[3] + ", " + datos[4] + ", " + datos[5]);

                fechaA = datos[0];

                System.out.println(fechaA);

                indicativoA = datos[1];

                System.out.println(indicativoA);

                Date fecha = formato.parse(fechaA);

                aemet.setFecha(fecha);

                aemet.setIndicativo(indicativoA);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    }
