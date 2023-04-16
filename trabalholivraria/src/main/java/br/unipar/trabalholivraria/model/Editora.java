/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.trabalholivraria.model;

/**
 *
 * @author vinid
 */
public class Editora {
    private int cod_editora;
    private String nmEditora;
    private String cnpjEditora;
    
    public Editora(){}
    public Editora(int cod_editora,String nmEditora, String cnpjEditora){
        this.cod_editora = cod_editora;
        this.nmEditora = nmEditora;
        this.cnpjEditora = cnpjEditora;
    }
    public void setCod_editora(int cod_editora){
        this.cod_editora = cod_editora;
    }
    public int getCod_editora(){
        return this.cod_editora;
    }
    public void setNmEditora(String nmEditora){
        this.nmEditora = nmEditora;
    }
    public String getNmEditora(){
        return this.nmEditora;
    }
    public void setCnpjEditora(String cnpjEditora){
        this.cnpjEditora = cnpjEditora;
    }
    public String getCnpjEditora(){
        return this.cnpjEditora;
    }

    @Override
    public String toString() {
        return "Editora{" + "cod_editora=" + cod_editora + ", nmEditora=" + nmEditora + ", cnpjEditora=" + cnpjEditora + '}';
    }
    
}
