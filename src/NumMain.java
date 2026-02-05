import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String numeros = "";

        System.out.println("Introduce el número de líneas: ");
        num = sc.nextInt();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))){
            for (int i = 1; i <= num; i++){ //Se empieza desde 1
                numeros+=i + " "; //En el string se guarda el número con los anteriores + un espacio entre medias
                writer.write(numeros); //Escribir el string en cada línea
                writer.newLine();
            }
            System.out.println("Los números han sido escritos.");
        } catch (IOException e){
            System.out.println("Error al escribir archivo --> " + e.getMessage());
        }
    }
}
