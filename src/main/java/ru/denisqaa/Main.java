package ru.denisqaa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.denisqaa.config.AppConfiguration;
import ru.denisqaa.model.Unforgiven;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfiguration.class);
    Unforgiven unforgiven =
        applicationContext.getBean(Unforgiven.class);
    System.out.println(unforgiven.writeSongText());
  }
}
