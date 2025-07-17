package SRP;


public class Ejercicio3 {
    
    
    
 public void registerProduct(String name, double price) {
     //falta aplicar SRP
     
        // Registro
        System.out.println("Producto registrado: " + name + " - $" + price);

        // Validación
        if (price < 1) {
            System.out.println("Error: El precio debe ser mayor a 0");
        }

        // Aplicar descuento
        double discountedPrice = price;
        if (price > 100) {
            discountedPrice = price * 0.9;
            System.out.println("Descuento aplicado: $" + discountedPrice);
        }

        // Registrar log
        System.out.println("Log: Producto " + name + " registrado exitosamente");
    }
}
