package com.solano.servicios;

import com.solano.modelos.Pago;

public class RegistroPagos {
    public void registrarPago(Pago pago) {
        System.out.println("Registrando pago de S/." + pago.getMonto() + " en el sistema.");
    }
}
