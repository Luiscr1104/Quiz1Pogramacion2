/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Luis-R
 */
public class Logica {

    public Logica() {
        this.Disponibility();
    }
    //Clientes
    Cliente cliente1 = new Cliente("Andrea", "Palma", "822938", "El Invu", "Ciudad Quesada");
    Cliente cliente2 = new Cliente("Amalia", "Zuñiga", "27849232", "Chachagua", "La Fortuna");
    Cliente cliente3 = new Cliente("Jose", "Lopez", "27832232", "La Fortuna", "El Tanque");
    // Uber
    Uber uber1 = new Uber(1994, "Celeste", 15, 500);
    Uber uber2 = new Uber(1999, "Blanco", 12, 500);
    Uber uber3 = new Uber(2000, "Rojo", 3, 500);
    //Chofer
    Chofer chofer1 = new Chofer("Luis", "Zuñiga", "207250080", uber1);
    Chofer chofer2 = new Chofer("Rolando", "Perez", "203970060", uber2);
    Chofer chofer3 = new Chofer("Roberto", "Jimenez", "203250150", uber3);

// revisar disponibilidad
    public void Disponibility() {
        if (uber1.isDisponibility() == false) {
            System.out.println("Buenos días " + cliente1.getName() + "." + " Su Uber es de color " + uber1.getColor() + " y será conducido por " + chofer1.getName() + " " + chofer1.getLastName()+
            " El monto total por viajar desde " + cliente1.getOrigin() + " hasta " + cliente1.getDestiny() + " es de: " + (uber1.getMileage()) * uber1.cash);
        } else {
            System.err.println("Disculpe la molestia " + cliente1.getName() + " En este momento no tenemos Uber disponible, por favor llame nuevamente");
            
        }
        if (uber2.isDisponibility() == false) {
            System.out.println("Buenos días " + cliente2.getName() + "." + " Su Uber es de color " + uber2.getColor() + " y será conducido por " + chofer2.getName() + " " + chofer2.getLastName());
            System.out.println("El monto total por viajar desde " + cliente2.getOrigin() + " hasta " + cliente2.getDestiny() + " es de: " + (uber2.getMileage()) * uber2.cash);
        } else {
            System.err.println("Disculpe la molestia " + cliente2.getName() + " En este momento no tenemos Uber disponible, por favor llame nuevamente");
        }
        if (uber3.isDisponibility() == false) {
            System.out.println("Buenos días " + cliente3.getName() + "." + " Su Uber es de color " + uber3.getColor() + " y será conducido por " + chofer3.getName() + " " + chofer3.getLastName());
            System.out.println("El monto total por viajar desde " + cliente3.getOrigin() + " hasta " + cliente3.getDestiny() + " es de: " + (uber3.getMileage()) * uber3.cash);
        } else {
            System.err.println("Disculpe la molestia " + cliente3.getName() + " En este momento no tenemos Uber disponible, por favor llame nuevamente");
        }
    }
}
