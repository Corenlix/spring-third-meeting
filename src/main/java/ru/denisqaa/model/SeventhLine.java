package ru.denisqaa.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeventhLine {

  private final EighthLine eighthLine;

  @Autowired
  public SeventhLine(EighthLine eighthLine) {
    this.eighthLine = eighthLine;
  }

  @Override
  public String toString() {
    return "Never free, never me\n" + eighthLine.toString();
  }
}
