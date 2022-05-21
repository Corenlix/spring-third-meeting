package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class FirstLine {

  private SecondLine secondLine;

  @Override
  public String toString() {
    return "What I've felt, what I've known\n" + secondLine.toString();
  }
}
