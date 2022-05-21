package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class SecondLine {

  private ThirdLine thirdLine;

  @Override
  public String toString() {
    return "Never shined through in what I've shown\n" + thirdLine.toString();
  }
}
