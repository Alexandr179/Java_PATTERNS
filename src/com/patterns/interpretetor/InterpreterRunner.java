package com.patterns.interpretetor;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isjavaDeveloper = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer knows JavaCore?: " + isjavaDeveloper.interpret("Java Core"));
        System.out.println("Does developer knows JavaEE?: " + isJavaEEDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("JavaCore");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);
    }
}
