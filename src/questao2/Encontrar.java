package questao2;

import java.util.Scanner;

public class Encontrar {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        AchadoPerdido achadoperdido = new AchadoPerdido("Caderno","agenda","3x4","Material","Sala","11h00","Disponivel");

        System.out.printf("Entre com o que deseja buscar:");
        String buscar = ler.nextLine();
        System.out.print(achadoperdido.BuscarTitulo(buscar));

        achadoperdido.visualizarDetalhes();

    }

}
