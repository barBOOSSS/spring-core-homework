package by.pleshkov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Archer archer = context.getBean(Archer.class);
        System.out.println(archer);
    }
}