import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toString() {
        return "Nombre: " + nombre + " - Nota: " + nota;
    }
}

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // aqui es dojnde se crea una lisat entre 1 y 50 numeros aleatorios
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            lista.add(rand.nextInt(50) + 1);
        }

        System.out.println("Lista:" + lista);

        // aqui se suman los elementos
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        System.out.println("Suma: " + suma);

        // aqui se calcula y muestra el numero mayor
        int mayor = lista.get(0);
        for (int num : lista) {
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("Mayor: " + mayor);

        // este es el sistema de busqueda del nuemro deseado
        System.out.print("Ingrese número a buscar: ");
        int buscar = sc.nextInt();
        if (lista.contains(buscar)) {
            System.out.println("El número SÍ existe");
        } else {
            System.out.println("El número NO existe");
        }

        // aqui se elimina el numeor deseado
        System.out.print("Ingrese número a eliminar: ");
        int eliminar = sc.nextInt();
        if (lista.remove((Integer) eliminar)) {
            System.out.println("Elemento eliminado");
        } else {
            System.out.println("No se encontró el elemento");
        }

        System.out.println("Lista actualizada:");
        System.out.println(lista);

        // aqui se ordenen sin ninguna funcion sino en este caso se uso el metodo burbuja
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

        System.out.println("Lista ordenada:");
        System.out.println(lista);

        // aqui se cuentan los pares
        int pares = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Cantidad de pares: " + pares);

        // y aqui se crea el crud
        ArrayList<String> crud = new ArrayList<>();

        // aqui se crea
        crud.add("Juan");
        crud.add("Maria");

        // y aqui se lee
        System.out.println("Lista CRUD:");
        for (int i = 0; i < crud.size(); i++) {
            System.out.println(i + ": " + crud.get(i));
        }

        // aqui es donde se actualiza
        crud.set(0, "Carlos");


        crud.remove(1);

        System.out.println("CRUD actualizado:");
        System.out.println(crud);

        // aqui es la lista de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Ana", 4.5));
        estudiantes.add(new Estudiante("Luis", 3.8));
        estudiantes.add(new Estudiante("Sofia", 4.9));

        System.out.println("Lista de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

        sc.close();
    }
}

