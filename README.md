Es vol crear una base de dades en MySQL que tingui tots els colors en català que hi ha en la pàgina de la Wikipèdia [http://ca.wikipedia.org/wiki/Llista_de_colors](http://ca.wikipedia.org/wiki/Llista_de_colors). 

Per això heu creat una taula en la Base de dades amb l'estructura següent:

![Taula Colors](http://imagizer.imageshack.us/v2/800x600q90/28/g4b8.png "taula")

Desenvolupeu un programa que us generi un fitxer de comandes SQL que permeti inserir tots els colors en la base de dades.

    INSERT INTO colors (nom, colorhex, red, green, blue) VALUES ("vermell", "#FF0000", 255,0,0);
    INSERT INTO colors (nom, colorhex, red, green, blue) VALUES ("verd", "#00FF00", 0,25,0);
    ...
