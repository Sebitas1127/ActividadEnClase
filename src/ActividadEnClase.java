import java.util.Scanner;
public class ActividadEnClase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String nom = entrada.nextLine() ;

        System.out.print("Digite su edad: ");
        int anios = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite su salario: ");
        double sal = Integer.parseInt(entrada.nextLine());

        System.out.print("¿Sumerce es jefe de departamento?: ");
        String FalseTrue = entrada.nextLine();
        boolean jefe=false;;
        if (FalseTrue=="si"){
            jefe = true;;
        if (FalseTrue=="no"){
            jefe = false;;
        }
        }
        System.out.println("Nombre"+" "+nom);
        System.out.println("Edad"+" "+anios);
        System.out.println("Salario"+" "+sal);
        System.out.println("Jefe de departamento"+" "+jefe);
    }
}
