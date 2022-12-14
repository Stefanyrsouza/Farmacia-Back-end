package org.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.generation.farmacia.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
	public List <ProdutoModel> buscarProdutosEntre(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);

	public  List < ProdutoModel > findAllByProdutoContainingIgnoreCase ( @Param ( "produto" ) String  produto );
}
