# ECOtoll
Il progetto, sviluppato da Alessandro D'Orazio, è l'homework da sviluppare per "Object Oriented Software Design".
Per avviare l'applicazione, utilizzare la classe Program.

## Veicoli
I veicoli non hanno metodi set poiché non è previsto che l'autostrada possa modificare i dati di un veicolo dopo la sua registrazione.
Il pedaggio extra influisce sul calcolo del pedaggio sommando il suo valore a quello della tariffa unitaria, prima di moltiplicare quest'ultima con i km.
Per creare un veicolo bisogna utilizzare il metodo nuovoVeicolo;

## Autostrada
La tipologia dell'autostrada influisce sul calcolo del pedaggio come moltiplicatore della tariffa unitaria.

I caselli sono gestiti tramite TreeMap, dove la chiave è il km del casello e il valore è il nome del casello.

## Utenti
Ogni utente ha un nome e un veicolo associato. Può calcolare il pedaggio solamente del suo veicolo, mentre gli admin possono calcolare i pedaggi di qualsiasi veicolo.

Per **autenticarsi come admin** inserire lo username "admin"

### Operazioni ammesse
Admin: Aggiunta di un casello, calcolo del pedaggio, aggiunta del proprio veicolo, visualizzazione di tutte i caselli

Utenti: calcolo del pedaggio, aggiunta del proprio veicolo