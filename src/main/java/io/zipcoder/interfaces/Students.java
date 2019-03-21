package io.zipcoder.interfaces;

public class Students {

    public final Students instance = new Students();

    private Students(){

        private getInstance(){
            return instance;
        }


    }
}
