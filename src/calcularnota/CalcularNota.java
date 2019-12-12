package calcularnota;

import java.util.Scanner;

public class CalcularNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos metodos = new Metodos();
            String nome = "Alumno";
            while (!nome.equals("fin")) {
                System.out.print("\nIntroduce un nombre: ");
                    nome = sc.next();
                    if(nome.equals("fin")) break;
                System.out.print("Introduce la nota del primer exámen teórico: ");
                    float teorico1 = sc.nextFloat();
                System.out.print("Introduce la nota del segundo exámen teórico: ");
                    float teorico2 = sc.nextFloat();
                System.out.print("Introduce la nota del exámen práctico: ");
                    float practico = sc.nextFloat();
                System.out.print("Introduce el porcentaje de boletines entegados: ");
                    float porcentEntrega = sc.nextFloat();

                float notaTeorico = metodos.calcularTeorico(teorico1,teorico2);
                float notaPractico = metodos.tantoPorCento(practico,40f);
                float notaBoletins = metodos.calcularBoletins(porcentEntrega);

                System.out.print(
                        "\n\n-------------NOTAS-------------"+
                        "\nNome: "+nome+
                        "\nNota da parte teórica: "+notaTeorico+
                        "\nNota da parte práctica: "+notaPractico+
                        "\nNota dos boletíns: "+notaBoletins+
                        "\n\nNota total: "+(notaTeorico+notaPractico+notaBoletins)+
                        "\n-------------------------------\n\n");
            }
            System.out.println("FIN");
    }
}
