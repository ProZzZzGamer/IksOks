# **IksOks**:
 - ovo je program koji radi tako što uneseš polje od 9 karaktera (naravno 'X', 'O', '_');
 - nakon unosa polja dolazi do analize polje (ko je pobjedio/izgubio, je li neriješeno,
 je li polje dobro postavljeno, je li igra moguća...);
 - **'X'/iks ili 'O'/oks** je pobjedio ako: ima diagonalu sa jedne strane, jedan vodoravan red ili
 horizontalan red;
 - **igra nije završena** kad nema kombinacija ni za 'X' ni za 'O', a ima prazno polje;
 - **igra nije dobro postavljena** ako u igri ima više kombinacija (npr dva reda X-ova, dvije diagonale...);
 - **igra nije moguća** ako je npr. 'X' pobjedio, a ima više O-ova u polju.
