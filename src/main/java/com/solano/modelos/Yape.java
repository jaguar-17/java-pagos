package com.solano.modelos;

import com.solano.interfaces.MetodoPago;

public class Yape implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago de S/." + monto + " realizado con Yape.");
    }
}
