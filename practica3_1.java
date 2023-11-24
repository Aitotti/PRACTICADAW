package entornosRamas;
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
                  
                  String fraseFinal9 = "";
                  
                  for (int i = 0; i < frase.length(); i++) {
  	              	char letra9 = frase.charAt(i);
  	              	if (Character.isUpperCase(letra9)) {
  	              		fraseFinal9 += Character.toLowerCase(letra9); 
  	              	} else if (Character.isLowerCase(letra9)) {
  	              		fraseFinal9 += Character.toUpperCase(letra9);
  	              	} else {
  	              		fraseFinal9 += letra9;
  	              		}
                	}
                  
                  System.out.println("La frase con las mayúsculas y minúsculas invertidas es: \n" +fraseFinal);
                  
                  break;
              case 10:
                  System.out.println("Opcion Elegida: Codificar frase");
                  break;
              case 11:
                  System.out.println("Opcion Elegida: Invertir cada palabra ");
                  break;
              case 12:
                  System.out.println("Opcion Elegida: Cuenta número de palabras ");
                  break;
              case 13:
                  System.out.println("Opcion Elegida: Salir, Adiós");
                  break;
              default:
                  System.out.println("Opcion Elegida no válida ");
          }
  }
}
