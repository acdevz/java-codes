package cloningObjs;

import java.util.Arrays;

public class Human implements Cloneable{
    private int age;
    public int[] dnaC;

    public Human(int age, int[] dnaC) {
        this.age = age;
        this.dnaC = dnaC;
    }

    public Human(Human human){
        this.age = human.age;
        this.dnaC = human.dnaC;
    }

    public String toString(){
        return "I'm " + age + " with DNA code " + Arrays.toString(dnaC) + ".";
    }

    public Object clone() throws CloneNotSupportedException{
        // !! deep copy in process !!
        Human human = (Human)super.clone(); // !! shallow copy !! (only copies the reference)
        human.dnaC = dnaC.clone(); // !! deep copy !!

        return human;
    }
}
