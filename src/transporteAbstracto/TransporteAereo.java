package transporteAbstracto;

public  abstract class TransporteAereo extends Transporte {
    public void Encender(){
        System.out.println("Encendiendo el motor");
    }

    public void Apagar(){
        System.out.println("Apagando el motor");
    }

}
