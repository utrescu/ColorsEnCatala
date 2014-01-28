package net.xaviersala.colors;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Colors {

    private Colors() {
        // Evitar que es crei un objecte d'aquesta classe...
    }

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://ca.wikipedia.org/wiki/Llista_de_colors").get();
        Elements files = doc.select("table.prettytable").select("tr");


        for(Element fila: files) {
            if (fila.select("td").size() != 0) {
                Elements columnes = fila.select("th,td");
                int numColumna = 0;
                for (Element columna: columnes) {
                    numColumna++;
                    if  (columna.tagName() == "th") {
                        System.out.print("INSERT INTO Colors (nom, colorhex,"
                                + "red, green, blue) VALUES (\"" + columna.text() + "\",");

                    } else {
                        switch (numColumna){
                        case 3:
                                System.out.print("\"" + columna.text() + "\"");
                                break;
                        case 4:
                        case 5:
                        case 6:
                                System.out.print("," + columna.text() );
                        default:
                            break;
                        }
                    }
                }
                System.out.println(")");
            }
        }

    }

}

