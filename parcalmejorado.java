package ejemplo;

import java.time.LocalDate;
import java.util.Scanner;

public class parcalmejorado {
    public static void main(String[] args) {
        String nombre;
        int dni;
        Scanner scan = new Scanner(System.in);

        // Datos del cliente
        System.out.println("Ingrese el nombre del cliente:");
        nombre = scan.nextLine();
        System.out.println("Ingrese el número de DNI:");
        dni = scan.nextInt();
        scan.nextLine();  // salto de linea

        LocalDate fechaActual = LocalDate.now();
        int contador = 1;
        int cantidad_producto;
        System.out.println("Cantidad de productos:");
        cantidad_producto = scan.nextInt();
        scan.nextLine();  // salto de linea

        // almacenar
        String productos[] = new String[cantidad_producto];
        double precios[] = new double[cantidad_producto];

        // Productos y precios
        String producto;
        double igv = 18;
        double precio = 0.00;
        double galleta = 1.00;
        double gaseosa = 2.50;
        double arroz = 4.00;
        double fideos = 3.50;

        // Entrada de productos
        while (contador <= cantidad_producto) {
            System.out.println("Ingrese el producto:");
            producto = scan.nextLine();

            if (producto.equals("galleta")) {
                precio = galleta;
            } else if (producto.equals("gaseosa")) {
                precio = gaseosa;
            } else if (producto.equals("arroz")) {
                precio = arroz;
            } else if (producto.equals("fideos")) {
                precio = fideos;
            }

            productos[contador - 1] = producto;
            precios[contador - 1] = precio;
            contador++;
        }

        // Impresión de la boleta
        System.out.println("===========================");
        System.out.println("BOLETA ELECTRONICA");
        System.out.println("===========================");
        System.out.println("TIENDA S.A");
        System.out.println("Fecha: " + fechaActual);
        System.out.println("Dirección Loma Verde, Suro");
        System.out.println("Cliente: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("---------------------------");
        System.out.println("Item     Producto     Total");

        double total = 0.00;
        for (int i = 0; i < cantidad_producto; i++) {
            System.out.println((i + 1) + "       " + productos[i] + "        " + precios[i]);
            total += precios[i];
        }
        double total_pagar = total + (total * (igv / 100));

        System.out.println("---------------------------");
        System.out.println("        SUBTOTAL: " + total);
        System.out.println("        I.G.V: " + igv + "%");
        System.out.println("    IMPORTE TOTAL S/" + total_pagar);
        System.out.println("===========================");
        System.out.println("GRACIAS POR SU PREFERENCIA");
        System.out.println("===========================");
    }
}