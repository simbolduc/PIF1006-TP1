package ca.uqtr.pif1006;

import ca.uqtr.pif1006.menu.MainMenu;
import ca.uqtr.pif1006.struct.Automaton;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import org.beryx.textio.TextTerminal;

public class Application {

    public Application(String[] args) {
        TextIO textIO = TextIoFactory.getTextIO();
        TextTerminal<?> terminal = textIO.getTextTerminal();

        new MainMenu(textIO, terminal, new Automaton()).show(); // Afficher le menu principal
    }
}