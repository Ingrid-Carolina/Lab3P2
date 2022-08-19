/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_ingridhernnadez_12141186;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author incah
 */
public class Lab3P2_IngridHernnadez_12141186 {
static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        ArrayList<Jugadores> jugador = new ArrayList();
        ArrayList<Torres> torres = new ArrayList();
        ArrayList<Cartas> cartas = new ArrayList();

        boolean centinela = true;

        while (centinela == true) {
            System.out.println("=======================MENU===================");
            System.out.println("0. Salir");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Añadir carta a Jugador");
            System.out.println("3. Añadir Torre de arquera a jugador");
            System.out.println("4. Añadir Torre de rey a jugador");
            System.out.println("5. Editar jugador");
            System.out.println("6. Eliminar jugador");
            System.out.println("7. Listar jugador");
            System.out.println("8. Listar jugadores ");
            System.out.println("9. Eliminar Torre de arquera a jugador");
            System.out.println("10. Eliminar torre de rey a jugador");
            System.out.println("11. Listar torres de jugador");
            System.out.println("12. Eliminar carta de jugador");
            System.out.println("13. Listar cartas de jugador");
            System.out.println("==============================================");
            System.out.print("Ingrese la opcion: ");

            int opcion = lea.nextInt();
            switch (opcion) {
                case 0: {
                    centinela = false;
                    break;
                }

                case 1: {
                    System.out.println("Ingrese el nombre del Jugador:");
                    String nombrej = lea.next();
                    ArrayList<Torres> torre = new ArrayList();
                    ArrayList<Cartas> carta = new ArrayList();
                    jugador.add(new Jugadores(nombrej, cartas, torres));
                    break;
                }//fin del case 1

                case 2: {
                    boolean ver = true;
                    System.out.println("Ingrese el Nombre de la carta: ");
                    String nombre = lea.next();
                    System.out.println("Ingrese la velocidad de la carta: ");
                    int veloc = lea.nextInt();
                    System.out.println("Ingrese el costo de elixir[1-20]: ");
                    int elixir = lea.nextInt();
                    while (elixir < 1 || elixir > 20) {
                        System.out.println("Ingrese denuevo el costo de elixir[1-20]:");
                        elixir = lea.nextInt();
                    }

                    System.out.println("Tipos de Cartas");
                    System.out.println("===================");
                    System.out.println("1.Especiales");
                    System.out.println("2.Epica");
                    System.out.println("3.Legendarias");
                    System.out.println("===================");
                    System.out.println("Elegir opcion: ");
                    int opicion = lea.nextInt();
                    switch (opicion) {
                        case 1: {
                            System.out.println("Ingrese la vida de la carta: ");
                            int vida = lea.nextInt();
                            cartas.add(new Especiales(vida, elixir, veloc, nombre));
                            break;
                        }

                        case 2: {
                            System.out.println("Ingrese el ataque de la carta: ");
                            int ataque = lea.nextInt();
                            cartas.add(new Epicas(ataque, elixir, veloc, nombre));
                            break;
                        }

                        case 3: {
                            System.out.println("Ingrese la vida de la carta: ");
                            int vida = lea.nextInt();
                            System.out.println("Ingrese el ataque de la carta: ");
                            int ataque = lea.nextInt();
                            cartas.add(new Legendarias(ataque, vida, elixir, veloc, nombre));
                            break;
                        }

                        default: {
                            System.out.println("Opcion Incoorecta");
                            ver = false;
                            break;
                        }

                    }
                    if (ver == true) {
                        String exit = "";
                        for (Object temp : jugador) {
                            if (temp instanceof Jugadores) {
                                exit += jugador.indexOf(temp) + "-" + temp;
                            }

                        }
                        System.out.println(exit);
                        System.out.println("Ingrese el indice del jugador a añadir: ");
                        int ana = lea.nextInt();

                        exit = "";
                        for (Object temp : cartas) {
                            if (temp instanceof Cartas) {
                                exit += cartas.indexOf(temp) + "-" + temp;
                            }

                        }
                        System.out.println(exit);
                        System.out.println("El indice de la Carta que quiere añadir: ");
                        int in = lea.nextInt();
                        ((Jugadores) jugador.get(ana)).getCartas().add((Cartas) cartas.get(in));
                    } else {
                        System.out.println("Hay un error");
                    }
                    break;
                }//fin del case 2

                case 3: {
                    System.out.println("Ingrese el ataque de la Torre arquera: ");
                    int ataque = lea.nextInt();
                    torres.add(new TorreArquera(ataque));
                    String exit = "";
                    for (Object temp : jugador) {
                        if (temp instanceof Jugadores) {
                            exit += jugador.indexOf(temp) + " - " + temp + "\n";
                        }
                    }
                    System.out.println(exit);
                    System.out.println("Ingrese el indice del jugador a añadir: ");
                    int ana = lea.nextInt();
                    exit = "";
                    for (Object temp : torres) {
                        if (temp instanceof Torres) {
                            exit += torres.indexOf(temp) + "-" + temp + "\n";
                        }
                    }
                    System.out.println(exit);
                    System.out.println("El indice de Torres que quiere añadir: ");
                    int in = lea.nextInt();
                    ((Jugadores) jugador.get(ana)).getTorres().add((TorreArquera) torres.get(in));
                    break;
                }//fin del case 3

                case 4: {
                    System.out.println("Ingrese el nombre de la Torre Rey: ");
                    String nombre = lea.next();
                    torres.add(new TorreRey(nombre));
                    String exit = "";
                    for (Object temp : jugador) {
                        if (temp instanceof Jugadores) {
                            exit += jugador.indexOf(temp) + "-" + temp;
                        }

                    }
                    System.out.println(exit);
                    System.out.println("Ingrese el indice del jugador a añadir: ");
                    int ana = lea.nextInt();

                    exit = "";
                    for (Object temp : torres) {
                        if (temp instanceof Torres) {
                            exit += torres.indexOf(temp) + "-" + temp + "\n";
                        }

                    }
                    System.out.println(exit);
                    System.out.println("El indice de torres que quiere añadir: ");
                    int in = lea.nextInt();
                    ((Jugadores) jugador.get(ana)).getTorres().add((TorreRey) torres.get(in));
                    break;
                }//fin del case 4

                case 5: {
                    if(jugador.isEmpty()){
                        System.out.println("No Existe Jugador");
                    }else{
                        String exit = "";
                        for(Object temp: jugador ){
                            if(temp instanceof Jugadores){
                                exit += jugador.indexOf(temp) + "- " + temp +"\n";
                            }
                        }
                        System.out.println(exit);
                        System.out.println("Ingrese la posicion del jugador que desea editar:");
                int pc = lea.nextInt();
                        System.out.println("Ingrese el nuevo nombre: ");
                        String nomb = lea.next();
                        ((Jugadores)jugador.get(pc)).setNombre(nomb);
                    }
                    
                
                    break;
                }//fin del case 5

                case 6: {
                    if(jugador.isEmpty()){
                        System.out.println("No Existe Jugador");
                    }else{
                        String exit = "";
                        for(Object temp: jugador ){
                            if(temp instanceof Jugadores){
                                exit += jugador.indexOf(temp) + "- " + temp +"\n";
                            }
                        }
                        System.out.println(exit);
                        System.out.println("La posicion del Jugador a eliminar: ");
                        int pos = lea.nextInt();
                        jugador.remove(pos);
                    }
                    break;
                }//fin del case 6

                case 7: {
                    if(jugador.isEmpty()){
                        System.out.println("No Existe Jugador");
                    }else{
                        String exit = "";
                        for(Object temp: jugador ){
                            if(temp instanceof Jugadores){
                                exit += jugador.indexOf(temp) + "- " + temp +"\n";
                            }
                        }
                        System.out.println(exit);
                        System.out.println("posicion del Jugador que listar: ");
                        int pos=lea.nextInt();
                        String temp = jugador.indexOf(pos)+"-"+((Jugadores)jugador.get(pos)).getNombre();
                         
                    }
                    break;
                }//fin del case 7

                case 8: {
                    if(jugador.isEmpty()){
                        System.out.println("No Existe Jugador");
                    }else{
                        String exit = "";
                        for(Object temp: jugador ){
                            if(temp instanceof Jugadores){
                                exit += jugador.indexOf(temp) + "- " + temp +"\n";
                            }
                        }
                        System.out.println(exit);
                        
                    }
                    break;
                }//fin del case 8

                case 9: {
                    if(jugador.isEmpty()){
                        System.out.println("No Existe Jugador");
                    }else{
                        String exit = "";
                        for(Object temp: jugador ){
                            if(temp instanceof Jugadores){
                                exit += jugador.indexOf(temp) + "- " + temp +"\n";
                            }
                        }
                        System.out.println(exit);
                        System.out.println("posicion del Jugador que listar: ");
                        int pos=lea.nextInt();
                        System.out.println(((Jugadores)jugador.get(pos)).lA());
                    }
                    break;
                }//fin del case 9

                case 10: {
                    break;
                }//fin del case 10

                case 11: {
                    String exit = "";
                        for(Object temp: torres ){
                            if(temp instanceof Torres){
                                exit += torres.indexOf(temp) + "-" + temp +"\n";
                            }
                        }
                        System.out.println(exit);
                    break;
                }//fin del case 11

                case 12: {
                    String exit = "";
                        for(Object temp: cartas ){
                            if(temp instanceof Cartas){
                                exit += cartas.indexOf(temp) + "-" + temp +"\n";
                            }
                        }
                        System.out.println(exit);
                        System.out.println("La posicion de la carta a eliminar: ");
                        int pos = lea.nextInt();
                        cartas.remove(pos);
                    break;
                }//fin del case 12

                case 13: {
                    if (jugador.isEmpty()) {
                        System.out.println("Jugador no Existe ");
                    } else {
                        String exit = "";
                        for (Object temp : jugador) {
                            if (temp instanceof Jugadores) {
                                exit += jugador.indexOf(temp) + "-" + temp;
                            }
                        }
                        System.out.println(exit);
                        System.out.println("Ingrese indice del Jugador que quiere listar cartas: ");
                        int in = lea.nextInt();
                        System.out.println(((Jugadores) jugador.get(in)).getCartas());

                    }
                    break;
                }//fin del case 13

                default: {
                    System.out.println("Opcion Incorrecta");
                    centinela = false;
                    break;
                }//fin del default

            }//fin del switch
        }//fin while

    }
}
