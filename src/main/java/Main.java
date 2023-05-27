import controller.MyController;
import model.base.AbstractFabricModel;
import model.base.HeroFactory;
import model.base.HeroType;
import view.ConsoleViewUser;
import view.base.ConsoleView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");

        Scanner scanner = new Scanner(System.in);
        AbstractFabricModel models = new HeroFactory();
        ConsoleView consoleView = new ConsoleViewUser(scanner);
        MyController controller = new MyController(models, consoleView);
        controller.start();
    }
}
