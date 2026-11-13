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

    int score;
    int lives;

    Scene homeScene;
    Scene questionsScene;
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
        champs.setOnAction(event -> {
            Stage.setScene(questionsScene);
            champsQuestions();
        });
        Button logos = new Button("LOGOS");
        logos.setFont(Font.font("DIN Condensed", 15));
        logos.setPrefSize(80, 50);
        logos.setLayoutX(250);
        logos.setLayoutY(160);
        logos.setOnAction(event -> {
            Stage.setScene(questionsScene);
            logosQuestions();
        });
        Button helmets = new Button("HELMETS");
        helmets.setFont(Font.font("DIN Condensed", 15));
        helmets.setPrefSize(80, 50);
        helmets.setLayoutX(75);
        helmets.setLayoutY(235);
        helmets.setOnAction(event -> {
            Stage.setScene(questionsScene);
            helmetsQuestions();
        });
        Button tracks = new Button("TRACKS");
        tracks.setFont(Font.font("DIN Condensed", 15));
        tracks.setPrefSize(80, 50);
        tracks.setLayoutX(250);
        tracks.setLayoutY(235);
        tracks.setOnAction(event -> {
            Stage.setScene(questionsScene);
            trackQuestions();
        });
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

        //questions scene
        Text question = new Text("Question: ");
        question.setFont(Font.font("DIN Condensed", 20));
        question.setLayoutX(90);
        question.setLayoutY(100);
        Text scoreDisplay = new Text("Score: " + score);
        scoreDisplay.setFont(Font.font("DIN Condensed", 20));
        scoreDisplay.setLayoutX(160);
        scoreDisplay.setLayoutY(40);
        Text livesDisplay = new Text("Lives: " + lives);
        livesDisplay.setFont(Font.font("DIN Condensed", 20));
        livesDisplay.setLayoutX(300);
        livesDisplay.setLayoutY(40);
        File homeFile1 = new File("/Users/danimaves/Desktop/f1 quiz/home1.png");
        Image home1 = new Image(homeFile1.toURI().toString());
        ImageView homeButton1 = new ImageView(home1);
        homeButton1.setFitHeight(30);
        homeButton1.setFitWidth(30);
        homeButton1.setLayoutX(20);
        homeButton1.setLayoutY(20);
        homeButton1.setPickOnBounds(true);
        homeButton1.setOnMousePressed(event -> Stage.setScene(homeScene));
        Group rootQuestion = new Group(question, scoreDisplay, livesDisplay,
         rightAnswer, wrongAnswer1, wrongAnswer2, wrongAnswer3);
        questionsScene = new Scene(rootQuestion, 400, 400);


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

    private void champsQuestions() {

    }

    private void logosQuestions() {

    }

    private void helmetsQuestions() {

    }

    private void trackQuestions() {

    }

}
