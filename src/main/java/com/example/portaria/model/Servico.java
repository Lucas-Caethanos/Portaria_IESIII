package com.example.portaria.model;
import java.util.Date;

public class Servico {
    private int id;
    private int morId;
    private int prestId;
    private Date dataInicio;
    private Date dataFim;

    public Servico(int id, int morId, int prestId, Date dataInicio, Date dataFim) {
        this.id = id;
        this.morId = morId;
        this.prestId = prestId;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMorId() {
        return morId;
    }

    public void setMorId(int morId) {
        this.morId = morId;
    }

    public int getPrestId() {
        return prestId;
    }

    public void setPrestId(int prestId) {
        this.prestId = prestId;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
