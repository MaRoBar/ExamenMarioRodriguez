package mariorodriguez_examen1;

import java.util.Scanner;

public class ControlVentas {

    static int[] factura = new int[10];
    static int[] cedula = new int[10];
    static String[] nombre = new String[10];
    static int[] localidad = new int[10];
    static int[] entradas = new int[10];
    static int indice = 0;

    public static Scanner leer = new Scanner(System.in);

    public ControlVentas() {
    }

    public static void IncluirComprador() {
        int total = 0, total1 = 1000, entra = 0;
        char seguir = 'n';
        Scanner leer = new Scanner(System.in);
        do {
            if (indice > 9) {
                System.out.println("La cantidad de compradores alcanzo el limite");
                seguir = 'n';
            } else {
                System.out.println("Digite el numero de factura");
                factura[indice] = leer.nextInt();
                System.out.println("Digite su numero de cedula");
                cedula[indice] = leer.nextInt();
                System.out.println("Digite su nombre");
                nombre[indice] = leer.next();
                System.out.println("Digite la localidad que desea comprar\n1- Sol Norte/Sur: 10500 \n2- Sombra Este/Oeste: 20500 \n3- Preferencial: 25500");
                localidad[indice] = leer.nextInt();

                switch (localidad[indice]) {
                    case 1:
                        entra = 10500 * entradas[indice];
                        total = total1 + entra;
                        break;
                    case 2:
                        entra = 20500 * entradas[indice];
                        total = total1 + entra;
                        break;
                    case 3:
                        entra = 25500 * entradas[indice];
                        total = total1 + entra;
                        break;

                }

                System.out.println("Digite la cantidad de entradas");
                entradas[indice] = leer.nextInt();
                if (entradas[indice] > 4) {
                    System.out.println("Maximo 4 entradas por persona");
                } else {
                    entra = 10500 * entradas[indice];
                }
                total = total1 * entradas[indice] + entra;
                System.out.println("Gracias a ingresado al registro\nFactura: " + factura[indice] + "\nCedula: " + cedula[indice]
                        + "\nNombre: " + nombre[indice] + "\nLocalidad: " + localidad[indice] + "\nEntradas: " + entradas[indice]
                        + "\nSubtotal: " + entra + "\nTotal: " + total);
                indice++;
                System.out.println("Requiere ingresar otro comprador?");
                seguir = leer.next().toLowerCase().charAt(0);
            }
        } while (seguir != 'n');
    }

}
