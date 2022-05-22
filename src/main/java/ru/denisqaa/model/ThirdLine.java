package ru.denisqaa.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ThirdLine {

  private final FourthLine fourthLine;

  public ThirdLine(@Autowired FourthLine fourthLine) {
    this.fourthLine = fourthLine;
  }

  @Override
  public String toString() {
    return "Never be, never see\n" + fourthLine.toString();
  }
}
