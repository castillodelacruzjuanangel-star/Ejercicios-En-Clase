import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los datos del estudiante.");

        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        nombre =  (nombre.trim().isEmpty()) ? null : nombre;

        System.out.print("Edad: ");
        int edad = leer.nextInt();

        System.out.print("Indice academico: ");
        double indice = leer.nextDouble();

        try {
            Estudiante.validarEstudiante(nombre, edad, indice);
            System.out.println("Estudiante registrado con exito.");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Programa finalizado.");
            leer.close();
        }
    }
}
