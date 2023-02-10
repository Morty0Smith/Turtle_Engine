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
import javafx.scene.text.*;
import javafx.scene.text.Font;
import java.util.List;
import java.util.ArrayList;
import je.NumberField;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 04.02.2023
 * @author 
 */

public class TurtleDesigner extends Application {
  // Anfang Attribute
  private Turtle turtle1 = new Turtle();
  private Button bNewGraphic = new Button();
  private CheckBox checkBox1 = new CheckBox();
  private Label lEnablePreviewCenter = new Label();
  private Label lTurtleDesigner2023 = new Label();
  ArrayList<Float> XCoordinates = new ArrayList<Float>();
  ArrayList<Float> YCoordinates = new ArrayList<Float>();
  ArrayList<Integer> Paths = new ArrayList<Integer>();
  private NumberField numberField1 = new NumberField();
  private NumberField numberField2 = new NumberField();
  private Label lX1 = new Label();
  private Label lY = new Label();
  private CheckBox checkBox2 = new CheckBox();
  private Label lEnablePreviewPoints = new Label();
  private Button bAddToPoints = new Button();
  private Button bPreview = new Button();
  private Label lExistingPoints1 = new Label();
  private TextArea textArea1 = new TextArea();
  private Button bRefresh = new Button();
  private Label lPoints = new Label();
  private Label lPaths = new Label();
  private Label lPathStart1 = new Label();
  private NumberField numberField3 = new NumberField();
  private NumberField numberField4 = new NumberField();
  private Label lPathEnd = new Label();
  private Button bAddToPaths = new Button();
  private Button bPreview1 = new Button();
  private CheckBox checkBox3 = new CheckBox();
  private Label lMakeCurve = new Label();
  private Label lCurveAmmount1 = new Label();
  private TextArea textArea2 = new TextArea();
  private Label lExistingPaths = new Label();
  
  float percent = 10;
  private int numberPaths = -1;
  float scale = 0;
  int OffsetX = 0;
  int OffsetY = 0;
  
  private NumberField numberField5 = new NumberField();
  private Label l = new Label();
  private Button bGenerateCode = new Button();
  private TextArea textArea3 = new TextArea();
  private NumberField numberField6 = new NumberField();
  private NumberField numberField7 = new NumberField();
  private Button bSave = new Button();
  private Button bSave1 = new Button();
  private Label lScale1 = new Label();
  private Label lOffset = new Label();
  private NumberField numberField8 = new NumberField();
  private Label lX = new Label();
  private Label lY2 = new Label();
  private Button bApply = new Button();
  private Button bApply1 = new Button();
  private Label lEdit = new Label();
  private NumberField numberField9 = new NumberField();
  private NumberField numberField10 = new NumberField();
  private NumberField numberField11 = new NumberField();
  private Button bPreview2 = new Button();
  private Button bApply2 = new Button();
  private Label lX2 = new Label();
  private Label lIndex = new Label();
  private Label lY1 = new Label();
  private Slider slider1 = new Slider(0, 100, 0);
  private Slider slider2 = new Slider(0, 100, 0);
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 1425, 1004);
    // Anfang Komponenten
    
    turtle1.setLayoutX(158);
    turtle1.setLayoutY(125);
    turtle1.setWidth(596);
    turtle1.setHeight(548);
    turtle1.setOriginX(298);
    turtle1.setOriginY(274);
    root.getChildren().add(turtle1);
    turtle1.setAnimated(false);
    bNewGraphic.setLayoutX(1056);
    bNewGraphic.setLayoutY(119);
    bNewGraphic.setPrefHeight(33);
    bNewGraphic.setPrefWidth(91);
    bNewGraphic.setOnAction(
      (event) -> {bNewGraphic_Action(event);} 
    );
    bNewGraphic.setText("New Graphic");
    root.getChildren().add(bNewGraphic);
    checkBox1.setLayoutX(1166);
    checkBox1.setLayoutY(124);
    checkBox1.setPrefHeight(25);
    checkBox1.setPrefWidth(16);
    checkBox1.setText("");
    checkBox1.setFont(Font.font("Dialog", 12));
    checkBox1.setSelected(true);
    root.getChildren().add(checkBox1);
    lEnablePreviewCenter.setLayoutX(1191);
    lEnablePreviewCenter.setLayoutY(125);
    lEnablePreviewCenter.setPrefHeight(20);
    lEnablePreviewCenter.setPrefWidth(142);
    lEnablePreviewCenter.setText("Enable Preview Center");
    root.getChildren().add(lEnablePreviewCenter);
    lTurtleDesigner2023.setLayoutX(136);
    lTurtleDesigner2023.setLayoutY(16);
    lTurtleDesigner2023.setPrefHeight(81);
    lTurtleDesigner2023.setPrefWidth(1073);
    lTurtleDesigner2023.setText("Turtle Designer 2023");
    lTurtleDesigner2023.setContentDisplay(ContentDisplay.CENTER);
    lTurtleDesigner2023.setFont(Font.font("Dialog", FontWeight.BOLD, 55));
    root.getChildren().add(lTurtleDesigner2023);
    numberField1.setLayoutX(970);
    numberField1.setLayoutY(319);
    numberField1.setPrefHeight(25);
    numberField1.setPrefWidth(59);
    root.getChildren().add(numberField1);
    numberField2.setLayoutX(1069);
    numberField2.setLayoutY(320);
    numberField2.setPrefHeight(25);
    numberField2.setPrefWidth(59);
    root.getChildren().add(numberField2);
    lX1.setLayoutX(944);
    lX1.setLayoutY(320);
    lX1.setPrefHeight(25);
    lX1.setPrefWidth(25);
    lX1.setText("X :");
    lX1.setFont(Font.font("Dialog", 15));
    root.getChildren().add(lX1);
    lY.setLayoutX(1040);
    lY.setLayoutY(320);
    lY.setPrefHeight(25);
    lY.setPrefWidth(25);
    lY.setText("Y :");
    lY.setFont(Font.font("Dialog", 15));
    root.getChildren().add(lY);
    checkBox2.setLayoutX(1080);
    checkBox2.setLayoutY(247);
    checkBox2.setPrefHeight(17);
    checkBox2.setPrefWidth(29);
    checkBox2.setText("");
    checkBox2.setSelected(true);
    root.getChildren().add(checkBox2);
    lEnablePreviewPoints.setLayoutX(1104);
    lEnablePreviewPoints.setLayoutY(246);
    lEnablePreviewPoints.setPrefHeight(20);
    lEnablePreviewPoints.setPrefWidth(126);
    lEnablePreviewPoints.setText("Enable Preview Points");
    root.getChildren().add(lEnablePreviewPoints);
    bAddToPoints.setLayoutX(1146);
    bAddToPoints.setLayoutY(319);
    bAddToPoints.setPrefHeight(25);
    bAddToPoints.setPrefWidth(99);
    bAddToPoints.setOnAction(
      (event) -> {bAddToPoints_Action(event);} 
    );
    bAddToPoints.setText("Add To Points");
    root.getChildren().add(bAddToPoints);
    bPreview.setLayoutX(1254);
    bPreview.setLayoutY(317);
    bPreview.setPrefHeight(25);
    bPreview.setPrefWidth(75);
    bPreview.setOnAction(
      (event) -> {bPreview_Action(event);} 
    );
    bPreview.setText("Preview");
    root.getChildren().add(bPreview);
    lExistingPoints1.setLayoutX(1106);
    lExistingPoints1.setLayoutY(349);
    lExistingPoints1.setPrefHeight(20);
    lExistingPoints1.setPrefWidth(86);
    lExistingPoints1.setText("Existing Points:");
    root.getChildren().add(lExistingPoints1);
    textArea1.setLayoutX(1039);
    textArea1.setLayoutY(376);
    textArea1.setPrefHeight(100);
    textArea1.setPrefWidth(200);
    textArea1.setEditable(false);
    root.getChildren().add(textArea1);
    bRefresh.setLayoutX(430);
    bRefresh.setLayoutY(726);
    bRefresh.setPrefHeight(25);
    bRefresh.setPrefWidth(75);
    bRefresh.setOnAction(
      (event) -> {bRefresh_Action(event);} 
    );
    bRefresh.setText("Refresh");
    root.getChildren().add(bRefresh);
    lPoints.setLayoutX(1114);
    lPoints.setLayoutY(193);
    lPoints.setPrefHeight(36);
    lPoints.setPrefWidth(110);
    lPoints.setText("Points");
    lPoints.setContentDisplay(ContentDisplay.CENTER);
    lPoints.setFont(Font.font("Dialog", FontPosture.ITALIC, 30));
    root.getChildren().add(lPoints);
    lPaths.setLayoutX(1100);
    lPaths.setLayoutY(542);
    lPaths.setPrefHeight(20);
    lPaths.setPrefWidth(110);
    lPaths.setText("Paths");
    lPaths.setContentDisplay(ContentDisplay.CENTER);
    lPaths.setFont(Font.font("Dialog", FontPosture.ITALIC, 30));
    root.getChildren().add(lPaths);
    lPathStart1.setLayoutX(893);
    lPathStart1.setLayoutY(615);
    lPathStart1.setPrefHeight(28);
    lPathStart1.setPrefWidth(86);
    lPathStart1.setText("Path Start:");
    lPathStart1.setFont(Font.font("Dialog", 15));
    root.getChildren().add(lPathStart1);
    numberField3.setLayoutX(978);
    numberField3.setLayoutY(615);
    numberField3.setPrefHeight(25);
    numberField3.setPrefWidth(43);
    numberField4.setLayoutX(1109);
    numberField4.setLayoutY(616);
    numberField4.setPrefHeight(25);
    numberField4.setPrefWidth(43);
    lPathEnd.setLayoutX(1032);
    lPathEnd.setLayoutY(616);
    lPathEnd.setPrefHeight(25);
    lPathEnd.setPrefWidth(73);
    root.getChildren().add(numberField3);
    root.getChildren().add(numberField4);
    lPathEnd.setText("Path End:");
    lPathEnd.setFont(Font.font("Dialog", 15));
    root.getChildren().add(lPathEnd);
    bAddToPaths.setLayoutX(1165);
    bAddToPaths.setLayoutY(615);
    bAddToPaths.setPrefHeight(25);
    bAddToPaths.setPrefWidth(91);
    bAddToPaths.setOnAction(
      (event) -> {bAddToPaths_Action(event);} 
    );
    bAddToPaths.setText("Add To Paths");
    root.getChildren().add(bAddToPaths);
    bPreview1.setLayoutX(1271);
    bPreview1.setLayoutY(615);
    bPreview1.setPrefHeight(25);
    bPreview1.setPrefWidth(75);
    bPreview1.setOnAction(
      (event) -> {bPreview1_Action(event);} 
    );
    bPreview1.setText("Preview");
    root.getChildren().add(bPreview1);
    checkBox3.setLayoutX(977);
    checkBox3.setLayoutY(672);
    checkBox3.setPrefHeight(17);
    checkBox3.setPrefWidth(16);
    checkBox3.setText("");
    root.getChildren().add(checkBox3);
    lMakeCurve.setLayoutX(1007);
    lMakeCurve.setLayoutY(672);
    lMakeCurve.setPrefHeight(20);
    lMakeCurve.setPrefWidth(78);
    lMakeCurve.setText("Make Curve");
    lMakeCurve.setContentDisplay(ContentDisplay.CENTER);
    root.getChildren().add(lMakeCurve);
    lCurveAmmount1.setLayoutX(1111);
    lCurveAmmount1.setLayoutY(669);
    lCurveAmmount1.setPrefHeight(20);
    lCurveAmmount1.setPrefWidth(110);
    lCurveAmmount1.setText("Curve Ammount: ");
    lCurveAmmount1.setContentDisplay(ContentDisplay.CENTER);
    root.getChildren().add(lCurveAmmount1);
    textArea2.setLayoutX(911);
    textArea2.setLayoutY(752);
    textArea2.setPrefHeight(108);
    textArea2.setPrefWidth(424);
    textArea2.setEditable(false);
    root.getChildren().add(textArea2);
    lExistingPaths.setLayoutX(1095);
    lExistingPaths.setLayoutY(716);
    lExistingPaths.setPrefHeight(20);
    lExistingPaths.setPrefWidth(110);
    lExistingPaths.setText("Existing Paths:");
    lExistingPaths.setContentDisplay(ContentDisplay.CENTER);
    root.getChildren().add(lExistingPaths);
    numberField5.setLayoutX(1227);
    numberField5.setLayoutY(666);
    numberField5.setPrefHeight(25);
    numberField5.setPrefWidth(75);
    root.getChildren().add(numberField5);
    l.setLayoutX(1308);
    l.setLayoutY(670);
    l.setPrefHeight(20);
    l.setPrefWidth(22);
    l.setText("%");
    root.getChildren().add(l);
    bGenerateCode.setLayoutX(679);
    bGenerateCode.setLayoutY(740);
    bGenerateCode.setPrefHeight(25);
    bGenerateCode.setPrefWidth(107);
    bGenerateCode.setOnAction(
      (event) -> {bGenerateCode_Action(event);} 
    );
    bGenerateCode.setText("GenerateCode");
    root.getChildren().add(bGenerateCode);
    textArea3.setLayoutX(96);
    textArea3.setLayoutY(800);
    textArea3.setPrefHeight(185);
    textArea3.setPrefWidth(785);
    root.getChildren().add(textArea3);
    numberField6.setLayoutX(209);
    numberField6.setLayoutY(765);
    numberField6.setPrefHeight(25);
    numberField6.setPrefWidth(75);
    root.getChildren().add(numberField6);
    numberField7.setLayoutX(133);
    numberField7.setLayoutY(951);
    numberField7.setPrefHeight(25);
    numberField7.setPrefWidth(75);
    root.getChildren().add(numberField7);
    bSave.setLayoutX(302);
    bSave.setLayoutY(765);
    bSave.setPrefHeight(25);
    bSave.setPrefWidth(75);
    bSave.setOnAction(
      (event) -> {bSave_Action(event);} 
    );
    bSave.setText("Save");
    root.getChildren().add(bSave);
    bSave1.setLayoutX(329);
    bSave1.setLayoutY(1053);
    bSave1.setPrefHeight(25);
    bSave1.setPrefWidth(75);
    bSave1.setOnAction(
      (event) -> {bSave1_Action(event);} 
    );
    bSave1.setText("Save");
    root.getChildren().add(bSave1);
    lScale1.setLayoutX(149);
    lScale1.setLayoutY(767);
    lScale1.setPrefHeight(20);
    lScale1.setPrefWidth(46);
    lScale1.setText("Scale:");
    root.getChildren().add(lScale1);
    lOffset.setLayoutX(38);
    lOffset.setLayoutY(1055);
    lOffset.setPrefHeight(20);
    lOffset.setPrefWidth(54);
    lOffset.setText("Offset:");
    root.getChildren().add(lOffset);
    numberField8.setLayoutX(243);
    numberField8.setLayoutY(1049);
    numberField8.setPrefHeight(25);
    numberField8.setPrefWidth(75);
    root.getChildren().add(numberField8);
    lX.setLayoutX(120);
    lX.setLayoutY(1048);
    lX.setPrefHeight(25);
    lX.setPrefWidth(25);
    lX.setText("X:");
    root.getChildren().add(lX);
    lY2.setLayoutX(228);
    lY2.setLayoutY(1048);
    lY2.setPrefHeight(28);
    lY2.setPrefWidth(30);
    lY2.setText("Y:");
    root.getChildren().add(lY2);
    bApply.setLayoutX(387);
    bApply.setLayoutY(768);
    bApply.setPrefHeight(25);
    bApply.setPrefWidth(75);
    bApply.setOnAction(
      (event) -> {bApply_Action(event);} 
    );
    bApply.setText("Apply");
    root.getChildren().add(bApply);
    bApply1.setLayoutX(422);
    bApply1.setLayoutY(1055);
    bApply1.setPrefHeight(25);
    bApply1.setPrefWidth(75);
    bApply1.setOnAction(
      (event) -> {bApply1_Action(event);} 
    );
    bApply1.setText("Apply");
    root.getChildren().add(bApply1);
    lEdit.setLayoutX(839);
    lEdit.setLayoutY(513);
    lEdit.setPrefHeight(20);
    lEdit.setPrefWidth(46);
    lEdit.setText("Edit:");
    root.getChildren().add(lEdit);
    numberField9.setLayoutX(943);
    numberField9.setLayoutY(510);
    numberField9.setPrefHeight(25);
    numberField9.setPrefWidth(43);
    root.getChildren().add(numberField9);
    numberField10.setLayoutX(1035);
    numberField10.setLayoutY(510);
    numberField10.setPrefHeight(25);
    numberField10.setPrefWidth(51);
    root.getChildren().add(numberField10);
    numberField11.setLayoutX(1137);
    numberField11.setLayoutY(512);
    numberField11.setPrefHeight(25);
    numberField11.setPrefWidth(47);
    root.getChildren().add(numberField11);
    bPreview2.setLayoutX(1208);
    bPreview2.setLayoutY(507);
    bPreview2.setPrefHeight(25);
    bPreview2.setPrefWidth(75);
    bPreview2.setOnAction(
      (event) -> {bPreview2_Action(event);} 
    );
    bPreview2.setText("Preview");
    root.getChildren().add(bPreview2);
    bApply2.setLayoutX(1305);
    bApply2.setLayoutY(507);
    bApply2.setPrefHeight(25);
    bApply2.setPrefWidth(75);
    bApply2.setOnAction(
      (event) -> {bApply2_Action(event);} 
    );
    bApply2.setText("Apply");
    root.getChildren().add(bApply2);
    lX2.setLayoutX(1016);
    lX2.setLayoutY(512);
    lX2.setPrefHeight(25);
    lX2.setPrefWidth(17);
    lX2.setText("X:");
    root.getChildren().add(lX2);
    lIndex.setLayoutX(896);
    lIndex.setLayoutY(512);
    lIndex.setPrefHeight(25);
    lIndex.setPrefWidth(41);
    lIndex.setText("Index:");
    root.getChildren().add(lIndex);
    lY1.setLayoutX(1112);
    lY1.setLayoutY(512);
    lY1.setPrefHeight(25);
    lY1.setPrefWidth(25);
    lY1.setText("Y:");
    root.getChildren().add(lY1);
    slider1.setLayoutX(896);
    slider1.setLayoutY(280);
    slider1.setPrefHeight(20);
    slider1.setPrefWidth(140);
    slider1.setShowTickLabels(true);
    slider1.setShowTickMarks(true);
    root.getChildren().add(slider1);
    slider1.valueProperty().addListener(new ChangeListener<Number>() {
         public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue){
          PrviewDraw();
           DrawPreviewPoint(UpdateSlider(numberField1, slider1), numberField2.getInt()); 
         }
      });
    slider2.setLayoutX(1048);
    slider2.setLayoutY(280);
    slider2.setPrefHeight(25);
    slider2.setPrefWidth(153);
    slider2.setShowTickLabels(true);
    slider2.setShowTickMarks(true);
    root.getChildren().add(slider2);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("TurtleDesigner");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public TurtleDesigner
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  public void bNewGraphic_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    scale = (float)6;
    numberField6.setFloat(scale);
    int OffsetX = 0;
    numberField7.setInt(OffsetX);
    int OffsetY = 0;
    numberField8.setInt(OffsetY);
    textArea1.setText("");
    textArea2.setText("");
    numberField1.setFloat((float)0);
    numberField2.setFloat((float)0);
    numberField3.setInt(0);
    numberField4.setInt(0);
    checkBox3.setSelected(false);
    numberField5.setInt(50);
    turtle1.clear();
    XCoordinates.clear();
    YCoordinates.clear();
    Paths.clear();
    numberPaths = -1;
    boolean PreviewCrossEnabled = checkBox1.isSelected();
    PreviewCross(PreviewCrossEnabled);
  } // end of bNewGraphic_Action
  
  private void PreviewCross(boolean enbled) {
    percent++;
    if (enbled) {
      turtle1.moveto(-10,0);
      turtle1.drawto(10,0);
      turtle1.moveto(0,-10);
      turtle1.drawto(0,10);
    } // end of if 
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
  
  private void PointDrawer(float x, float y, float scale,ArrayList <Float> CorordinatesX,ArrayList <Float> CorordinatesY,ArrayList <Integer> Prahs) {
    turtle1.moveto(x,y);
    
    for (int i = 0; i < Prahs.size(); i+=2) {
      if (Paths.get(i) < 0) {
        float Percentage = Paths.get(i) * -1;
        ArrayList <Float> XEs = new ArrayList<Float>();
        ArrayList <Float> YEs = new ArrayList<Float>();
        ArrayList <Integer> Pathes = new ArrayList<Integer>();
        float[][] Points = getArcPoints(CorordinatesX.get(Prahs.get(i + 1)),CorordinatesY.get(Prahs.get(i + 1)),CorordinatesX.get(Prahs.get(i+2)),CorordinatesY.get(Prahs.get(i+2)), Percentage, 30);
        for (int f = 0; f < 30; f++) {
          XEs.add(Points[f][0]);
          YEs.add(Points[f][1]);
          if (f > 0) {
            Pathes.add(f - 1);
            Pathes.add(f);
          } // end of if
        }
        for (int f = 0; f < Pathes.size() -1; f+=2) {
          turtle1.moveto(x + scale * XEs.get(Pathes.get(f)),y + scale * YEs.get(Pathes.get(f)));
          turtle1.drawto(x + scale * XEs.get(Pathes.get(f + 1)),y + scale * YEs.get(Pathes.get(f + 1)));
        }
        i++;
      } // end of if
      else {
        turtle1.moveto(x + scale * CorordinatesX.get(Prahs.get(i)), y + scale * CorordinatesY.get(Prahs.get(i)));
        turtle1.drawto(x + scale * CorordinatesX.get(Prahs.get(i + 1)), y +  scale * CorordinatesY.get(Prahs.get(i + 1)));
      } // end of if-else
    }
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
  
  public float UpdateSlider(NumberField field, Slider slide) {
    field.setInt((int)slide.getValue());
    if (slide.getValue() > slide.getMax() - 5) {
      slide.setMax((int)slide.getValue() + 50);
      slide.setMin((int)slide.getValue() - 50);
    } // end of if
    if (slide.getValue() < slide.getMin() + 5) {
      slide.setMax((int)slide.getValue() + 50);
      slide.setMin((int)slide.getValue() - 50);
    } // end of if
    return (float)slide.getValue();
  }

  public void bAddToPoints_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    if (!Float.isNaN(numberField1.getFloat())) {
      XCoordinates.add(numberField1.getFloat());
    } 
    if (!Float.isNaN(numberField2.getFloat())) {
      YCoordinates.add(numberField2.getFloat());
    } 
    if ((textArea1.getText().isEmpty())) {
      textArea1.setText("Index " + (XCoordinates.size() - 1) + ":  X: " + XCoordinates.get(XCoordinates.size() - 1) + " , Y: " + YCoordinates.get(YCoordinates.size() - 1));
    } // end of if
    else {
      textArea1.appendText("\nIndex " + (XCoordinates.size() - 1) + ":  X: " + XCoordinates.get(XCoordinates.size() - 1) + " , Y: " + YCoordinates.get(YCoordinates.size() - 1));
    } // end of if-else
    if (checkBox2.isSelected()) {
       PrviewDraw();
    } // end of if
    else {
      turtle1.clear();
      boolean PreiewCrossEnabled = checkBox1.isSelected();
      PreviewCross(PreiewCrossEnabled);
    } // end of if-else
  } // end of bAddToPoints_Action
  
  private void PrviewDraw() {
    turtle1.clear();
    boolean PreiewCrossEnabled = checkBox1.isSelected();
    PreviewCross(PreiewCrossEnabled);
    int CoordinateLength = XCoordinates.size();
    if (checkBox2.isSelected()) {
      for (int i = 0; i < CoordinateLength; i++) {
      DrawPreviewPoint(XCoordinates.get(i) * scale + OffsetX, YCoordinates.get(i) * scale + OffsetY);    
    }
    } // end of if
    PointDrawer(OffsetX,OffsetY,scale,XCoordinates,YCoordinates,Paths);
  }
  
  private void DrawPreviewPoint(float x, float y) {
    turtle1.moveto(x - 1, y - 1);
    for (int i = 0; i < 4; i++) {
      turtle1.draw(2);
      turtle1.turn(90);
    }
  }

  public void bPreview_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    PrviewDraw();
    float PrevievX = numberField1.getFloat() * scale - (float)1 + OffsetX;
    float PrevievY = numberField2.getFloat() * scale + (float) 1 + OffsetY;
    turtle1.moveto(PrevievX, PrevievY);
    for (int i = 0; i < 4; i++) {
      turtle1.draw(2);
      turtle1.turn(90);
    }
  } // end of bPreview_Action

  public void bRefresh_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    PrviewDraw();
  } // end of bRefresh_Action

  public void bAddToPaths_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    int Index1 = numberField3.getInt();
    int Index2 = numberField4.getInt();
    if (! (Index1 == Index2)) {
      if(checkBox3.isSelected()) {
        Paths.add((numberField5.getInt() * -1));
      }
      Paths.add(Index1);
      Paths.add(Index2);
      numberPaths++;
      if (textArea2.getText().isEmpty()) {
      if (checkBox3.isSelected()) {
        textArea2.setText("- Index 0: " + "Curved path with " + numberField5.getInt() + "% ammount from point " + numberField3.getInt() + " to point" + numberField4.getInt());
      } else {
        textArea2.setText("- Index 0: " + "Straight path from point " + numberField3.getInt() + " to point " + numberField4.getInt());
      } // end of if-else
    } else {
      if (checkBox3.isSelected()) {
        textArea2.appendText("\n- Index " + numberPaths + ": " + "Curved path with " + numberField5.getInt() + "% ammount from point " + numberField3.getInt() + " to point" + numberField4.getInt());
      } else {
        textArea2.appendText("\n- Index " + numberPaths + ": " + "Straight path from point " + numberField3.getInt() + " to point " + numberField4.getInt());
      } // end of if-else
    } // end of if-else
    } else {
      System.out.println("You can't draw a path between two equal points");
    } // end of if-else
    PrviewDraw();
  } // end of bAddToPaths_Action

  public void bPreview1_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    PrviewDraw();
    if (checkBox3.isSelected()) {
        float Percentage = numberField5.getInt();
        ArrayList <Float> XEs = new ArrayList<Float>();
        ArrayList <Float> YEs = new ArrayList<Float>();
        ArrayList <Integer> Pathes = new ArrayList<Integer>();
        float[][] Points = getArcPoints(XCoordinates.get(numberField3.getInt()),YCoordinates.get(numberField3.getInt()),XCoordinates.get(numberField4.getInt()),YCoordinates.get(numberField4.getInt()), Percentage, 30);
        for (int f = 0; f < 30; f++) {
          XEs.add(OffsetX + scale * Points[f][0]);
          YEs.add(OffsetY + scale * Points[f][1]);
          if (f > 0) {
            Pathes.add(f - 1);
            Pathes.add(f);
          } // end of if
        }
        for (int f = 0; f < Pathes.size() -1; f+=2) {
          turtle1.moveto(XEs.get(Pathes.get(f)),YEs.get(Pathes.get(f)));
          turtle1.drawto(XEs.get(Pathes.get(f +1)),YEs.get(Pathes.get(f+1)));
        }
    } else {
      turtle1.moveto((float)OffsetX + scale * XCoordinates.get(numberField3.getInt()), (float)OffsetY + scale * YCoordinates.get(numberField3.getInt()));
      turtle1.drawto((float)OffsetX + scale * XCoordinates.get(numberField4.getInt()), (float)OffsetY + scale * YCoordinates.get(numberField4.getInt()));
    } // end of if-else
  } // end of bPreview1_Action

  public void bGenerateCode_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bGenerateCode_Action

  public void bSave_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    scale = numberField6.getFloat();
    PrviewDraw();
  } // end of bSave_Action

  public void bSave1_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    OffsetX = numberField7.getInt();
    OffsetY = numberField8.getInt();
    PrviewDraw();
  } // end of bSave1_Action

  public void bApply_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    for (int i = 0; i < XCoordinates.size(); i++) {
      XCoordinates.set(i, XCoordinates.get(i) * scale);
      YCoordinates.set(i, YCoordinates.get(i) * scale);
    } 
    scale = (float)1;
    numberField6.setFloat(scale);
  } // end of bApply_Action

  public void bApply1_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    for (int i = 0; i < XCoordinates.size(); i++) {
      XCoordinates.set(i, XCoordinates.get(i) + (float)OffsetX);
      YCoordinates.set(i, YCoordinates.get(i) + (float)OffsetY);
    }
    OffsetX = 0;
    OffsetY = 0;
    numberField7.setFloat(OffsetX);
    numberField8.setFloat(OffsetY);
  } // end of bApply1_Action

  public void bPreview2_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bPreview2_Action

  public void bApply2_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of bApply2_Action

  // Ende Methoden
} // end of class TurtleDesigner
