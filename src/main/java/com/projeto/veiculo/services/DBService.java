package com.projeto.veiculo.services;


import com.projeto.veiculo.domains.Veiculo;
import com.projeto.veiculo.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public void initDB(){
        Veiculo veiculo1 = new Veiculo(null,"caro vermelho", LocalDate.now(),10.00, "Victor", "34357890821");

    veiculoRepository.save(veiculo1);
    }




}
