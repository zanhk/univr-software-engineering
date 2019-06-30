package dev.matteomeneghetti.sendhelp.utility;

import dev.matteomeneghetti.sendhelp.data.CartellaClinica;
import dev.matteomeneghetti.sendhelp.data.Utente;
import java.util.ArrayList;

public class Database {
    private Utente utenteLoggato;
    private Settings settings;
    private ArrayList<CartellaClinica> pazientiRicoverati;
    
    public Database() {
        utenteLoggato = null;
        settings = new Settings();
        pazientiRicoverati = new ArrayList<>();
    }
}
