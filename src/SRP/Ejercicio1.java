
package SRP;

public class Ejercicio1 {

public void createUser(String username, String password) {
        // SRP SINGLE RESPONSABILITY 
        //establece que una clase, componente o microservicio debe ser responsable de una sola cosa
        
        // Lógica de creación
        System.out.println("Usuario creado: " + username);
    }
    

    public void validate(String password){
        //validacion
        if(password.length() < 8){
            System.out.println("la contrasena es muy corta");
        }
    }
    
    public void createcd(String username, String password){
    //guardado en el disco
     System.out.println("guardado exitosamente en el disco al usuario"+username);
    }
 
    /*
        codigo antiguo
    
     public void createUser(String username, String password) {
        // Lógica de creación
        System.out.println("Usuario creado: " + username);
        
        // Validación
        if (password.length() < 8) {
            System.out.println("La contraseña es muy corta");
        }

        // Guardado en archivo
        System.out.println("Guardando usuario en disco...");
    }
    */
}
