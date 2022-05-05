package com.dio.santander.bankline.api.service;

import java.util.Date;
import org.springframework.stereotype.Service;
import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Conta;
import com.dio.santander.bankline.api.model.Correntista;

@Service
public class CorrentistaService {
	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista ();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(null);
		 
	}

}
