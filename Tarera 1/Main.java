import java.util.Scanner;

public class Main extends ListaEnlazada{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int indice,contador=0;
        do {
            System.out.println("Bienvenido\n¿En qué tipo de enlace quieres trabajar?\n1) Simple\n2) Doble\n3) Circular\n4) Terminar");
            int opcion=in.nextInt();
            if (opcion==1) {
                ListaEnlazada lista=new ListaEnlazada();
                lista.inicializar();
                do {
                    System.out.println("1) Agregar\n2) Eliminar\n3) Agregar por indice\n4) Invertir lista\n5) Terminar");
                    opcion=in.nextInt();
                    if(opcion==1){
                        System.out.print("Ingrese el valor que desea agregar: ");
                        opcion=in.nextInt();
                        lista.agregar(opcion);
                        lista.imprimir();
                    }else if (opcion==2) {
                        System.out.print("Ingrese el valor que desea eliminar: ");
                        opcion=in.nextInt();
                        lista.eliminar(opcion);
                        lista.imprimir();
                    }else if (opcion==3) {
                        lista.imprimir();
                        System.out.println("Ingrese el valor que desea gregar: ");
                        opcion=in.nextInt();
                        System.out.println("Ingrese el indice en donde deseas insertarlo: ");
                        indice=in.nextInt();
                        lista.insertar(opcion,indice);
                        lista.imprimir();
                    }else if (opcion==4) {
                        lista.revertir();
                        lista.imprimir();
                    }else if(opcion==5){
                        contador++;
                        
                    }
                    opcion=1;
                } while (contador<1);
                
            }
            if (opcion==2) {
                ListaDoble lista=new ListaDoble();
                lista.inicializar();
                do {
                    System.out.println("1) Agregar\n2) Eliminar\n3) Agregar por lugar\n4) Invertir lista\n5) Terminar");
                    opcion=in.nextInt();
                    if(opcion==1){
                        System.out.print("Ingrese el valor que desea agregar: ");
                        opcion=in.nextInt();
                        lista.agregar(opcion);
                        lista.imprimir();
                    }else if (opcion==2) {
                        System.out.print("Ingrese el valor que desea eliminar: ");
                        opcion=in.nextInt();
                        lista.eliminar(opcion);
                        lista.imprimir();
                    }else if (opcion==3) {
                        lista.imprimir();
                        System.out.println("Ingrese el valor que desea gregar: ");
                        opcion=in.nextInt();
                        System.out.println("Ingrese despúes de qué número desea guardarlo: ");
                        indice=in.nextInt();
                        lista.insertarDespuesDe(indice,opcion);
                        lista.imprimir();
                    }else if (opcion==4) {
                        lista.revertir();
                        lista.imprimir();
                    }else if(opcion==5){
                        contador++;
                    }
                    opcion=2;
                } while (contador<1);
                
            }
            if (opcion==3) {
                ListaCircular lista=new ListaCircular();
                lista.inicializar();
                do {
                    System.out.println("1) Agregar\n2) Eliminar\n3) Agregar por lugar\n4) Invertir lista\n5) Terminar");
                    opcion=in.nextInt();
                    if(opcion==1){
                        System.out.print("Ingrese el valor que desea agregar: ");
                        opcion=in.nextInt();
                        lista.agregar(opcion);
                        lista.imprimir();
                    }else if (opcion==2) {
                        System.out.print("Ingrese el valor que desea eliminar: ");
                        opcion=in.nextInt();
                        lista.eliminar(opcion);
                        lista.eliminar(opcion);
                        lista.imprimir();
                        
                    }else if (opcion==3) {
                        lista.imprimir();
                        System.out.println("Ingrese el valor que desea gregar: ");
                        opcion=in.nextInt();
                        System.out.println("Ingrese despúes de qué número desea guardarlo: ");
                        indice=in.nextInt();
                        lista.insertarDespuesDe(indice,opcion);
                        lista.imprimir();
                    }else if (opcion==4) {
                        lista.revertir();
                        lista.imprimir();
                    }else if(opcion==5){
                        contador++;
                    }
                    opcion=3;
                } while (contador<1);
                
            }
            if (opcion==4) {
                contador=2;
            }
            contador--;
        } while (contador==0);
        
    }
    
}
