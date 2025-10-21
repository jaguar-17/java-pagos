package com.solano.modelos;

import com.solano.interfaces.MetodoPago;

public class TransferenciaBancaria implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago de S/." + monto + " realizado mediante Transferencia Bancaria.");
    }
}
