import herencia.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" Aprendieno Herencia");

        Padre padre = new Padre();
        Hijo hijo = new Hijo();

        //enviar datos
        padre.setNombre(" Mario");
        padre.setEdad(55);
        hijo.setNombre("Juan CArlos");
        hijo.setEdad(23);

        //recibir y mostar los datos
        System.out.println("El padre se llama "+padre.getNombre() + " y tiene "+padre.getEdad() + " años");
        System.out.println("El hijo se llama "+hijo.getNombre()+" y tiene "+hijo.getEdad()+" años");
        
        

    }
}
