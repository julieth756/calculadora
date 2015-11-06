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
 
    public void numero(ActionEvent e){
        String identif = e.getComponent().getId().substring(3);
        this.operador+=identif; 
    }

    public void signo(ActionEvent e){
        String identif = e.getComponent().getId().substring(3);
         switch(identif){
            case "s":
                this.operador +="+";
                signo = "+";
                break;
            case "r":
                this.operador +="-";
                signo = "-";
                break;
            case "m":
                this.operador +="*";
                signo = "*";
                break;
            case "d":
                this.operador +="/";
                signo = "/";
                break;
            case "p":
                this.operador +=".";
                break;
            default:
                this.operador+="";
        }
    }
    
    public void resultado(){
                String union[];
                double resultado;
                double nume1 = 0.0;
                double nume2 = 0.0;
        
                switch(signo){
                case "+":
                    union = operador.split("\\+");
                    nume1 = Double.valueOf(union[0]);
                    nume2 = Double.valueOf(union[1]);
                    resultado = nume1 + nume2;
                    this.operador = String.valueOf(resultado);
                    break;
                case "-":
                    union = operador.split("-");
                    nume1 = Double.valueOf(union[0]);
                    nume2 = Double.valueOf(union[1]);
                    resultado = nume1 - nume2;
                    this.operador = String.valueOf(resultado);
                    break;
                case "*":
                    union = operador.split("\\*");
                    nume1 = Double.valueOf(union[0]);
                    nume2 = Double.valueOf(union[1]);
                    resultado = nume1 * nume2;
                    this.operador = String.valueOf(resultado);
                    break;
                case "/":
                    union = operador.split("/");
                    nume1 = Double.valueOf(union[0]);
                    nume2 = Double.valueOf(union[1]);
                    resultado = nume1 / nume2;
                    this.operador = String.valueOf(resultado);
                    break;                
            default:
                    this.operador = "";
        }
    }
    public void reset(){
      setOperador(" ");  
    }
}