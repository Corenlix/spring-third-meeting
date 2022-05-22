package ru.denisqaa.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FourthLine {

  @Autowired
  private FifthLine fifthLine;

  @Override
  public String toString() {
    return "Won't see what might have been\n" + fifthLine.toString();
  }
}
