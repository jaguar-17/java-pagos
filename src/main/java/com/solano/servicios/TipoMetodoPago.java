package com.solano.servicios;

import com.solano.interfaces.MetodoPago;
import com.solano.modelos.TajetaCredito;
import com.solano.modelos.TransferenciaBancaria;
import com.solano.modelos.Yape;

public class TipoMetodoPago {
    public static MetodoPago obtenerMetodoPago(String opcion) {
        return switch (opcion.toLowerCase()) {
            case "tarjeta" -> new TajetaCredito();
            case "transferencia" -> new TransferenciaBancaria();
            case "yape" -> new Yape();
            default -> throw new IllegalArgumentException("Método de pago no reconocido: " + opcion);
        };
    }
}
