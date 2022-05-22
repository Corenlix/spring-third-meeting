package ru.denisqaa.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FirstLine {
  @NonNull
  private SecondLine secondLine;

  @Override
  public String toString() {
    return "What I've felt, what I've known\n" + secondLine.toString();
  }
}
