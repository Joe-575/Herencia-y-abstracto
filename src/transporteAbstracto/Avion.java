package transporteAbstracto;

public class Avion extends TransporteAereo{
    public Avion(){
        System.out.println(" Se ha creado un avion ");
    }

    @Override
    public void Encender(){
        System.out.println("Encendiendo las turbinas");
    }
    @Override
    public void Apagar(){
        System.out.println("Apagando las turbinas");
    }
}
