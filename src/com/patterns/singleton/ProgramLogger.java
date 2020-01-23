package com.patterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "--------- This is LogFile --------\n";

    public static ProgramLogger getInstance(){
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public ProgramLogger() {
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
