package ru.denisqaa.model;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SixthLine {

  private final SeventhLine seventhLine;

  @Override
  public String toString() {
    return "Never shined through in what I've shown\n" + seventhLine.toString();
  }
}
