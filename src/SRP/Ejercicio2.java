
package SRP;

public class Ejercicio2 {

    public void createInvoice(String client, double amount) {
      System.out.println("Factura creada para: " + client + " por $" + amount);
  }
    
    //validacion
    public void validation(double amount){
        if(amount <= 0){
            System.out.println("el monto no puede ser menor o igual a cero");
        }
    }
    
    //calculo de impuestos
    public void calculateim(double amount){
        double tax = amount * 0.16;
        System.out.println("IVA CALCULADO: $"+tax);
    }

      // Enviar por correo (simulación)
    public void sendmail(String client){
        System.out.println("Enviando factura por correo a " + client + "@example.com");
    }
}

