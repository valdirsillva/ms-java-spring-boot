package com.hrpayroll.payrol.services;

import org.springframework.stereotype.Service;

import com.hrpayroll.payrol.entities.Payment;

// Registrando o service
@Service
public class PaymentService {

    // Método para instanciar o Pagamento
    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
