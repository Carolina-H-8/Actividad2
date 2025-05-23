import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personas[] personas = new Personas[5];

        System.out.println("Ingrese los datos de las 5 personas");

        for (int i = 0; i < 5; i++) {

            System.out.println("Pernonas" + (i + 1) + ":");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Genero: ");
            String genero = sc.nextLine();
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            personas[i] = new Personas(nombre, apellido, genero, edad);
        }
        System.out.println("\nNombre y Genero");
        for (Personas persona : personas) {
            System.out.println("Nombre" + persona.getNombre() + "Genero" + persona.getGenero());
        }
        double promedioEdad = calculopromedioEdad(personas);
        System.out.println("Promedio de Edad: " + promedioEdad);
        System.out.println("\nCantidad de personas de genero ");
        System.out.println("\nMasculino: "+ ContarGeneros(personas, "Masculino"));
        System.out.println("\nFemenino: " + ContarGeneros(personas, "Femenino"));



    }

    private static double calculopromedioEdad(Personas[] personas) {

        double edad = 0;
        for (Personas persona : personas) {
            edad += persona.getEdad();
        }
        return edad / personas.length;
    }

    public static int ContarGeneros(Personas[] personas, String generocontado) {
        int contador = 0;

        for (Personas persona : personas) {
            if (persona.getGenero().equalsIgnoreCase(generocontado)) {
                contador++;
            }
        }
        return contador;
    }

}