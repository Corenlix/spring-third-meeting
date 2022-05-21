package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class ThirdLine {

  private FourthLine fourthLine;

  @Override
  public String toString() {
    return "Never be, never see\n" + fourthLine.toString();
  }
}
