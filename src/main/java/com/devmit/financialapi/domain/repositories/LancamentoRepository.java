package com.devmit.financialapi.domain.repositories;

import com.devmit.financialapi.domain.entities.lancamento.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {


}
