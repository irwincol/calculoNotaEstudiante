import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Desarrollar un sistema de nota para un estudiante que sea saber su nota final (de cada materia)
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
        double notaExamenParcial = 0, notaTaller = 0, notaFinal = 0, notaMateria = 0;
        String materia = "";

        System.out.println("Ingrese el nombre del estudiante");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingrese el documento del estudiante");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrollo de software\n2 - Diseño Grafico\n3 - Gastronomia");
        String programa = sc.nextLine();
        switch (programa){
            case "1":
                System.out.println("Programa de desarrollo de Software");
                System.out.println("Seleccione la materia:\n1 - Lógica de programacion\n2 - Metodologias agiles\n3 - Introduccion a la programacion");
                materia = sc.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("nota de logica de programacion");
                        System.out.println("Nota examen parcial (20%): ");
                         notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller (30%): ");
                        notaTaller = sc.nextDouble();
                        System.out.println("nota final (50%):");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);

                        System.out.println("El estudiante " + nombreEstudiante + " tiene la siguiente calificación  en logica de prgramacion:  " + notaMateria);
                        if(notaMateria < 2){
                            System.out.println("Perdio Definitivamente logica de programación");
                        } else if (notaMateria < 2.9){
                            System.out.println("tiene derecho a un plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedo la materia");
                        }
                        break;

                    case "2":
                        System.out.println("nota de metodologias agiles: ");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("nota final:");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + " tiene la siguiente calificación en Metodologias Agiles:  " + notaMateria);
                        if(notaMateria < 2){
                            System.out.println("Perdio Definitivamente Metodologías agiles");
                        } else if (notaMateria < 2.9){
                            System.out.println("tiene derecho a un plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("nota de introduccion a la programacion");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("nota final:");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + " tiene la siguiente calificación en Introducción a la programacion :  " + notaMateria);
                        if(notaMateria < 2){
                            System.out.println("Perdio Definitivamente introducción a la progrmación programación");
                        } else if (notaMateria < 2.9){
                            System.out.println("tiene derecho a un plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedo la materia");
                        }
                        break;
                }
                break;
            case "2":
                System.out.println("Programa de Diseño Grafico");
                System.out.println("Seleccione la materia:\n1 - tipografia \n2 - Iconografia\n3 - semantica");
                materia = sc.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("nota de Tipografia");
                        System.out.println("Nota examen parcial (20%): ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller (30%): ");
                        notaTaller = sc.nextDouble();
                        System.out.println("nota final (50%):");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);

                        System.out.println("El estudiante " + nombreEstudiante + " tiene la siguiente calificación  en Tipografia:  " + notaMateria);
                        if(notaMateria < 2){
                            System.out.println("Perdio Definitivamente tipografia");
                        } else if (notaMateria < 2.9){
                            System.out.println("tiene derecho a un plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedo la materia");
                        }
                        break;
                    case "2":
                        System.out.println("nota de Iconografia: ");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("nota final:");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + " tiene la siguiente calificación en Iconografia:  " + notaMateria);
                        if(notaMateria < 2){
                            System.out.println("Perdio Definitivamente Iconografía");
                        } else if (notaMateria < 2.9){
                            System.out.println("tiene derecho a un plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("nota de semantica");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("nota final:");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + " tiene la siguiente calificación en semantica :  " + notaMateria);
                        if(notaMateria < 2){
                            System.out.println("Perdio definitivamente Semántica");
                        } else if (notaMateria < 2.9){
                            System.out.println("tiene derecho a un plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedo la materia");
                        }
                        break;
                }
                break;
            case "3":
                System.out.println("Programa de Gastronomia");
                System.out.println("Seleccione la materia:\n1 - Costos \n2 - panaderia dulce\n3 - cocina internacional");
                materia = sc.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("nota de Costos");
                        System.out.println("Nota examen parcial (20%): ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller (30%): ");
                        notaTaller = sc.nextDouble();
                        System.out.println("nota final (50%):");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);

                        System.out.println("El estudiante " + nombreEstudiante + " tiene la siguiente calificación  en Costos:  " + notaMateria);
                        if(notaMateria < 2){
                            System.out.println("Perdio Definitivamente costos");
                        } else if (notaMateria < 2.9){
                            System.out.println("tiene derecho a un plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedo la materia");
                        }
                        break;
                    case "2":
                        System.out.println("nota de Panaderia Dulce: ");
                        System.out.println("Nota examen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.println("Nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.println("nota final:");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("El estudiante " + nombreEstudiante + " tiene la siguiente calificación en Panaderia Dulce:  " + notaMateria);
                        if(notaMateria < 2){
                            System.out.println("Perdio Definitivamente Iconografía");
                        } else if (notaMateria < 2.9){
                            System.out.println("tiene derecho a un plan de mejoramiento");
                        } else {
                            System.out.println("Así le quedo la materia");
                        }
                        break;
                break;
        }




    }
}