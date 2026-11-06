package com.example.f1finalproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.File;

public class f1game extends Application {

    int score = 0;
    int lives = 3;
    Scene homeScene;
    Scene champsScene;
    Scene logosScene;
    Scene helmetsScene;
    Scene tracksScene;
    Scene rulesScene;
    Scene loseScene;

    Button rightAnswer;
    Button wrongAnswer1;
    Button wrongAnswer2;
    Button wrongAnswer3;
    Text right;
    Text wrong1;
    Text wrong2;
    Text wrong3;

    @Override
    public void start(Stage Stage) {

        //home screen
        Text title = new Text("Formula 1 Game");
        title.setFont(Font.font("DIN Condensed", 24));
        title.setLayoutX(140);
        title.setLayoutY(50);
        Text select = new Text("Select a Mode");
        select.setFont(Font.font("DIN Condensed", 20));
        select.setLayoutX(160);
        select.setLayoutY(135);
        Button champs = new Button("CHAMPIONS");
        champs.setFont(Font.font("DIN Condensed", 15));
        champs.setPrefSize(80, 50);
        champs.setLayoutX(75);
        champs.setLayoutY(160);
        champs.setOnAction(event -> Stage.setScene(champsScene));
        Button logos = new Button("LOGOS");
        logos.setFont(Font.font("DIN Condensed", 15));
        logos.setPrefSize(80, 50);
        logos.setLayoutX(250);
        logos.setLayoutY(160);
        logos.setOnAction(event -> Stage.setScene(logosScene));
        Button helmets = new Button("HELMETS");
        helmets.setFont(Font.font("DIN Condensed", 15));
        helmets.setPrefSize(80, 50);
        helmets.setLayoutX(75);
        helmets.setLayoutY(235);
        helmets.setOnAction(event -> Stage.setScene(helmetsScene));
        Button tracks = new Button("TRACKS");
        tracks.setFont(Font.font("DIN Condensed", 15));
        tracks.setPrefSize(80, 50);
        tracks.setLayoutX(250);
        tracks.setLayoutY(235);
        tracks.setOnAction(event -> Stage.setScene(tracksScene));
        Button rules = new Button("HOW TO PLAY");
        rules.setFont(Font.font("DIN Condensed", 15));
        rules.setPrefSize(85, 50);
        rules.setLayoutX(160);
        rules.setLayoutY(335);
        rules.setOnAction(event -> Stage.setScene(rulesScene));
        Group rootHome = new Group(title, select, champs, logos, helmets, tracks, rules);
        homeScene = new Scene(rootHome, 400, 400, Color.WHITE);
        Stage.setTitle("Formula 1 Game");
        Stage.setScene(homeScene);
        Stage.show();

        //championship scene
        Text champsQuestion = new Text("Who won the championship in 1950?");
        champsQuestion.setFont(Font.font("DIN Condensed", 20));
        champsQuestion.setLayoutX(90);
        champsQuestion.setLayoutY(100);
        File homeFile1 = new File("/Users/danimaves/Desktop/f1 quiz/home1.png");
        Image home1 = new Image(homeFile1.toURI().toString());
        ImageView homeButton1 = new ImageView(home1);
        homeButton1.setFitHeight(30);
        homeButton1.setFitWidth(30);
        homeButton1.setLayoutX(20);
        homeButton1.setLayoutY(20);
        homeButton1.setPickOnBounds(true);
        homeButton1.setOnMousePressed(event -> Stage.setScene(homeScene));
        Group rootChamps = new Group(champsQuestion, homeButton1);
        champsScene = new Scene(rootChamps, 400, 400);

        //logos scene
        Text logosQuestion = new Text("Whose logo is this?");
        logosQuestion.setFont(Font.font("DIN Condensed", 20));
        logosQuestion.setLayoutX(140);
        logosQuestion.setLayoutY(100);
        File homeFile2 = new File("/Users/danimaves/Desktop/f1 quiz/home2.png");
        Image home2 = new Image(homeFile2.toURI().toString());
        ImageView homeButton2 = new ImageView(home2);
        homeButton2.setFitHeight(30);
        homeButton2.setFitWidth(30);
        homeButton2.setLayoutX(20);
        homeButton2.setLayoutY(20);
        homeButton2.setPickOnBounds(true);
        homeButton2.setOnMousePressed(event -> Stage.setScene(homeScene));
        Group rootLogos = new Group(logosQuestion, homeButton2);
        logosScene = new Scene(rootLogos, 400, 400);

        //helmets scene
        Text helmetsQuestion = new Text("Who races with this helmet?");
        helmetsQuestion.setFont(Font.font("DIN Condensed", 20));
        helmetsQuestion.setLayoutX(110);
        helmetsQuestion.setLayoutY(100);
        File homeFile3 = new File("/Users/danimaves/Desktop/f1 quiz/home3.png");
        Image home3 = new Image(homeFile3.toURI().toString());
        ImageView homeButton3 = new ImageView(home3);
        homeButton3.setFitHeight(30);
        homeButton3.setFitWidth(30);
        homeButton3.setLayoutX(20);
        homeButton3.setLayoutY(20);
        homeButton3.setPickOnBounds(true);
        homeButton3.setOnMousePressed(event -> Stage.setScene(homeScene));
        Group rootHelmets = new Group(helmetsQuestion, homeButton3);
        helmetsScene = new Scene(rootHelmets, 400, 400);

        //tracks scene
        Text tracksQuestion = new Text("Which track is this?");
        tracksQuestion.setFont(Font.font("DIN Condensed", 20));
        tracksQuestion.setLayoutX(140);
        tracksQuestion.setLayoutY(100);
        File homeFile4 = new File("/Users/danimaves/Desktop/f1 quiz/home4.png");
        Image home4 = new Image(homeFile4.toURI().toString());
        ImageView homeButton4 = new ImageView(home4);
        homeButton4.setFitHeight(30);
        homeButton4.setFitWidth(30);
        homeButton4.setLayoutX(20);
        homeButton4.setLayoutY(20);
        homeButton4.setPickOnBounds(true);
        homeButton4.setOnMousePressed(event -> Stage.setScene(homeScene));
        Group rootTracks = new Group(tracksQuestion, homeButton4);
        tracksScene = new Scene(rootTracks, 400, 400);

        //how to play scene
        Text rulesText = new Text("There are four different types of questions that\n" +
                "can be asked, based on which mode you select.\n" +
                "For each game mode, you will be asked to identify\n" +
                "the correct answer. You are given three lives, and\n" +
                "if you lose all your lives, you lose the game and go\n" +
                "back to the home screen to try again or play a new\n" +
                "mode. Good luck and have fun!");
        rulesText.setFont(Font.font("DIN Condensed", 20));
        rulesText.setLayoutX(50);
        rulesText.setLayoutY(100);
        File homeFile5 = new File("/Users/danimaves/Desktop/f1 quiz/home5.png");
        Image home5 = new Image(homeFile5.toURI().toString());
        ImageView homeButton5 = new ImageView(home5);
        homeButton5.setFitHeight(30);
        homeButton5.setFitWidth(30);
        homeButton5.setLayoutX(20);
        homeButton5.setLayoutY(20);
        homeButton5.setPickOnBounds(true);
        homeButton5.setOnMousePressed(event -> Stage.setScene(homeScene));
        Group rootRules = new Group(rulesText, homeButton5);
        rulesScene = new Scene(rootRules, 400, 400);

        //lose scene
        Text loseText = new Text("You lost all your lives, go home\n" +
                "to try again or play a new mode");
        loseText.setFont(Font.font("DIN Condensed", 20));
        loseText.setLayoutX(100);
        loseText.setLayoutY(100);
        File homeFile6 = new File("/Users/danimaves/Desktop/f1 quiz/home6.png");
        Image home6 = new Image(homeFile6.toURI().toString());
        ImageView homeButton6 = new ImageView(home6);
        homeButton6.setFitHeight(30);
        homeButton6.setFitWidth(30);
        homeButton6.setLayoutX(20);
        homeButton6.setLayoutY(20);
        homeButton6.setPickOnBounds(true);
        homeButton6.setOnMousePressed(event -> Stage.setScene(homeScene));
        Group rootLose = new Group(loseText, homeButton6);
        loseScene = new Scene(rootLose, 400, 400);

    }



}
