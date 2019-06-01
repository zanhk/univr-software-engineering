package dev.matteomeneghetti.sendhelp.data;

/*
La cartella clinica e' il cuore pulsante della gestione dei dati.
Per ogni paziente in fase di ricovero viene aperta una cartella clinica,
nel quale sono inserite generalita' del paziente, prescrizioni di medicinali 
e un record delle relative somministrazioni.
Al termine del ricovero, il primario compila una lettera di dimissioni 
riassuntiva di quanto avvenuto al paziente durante il ricovero e chiude in tal
modo la cartella clinica del ricovero.
*/
public class CartellaClinica {
    
    private Paziente paziente;
    private Prescrizione[] prescrizioni;
    private Somministrazione[] somministrazioni;
    
}
