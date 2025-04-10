import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Desarrollar un sistema de nota para un estudiante que sea saber su nota fin (de cada materia)
        el sistema debe pedir el nombre del estudiante, el documento y el programa al que esta matriculado
        (Menu de opciones: Desarrollo de software, Diseño Grafico, Gastronomia)
        Debe permitir seleccionar la materia ( Menu de opciones:
         Desarrollo: logica, Metodologia, Introduccion
         Diseño: tipografia, iconografia, semantica
         gastronomia: costos, panaderia dulce, cocina internacional)

        El calculo de nota es de la siguiente manera:
        para cada materia hay un examen parcial que equivale al 20% de la nota
        un taller que equivale el 30% de la nota y
        un examen final que equivale al 50% de la nota)

        Una vez calculada la nota final, tener en cuenta que:
        Si la nota esta entre 0 y 2 el estudiante pierde definitivamente
        Si la nota este entre 2.1 y 2.9 tiene derecho a un pla de mejoramiento
        Si la nota es igual o superior a 3, asi que le queda la materia
        Si el estudiante hace plan de mejoramiento, la nota maxima de la materia sera 3

        El sistema debe discriminar debe discriminar la informacion general del estudiante: nombre, documento, nota materia
         */
        Scanner sc = new Scanner(System.in);

        /*Definicion y asignacion de variables */

        System.out.print("Ingrese el nombre del estudiante");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingrese el documento del estudiante");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrollo de software\n2 - Diseño Grafico\n3 - Gastronomia");
        String programa = sc.nextLine();
        switch (programa){
            case "1":
                System.out.println("Programa de desarrollo de Software");
                System.out.println("Seleccione la materia:\n1 - Lógica de programacion\n2 - Metodologias agiles\n3 - Introduccion a la progrmacion");
                String materia = sc.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("nota de logica de programacion");
                        break;
                    case "2":
                        System.out.println("nota de metodologias agiles: ");
                        break;
                    case "3":
                        System.out.println("nota de introduccion a la programacion");
                        break;
                }
                break;
            case "2":
                System.out.println("Programa de Diseño Grafico");
                break;
            case "3":
                System.out.println("Programa de Gastronomia");
                break;
        }




    }
}