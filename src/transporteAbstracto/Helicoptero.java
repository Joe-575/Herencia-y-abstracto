package transporteAbstracto;

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
}
