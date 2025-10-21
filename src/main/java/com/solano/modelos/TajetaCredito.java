package com.solano.modelos;

import com.solano.interfaces.MetodoPago;

public class TajetaCredito implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago de S/." + monto + " realizado con Tarjeta de Crédito.");
    }
}
