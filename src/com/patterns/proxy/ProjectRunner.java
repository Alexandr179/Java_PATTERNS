package com.patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
//        Project project = new RealProject("https://www.github.com/user/realproject");
//        // загружать(RealProject загружается в конструкторе)! нужно однако не при содании проекта, а только при запуске
//        project.ran();

        Project project = new ProxyProject("https://www.github.com/user/realproject");
        project.ran();
    }
}
