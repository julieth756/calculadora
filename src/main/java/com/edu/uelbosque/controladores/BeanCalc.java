/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.uelbosque.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
/**
 *
 * @author jcobos
 */
@ManagedBean
@ViewScoped
public class BeanCalc{
    private String operador;
    private String signo;

    public BeanCalc() {
        operador = "";
        signo = "";
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
 
    public void operacion(){
    
    }

    public void numero(ActionEvent e){
        String identif = e.getComponent().getId();
        String concatena = identif.substring(identif.indexOf("nume")+4);
        this.operador +=concatena;
    }
    
    public void reset(){
      setOperador(" ");  
    }
}