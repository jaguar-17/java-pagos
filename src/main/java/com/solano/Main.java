package com.solano;

import com.solano.interfaces.MetodoPago;
import com.solano.modelos.Pago;
import com.solano.servicios.ProcesadorPago;
import com.solano.servicios.RegistroPagos;
import com.solano.servicios.TipoMetodoPago;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroPagos registro = new RegistroPagos();

        System.out.println("=== SISTEMA DE PAGOS ===");

        System.out.print("Ingrese el monto del pago: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta");
        System.out.println("2. Transferencia");
        System.out.println("3. Yape");

        String opcion = "";
        int seleccion = sc.nextInt();
        switch (seleccion) {
            case 1 -> opcion = "tarjeta";
            case 2 -> opcion = "transferencia";
            case 3 -> opcion = "yape";
            default -> {
                System.out.println("Opción inválida.");
                System.exit(0);
            }
        }

        try {
            MetodoPago metodo = TipoMetodoPago.obtenerMetodoPago(opcion);
            ProcesadorPago procesador = new ProcesadorPago(metodo);
            Pago pago = new Pago(monto);

            procesador.procesarPago(pago);
            registro.registrarPago(pago);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}