package com.solano.servicios;

import com.solano.interfaces.MetodoPago;
import com.solano.modelos.Pago;

public class ProcesadorPago {
    private final MetodoPago metodoPago;

    // Inversion de control a través del constructor
    public ProcesadorPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesarPago(Pago pago) {
        metodoPago.pagar(pago.getMonto());
    }
}
