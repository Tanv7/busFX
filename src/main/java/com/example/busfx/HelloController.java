package com.example.busfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    TextField kolvo;
    @FXML
    TextField vysoty;

    @FXML
    Label crash;

    @FXML
    Label noCrash;

    @FXML
    protected void mainCheck() {
        int n = Integer.parseInt(kolvo.getText());
            String strVysoty=vysoty.getText();
            String[] arr=strVysoty.split("");
            int[] heights=new int[];  //или arr.length?

        //?
        boolean wasCrashed=false;
        noCrash.setVisible(! wasCrashed);
        crash.setVisible(wasCrashed);












}