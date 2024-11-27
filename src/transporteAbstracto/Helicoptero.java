package transporteAbstracto;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Helicoptero extends TransporteAereo {
    private String modelo = "Bell 206";
    
    //creando el constructor
    public Helicoptero(){
        System.out.println( "Se ha creado un helicoptero" );
    }

    //sirve para modificar el método del padre -> polimosfismo
    @Override
    public void Encender(){
        // super -> me sirve para llamar el método del padre(Transporte)
        super.Encender();
        System.out.println("Encendiendo las elices del modelo: " + modelo );
    }

    @Override
    public void Apagar(){
        System.out.println("Apagando las elices del modelo: "+ modelo);
        super.Apagar();
    }

    public void mostrarRutas(String ruta){
        leerRutas(ruta);
    }

    public void leerRutas(String rutaArchivo){
        Path ruta = Path.of(rutaArchivo);
        try {
            List<String> lines = Files.readAllLines(ruta);
            //lines.forEach(System.out::println); //imprime de golpe el archivo
            for(String linea : lines){
                Loading();
                System.out.println(linea.replace(";", "|\t"));
                //System.out.println(linea);
                String[] celdas =  linea.split(";");
                //System.out.println(" numoer de columnas "+ celdas.length);
                String altitud = celdas[celdas.length-1];
                //System.out.println(altitud);
                if(altitud.equals("2000m")){
                    escribirArchivo(celdas[0] + altitud );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo(String line){
        Path path = Path.of("src\\transporteAbstracto\\rutasGuardadas.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(path.toFile(), true))) {
            pw.println(line); // Escribe la línea y agrega un salto de línea automáticamente
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void Loading(){
        String[] caracter = {"|","/","-","\\"};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r"+caracter[i % caracter.length] + " " + i + "%  ");
            try {
                Thread.sleep(18);
            } catch (Exception e) {
                
            }
        }

    }
}
