import Presentation.MainMenu;
import Presentation.Menu;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        Menu menu = new MainMenu();

        do {
           menu= menu.action();
        }while (true);

        }

}
