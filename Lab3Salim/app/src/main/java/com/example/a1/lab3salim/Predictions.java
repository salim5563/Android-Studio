package com.example.a1.lab3salim;

public class Predictions {
    private String[] closePredictions = new String [3];
    private String[] farPredictions = new String[3];

    public Predictions() {
        closePredictions[0] = "В ближайшем будущем вам точно повезёт!";
        closePredictions[1] = "В ближайшем будущем вам, к сожалению, не повезёт...";
        closePredictions[2] = "В ближайшем будущем никаких изменений не будет";

        farPredictions[0] = "В дальнем будущем вас определенно ждёт успех!";
        farPredictions[1] = "Упс... В дальнейшем будущем вас ждёт неудача";
        farPredictions[2] = "В дальнейшем вас ждёт скучное время без перемен";
    }

    public String[] getClosePredictions(){
        return this.closePredictions;
    }

    public String[] getFarPredictions() {
        return this.farPredictions;
    }
}
