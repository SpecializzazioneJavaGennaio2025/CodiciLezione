Modi per scrivere codice:
- Tramite programmazione imperativa
    - diamo al programma tutte le istruzioni, passo dopo passo, per eseguire una algoritmo, dettagliando molto specificatamente come raggingere il risultato

    numbers = [1,2,3,4,5,6,7,8];
    Integer[] result = [];
    for(Integer n : numbers){
        if(n % 2 == 0){
            result.add(n);
        }
    }

    Dobbiamo necessariamente scriverci sempre tutta la logica connessa

    Passiamo ad un algoritmo(funzione) dei dati che vengono mannipolati e possono CAMBIARE IL PROPRIO STATO(cambiare valore)

    In generale ed in modo netto su ipotetici linguaggi "puri" possiamo dire che:

    Nella programmazione imperativa costruiamo programmi con una sequenza di istruzioni che mutano uno stato

- Tramite programmazione dichirativa
    - Indichiamo al programma cosa vogliamo ottenre, NON IL COME. Sarà il programma a manipolae i dati secondo delle funzioni GIA' ESISTENTI.

    javascript
    numbers = [1,2,3,4,5,6,7,8];
    numbers.filter( el => el % 2 == 0);

    SQL
    select * from books;

    In questa tipologia di programmazione andremo appunto ad affrontare l'approccio funionale cioè utilizzo di comndi a livello dichirativo
    NB non sempre questo approccio risove i nostri problemi

    Con la'pproccio dichiarativo si tende ad astrarre il dato ricevuto, non lavorando mai direttamente sul dato stesso, ma eseguendo quelle che vengono chiamate funzioni pure

    NON PURA
    function somma(num1,num2){
        console.log(num1 + num2);
    }

    PURA
    function somma(num1,num2){
        return num1 + num2;
    }

Data una lista di oggetti di classe Person, filtrare le persone in base al genere

LAMBDA FUNNCTION
parameter -> expression(predicate)
el -> el * 2;

TYPE INFERENCE
a -> a * 2;

NO TYPE INFERENCE
(int a) -> a * 2;

PIù PARAMETRI
(parametro1, parametro2) -> {
    code ...;
    return something;
}

Si dicono first class value (first class citizens)
- Possono essere assegnate a delle variabili
- Posso essere passate come argomento di altre funzioni
- Posso essere restituite da altre funzioni
- Inserite in strutture dati

STREAM
- Uno stream è un flusso (immaginiamo un nastro trasportatore)

Paradigma
- Insiemi di regole da seguire per scrivere codice


