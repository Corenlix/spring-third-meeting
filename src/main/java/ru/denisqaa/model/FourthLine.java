package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class FourthLine {

  private FifthLine fifthLine;

  @Override
  public String toString() {
    return "Won't see what might have been\n" + fifthLine.toString();
  }
}
