package com.patterns.command;

public class UpdateCommand implements Command {
    Database dataBase;

    public UpdateCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
