import java.util.LinkedList;
import java.util.List;

void main() {

    List<Elev> elever = new LinkedList<Elev>();

    for (int i = 0; i <= 99; i++) {
        
        Elev e = new Elev();

        e.fornamn = "Hubert" + i;
        e.efternamn = "Andersson" + i;

        elever.add(e);
    }
    

    // /// //// ///

    while (true) {
        IO.println("Vilken elev vill du hitta?");
        IO.println("Skriv deras för- eller efternamn");
        
        String elev = IO.readln();

        for (int i = 0; i < elever.size(); i++) {
            String f = elever.get(i).fornamn;
            String e = elever.get(i).efternamn;

            if (elev.equalsIgnoreCase(f) || elev.equalsIgnoreCase(e)) {
                IO.println(f + " " + e);
            }
        }
    }

}

