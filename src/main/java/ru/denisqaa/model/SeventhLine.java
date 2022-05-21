package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class SeventhLine {

  private EighthLine eighthLine;

  @Override
  public String toString() {
    return "Never free, never me\n" + eighthLine.toString();
  }
}
