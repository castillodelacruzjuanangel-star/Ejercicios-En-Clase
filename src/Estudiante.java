public class Estudiante {
    private String nombre;
    private int edad;
    private double indiceAcademico;

    public static void validarEstudiante(String nombre, int edad, double indiceAcademico) throws Exception{
        if(nombre == null){
            throw new Exception("ERROR: El nombre no puede estar vacio.");
        }
        if(edad < 18){
            throw new Exception("ERROR: La edad debe ser mayor o igual a 18.");
        }
        if(indiceAcademico < 0 || indiceAcademico > 4){
            throw new Exception("ERROR: El indice debe estar entre 0 y 4");
        }
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setIndice(double indiceAcademico){
        this.indiceAcademico = indiceAcademico;
    }

    public int getEdad(){return edad; }
    public String getNombre(){ return nombre; }
    public double getIndice(){ return indiceAcademico; }
}
