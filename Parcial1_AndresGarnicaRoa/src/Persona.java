//Abstraccion: capacidad de crear una clase con atributos y metodos
public class Persona {
    //Atributos
    // Encapsulamiento: al instanciar los atributos haciendo uso del 'private' hacemos que
    //estos atributos solo puedan ser modificables por metodos de la misma clase
    private static String nombre;
    private static int edad;
    private static double estatura;
    private static String colorOjos;
    private static String rol;
    private static boolean trabajo;
    private static boolean familia;

    //Metodos
    //Constructor
    public Persona(String nombre, int edad, double estatura, String colorOjos, String rol, boolean trabajo){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.colorOjos = colorOjos;
        this.rol = rol;
        this.trabajo = trabajo;
        this.familia = true;
    }

    //Polimorfismo: capacidad de que objetos similares resnpondan de diferente forma al mismo mensaje
    public Persona(String nombre, int edad, double estatura,String colorOjos){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.colorOjos = colorOjos;
        this.rol = "Estudiante";
        this.trabajo = false;
        this.familia = true;
    }

    //3 metodos propios
    public static void preguntarRol(){
        if(Persona.rol.equals("Estudiante")){
            System.out.println("Esta persona es un Estudiante");

        }else if(Persona.rol.equals("Docente")){
            System.out.println("Esta persona es un Docente");
        }

        else if(Persona.rol.equals("Administrativo")){
            System.out.println("Esta persona es un Administrativo");
        }
        else
            System.out.println("Esta persona no tiene ningun rol asignado");
    }

    public static void trabajo(){
        boolean trabajo = false;
        if(Persona.trabajo == trabajo){
            System.out.println("Esta persona esta desempleada");
        }
        else
            System.out.println("Esta persona tiene empleo");
    }

    public static void familia(){
        boolean familia = false;
        if(Persona.familia == familia){
            System.out.println("Esta persona no tiene familiares");
        }
        else
            System.out.println("Esta persona tiene una hermosa familia");
    }

    //setters y getters
    public static String getNombre(){return nombre;}
    public static void setNombre(String nombre){Persona.nombre = nombre;}

    public static int getEdad(){return edad;}
    public static void setEdad(int edad){Persona.edad = edad;}

    public static double getEstatura(){return estatura;}
    public static void setEstatura(double estatura){Persona.estatura = estatura;}

    public static String getColorOjos(){return colorOjos;}
    public static void setColorOjos(String colorOjos){Persona.colorOjos = colorOjos;}

    public static String getRol(){return rol;}
    public static void setColorCabello(String rol){Persona.rol = rol;}

    public static boolean getTrabajo(){return trabajo;}
    public static void setTrabajo(boolean trabajo){Persona.trabajo = trabajo;}

    public static boolean getFamilia(){return familia;}
    public static void setFamilia(boolean familia){Persona.familia = familia;}

}
