/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Entidade;

import java.sql.Date;

/**
 *
 * @author maste
 */
public class Produto {
    
    private Integer Id_produto;
    private String  Nome_produto;
    private String  Categoria_produto;
    private Double  Valor_produto;
    private Integer Quantidade_produto;
    private Boolean Estado_produto; 
    private Date validade_produto;
    /**
     * @return the validade_produto
     */
    public Date getValidade_produto() {
        return validade_produto;
    }

    /**
     * @param validade_produto the validade_produto to set
     */
    public void setValidade_produto(Date validade_produto) {
        this.validade_produto = validade_produto;
    }

    /**
     * @return the Quantidade_produto
     */
    public Integer getQuantidade_produto() {
        return Quantidade_produto;
    }

    /**
     * @param Quantidade_produto the Quantidade_produto to set
     */
    public void setQuantidade_produto(Integer Quantidade_produto) {
        this.Quantidade_produto = Quantidade_produto;
    }

    /**
     * @return the Id_produto
     */
    public Integer getId_produto() {
        return Id_produto;
    }

    /**
     * @param Id_produto the Id_produto to set
     */
    public void setId_produto(Integer Id_produto) {
        this.Id_produto = Id_produto;
    }

    /**
     * @return the Nome_produto
     */
    public String getNome_produto() {
        return Nome_produto;
    }

    /**
     * @param Nome_produto the Nome_produto to set
     */
    public void setNome_produto(String Nome_produto) {
        this.Nome_produto = Nome_produto;
    }

    /**
     * @return the Categoria_produto
     */
    public String getCategoria_produto() {
        return Categoria_produto;
    }

    /**
     * @param Categoria_produto the Categoria_produto to set
     */
    public void setCategoria_produto(String Categoria_produto) {
        this.Categoria_produto = Categoria_produto;
    }

    /**
     * @return the Valor_produto
     */
    public Double getValor_produto() {
        return Valor_produto;
    }

    /**
     * @param Valor_produto the Valor_produto to set
     */
    public void setValor_produto(Double Valor_produto) {
        this.Valor_produto = Valor_produto;
    }

    /**
     * @return the Estado_produto
     */
    public Boolean getEstado_produto() {
        return Estado_produto;
    }

    /**
     * @param Estado_produto the Estado_produto to set
     */
    public void setEstado_produto(Boolean Estado_produto) {
        this.Estado_produto = Estado_produto;
    }
    
  
    
}
