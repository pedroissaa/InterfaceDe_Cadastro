/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Fornecedor {
  private String nome;
  private String cnpj;
  private String telefone;
  
  public String getNome() {
      return nome;
  }
  
  public String setNome(String nome) {
      this.nome = nome;
  }
  
  public String getCnpj() {
      return cnpj;
  }
  
  public String setCnpj(String cnpj) {
      this.cnpj = cnpj;
  }
  
  public String getTelefone() {
      return telefone;
  }
  
  public String setTelefone(String Telefone) {
      this.telefone = telefone;
  }
  
}
