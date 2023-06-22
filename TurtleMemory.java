import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import je.fx.util.Turtle;
import javafx.scene.canvas.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.*;
import java.util.Random;
import java.util.Arrays;
import je.NumberField;
import java.util.List;
import java.util.ArrayList;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.geometry.*;
import javafx.scene.image.*;
import javafx.collections.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 06.12.2022
 * @author 
 */

public class TurtleMemory extends Application {
  // Anfang Attribute
  private Turtle turtle1 = new Turtle();
  private Button button2 = new Button();
  private Button button3 = new Button();
  private Button button4 = new Button();
  private Button button5 = new Button();
  private Button button6 = new Button();
  private Button button7 = new Button();
  private Button button8 = new Button();
  private Button button9 = new Button();
  private Button button10 = new Button();
  private Button button11 = new Button();
  private Button button12 = new Button();
  private Button button13 = new Button();
  private Button button14 = new Button();
  private Button button15 = new Button();
  private Button button16 = new Button();
  private Button button17 = new Button();
  private String GameMode = "Tiere";
  private List<Integer> AleadySolvedButtonIndexes = new ArrayList<>();
  private boolean[] StellenAufgedeckt = new boolean[16]; 
  private int LastCardPositionIndex = 0;
  private int[] xPositions = {-280, -87, 89, 285};
  private int[] yPositions = {279, 93, -93, -279};
  private char[] Buchstaben = new char[16];
  private char[] AlleBuchstaben = {'A', 'B', 'C', 'D', 'E','F', 'G','H','I', 'J', 'K', 'L', 'N', 'M', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  private String[] Tiere = new String[16];
  private String[] AlleTiere = {"Huhn", "Schwein", "Ziege", "Otter"};
  private boolean[] BuchstabenBefüllt = new boolean[16];
  private int KartenAnzahlZähler = 0;
  private int score = 0;
  private String LetzteKarte = "*";
  private int Turns = 0;
  private int LowestTurns = 0;
  private Button[] MemoryButtons = {button2, button3, button4, button5, button6,button7,button8, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17};
  
  private Label lTurtleMemory = new Label();
  private Button bStart = new Button();
  private NumberField numberField2 = new NumberField();
  private NumberField numberField3 = new NumberField();
  private Label label1 = new Label();
  private Label lTurns10 = new Label();
  private Button bStartScreen = new Button();
  private Label l10 = new Label();
  private Button bQuit = new Button();
  private Label lCurrentturns = new Label();
  private Label lHighscore = new Label();
  private Button bSettings = new Button();
  private ComboBox<String> comboBox1 = new ComboBox<>();
      private ObservableList<String> comboBox1ObservableList = 
              FXCollections.observableArrayList();
  private Button bZurueckzumHaubtmenue = new Button();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 829, 924);
    // Anfang Komponenten
    
    turtle1.setLayoutX(38);
    turtle1.setLayoutY(62);
    turtle1.setWidth(756);
    turtle1.setHeight(748);
    turtle1.setOriginX(378);
    turtle1.setOriginY(374);
    root.getChildren().add(turtle1);
    turtle1.setAnimated(false);
    button3.setLayoutX(248);
    button3.setLayoutY(96);
    button3.setPrefHeight(145);
    button3.setPrefWidth(147);
    button3.setOnAction(
    (event) -> {button3_Action(event);} 
    );
    root.getChildren().add(button3);
    button4.setLayoutX(432);
    button4.setLayoutY(96);
    button4.setPrefHeight(145);
    button4.setPrefWidth(147);
    button4.setOnAction(
    (event) -> {button4_Action(event);} 
    );
    root.getChildren().add(button4);
    button5.setLayoutX(608);
    button5.setLayoutY(96);
    button5.setPrefHeight(145);
    button5.setPrefWidth(147);
    button5.setOnAction(
    (event) -> {button5_Action(event);} 
    );
    root.getChildren().add(button5);
    button6.setLayoutX(608);
    button6.setLayoutY(272);
    button6.setPrefHeight(145);
    button6.setPrefWidth(147);
    button7.setLayoutX(432);
    button7.setLayoutY(272);
    button7.setPrefHeight(145);
    button7.setPrefWidth(147);
    button8.setLayoutX(248);
    button8.setLayoutY(272);
    button8.setPrefHeight(145);
    button8.setPrefWidth(147);
    button9.setLayoutX(72);
    button9.setLayoutY(272);
    button9.setPrefHeight(145);
    button9.setPrefWidth(147);
    button6.setOnAction(
    (event) -> {button6_Action(event);} 
    );
    root.getChildren().add(button6);
    button7.setOnAction(
    (event) -> {button7_Action(event);} 
    );
    root.getChildren().add(button7);
    button8.setOnAction(
    (event) -> {button8_Action(event);} 
    );
    root.getChildren().add(button8);
    button9.setOnAction(
    (event) -> {button9_Action(event);} 
    );
    root.getChildren().add(button9);
    button10.setLayoutX(609);
    button10.setLayoutY(640);
    button10.setPrefHeight(145);
    button10.setPrefWidth(147);
    button11.setLayoutX(609);
    button11.setLayoutY(456);
    button11.setPrefHeight(145);
    button11.setPrefWidth(147);
    button12.setLayoutX(432);
    button12.setLayoutY(456);
    button12.setPrefHeight(145);
    button12.setPrefWidth(147);
    button13.setLayoutX(432);
    button13.setLayoutY(640);
    button13.setPrefHeight(145);
    button13.setPrefWidth(147);
    button14.setLayoutX(248);
    button14.setLayoutY(456);
    button14.setPrefHeight(145);
    button14.setPrefWidth(147);
    button15.setLayoutX(248);
    button15.setLayoutY(640);
    button15.setPrefHeight(145);
    button15.setPrefWidth(147);
    button16.setLayoutX(72);
    button16.setLayoutY(456);
    button16.setPrefHeight(145);
    button16.setPrefWidth(147);
    button17.setLayoutX(72);
    button17.setLayoutY(640);
    button17.setPrefHeight(145);
    button17.setPrefWidth(147);
    button10.setOnAction(
    (event) -> {button10_Action(event);} 
    );
    root.getChildren().add(button10);
    button11.setOnAction(
    (event) -> {button11_Action(event);} 
    );
    root.getChildren().add(button11);
    button12.setOnAction(
    (event) -> {button12_Action(event);} 
    );
    root.getChildren().add(button12);
    button13.setOnAction(
    (event) -> {button13_Action(event);} 
    );
    root.getChildren().add(button13);
    button14.setOnAction(
    (event) -> {button14_Action(event);} 
    );
    root.getChildren().add(button14);
    button15.setOnAction(
    (event) -> {button15_Action(event);} 
    );
    root.getChildren().add(button15);
    button16.setOnAction(
    (event) -> {button16_Action(event);} 
    );
    root.getChildren().add(button16);
    button17.setOnAction(
    (event) -> {button17_Action(event);} 
    );
    root.getChildren().add(button17);
    button2.setLayoutX(72);
    button2.setLayoutY(96);
    button2.setPrefHeight(145);
    button2.setPrefWidth(147);
    button2.setOnAction(
    (event) -> {button2_Action(event);} 
    );
    root.getChildren().add(button2);
    lTurtleMemory.setLayoutX(203);
    lTurtleMemory.setLayoutY(233);
    lTurtleMemory.setPrefHeight(116);
    lTurtleMemory.setPrefWidth(462);
    lTurtleMemory.setText("Turtle Memory");
    lTurtleMemory.setFont(Font.font("Dialog", 70));
    root.getChildren().add(lTurtleMemory);
    bStart.setLayoutX(311);
    bStart.setLayoutY(317);
    bStart.setPrefHeight(65);
    bStart.setPrefWidth(227);
    bStart.setOnAction(
    (event) -> {bStart_Action(event);} 
    );
    bStart.setText("");
    bStart.setFont(Font.font("Dialog", 50));
    root.getChildren().add(bStart);
    numberField2.setLayoutX(200);
    numberField2.setLayoutY(856);
    numberField2.setPrefHeight(33);
    numberField2.setPrefWidth(67);
    numberField2.setEditable(false);
    numberField2.setMouseTransparent(true);
    numberField2.setFocusTraversable(false);
    numberField2.setFont(Font.font("Dialog", 20));
    numberField2.setAlignment(Pos.CENTER);
    root.getChildren().add(numberField2);
    numberField3.setLayoutX(566);
    numberField3.setLayoutY(852);
    numberField3.setPrefHeight(33);
    numberField3.setPrefWidth(67);
    numberField3.setMouseTransparent(true);
    numberField3.setFocusTraversable(false);
    numberField3.setEditable(false);
    numberField3.setAlignment(Pos.CENTER);
    numberField3.setFont(Font.font("Dialog", 20));
    root.getChildren().add(numberField3);
    label1.setLayoutX(288);
    label1.setLayoutY(344);
    label1.setPrefHeight(76);
    label1.setPrefWidth(270);
    label1.setText("You won!");
    label1.setContentDisplay(ContentDisplay.CENTER);
    label1.setFont(Font.font("Dialog", 60));
    root.getChildren().add(label1);
    lTurns10.setLayoutX(354);
    lTurns10.setLayoutY(561);
    lTurns10.setPrefHeight(28);
    lTurns10.setPrefWidth(118);
    lTurns10.setText("Turns: 10");
    lTurns10.setFont(Font.font("Dialog", 25));
    lTurns10.setContentDisplay(ContentDisplay.CENTER);
    root.getChildren().add(lTurns10);
    bStartScreen.setLayoutX(288);
    bStartScreen.setLayoutY(440);
    bStartScreen.setPrefHeight(81);
    bStartScreen.setPrefWidth(238);
    bStartScreen.setOnAction(
    (event) -> {bStartScreen_Action(event);} 
    );
    bStartScreen.setText("Start Screen");
    bStartScreen.setFont(Font.font("Dialog", 30));
    root.getChildren().add(bStartScreen);
    l10.setLayoutX(398);
    l10.setLayoutY(249);
    l10.setPrefHeight(44);
    l10.setPrefWidth(46);
    l10.setText("10");
    l10.setFont(Font.font("Dialog", 35));
    root.getChildren().add(l10);
    bQuit.setLayoutX(362);
    bQuit.setLayoutY(842);
    bQuit.setPrefHeight(41);
    bQuit.setPrefWidth(115);
    bQuit.setOnAction(
    (event) -> {bQuit_Action(event);} 
    );
    bQuit.setText("Quit");
    bQuit.setFont(Font.font("Dialog", 25));
    root.getChildren().add(bQuit);
    lCurrentturns.setLayoutX(200);
    lCurrentturns.setLayoutY(896);
    lCurrentturns.setPrefHeight(20);
    lCurrentturns.setPrefWidth(70);
    lCurrentturns.setText("current turns");
    lCurrentturns.setContentDisplay(ContentDisplay.CENTER);
    root.getChildren().add(lCurrentturns);
    lHighscore.setLayoutX(568);
    lHighscore.setLayoutY(890);
    lHighscore.setPrefHeight(20);
    lHighscore.setPrefWidth(62);
    lHighscore.setText("high score");
    lHighscore.setContentDisplay(ContentDisplay.CENTER);
    root.getChildren().add(lHighscore);
    bSettings.setLayoutX(552);
    bSettings.setLayoutY(432);
    bSettings.setPrefHeight(89);
    bSettings.setPrefWidth(99);
    bSettings.setOnAction(
      (event) -> {bSettings_Action(event);} 
    );
    bSettings.setText("Settings");
    bSettings.setFont(Font.font("Dialog", 18));
    root.getChildren().add(bSettings);
    comboBox1.setLayoutX(363);
    comboBox1.setLayoutY(378);
    comboBox1.setPrefHeight(27);
    comboBox1.setPrefWidth(120);
    comboBox1.setItems(comboBox1ObservableList);
    comboBox1ObservableList.add("Buchstaben");
    comboBox1ObservableList.add("Tiere");
    comboBox1.setValue("Buchstaben");
    root.getChildren().add(comboBox1);
    bZurueckzumHaubtmenue.setLayoutX(302);
    bZurueckzumHaubtmenue.setLayoutY(444);
    bZurueckzumHaubtmenue.setPrefHeight(65);
    bZurueckzumHaubtmenue.setPrefWidth(203);
    bZurueckzumHaubtmenue.setOnAction(
      (event) -> {bZurueckzumHaubtmenue_Action(event);} 
    );
    bZurueckzumHaubtmenue.setText("Zurück zum Haubtmenü");
    bZurueckzumHaubtmenue.setFont(Font.font("Dialog", 18));
    root.getChildren().add(bZurueckzumHaubtmenue);
    // Ende Komponenten
    
    button2.setStyle("-fx-background-color: transparent;");
    button3.setStyle("-fx-background-color: transparent;");
    button4.setStyle("-fx-background-color: transparent;");
    button5.setStyle("-fx-background-color: transparent;");
    button6.setStyle("-fx-background-color: transparent;");
    button7.setStyle("-fx-background-color: transparent;");
    button8.setStyle("-fx-background-color: transparent;");
    button9.setStyle("-fx-background-color: transparent;");
    button10.setStyle("-fx-background-color: transparent;");
    button11.setStyle("-fx-background-color: transparent;");
    button12.setStyle("-fx-background-color: transparent;");
    button13.setStyle("-fx-background-color: transparent;");
    button14.setStyle("-fx-background-color: transparent;");
    button15.setStyle("-fx-background-color: transparent;");
    button16.setStyle("-fx-background-color: transparent;");
    button17.setStyle("-fx-background-color: transparent;");
    lTurtleMemory.setVisible(false);
    bStart.setStyle("-fx-background-color: transparent;");
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("TurtleMemory");
    primaryStage.setScene(scene);
    primaryStage.show();
    SwitchToStartScreen();
  } // end of public TurtleMemory
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  public void SpielfeldZeichnen() {
    turtle1.moveto(-185, -370);
    turtle1.turnto(0);
    HalbesSpielfeldZeichnen();
    turtle1.turn(-90);
    turtle1.move(555);
    turtle1.turn(180);
    HalbesSpielfeldZeichnen();
  }
  public void KreuzFeldZeichnen(List<Integer> Ausnahmen) {
    for (int x = 0; x < 4; x++) {
      for (int y = 0; y < 4; y++) {
        boolean KannZeichnen = ! Ausnahmen.contains((x + 1) + (y* 4));
        if (KannZeichnen) {
          KreuzZeichnen(xPositions[x], yPositions[y], 150);
        } // end of if
      } 
    } // end of for
  }
  public void HalbesSpielfeldZeichnen() {
    for (int i = 0; i < 3; i++) {
      if (i % 2 == 0) {
        turtle1.turn(90);
        turtle1.draw(732);
        turtle1.turn(-90);
        turtle1.move(185);
      } // end of if 
      if (i % 2 == 1) {
        turtle1.turn(-90);
        turtle1.draw(732);
        turtle1.turn(90);
        turtle1.move(185);
      } // end of if
    }
  }
  public void NewGame() {
    score = 0;
    LastCardPositionIndex = 0;
    MemoryMischen();
    turtle1.clear();
    SpielfeldZeichnen();
    KreuzFeldZeichnen(new ArrayList<>(Arrays.asList()));
    Arrays.fill(StellenAufgedeckt, false);
    Turns = 0;
    numberField2.setInt(Turns);
    numberField3.setInt(LowestTurns);
  }
  
  private void MemoryMischen() {
    AleadySolvedButtonIndexes.clear();
    Arrays.fill(BuchstabenBefüllt, false);
    int Zufallspostion1;
    int Zufallspostion2;
    int Zufallsbchstabe = 0;
    if (GameMode == "Buchstaben") {
      for (int i = 0; i < 8; i++) { 
        Zufallsbchstabe = new Random().nextInt(AlleBuchstaben.length);
        Zufallspostion1 = new Random().nextInt(16);
        while (BuchstabenBefüllt[Zufallspostion1] == true) { 
          Zufallspostion1 = new Random().nextInt(16);
        } // end of while
        BuchstabenBefüllt[Zufallspostion1] = true;
        Zufallspostion2 = new Random().nextInt(15);
        while (BuchstabenBefüllt[Zufallspostion2] == true) { 
          Zufallspostion2 = new Random().nextInt(16);
        } // end of while
        BuchstabenBefüllt[Zufallspostion2] = true;
        Buchstaben[Zufallspostion1] = AlleBuchstaben[Zufallsbchstabe];
        Buchstaben[Zufallspostion2] = AlleBuchstaben[Zufallsbchstabe];
      } // end of for   
    } // end of if  
    if (GameMode == "Tiere") {
      for (int i = 0; i < 8; i++) { 
        Zufallsbchstabe = new Random().nextInt(AlleTiere.length);
        Zufallspostion1 = new Random().nextInt(16);
        while (BuchstabenBefüllt[Zufallspostion1] == true) { 
          Zufallspostion1 = new Random().nextInt(16);
        } // end of while
        BuchstabenBefüllt[Zufallspostion1] = true;
        Zufallspostion2 = new Random().nextInt(15);
        while (BuchstabenBefüllt[Zufallspostion2] == true) { 
          Zufallspostion2 = new Random().nextInt(16);
        } // end of while
        BuchstabenBefüllt[Zufallspostion2] = true;
        Tiere[Zufallspostion1] = AlleTiere[Zufallsbchstabe];
        Tiere[Zufallspostion2] = AlleTiere[Zufallsbchstabe];
      } // end of for   
    } // end of if   
  }
  
  
  private void KreuzZeichnen(double x, double y, int Linienlänge) {
    turtle1.moveto(x, y);
    turtle1.turnto(45);
    HalbesKreuzZeichnen(Linienlänge);
    turtle1.turnto(-45);
    HalbesKreuzZeichnen(Linienlänge);
  }
  private void HalbesKreuzZeichnen(int Linienlänge) {
    turtle1.draw(Linienlänge/2);
    turtle1.turn(180);
    turtle1.draw(Linienlänge);
    turtle1.turn(180);
    turtle1.draw(Linienlänge/2);
  }
  
  
  private void BuchstabenZeichenen(char Buchstabe, int x, int y, int size, boolean OffsetTrue) {
    int XOffset = 0;
    int YOffset = 0;
    turtle1.moveto(x,y);
    if (Buchstabe=='A') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -10.0, (float) 10.0, (float) 0.0, (float) -6.0, (float) 6.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -10.0, (float) -10.0, (float) 12.0, (float) 0.0, (float) 0.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 0, 3, 4));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 11.666667, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe=='B') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -20.0, (float) -20.0, (float) -20.0, (float) -20.793652, (float) -19.0, (float) 3.0, (float) 4.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -78.0, (float) 0.0, (float) 78.0, (float) -78.0, (float) 0.0, (float) 77.0, (float) -5.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 2, -60, 4, 5, -60, 3, 6));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 70.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'C') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) 49.0, (float) -39.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 66.0, (float) -62.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-70, 0, 1));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 80.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'D') {
      if (OffsetTrue) { XOffset = (int) (-0.5714286 * size); YOffset = - (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) 0.0, (float) 0.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 16.0, (float) -16.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(1, 0, -50, 1, 0));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 14.666667, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe =='E') {
      if (OffsetTrue) { XOffset = (int) (-0.6857143 * size); YOffset = (int) (0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) 0.0, (float) 0.0, (float) 0.0, (float) 15.0, (float) 15.0, (float) 15.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 12.0, (float) -12.0, (float) 0.0, (float) 12.0, (float) -12.0, (float) 0.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 1, 0, 3, 1, 4, 2, 5));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 11.666667, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'F') {
      if (OffsetTrue) {
        XOffset = -30;
        YOffset = -60;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)0, (float)0, (float)10, (float)10, (float)0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)10, (float)20, (float)20, (float)10, (float)10));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 2, 3, 4, 5));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'G') {
      if (OffsetTrue) { XOffset = (int) (-0.2857143 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) 62.0, (float) -24.0, (float) 96.0, (float) 15.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 60.0, (float) -66.0, (float) -2.0, (float) -5.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-85, 0, 1, 2, 3));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 80.0, XCoordinates, YCoordinates, Paths);
    }
    if (Buchstabe == 'H') {
      if (OffsetTrue) {
        XOffset = -30;
        YOffset = -60;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)10, (float)10, (float)10, (float)0, (float)0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)0, (float)10, (float)20, (float)10, (float)20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(1,3,2,4,0,5));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'I') {
      if (OffsetTrue) {
        XOffset = 0;
        YOffset = -60;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 1));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'J') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (-0.028571429 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -42.0, (float) 40.0, (float) 40.0, (float) 42.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -36.0, (float) -36.0, (float) 84.0, (float) 84.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-50, 0, 1, 1, 2));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 70.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'K') {
      if (OffsetTrue) {
        XOffset = -20;
        YOffset = -60;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)7, (float)10, (float)7, (float)0, (float)0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0,(float) 0, (float)10, (float)20, (float)10, (float)20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 5, 4, 1, 4, 3));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'L') {
      if (OffsetTrue) {
        XOffset = -25;
        YOffset = -60;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)12, (float)0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)0, (float)20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0,1,0,2));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'N') {
      if (OffsetTrue) {
        XOffset = -30;
        YOffset = -60;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)0, (float)10, (float)10));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)20, (float)0, (float)20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0,1,1,2,2,3));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'O') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) 0.0, (float) 13.0, (float) 0.0, (float) -13.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 72.0, (float) -66.0, (float) -66.0, (float) 72.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-47, 0, 1, -47, 2, 3));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 70.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'P') {
      if (OffsetTrue) { XOffset = (int) (0.25714287 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -7.0, (float) -3.0, (float) -7.0, (float) -7.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -12.0, (float) 12.0, (float) 12.0, (float) 0.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 2, -60, 3, 1));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 11.666667, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'Q') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) 0.0, (float) 0.0, (float) 3.1746032, (float) 6.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 9.0, (float) -9.0, (float) -5.0, (float) -9.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-50, 0, 1, -50, 1, 0, 2, 3));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 10.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'R') {
      if (OffsetTrue) { XOffset = (int) (-0.2857143 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) 0.0, (float) 0.0, (float) 0.0, (float) 21.0, (float) 44.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 66.0, (float) -66.0, (float) 0.0, (float) 66.0, (float) -62.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 1, -60, 2, 3, 2, 4));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 70.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'S') {
      if (OffsetTrue) { XOffset = (int) (0.072571429 * size); YOffset = (int) (-0.25428572 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -49.2, (float) 34.44, (float) 27.06, (float) 0.0, (float) 22.96, (float) -29.52, (float) -4.92, (float) -28.699999, (float) -29.52, (float) 44.28));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -44.28, (float) 54.12, (float) -49.2, (float) -5.74, (float) -3.28, (float) 28.699999, (float) 28.699999, (float) 75.44, (float) -28.699999, (float) 75.44));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-20, 0, 1, -35, 2, 3, 4, 5, -35, 7, 6, -20, 9, 8));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 75.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'M') {
      if (OffsetTrue) {
        XOffset = -35;
        YOffset = -55;
      } // end of if
      float scale = (float)size/(float)12.5;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)0, (float)7.5, (float)15, (float)15));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float)20, (float)0, (float)20, (float)0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0,1,1,2,2,3,3,4));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'T') {
      if (OffsetTrue) {
        XOffset = -58;
        YOffset = -68;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)10, (float) 10, (float) 1, (float) 19));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float) 20, (float) 20, (float) 20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0,1,2,3));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'U') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.21428573 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -42.0, (float) 42.0, (float) 42.0, (float) -42.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -42.0, (float) -42.0, (float) 42.0, (float) 42.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-50, 0, 1, 0, 3, 1, 2));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 63.636364, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'V') {
      if (OffsetTrue) {
        XOffset = -45;
        YOffset = -65;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0, (float) 7.5,(float)15));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)20, (float) 0, (float) 20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0,1,1,2));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'W') {
      if (OffsetTrue) {
        XOffset = -59;
        YOffset = -70;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0,(float) 5,(float)10,(float)15,(float)20));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)20,(float)0,(float)20, (float)0,(float)20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0,1,1,2,2,3,3,4));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'X') {
      if (OffsetTrue) {
        XOffset = -30;
        YOffset = -65;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0,(float)0,(float)10,(float)10));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)0,(float)20,(float)0,(float)20));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0,3,1,2));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'Y') {
      if (OffsetTrue) {
        XOffset = -30;
        YOffset = -65;
      } // end of if
      float scale = (float)size/(float)11.66;
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float)0,(float)5,(float)10,(float)5));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float)20,(float)10,(float)20,(float)0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0,1,1,2,1,3));
      PointDrawer(x + XOffset, y + YOffset, scale, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == 'Z') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = - (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -8.0, (float) 8.0, (float) 8.0, (float) -8.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 10.0, (float) 10.0, (float) -10.0, (float) -10.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 1, 3, 1, 3, 2));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 11.666667, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == ';') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -49.0, (float) -10.0, (float) 17.0, (float) -23.0, (float) -18.0, (float) 0.0, (float) -23.0, (float) -10.0, (float) 25.0, (float) 69.0, (float) 33.0, (float) 87.0, (float) 43.0, (float) 42.0, (float) 57.0, (float) 61.0, (float) 73.0, (float) 18.0, (float) 16.0, (float) 42.0, (float) 43.0, (float) -7.0, (float) -7.0, (float) -5.0, (float) -6.0, (float) 40.0, (float) 40.0, (float) 18.0, (float) 18.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -35.0, (float) -64.0, (float) -20.0, (float) 7.0, (float) -13.0, (float) -26.0, (float) -38.0, (float) -19.0, (float) -19.0, (float) -1.0, (float) -64.0, (float) -51.0, (float) -49.0, (float) -25.0, (float) -43.0, (float) -15.0, (float) -38.0, (float) 61.0, (float) 7.0, (float) 25.0, (float) 13.0, (float) 23.0, (float) 12.0, (float) 49.0, (float) 61.0, (float) 48.0, (float) 58.0, (float) 59.0, (float) 81.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 1, 2, 3, 0, 3, 4, 5, 6, 7, 8, 9, 11, 9, 11, 10, 10, 8, 12, 13, 14, 13, 14, 15, 16, 15, -50, 17, 18, -50, 18, 17, -50, 19, 20, -50, 20, 19, -50, 21, 22, -50, 22, 21, -50, 23, 24, -50, 24, 23, -50, 25, 26, -50, 26, 25, -50, 27, 28, -50, 28, 27));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 70.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    if (Buchstabe == '0') {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -23.0, (float) 23.0, (float) 23.0, (float) -23.0, (float) -4.0, (float) -4.0, (float) 7.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -9.0, (float) -9.0, (float) 9.0, (float) 9.0, (float) -5.0, (float) 5.0, (float) 0.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 1, 2, 3, 0, 3, 4, 5, 6, 5, 6, 4));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 11.666667, XCoordinates, YCoordinates, Paths);
    } // end of if
  }
  
  private void TiereZeichenen(String Tier, int x, int y, int size, boolean OffsetTrue) {
    int XOffset = 0;
    int YOffset = 0;
    turtle1.moveto(x,y);
    if (Tier == "Huhn") {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) 0.0, (float) 0.0, (float) 22.259998, (float) 31.8, (float) 31.8, (float) 31.8, (float) 22.259998, (float) 22.259998, (float) 22.259998, (float) -19.079998, (float) -19.079998, (float) 19.079998, (float) 19.079998, (float) 19.079998, (float) 19.079998, (float) -18.55, (float) -18.55, (float) 0.0, (float) 0.0, (float) -12.719999, (float) 13.779999, (float) -10.599999, (float) 39.749996, (float) -6.8899994, (float) 7.4199996, (float) -34.98, (float) 7.95));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 45.05, (float) -82.149994, (float) -2.6499999, (float) 86.38999, (float) 64.13, (float) 48.229996, (float) 10.07, (float) 22.789999, (float) 25.97, (float) -5.83, (float) 3.7099998, (float) 3.7099998, (float) -5.83, (float) -1.5899999, (float) -0.53, (float) -1.5899999, (float) -0.53, (float) -18.55, (float) -30.739998, (float) -24.909998, (float) -24.909998, (float) -26.499998, (float) -55.119995, (float) -59.889996, (float) -48.76, (float) -28.089998, (float) -59.359997));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-50, 0, 1, -50, 1, 0, -30, 3, 2, -30, 4, 6, -30, 5, 7, -50, 5, 4, -50, 4, 3, -50, 9, 10, -50, 10, 9, -50, 11, 12, -50, 12, 11, -50, 13, 14, -50, 14, 13, -50, 15, 16, -50, 16, 15, 17, 19, 17, 20, 18, 20, 18, 19, -20, 21, 22, -30, 23, 24, -20, 26, 25));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 70.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    
    if (Tier == "Schwein") {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -72.0, (float) 72.0, (float) -30.000002, (float) -64.8, (float) 18.0, (float) -30.000002, (float) -70.8, (float) -85.200005, (float) -36.0, (float) 61.800003, (float) 51.000004, (float) 79.200005, (float) 48.600002, (float) -36.0, (float) 37.800003, (float) -36.600002, (float) -36.600002, (float) 36.600002, (float) 36.600002, (float) -37.2, (float) 36.600002, (float) 40.2, (float) 33.0, (float) 0.6, (float) 18.6, (float) 35.4, (float) -33.0, (float) 3.0, (float) -28.800001, (float) -36.0, (float) -36.600002, (float) 37.2, (float) 36.0, (float) -13.8, (float) -13.8, (float) 13.8, (float) 13.8));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 0.0, (float) 0.0, (float) 0.0, (float) 25.2, (float) -25.2, (float) 30.6, (float) 61.2, (float) 27.000002, (float) 46.800003, (float) 29.400002, (float) 76.200005, (float) 58.2, (float) 6.0, (float) -25.800001, (float) 46.800003, (float) 15.000001, (float) 1.2, (float) 1.2, (float) 15.000001, (float) -32.4, (float) 16.800001, (float) 6.0, (float) -37.2, (float) -9.0, (float) -20.400002, (float) -12.0, (float) -60.000004, (float) -43.800003, (float) -6.6000004, (float) 9.0, (float) 7.8, (float) 8.400001, (float) 7.8, (float) -15.000001, (float) -28.2, (float) -28.2, (float) -15.000001));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-50, 0, 1, -10, 1, 2, -10, 3, 4, -25, 6, 5, -25, 8, 7, -25, 9, 10, -25, 11, 12, -25, 14, 13, -50, 15, 16, -50, 16, 15, -50, 17, 18, -50, 18, 17, -30, 19, 20, -20, 22, 23, -30, 25, 26, -20, 28, 27, -50, 29, 30, -50, 30, 29, -50, 31, 32, -50, 32, 31, -50, 33, 34, -50, 34, 33, -50, 35, 36, -50, 36, 35));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 70.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    
    if (Tier == "Ziege") {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (0.0 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -45.600002, (float) 49.2, (float) -30.000002, (float) -12.0, (float) -73.200005, (float) -130.20001, (float) 46.2, (float) 40.800003, (float) 41.4, (float) 120.00001, (float) 35.4, (float) 79.200005, (float) 64.8, (float) 48.0, (float) -44.4, (float) -30.000002, (float) -55.800003, (float) -74.4, (float) -55.800003, (float) -34.2, (float) -42.600002, (float) -36.0, (float) 36.0, (float) 48.0, (float) 35.4, (float) -12.6, (float) 12.0, (float) 0.0, (float) 0.0, (float) 0.0, (float) -9.0, (float) 9.0, (float) -30.000002, (float) -30.000002, (float) 30.000002, (float) 30.000002, (float) 30.000002, (float) -29.400002, (float) -29.400002, (float) 30.000002, (float) 30.000002));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) -30.000002, (float) 37.2, (float) 53.4, (float) 60.000004, (float) 39.0, (float) 40.2, (float) 21.6, (float) 85.8, (float) 86.4, (float) 9.6, (float) -1.2, (float) 26.400002, (float) 70.200005, (float) 15.000001, (float) 37.2, (float) 58.2, (float) -17.400002, (float) 23.400002, (float) -17.400002, (float) 59.4, (float) 13.8, (float) -45.0, (float) -45.0, (float) 15.000001, (float) 6.0, (float) -61.2, (float) -61.2, (float) -82.8, (float) -63.000004, (float) -39.600002, (float) -30.6, (float) -30.6, (float) 6.6000004, (float) -4.2000003, (float) -4.2000003, (float) 6.6000004, (float) -24.0, (float) 1.2, (float) 0.0, (float) 0.0, (float) 1.2));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-30, 1, 0, -20, 3, 4, -10, 2, 5, -20, 7, 6, -10, 8, 9, -20, 11, 10, -20, 13, 12, -20, 14, 16, -20, 17, 15, 20, 21, 22, 23, -30, 21, 24, 25, 27, 26, 27, 29, 28, 29, 30, 29, 31, -100, 32, 33, -100, 34, 35, -100, 37, 38, -100, 39, 40));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 70.0, XCoordinates, YCoordinates, Paths);
    } // end of if
    
  if (Tier == "Otter") {
      if (OffsetTrue) { XOffset = (int) (0.0 * size); YOffset = (int) (-0.17142858 * size); }
      ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -114.0, (float) 114.0, (float) -69.0, (float) 75.0, (float) -74.79365, (float) -48.0, (float) -63.0, (float) -52.0, (float) 47.0, (float) 0.0, (float) 96.0, (float) -1.0, (float) 0.0, (float) -17.0, (float) 12.0, (float) -61.0, (float) -61.0, (float) 61.0, (float) 61.0, (float) 61.0, (float) 61.0, (float) -61.0, (float) -61.0));
      ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 97.0, (float) -17.0, (float) -457.0, (float) 7.0, (float) 5.0, (float) -112.0, (float) -112.0, (float) 0.0, (float) -111.0, (float) -61.0, (float) -65.0, (float) -60.0, (float) -34.0, (float) -20.0, (float) -20.0, (float) 63.0, (float) 33.0, (float) 33.0, (float) 63.0, (float) 45.0, (float) 48.0, (float) 48.0, (float) 45.0));
      ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(-65, 1, 0, -10, 3, 2, -50, 4, 5, -25, 6, 7, -50, 8, 3, -25, 9, 10, 11, 12, 13, 12, 14, 12, -100, 15, 16, -100, 17, 18, -100, 19, 20, -100, 21, 22));
      PointDrawer(x + XOffset, y + YOffset, (float) size / (float) 125, XCoordinates, YCoordinates, Paths);
  } // end of if
  }
  

  public static float[][] getArcPoints(float startX, float startY, float endX, float endY, float percentage, int n) {
    double cx = (startX + endX) / 2.0;
    double cy = (startY + endY) / 2.0;
    double r = Math.sqrt((startX - endX) * (startX - endX) + (startY - endY) * (startY - endY)) / 2.0;
    double startAngle = Math.atan2(startY - cy, startX - cx);
    double endAngle = Math.atan2(endY - cy, endX - cx);
    double angle = 2 * Math.PI * percentage / 100;
    endAngle = startAngle + angle;
    float[][] points = new float[n][2];
    double angleStep = (endAngle - startAngle) / (n - 1);
    for (int i = 0; i < n; i++) {
      angle = startAngle + i * angleStep;
      double x = cx + r * Math.cos(angle);
      double y = cy + r * Math.sin(angle);
      points[i][0] = (float) x;
      points[i][1] = (float) y;
    }
    return points;
  }

  
  private void nEckZeichnen(int x, int y, int Ecken, float Umfang, int Rotation, float Kreisteil) {
    turtle1.moveto(x,y);
    turtle1.turnto(Rotation);
    for (int i = 0; i < (float) Ecken * Kreisteil; i++) {
      turtle1.draw(Umfang/(float)Ecken);
      turtle1.turn(360/Ecken);
    }
  }
  
  private void PointDrawer(float x, float y, float scale,ArrayList <Float> XCoordinates,ArrayList <Float> YCoordinates,ArrayList <Integer> Paths) {
    turtle1.moveto(x,y);
    for (int i = 0; i < XCoordinates.size(); i++) {
      XCoordinates.set(i , (float) XCoordinates.get(i) * scale);
      YCoordinates.set(i , (float) YCoordinates.get(i) * scale);
    }
    
    for (int i = 0; i < Paths.size(); i+=2) {
      if (Paths.get(i) < 0) {
        float Percentage = Paths.get(i) * -1;
        ArrayList <Float> XEs = new ArrayList<Float>();
        ArrayList <Float> YEs = new ArrayList<Float>();
        ArrayList <Integer> Pathes = new ArrayList<Integer>();
        float[][] Points = getArcPoints(XCoordinates.get(Paths.get(i + 1)),YCoordinates.get(Paths.get(i + 1)),XCoordinates.get(Paths.get(i+2)),YCoordinates.get(Paths.get(i+2)), Percentage, 30);
        for (int f = 0; f < 30; f++) {
          XEs.add(Points[f][0]);
          YEs.add(Points[f][1]);
          if (f > 0) {
            Pathes.add(f - 1);
            Pathes.add(f);
          } // end of if
        }
        for (int f = 0; f < Pathes.size() -1; f+=2) {
          turtle1.moveto(x + XEs.get(Pathes.get(f)),y + YEs.get(Pathes.get(f)));
          turtle1.drawto(x + XEs.get(Pathes.get(f +1)),y + YEs.get(Pathes.get(f+1)));
        }
        i++;
      } // end of if
      else {
        turtle1.moveto(x + XCoordinates.get(Paths.get(i)), y + YCoordinates.get(Paths.get(i)));
        turtle1.drawto(x + XCoordinates.get(Paths.get(i + 1)), y + YCoordinates.get(Paths.get(i + 1)));
      } // end of if-else
    }
  }
  
  private void ButtonService(int ButtonIndex) {
    if (StellenAufgedeckt[ButtonIndex] == false) {
      Turns++;
      numberField2.setInt(Turns);
    } // end of if
    if (! AleadySolvedButtonIndexes.contains(ButtonIndex) && LastCardPositionIndex != ButtonIndex + 1) {
      MemoryKarteChecken(ButtonIndex);
      RedrawService(ButtonIndex + 1);
      KartenelementEnfügen(ButtonIndex);
    } // end of if
    if (score > 7) {
      if (LowestTurns == 0) {
        LowestTurns = Turns;
      } else {
        if (Turns < LowestTurns) {
          LowestTurns = Turns;
          System.out.println("New High Score : " + Turns);
        } // end of if
      } // end of if-else
      numberField3.setInt(LowestTurns);
      DisplayWin();
    } // end of if
  }
  private void KartenelementEnfügen(int ButtonIndex) {
    int XIndex =  ButtonIndex%4;
    int YIndex = ButtonIndex/4;
    if (GameMode == "Buchstaben") {
      BuchstabenZeichenen(Buchstaben[ButtonIndex], xPositions[XIndex], yPositions[YIndex], 70, true);
    } // end of if
    if (GameMode == "Tiere") {
      TiereZeichenen(Tiere[ButtonIndex], xPositions[XIndex], yPositions[YIndex], 70, true);
    } // end of if
    //TiereZeichenen("Schwein", xPositions[XIndex], yPositions[YIndex], 60, true);
  }
  private void RedrawService(int ClickIndex) {
    turtle1.clear();
    SpielfeldZeichnen();
    List<Integer> Ausnahmen = new ArrayList<>();
    for (int i = 0; i < AleadySolvedButtonIndexes.size(); i++) {
      Ausnahmen.add(AleadySolvedButtonIndexes.get(i) + 1);
    }
    Ausnahmen.add(ClickIndex);
    if (LastCardPositionIndex != 0) {
      Ausnahmen.add(LastCardPositionIndex);
    } // end of if 
    
    //Ausnahmen auf StellenAufgedeckt übertragen, damit turns richtig gezählt werden können
    Arrays.fill(StellenAufgedeckt, false);
    for (int i = 0; i < Ausnahmen.size(); i++) {
      StellenAufgedeckt[Ausnahmen.get(i) - 1] = true;
    }
    
    KreuzFeldZeichnen(Ausnahmen);
    for (int i = 0; i < AleadySolvedButtonIndexes.size(); i++) {
      KartenelementEnfügen(AleadySolvedButtonIndexes.get(i));
    }
    if (LastCardPositionIndex != 0) {
      KartenelementEnfügen(LastCardPositionIndex - 1);
    } // end of if
    LastCardPositionIndex = ClickIndex;
  }
  
  private void DisplayWin() {
    turtle1.clear();
    SetWinScreenUIVisibility(true);
    SetMemoryUIVisibility(false);
    setStartScreenUIVisibily(false);
    SetSettingsScreenVisibility(false);
    l10.setText("" + LowestTurns);
    lTurns10.setText("Turns: " + Turns);
    int XOffset = 0; int YOffset = 0;
    ArrayList<Float> XCoordinates = new ArrayList<Float>(Arrays.asList((float) -25.0, (float) 25.0, (float) 25.0, (float) -25.0, (float) -10.0, (float) 10.0, (float) 10.396826, (float) 5.0, (float) 0.0, (float) -5.0, (float) -10.0));
    ArrayList<Float> YCoordinates = new ArrayList<Float>(Arrays.asList((float) 13.0, (float) 13.0, (float) -13.0, (float) -13.0, (float) 17.0, (float) 17.0, (float) 27.0, (float) 22.0, (float) 27.0, (float) 22.0, (float) 27.0));
    ArrayList<Integer> Paths = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 1, 2, 3, 0, 3, 4, 5, 6, 5, 8, 7, 6, 7, 9, 8, 9, 10, 4, 10));
    PointDrawer(XOffset,YOffset, (float)8, XCoordinates, YCoordinates, Paths);
    BuchstabenZeichenen(';', -20,-210, 40, false);
    
  }
  
  public void DisplaySettings() {
    SetWinScreenUIVisibility(false);
    SetMemoryUIVisibility(false);
    setStartScreenUIVisibily(false);
    SetSettingsScreenVisibility(true);
    turtle1.clear();
  }
  
  private void MemoryKarteChecken(int KartenIndex) {
    String Karte = "";
    if (GameMode == "Buchstaben") {
      Karte = "" + Buchstaben[KartenIndex];
    } // end of if
    if (GameMode == "Tiere") {
      Karte = "" + Tiere[KartenIndex];
    } // end of if
    KartenAnzahlZähler++;
    if (KartenAnzahlZähler == 3) {
      LastCardPositionIndex = 0;
      KartenAnzahlZähler = 1;
      turtle1.clear();
      SpielfeldZeichnen();
    } // end of if
    if (KartenAnzahlZähler == 2) {
      if (LetzteKarte.equals(Karte)) {
        score++;
        AleadySolvedButtonIndexes.add(KartenIndex);
        AleadySolvedButtonIndexes.add(LastCardPositionIndex - 1);
      } // end of if
    } // end of if
    if (KartenAnzahlZähler == 1) {
      LetzteKarte = Karte; 
    } // end of if
  }
  
  public void SetWinScreenUIVisibility(boolean visisble) {
    label1.setVisible(visisble);
    l10.setVisible(visisble);
    bStartScreen.setVisible(visisble);
    lTurns10.setVisible(visisble);
  }
  
  public void SetMemoryUIVisibility(boolean visisble) {
    for (int i = 0; i < MemoryButtons.length; i++) {
      MemoryButtons[i].setVisible(visisble);
    }
    numberField2.setVisible(visisble);
    lCurrentturns.setVisible(visisble);
    if (LowestTurns > 0) {
      numberField3.setVisible(visisble);
      lHighscore.setVisible(visisble);    
    } // end of if
    else {
      numberField3.setVisible(false);
      lHighscore.setVisible(false);
    } // end of if-else
    bQuit.setVisible(visisble);
  }
  
  public void setStartScreenUIVisibily(boolean visible) {
    lTurtleMemory.setVisible(visible);
    bStart.setLayoutY(430);
    bStart.setLayoutX(303);
    bStart.setVisible(visible);
    lTurtleMemory.setLayoutY(220);
    bSettings.setVisible(visible);
  }
  
  public void SetSettingsScreenVisibility(boolean visible) {
    comboBox1.setVisible(visible);
    bZurueckzumHaubtmenue.setVisible(visible);
  }
  
  
  public void SwitchToStartScreen() {
    SetWinScreenUIVisibility(false);
    SetMemoryUIVisibility(false);
    SetSettingsScreenVisibility(false);
    setStartScreenUIVisibily(true);
    turtle1.clear();
    BuchstabenZeichenen(';', -20,-180, 50, false);
    BuchstabenZeichenen('0', 0, -40, 60, false);
    nEckZeichnen(-250,-250,4,2000,0,(float)100);
    nEckZeichnen(-250,50,2,1000,0,(float)100);
  }
  
  public void StartGame() {
    setStartScreenUIVisibily(false);
    SetSettingsScreenVisibility(false);
    SetMemoryUIVisibility(true);
    SetWinScreenUIVisibility(false);
    GameMode = comboBox1.getValue();
    NewGame();
  }
  


  public void button2_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(0);
    
  } // end of button2_Action

  public void button3_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(1);
  } // end of button3_Action

  public void button4_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(2);
  } // end of button4_Action

  public void button5_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(3);
  } // end of button5_Action

  public void button6_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(7);
  } // end of button6_Action

  public void button7_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(6);
  } // end of button7_Action

  public void button8_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(5);
  } // end of button8_Action

  public void button9_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(4);
  } // end of button9_Action

  public void button10_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(15);
  } // end of button10_Action

  public void button11_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(11);
  } // end of button11_Action

  public void button12_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(10);
  } // end of button12_Action

  public void button13_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(14);
  } // end of button13_Action

  public void button14_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(9);
  } // end of button14_Action

  public void button15_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(13);
  } // end of button15_Action                                           

  public void button16_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(8);
  } // end of button16_Action

  public void button17_Action(Event evt) {
    // TODO hier Quelltext einfügen
    ButtonService(12);
  } // end of button17_Action

  public void bStart_Action(Event evt) {
    // TODO hier Quelltext einfügen
    StartGame();
  } // end of bStart_Action

  public void bStartScreen_Action(Event evt) {
    // TODO hier Quelltext einfügen
    SwitchToStartScreen();
  } // end of bStartScreen_Action

  public void bQuit_Action(Event evt) {
    // TODO hier Quelltext einfügen
    SwitchToStartScreen();
  } // end of bQuit_Action

  public void bSettings_Action(Event evt) {
    // TODO hier Quelltext einfügen
    DisplaySettings();
  } // end of bSettings_Action

  public void bZurueckzumHaubtmenue_Action(Event evt) {
    // TODO hier Quelltext einfügen
    SwitchToStartScreen();
  } // end of bZurueckzumHaubtmenue_Action

  // Ende Methoden
} // end of class TurtleMemory

