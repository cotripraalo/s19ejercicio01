/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acotrina;

/**
 *
 * @author Fortress of Solitude
 */
public class PlanPostPago {
    
    private int minutos;
    private boolean minutosIlimitado; 
    
    private int rpc;
    private boolean rpcIlimitado;
    
    private int sms;
    private boolean smsIlimitado;
    
    private int internet;
    private boolean intenetIlimitado;
    
    public PlanPostPago(){
    
    }

    public void setMinutos(int minutos) {        
        this.minutos = minutos;
        this.minutosIlimitado = false;
    }
    
    public void setMinutosIlimitado(boolean minutosIlimitado) {                        
        this.minutosIlimitado = minutosIlimitado;        
        this.minutos = 0;        
    }
    
    public String getMinutos() {
        return minutosIlimitado ? "Ilimitado" : String.format("%d", minutos);
    }
    
    public void setRpc(int rpc) {
        this.rpc = rpc;
        this.rpcIlimitado = false;
    }
    
    public void setRpcIlimitado(boolean rpcIlimitado) {
        this.rpcIlimitado = rpcIlimitado;        
        this.rpc = 0;
    }    
    
    public String getRpc() {
        return rpcIlimitado ? "Ilimitado" : String.format("%d", rpc);
    }
    public int getSms() {
        return sms;
    }    

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    void setNombrePlan(String claro_MAX_189) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
