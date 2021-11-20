/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Entidade;

/**
 *
 * @author bruno.bittencourt
 */
public class Filme {
    private int FilmeID;
    private String atorNome;
    private int atorIdade;
    private String titulo;
    private String descricao;
    
    /**
     * @return the id
     */
    public int getFilmeID() {
        return FilmeID;
    }

    /**
     * @param id the id to set
     */
    public void setFilmeID(int FilmeID) {
        this.FilmeID = FilmeID;
    }

   
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

  

    /**
     * @return the atorNome
     */
    public String getAtorNome() {
        return atorNome;
    }

    /**
     * @param atorNome the atorNome to set
     */
    public void setAtorNome(String atorNome) {
        this.atorNome = atorNome;
    }

    /**
     * @return the atorIdade
     */
    public int getAtorIdade() {
        return atorIdade;
    }

    /**
     * @param atorIdade the atorIdade to set
     */
    public void setAtorIdade(int atorIdade) {
        this.atorIdade = atorIdade;
    }

}
