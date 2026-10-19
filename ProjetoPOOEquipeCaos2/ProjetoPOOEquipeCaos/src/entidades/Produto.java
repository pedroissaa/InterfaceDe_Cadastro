/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author aula
 */
public class Produto {
    private String descricao;
    private Double preco;
    private Integer quantidade;
    private Fornecedor fornecedor;
    
    public String getDescricao() {
      return descricao;
  }
  
  public void setDescricao(String descricao) {
      this.descricao = descricao;
  }
  
  public Double getPreco() {
      return preco;
  }
  
  public void setPreco(Double preco) {
      this.preco = preco;
  }
  
  public Integer getQuantidade() {
      return quantidade;
  }
  
  public void setQuantidade(Integer quantidade) {
      this.quantidade = quantidade;
  }
  
  public Forcenedor getFornecedor() {
      return fornecedor;
  }
  
  public void setFornecedor(Fornecedor fornecedor) {
      this.fornecedor = fornecedor;
  }
  
}
