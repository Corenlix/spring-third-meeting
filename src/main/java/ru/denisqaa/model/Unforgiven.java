package ru.denisqaa.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Unforgiven {
  private FirstLine firstLine;

  public String writeSongText() {
    return firstLine.toString();
  }
}
