package uebung13.vzb.ch.zhaw.kanliroj;

import java.util.stream.Stream;

import javax.swing.JOptionPane;

public enum JokeType {
  
  SINGLE("single", false, 1, JOptionPane.INFORMATION_MESSAGE),
  TWOPART("twopart", true, 2, JOptionPane.QUESTION_MESSAGE, JOptionPane.WARNING_MESSAGE);

  private final String type;
  private final boolean isMultiPart;
  private final int numberOfParts;
  private final int[] iconTypes;

  private JokeType(String type, boolean isMultiPart, int numberOfParts, int...iconTypes) {
    this.type = type;
    this.isMultiPart = isMultiPart;
    this.numberOfParts = numberOfParts;
    this.iconTypes = iconTypes;
  }
  
  @Override
  public String toString() {
    return type;
  }

  public boolean isMultiPart() {
    return isMultiPart;
  }

  public int getNumberOfParts() {
    return numberOfParts;
  }

  public int getIconType(int part) {
    return iconTypes[part - 1];
  }

  public static JokeType getJokeType(String type) {
    return Stream.of(JokeType.values()).filter(jokeType -> jokeType.type.equals(type)).findFirst().orElse(null);
  }

}
