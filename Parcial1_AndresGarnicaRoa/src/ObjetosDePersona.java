public class ObjetosDePersona {
    public static void main(String[] args) {
        //Herencia: capacidad de crear una clase o un objeto basandose en una clase ya existente
        //Se instanciaron 3 objetos 'Persona'
        Persona persona1 = new Persona("Andres",29,1.74,"Cafe", "Docente", true);
        System.out.println("Informacion de " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Estatura: " + persona1.getEstatura());
        System.out.println("Color de ojos: " + persona1.getColorOjos());
        //se le asigna un valor determinado al booleano familia
        persona1.setFamilia(true);
        //se llama a la funcion preguntar rol
        persona1.preguntarRol();
        //se llama a la funcion trabajo
        persona1.trabajo();
        // se llama a la funcion familia
        persona1.familia();

        Persona persona2 = new Persona("Felipe", 19, 1.83,"Verdes");
        System.out.println("\nInformacion de " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Estatura: " + persona2.getEstatura());
        System.out.println("Color de ojos: " + persona2.getColorOjos());
        persona2.setFamilia(true);
        persona2.preguntarRol();
        persona2.trabajo();
        persona2.familia();

        Persona persona3 = new Persona("Mariana", 34,1.67,"Azules", "Administrativo",true);
        System.out.println("\nInformacion de " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        System.out.println("Estatura: " + persona3.getEstatura());
        System.out.println("Color de ojos: " + persona3.getColorOjos());
        persona3.setFamilia(false);
        persona3.preguntarRol();
        persona3.trabajo();
        persona3.familia();
    }
}
