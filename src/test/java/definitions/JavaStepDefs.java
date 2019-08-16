package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.Animal;
import pages.Cat;
import pages.Dog;

import java.util.*;

public class JavaStepDefs {
    @Given("I work with classes")
    public void iWorkWithClasses() {

        Animal tom = new Cat("Tom");
        tom.walk();
        tom.sleep();
        tom.eat("fish");
        tom.speak();

        Animal jack = new Dog();
        jack.walk();
        jack.sleep();
        jack.eat("bone");
        jack.speak();

    }
}
