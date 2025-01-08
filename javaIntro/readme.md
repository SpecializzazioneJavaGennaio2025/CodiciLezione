Java è case sensitive

Prima regola, il nome del file deve seguire le regole di nomenclatura delle classi e deve corrispondere esatamente al nome dell'unica classe che il file contiene

Modificatore di accesso: public, private, package, protected

Funzione statica non dipende dall'oggetto di cui fa parte ma dipende dalla classe
Funzioni e metodi statici posso essere utilizzati richiamando direttamente la classe e non necessariamente avere un oggetto su cui richiamarli

In java è fondamentale sppecificare che tipo di dato restituisce una funzione se non restituisce nulla si dice restituire un void, vuol dire banalmente che non ha la return

Tipi di ritorno es:
int, string, long .........


String[] args -> è il parametro formale della funzione main che corrisponde ad un array di stringhe ("concatenazione di caratteri")

Linguaggi Compilati e Interpretati
Interpretati -> Letto ed eseguito (Errore a runtime a tempo di esecuzione)
Compilato -> Prima letto per intero e SE NON CI SONO ERRORI viene creato il bytecode (l'errore viene visto a compile time)

.java -> file che contiene il codice
.class -> bytecode

javac -> chiamo il compilatore
java -> chiamo la jvm

Type system di Java
Possiamo suddividerlo in:
- come effettua le verifiche sui tipi di dato che stiamo utilizzando:
    - verifica statica (a compile time)
    - verifica dinamica (a run time)
- come effettua le verifiche sulla correttezza dei dati che sto utilizzando
    - forte (vuol dire che dobbiamo dirgli sempre il tipo del dato, sempre il tipo del dato di ritorno di una funzione)
    - debole (Non devo necessarimaente dirgli la tipologia del dato)

Forte è a tipizzazione statica e forte

Casting
- si trasfomra un tipo di dato più piccolo in uno più grande

Il casting implicito avviene grazie ad un meccanismo di java chiamato Type Inference

Ogni tipo di dato primitivo possiede un classe chiamata wrapper
Cioè una classe che incapsula il dato primitivo e lo trasforma in un oggetto
Tutti i tipi primitivi posseggono una classe wrapper ad esempio int possiede Integer
Ma perchè esiste??????????????????
Per poter gestire anche valori nulli nelle logiche

La classe Arrays è una classe creata in java per gestire gli array


Keep
It
Simple
STUPID


java.util -> contiente una varietà immensa di classi di utilità e manipolazione
java.util è un Package

thread -> piccolo nucleo di esecuzione del nostro programma

se il dato è una istanza della classe String 
    ..................fai qualcosa
se invece è una istanza della classe Integer
    .....................fai altro