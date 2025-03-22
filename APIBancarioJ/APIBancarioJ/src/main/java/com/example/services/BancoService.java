package com.example.services;

import com.example.models.ContaCorrente;
import com.example.models.ContaPoupanca;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class BancoService {

    private static final String FILE_PATH = "src/main/resources/banco.json";
    private List<ContaPoupanca> contaPoupancas;
    private List<ContaCorrente> contaCorrentes;
    private ObjectMapper objectMapper;

    public BancoService() throws  {
        this.objectMapper = new ObjectMapper();
        this.contaCorrentes = carregarConta();
        this.contaPoupancas = carregarConta();
    }

    public ResponseEntity<ContaCorrente> createConta(ContaCorrente contaCorrente) throws IOException {
        contaCorrente

        return new ResponseEntity<>(contaCorrente, HttpStatus.CREATED);
    }

    public ResponseEntity<ContaPoupanca> createConta(ContaPoupanca contaPoupanca) throws IOException {
        cpRepository.save(contaPoupanca);

        return new ResponseEntity<>(contaPoupanca, HttpStatus.CREATED);
    }

    /*

        public ResponseEntity<Double> getSaldoCP(int numeroConta) {
            Optional<ContaPoupanca> optionalCP = cpRepository.findById((long) numeroConta);
            double saldo = 0;
            if (optionalCP.isPresent()) {
                // Acessa o saldo da conta de ContaPoupanca e retorna como BigDecimal
                saldo = optionalCP.get().getSaldo(); // Substitua 'getSaldo()' com o método correto para acessar o saldo.
                return new ResponseEntity<>(saldo, HttpStatus.OK);
            } else {
                // Caso a conta não seja encontrada, retorna 404 Not Found
                return new ResponseEntity<>(saldo, HttpStatus.NOT_FOUND);
            }
        }

        public ResponseEntity<Double> getSaldoCC(int numeroConta) {
            Optional<ContaCorrente> optionalCC = ccRepository.findById((long) numeroConta);
            double saldo = 0;
            if (optionalCC.isPresent()) {
                // Acessa o saldo da conta de ContaPoupanca e retorna como BigDecimal
                 saldo = optionalCC.get().getSaldo(); // Substitua 'getSaldo()' com o método correto para acessar o saldo.
                return new ResponseEntity<>(saldo, HttpStatus.OK);
            } else {
                // Caso a conta não seja encontrada, retorna 404 Not Found
                return new ResponseEntity<>(saldo, HttpStatus.NOT_FOUND);
            }
        }
    */
    public ResponseEntity<ContaCorrente> depositarCC(int numeroConta, ContaCorrente contaCorrente) {
        Optional<ContaCorrente> optionalCC = ccRepository.findById((long)numeroConta);
        if (optionalCC.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        ContaCorrente ccDepositar = optionalCC.get();
        ccDepositar.depositar(contaCorrente.getSaldo());

        ccRepository.save(ccDepositar);

        return ResponseEntity.ok(ccDepositar);
    }

    public ResponseEntity<ContaPoupanca> depositarCP(int numeroConta, ContaPoupanca contaPoupanca) {
        Optional<ContaPoupanca> optionalCP = cpRepository.findById((long)numeroConta);
        if (optionalCP.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        ContaPoupanca cpDepositar = optionalCP.get();
        cpDepositar.depositar(contaPoupanca.getSaldo());

        cpRepository.save(cpDepositar);

        return ResponseEntity.ok(cpDepositar);
    }

    public ResponseEntity<ContaCorrente> sacarCC(int numeroConta, ContaCorrente contaCorrente) {
        Optional<ContaCorrente> optionalCC = ccRepository.findById((long)numeroConta);
        if (optionalCC.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        ContaCorrente ccSacar = optionalCC.get();
        ccSacar.sacar(contaCorrente.getSaldo());

        ccRepository.save(ccSacar);

        return ResponseEntity.ok(ccSacar);
    }

    public ResponseEntity<ContaPoupanca> sacarCP(int numeroConta, ContaPoupanca contaPoupanca) {
        Optional<ContaPoupanca> optionalCP = cpRepository.findById((long)numeroConta);
        if (optionalCP.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        ContaPoupanca cpSacar = optionalCP.get();
        cpSacar.sacar(contaPoupanca.getSaldo());

        cpRepository.save(cpSacar);

        return ResponseEntity.ok(cpSacar);
    }
/*
    public ResponseEntity<ContaCorrente> depositarCC(int numeroConta, ContaCorrente contaCorrente) {

        return null;
    }

    public ResponseEntity<ContaPoupanca> depositarCP(int numeroConta, ContaPoupanca contaPoupanca) {
        return null;
    }
*/
}

