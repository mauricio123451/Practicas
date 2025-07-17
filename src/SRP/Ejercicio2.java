
package SRP;

public class Ejercicio2 {

    public void createInvoice(String client, double amount) {
      System.out.println("Factura creada para: " + client + " por $" + amount);

      // Validación
      if (amount <= 0) {
          System.out.println("El monto no puede ser menor o igual a cero");
      }

      // Cálculo de impuestos
      double tax = amount * 0.16;
      System.out.println("IVA calculado: $" + tax);

      // Enviar por correo (simulación)
      System.out.println("Enviando factura por correo a " + client + "@example.com");
  }
    public void validation(double amount){
        if(amount <= 0){
            
        }
    }
}

