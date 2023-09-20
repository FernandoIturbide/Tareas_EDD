import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("En que te gustaría trabajar: \n1) Pila\n2) Cola\n3) Salir");
        int opcion=i.nextInt();
        Object objeto;
        if(opcion ==1){
            Pila pila = new Pila();
                pila.push(2);
                pila.push(4);
                pila.push(9);
                pila.push(1);
                pila.push(7);
            do {
                pila.imprimir();
                System.out.println("¿Qué te gustaríoa hacer?: \n1) Peek \n2) push\n3) Pop\n4) Salir");
                opcion=i.nextInt();
                if(opcion==1){
                    System.out.println(pila.peek());
                    opcion=1;
                }else if(opcion==2){
                    System.out.print("Ingresa el valor que deaseas agregar: ");
                    objeto=i.next();
                    pila.push(objeto);
                    opcion=1;
                }else if(opcion ==3){
                    pila.pop();
                    opcion=1;
                }else if(opcion==4){
                    opcion=2;
                }
            } while (opcion==1);
        }else if(opcion ==2){
            Cola cola = new Cola();
            cola.enqueue(2);
            cola.enqueue(4);
            cola.enqueue(9);
            cola.enqueue(1);
            cola.enqueue(7);
            do {
                cola.imprimir();
                System.out.println("¿Qué te gustaríoa hacer?: \n1) Peek \n2) Enqueue\n3) Dequeue\n4) Salir");
                opcion=i.nextInt();
                if(opcion==1){
                    System.out.println(cola.peek());
                    opcion=1;
                }else if(opcion==2){
                    System.out.print("Ingresa el valor que deaseas agregar: ");
                    objeto=i.next();
                    cola.enqueue(objeto);
                    opcion=1;
                }else if(opcion ==3){
                    cola.dequeue();
                    opcion=1;
                }else if(opcion==4){
                    opcion=2;
                }
            } while (opcion==1);
        }
    }
}

