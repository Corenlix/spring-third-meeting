package ru.denisqaa.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondLine {

  private ThirdLine thirdLine;

  @Autowired
  public void setThirdLine(ThirdLine thirdLine) {
    this.thirdLine = thirdLine;
  }

  @Override
  public String toString() {
    return "Never shined through in what I've shown\n" + thirdLine.toString();
  }
}
