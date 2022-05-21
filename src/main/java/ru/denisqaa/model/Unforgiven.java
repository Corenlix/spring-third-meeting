package ru.denisqaa.model;

import org.springframework.stereotype.Component;

@Component
public class Unforgiven {
  private FirstLine firstLine;

  public String writeSongText() {
    return firstLine.toString();
  }
}
