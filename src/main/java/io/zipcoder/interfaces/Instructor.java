package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name){
        super(id,name);
    }

    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learner, double numberOfHours) {

    }
}
st