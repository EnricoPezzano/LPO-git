# Progetto finale LPO a.a. 2020-'21

## Contenuto del repository

* `semantica-statica.ml` : semantica statica del linguaggio esteso, definita in OCaml
* `semantica-dinamica.ml` : semantica dinamica del linguaggio esteso, definita in OCaml
* `specifica.pdf`: specifica del linguaggio esteso, con commenti ed esempi
* `tests/success`: test che vengono eseguiti senza errori senza l'opzione `-ntc`
* `tests/success/ntc`: test che vengono eseguiti senza errori con l'opzione `-ntc`
* `tests/failure/syntax`: test che non passano i controlli di sintassi 
* `tests/failure/type`: test che non passano i controlli di semantica statica (ossia, senza l'opzione `-ntc`)
* `tests/failure/ntc`: test che causano errori dinamici con l'opzione `-ntc`
