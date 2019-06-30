package dev.matteomeneghetti.sendhelp.utility;

public class Settings {
    private int frequenzaPressione = 120;
    private int frequenzaBPM = 300;
    private int frequenzaTemperatura = 180;

    public int getFrequenzaPressione() {
        return frequenzaPressione;
    }

    public void setFrequenzaPressione(int frequenzaPressione) {
        this.frequenzaPressione = frequenzaPressione;
    }

    public int getFrequenzaBPM() {
        return frequenzaBPM;
    }

    public void setFrequenzaBPM(int frequenzaBPM) {
        this.frequenzaBPM = frequenzaBPM;
    }

    public int getFrequenzaTemperatura() {
        return frequenzaTemperatura;
    }

    public void setFrequenzaTemperatura(int frequenzaTemperatura) {
        this.frequenzaTemperatura = frequenzaTemperatura;
    }
    
}