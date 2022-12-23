package uebung13.vzb.ch.zhaw.kanliroj;

import javax.swing.JOptionPane;

public class Joke {
  
  private boolean error;
  private String type;
  private JokeType jokeType;
  private String category;
  private String[] parts;

  private String joke, setup, delivery;

  public boolean isError() {
    return this.error;
  }

  public JokeType getType() {
    this.jokeType = this.jokeType == null ? JokeType.getJokeType(this.type) : this.jokeType;
    return this.jokeType;
  }

  public String getCategory() {
    return this.category;
  }

  public String[] getParts() {
    if (this.parts == null) {
      this.parts = new String[this.getType().getNumberOfParts()];
      this.parts[0] = this.joke == null ? this.setup : this.joke;
      if (this.getType().isMultiPart())
        this.parts[1] = this.delivery;
    }
    return this.parts;
  }

  public String getPart(int part) {
    return this.getParts()[part - 1];
  }

  public void show(int numberOfJokesMade) {
    for (int i = 1; i <= this.getType().getNumberOfParts(); i++)
      JOptionPane.showMessageDialog(null, this.getPart(i), this.getCategory() + " (" + numberOfJokesMade + ")", this.getType().getIconType(i));
  }

}
