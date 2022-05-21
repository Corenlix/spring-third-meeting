package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class FifthLine {

  private SixthLine sixthLine;

  @Override
  public String toString() {
    return "What I've felt, what I've known\n" + sixthLine.toString();
  }
}
