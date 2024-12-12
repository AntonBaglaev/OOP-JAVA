package homework7;

import homework7.controller.Controller;
import homework7.model.Model;
import homework7.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        ViewCalculator view = new ViewCalculator();
        Controller controller = new Controller(model, view);

        controller.processUserInput();
    }
}