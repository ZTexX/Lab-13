import java.io.*;

class Lab13A {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int numOfLegs;
    boolean rolling;
    String material;

    System.out.println("You are about to create a chair.");
    System.out.print("How many legs does your chair have: ");
    numOfLegs = Integer.parseInt(br.readLine());

    System.out.print("Is your chair rolling (true/false): ");
    rolling = br.readLine().equalsIgnoreCase("true");

    System.out.print("What is your chair made of: ");
    material = br.readLine();

    Chair chair = new Chair(numOfLegs, rolling, material);

    System.out.println("\n" + chair);
    System.out.println("\nThis program is going to change that.");

    chair.numOfLegs = 4;
    chair.rolling = false;
    chair.material = "wood";

    System.out.println("\n" + chair);
  }
}

class Chair {
  public int numOfLegs;
  public boolean rolling;
  public String material;

  public Chair(int numOfLegs, boolean rolling, String material) {
    this.numOfLegs = numOfLegs;
    this.rolling = rolling;
    this.material = material;
  }

  public String toString() {
    String isRolling = rolling ? "is rolling" : "is not rolling";
    return String.format("Your chair has %d legs, %s, and is made of %s.", numOfLegs, isRolling, material);
  }
}