package com.patterns.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getInstance().toString());
        System.out.println(ProgramLogger.getInstance().toString());
        System.out.println(ProgramLogger.getInstance().toString());

        ProgramLogger.getInstance().addLogInfo("First LOgInfo ..");
        ProgramLogger.getInstance().addLogInfo("Second LOgInfo ..");
        ProgramLogger.getInstance().addLogInfo("Third LOgInfo ..");

        ProgramLogger.getInstance().showLogFile();
    }
}
