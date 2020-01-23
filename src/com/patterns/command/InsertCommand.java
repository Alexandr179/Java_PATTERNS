package com.patterns.command;

public class InsertCommand implements Command {
    Database dataBase;

    public InsertCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
