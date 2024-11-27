package transporteAbstracto;

public class Transporte {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Acelerar(){
        System.out.println(" está acelerando...!");
    }
}
