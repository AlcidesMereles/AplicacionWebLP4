/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageBeans;

/**
 *
 * @author Neuschwanstein
 */
public class EncuestaBeans {
    private int idCandidato;
    private String nombreCandidato;
    private int totalVotos;

    public EncuestaBeans() {
    }

    public EncuestaBeans(String nombreCandidato, int totalVotos) {
        this.nombreCandidato = nombreCandidato;
        this.totalVotos = totalVotos;
    }

    public EncuestaBeans(int idCandidato, String nombreCandidato, int totalVotos) {
        this.idCandidato = idCandidato;
        this.nombreCandidato = nombreCandidato;
        this.totalVotos = totalVotos;
    }

    
    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }
}
