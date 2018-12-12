package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {
    public Label points;
    private Integer sum = 0;

    public void addOne(ActionEvent actionEvent) {
        sum++;
        points.setText("Points: " + sum.toString());
    }

    public void addTen(ActionEvent actionEvent) {
        sum+=10;
        points.setText("Points: " + sum.toString());
    }

    public void addOneHundred(ActionEvent actionEvent) {
        sum+=100;
        points.setText("Points: " + sum.toString());
    }

    public void clear(ActionEvent actionEvent) {
        sum=0;
        points.setText("Points: " + sum.toString());
    }
}
