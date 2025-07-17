package SRP;


public class Ejercicio3 {
    
    
 //registra producto
 public void registerProduct(String name, double price) {
        // Registro
        System.out.println("Producto registrado: " + name + " - $" + price);
    }
 
 //valida el producto
 public void validation(double price){
     if(price<=0){
         System.out.println("El precio debe ser mayor a 0");
     }
 }
 
 //se aplica descuento
 public void discount(double price){
     double discountedPrice = price ;
     if(price>100){
         discountedPrice = price * 0.9;
         System.out.println("Descuento aplicado: $"+discountedPrice);
     }
 }
 
 //se registra en el log 
 public void registerLog(String name){
     System.out.println("Log: Producto "+ name + "registrado exitosamente");
 }
}
