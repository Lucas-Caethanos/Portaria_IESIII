package com.example.portaria.model;

public class Autorizacao {
    private int pesId;
    private int locId;
    private boolean autorizacao;

    public Autorizacao(int pesId, int locId, boolean autorizacao) {
        this.pesId = pesId;
        this.locId = locId;
        this.autorizacao = autorizacao;
    }

    public int getPesId() {
        return pesId;
    }

    public void setPesId(int pesId) {
        this.pesId = pesId;
    }

    public int getLocId() {
        return locId;
    }

    public void setLocId(int locId) {
        this.locId = locId;
    }

    public boolean isAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(boolean autorizacao) {
        this.autorizacao = autorizacao;
    }
}
