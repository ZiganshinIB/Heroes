package controller;

import model.base.AbstractFabricModel;
import model.base.Hero;
import view.base.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class MyController {

    private List<String> commandList;
    private AbstractFabricModel models;
    private ConsoleView consoleView;



    public MyController(AbstractFabricModel models, ConsoleView consoleView){
        this.models = models;
        this.consoleView = consoleView;
        upload();
    }

    public void start(){
        int numberCommand = consoleView.getCommandNumber();
        while (numberCommand != ConsoleView.getStop_CODE_COMMAND()){
            compel(numberCommand);
            numberCommand = consoleView.getCommandNumber();
        }
    }

    private List<String> getCommandList(){
        commandList = new ArrayList<>();
        commandList.add("Создать героя");
        return commandList;
    }


    public void compel(int commandIndex){
        switch (commandIndex){
            case 0:
                createHero();
                break;
        }
    }

    private void createHero(){
        consoleView.showMessage("Выбирете героя:");
        consoleView.showSimpleList(models.getAllType());
        String cast = consoleView.getString("\t");
        if (!models.content(cast)){
            consoleView.showMessage("Нету такой касты!");
            createHero();
            return;
        }
        String name = consoleView.getString("Введите имя героя");
        if (models.content(cast, name)){
            consoleView.showMessage("Персонаж с таким именем имеется!!");
            createHero();
            return;
        }
        models.addModel(models.createModel(cast, name));
    }


    protected void upload(){
        consoleView.setCommandList(getCommandList());
    }
}
