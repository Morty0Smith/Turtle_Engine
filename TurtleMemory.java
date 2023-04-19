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
  private Button button1 = new Button();
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
  private String GameMode = "Buchstaben";
  private List<Integer> AleadySolvedButtonIndexes = new ArrayList<>();
  private int LastCardPositionIndex = 0;
  private int[] xPositions = {-280, -87, 89, 285};
  private int[] yPositions = {279, 93, -93, -279};
  private char[] Buchstaben = new char[16];
  private char[] AlleBuchstaben = {'A', 'B', 'C', 'D', 'E','F', 'G','H','I', 'J', 'K', 'L', 'N', 'M', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  private boolean[] BuchstabenBefüllt = new boolean[16];
  private int KartenAnzahlZähler = 0;
  private int score = 0;
  private char LetzteKarte = '*';
  private char VorletzteKarte = '*';
  
  private NumberField numberField1 = new NumberField();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 988, 765);
    // Anfang Komponenten
    
    turtle1.setLayoutX(38);
    turtle1.setLayoutY(62);
    turtle1.setWidth(756);
    turtle1.setHeight(748);
    turtle1.setOriginX(378);
    turtle1.setOriginY(374);
    root.getChildren().add(turtle1);
    turtle1.setAnimated(false);
    button1.setLayoutX(853);
    button1.setLayoutY(89);
    button1.setPrefHeight(25);
    button1.setPrefWidth(75);
    button1.setOnAction(
      (event) -> {button1_Action(event);} 
    );
    root.getChildren().add(button1);
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
    numberField1.setLayoutX(857);
    numberField1.setLayoutY(147);
    numberField1.setPrefHeight(25);
    numberField1.setPrefWidth(75);
    root.getChildren().add(numberField1);
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
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("TurtleMemory");
    primaryStage.setScene(scene);
    primaryStage.show();
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
  
  public void button1_Action(Event evt) {
    // TODO hier Quelltext einfügen
    score = 0;
    LastCardPositionIndex = 0;
    numberField1.setInt(score);
    MemoryMischen();
    turtle1.clear();
    SpielfeldZeichnen();
    KreuzFeldZeichnen(new ArrayList<>(Arrays.asList()));
  } // end of button1_Action
  
  private void MemoryMischen() {
    AleadySolvedButtonIndexes.clear();
    Arrays.fill(BuchstabenBefüllt, false);
    int Zufallspostion1;
    int Zufallspostion2;
    int Zufallsbchstabe;
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
    if(Ecken > 20) {
    }
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
    if (! AleadySolvedButtonIndexes.contains(ButtonIndex) && LastCardPositionIndex != ButtonIndex + 1) {
      if (GameMode == "Buchstaben") {
      MemoryKarteChecken(ButtonIndex);
      RedrawService(ButtonIndex + 1);
      BuchstabenEnfügen(ButtonIndex);
      } // end of if
    } // end of if
  }
  private void BuchstabenEnfügen(int ButtonIndex) {
    int XIndex =  ButtonIndex%4;
    int YIndex = ButtonIndex/4;
    BuchstabenZeichenen(Buchstaben[ButtonIndex], xPositions[XIndex], yPositions[YIndex], 70, true);
    //BuchstabenZeichenen('L', xPositions[XIndex], yPositions[YIndex], 70, true);
  }
  private void RedrawService(int ClickIndex) {
    turtle1.clear();
    SpielfeldZeichnen();
    List<Integer> Ausnahmen = new ArrayList<>();
    for (int i = 0; i < AleadySolvedButtonIndexes.size(); i++) {
      Ausnahmen.add(AleadySolvedButtonIndexes.get(i) + 1);
    }
    Ausnahmen.add(ClickIndex);
    Ausnahmen.add(LastCardPositionIndex);
    KreuzFeldZeichnen(Ausnahmen);
    for (int i = 0; i < AleadySolvedButtonIndexes.size(); i++) {
      BuchstabenEnfügen(AleadySolvedButtonIndexes.get(i));
    }
    if (LastCardPositionIndex != 0) {
      BuchstabenEnfügen(LastCardPositionIndex - 1);
    } // end of if
    LastCardPositionIndex = ClickIndex;
  }
  
  private void MemoryKarteChecken(int KartenIndex) {
    char Karte = Buchstaben[KartenIndex];
    KartenAnzahlZähler++;
    if (KartenAnzahlZähler == 3) {
      LastCardPositionIndex = 0;
      KartenAnzahlZähler = 1;
      turtle1.clear();
      SpielfeldZeichnen();
    } // end of if
    if (KartenAnzahlZähler == 2) {
      if (LetzteKarte == Karte) {
        score++;
        AleadySolvedButtonIndexes.add(KartenIndex);
        AleadySolvedButtonIndexes.add(LastCardPositionIndex - 1);
        numberField1.setInt(score);
      } // end of if
    } // end of if
    if (KartenAnzahlZähler == 1) {
      LetzteKarte = Karte; 
    } // end of if
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

  // Ende Methoden
} // end of class TurtleMemory

