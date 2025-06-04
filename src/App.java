import controllers.QueueG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
//        Stack stack = new Stack();
//
//        stack.push(10);
//        stack.push(-1);
//        stack.push(5);
//        stack.push(8);
//
//        stack.printStack();
//        stack.pop();
//        stack.printStack();
//        stack.pop();
//
//        System.out.println("Tam = " + stack.size());
//        stack.printStack();
//        stack.pop();
//        System.out.printf("Tam = " + stack.size());
//        stack.printStack();

        StackG<Integer> pilaG = new StackG<>();

        pilaG.push(10);
        pilaG.push(8);
        pilaG.push(-1);
        pilaG.push(5);

        System.out.println("Tam = " + pilaG.size());
        pilaG.printStack();
        pilaG.pop();
        System.out.println("Tam = " + pilaG.size());
        pilaG.printStack();


        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        Persona p4 = new Persona("David");

        QueueG<Persona> colaPersonas = new QueueG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);

        System.out.println("\nCola de personas ");
        colaPersonas.printCola();
        System.out.println("Persona antendida -> " + colaPersonas.remove());
        colaPersonas.printCola();

        System.out.println("\nCola de personas 2");
        Persona pB = colaPersonas.findByName("Juan");
        System.out.println("Personas encontrada -> " + pB != null ? pB : "Persona no encontrada");
        Persona pE = colaPersonas.deleteByName("Pedro");
        System.out.println("Persona eliminada -> " + pE != null ? pE : "Persona no eliminada");
        colaPersonas.printCola();
    }
}
