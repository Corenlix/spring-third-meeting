package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class SixthLine {

  private SeventhLine seventhLine;

  @Override
  public String toString() {
    return "Never shined through in what I've shown\n" + seventhLine.toString();
  }
}
