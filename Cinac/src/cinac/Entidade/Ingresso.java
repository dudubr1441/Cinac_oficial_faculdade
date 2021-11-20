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
public class Ingresso extends Filme{
    private int ingressoID;
    private boolean entradaInteira;
    private float valorTotal;
    private String sala_tipo;
    private String assento;

    /**
     * @return the ingressoID
     */
    public int getIngressoID() {
        return ingressoID;
    }

    /**
     * @param ingressoID the ingressoID to set
     */
    public void setIngressoID(int ingressoID) {
        this.ingressoID = ingressoID;
    }

    /**
     * @return the entradaInteira
     */
    public boolean isEntradaInteira() {
        return entradaInteira;
    }

    /**
     * @param entradaInteira the entradaInteira to set
     */
    public void setEntradaInteira(boolean entradaInteira) {
        this.entradaInteira = entradaInteira;
    }

    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the sala_tipo
     */
    public String getSala_tipo() {
        return sala_tipo;
    }

    /**
     * @param sala_tipo the sala_tipo to set
     */
    public void setSala_tipo(String sala_tipo) {
        this.sala_tipo = sala_tipo;
    }

    /**
     * @return the assento
     */
    public String getAssento() {
        return assento;
    }

    /**
     * @param assento the assento to set
     */
    public void setAssento(String assento) {
        this.assento = assento;
    }
}  
    
    