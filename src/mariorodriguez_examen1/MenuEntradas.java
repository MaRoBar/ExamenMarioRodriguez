package mariorodriguez_examen1;

import java.util.Scanner;

public class MenuEntradas {
    public byte opcion;
    public Scanner leer = new Scanner(System.in);
    
 public MenuEntradas(){
        opcion = 10;
    }
public void Mostrar(){    
        do {
            System.out.println("*BIENVENIDO A SU SISTEMA DE CONTROL*");
            System.out.println("Presione 1 para incluir sus datos");
            
            opcion = leer.nextByte();
            
            switch (opcion) {
                case 1: ControlVentas.IncluirComprador();
                break;   
                case 2:
                break;
            }
        }while (opcion!=0);
    }
















}
