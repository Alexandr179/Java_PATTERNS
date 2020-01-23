package com.patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();// можно делать др.разрабов от интерфейса, или DECORATOR
        System.out.println(developer.makeJob());

        Developer developer2 = new SeniorJavaDeveloper(new JavaDeveloper());// во факту декорируем ->JavaDeveloper
        System.out.println(developer2.makeJob());

        Developer developer3 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer3.makeJob());
    }
}
