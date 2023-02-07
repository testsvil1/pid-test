# Eliminazione Prospetti Duplicati

### Descrizione casistica
I file dei Pid scaricati dal ministero contengono delle informazioni duplicate:
- FIle duplicati
- Doppi invii
- Rettifihe e annulamenti

##### File Duplicati

Quando si estraggono i file dallo zip inviato da Paramucchi, il programma segnala la presenza di file duplicati

A seconda del programma utilizzato per estrarre i file viene aggiunto un suffisso al nome
7zip xxxx_1   winzip xxxxxx (1)
Vededre quanto è lungo il nome del file (codiceComunicazione) memorizza il codice q quando lo reincontra con eventuali caratteri in esubero eliminare questi file
 
 
##### Doppi Invii

A volta le ditte inviano più volte le comunicazioni obbligatorie. 

Pur essendo comunicazioni di una stessa ditta hanno codice differente. Va considerata solo l'ultimo invio (dovrebbe avere codiceComunicazione più grande)


##### Rettifiche/Annullamenti

Esiste la possibilita di inviare delle rettifiche o annullamenti delle comunicazioni preventivamnte inviate
