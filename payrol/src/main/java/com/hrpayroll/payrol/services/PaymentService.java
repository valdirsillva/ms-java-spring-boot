package com.hrpayroll.payrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrpayroll.payrol.entities.Payment;
import com.hrpayroll.payrol.entities.Worker;
import com.hrpayroll.payrol.feignclients.WorkerFeignClient;

// Registrando o service
@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    // Método para instanciar o Pagamento
    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
