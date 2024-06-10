package br.edu.infnet.tp224e2_1.repository;

import br.edu.infnet.tp224e2_1.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}