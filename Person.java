class Person {
  boolean shouldEat(String food){
    System.out.println("Person base class, checking...");
    return true;
  }
}

class Vegan extends Person {
  boolean shouldEat(String food){
    System.out.println("Vegan class, checking...");
    return false;
  }
}

class Vegetarian extends Person {
  boolean shouldEat(String food){
    System.out.println("Vegetarian class, checking...");
    return false;
  }
}

class Runner {
  public static void main(String[] args){
    Person[] people = new Person[4];

    people[0] = new Person();
    people[1] = new Vegetarian();
    people[2] = new Vegan();
    people[3] = new Person();

    for (Person p : people){
      p.shouldEat("Food");
    }
  }
}
