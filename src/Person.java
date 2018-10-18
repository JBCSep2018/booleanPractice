public class Person {
  private String name;
  private boolean likeFrenchFries;
  private boolean likeSleeping;
  private boolean adventurous;

  public Person() {
  }

  public Person(String name, boolean likeFrenchFries, boolean likeSleeping, boolean adventurous) {
    this.name = name;
    this.likeFrenchFries = likeFrenchFries;
    this.likeSleeping = likeSleeping;
    this.adventurous = adventurous;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean likeFrenchFries() {
    return likeFrenchFries;
  }

  public void setLikeFrenchFries(boolean likeFrenchFries) {
    this.likeFrenchFries = likeFrenchFries;
  }

  public boolean likeSleeping() {
    return likeSleeping;
  }

  public void setLikeSleeping(boolean likeSleeping) {
    this.likeSleeping = likeSleeping;
  }

  public boolean isAdventurous() {
    return adventurous;
  }

  public void setAdventurous(boolean adventurous) {
    this.adventurous = adventurous;
  }
}
