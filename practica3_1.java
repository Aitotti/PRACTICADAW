import java.util.Scanner;
//1. Elimina blancos (André)
//2. Invierte cadena (Kened)
//3. Concatena dos cadenas (Sylvia)
//4. Busca una subcadena (Ion Ailoai)
//5. Convierte frase a mayúsculas (Ayman)
//6. Convierte frase a minúsculas (Sebastian)
//7. Visualiza número de caracteres (Daniel)
//8. Palindrono (Arnau)
//9. Invierte mayúsculas y minúsculas (Ion Evangelista)
//10. Codifica frase (Josep)
//11. Invierte cada palabra (Nicolas)
//12. Cuenta número de palabras (Cristian)
//13. Salir
public class practica3_1 {
    public static void main(String[] args) {
            int opcion;

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la frase");
            String frase = sc.nextLine();
            System.out.println("Elige una opcion del menu (1-13)");
            opcion = sc.nextInt();

            // ELEGIR OPCION CON SWITCH
            switch(opcion) {
                case 1:
                    System.out.println("Opcion Elegida, elimina blancos");
                    break;

                case 2:
                    System.out.println("Opcion Elegida invierte cadena");
                    break;
                case 3:
                    System.out.println("Opcion Elegida: concatenar dos Strings");
                    break;
                case 4:
                    System.out.println("Opcion Elegida: Buscar Subcadenas");
                    break;
                case 5:
                    System.out.println("Opcion Elegida: Convertir frase a mayúsculas");
                    break;
                case 6:
                    System.out.println("Opcion Elegida: Convierte frase a minúsculas ");
                    break;
                case 7:
                    System.out.println("Opcion Elegida: Visualiza numero de caracteres");
                    break;
                case 8:
                    System.out.println("Opcion Elegida: Comprobación Palíndromo ");
                    break;
                case 9:
                    System.out.println("Opcion Elegida: Invierte mayúsculas y minúsculas ");
                    break;
                case 10:
                    System.out.println("Opcion Elegida: Codificar frase");
                    break;
                case 11:
                    System.out.println("Opcion Elegida: Invertir cada palabra ");
                    break;
                case 12:
                    System.out.println("Opcion Elegida: Cuenta número de palabras ");
                    int numero=0;
				    System.out.println("INTRODUZCA LA FRASE");
				    String mensaje = sc.nextLine();//Si es un poco cutre pero no he encontrado otra forma
				    mensaje = sc.nextLine();// de que no se salte la linea de codigo y no de errores;
				    mensaje = mensaje.trim();
				    mensaje = mensaje.replaceAll("\\s+", " ");
				    String[] palabras = mensaje.split(" ");
				    numero = palabras.length;
				    System.out.println("NUMERO DE PALABRAS: " + numero);
                    break;
                case 13:
                    System.out.println("Opcion Elegida: Salir, Adiós");
                    break;
                default:
                    System.out.println("Opcion Elegida no válida ");
            }
    }
}
