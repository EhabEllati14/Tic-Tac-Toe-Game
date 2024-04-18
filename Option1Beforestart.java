package application;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Option1Beforestart {
	Stage stage3;
	private Group op1gp = new Group();
	
   private Label playernamelabel,computerlabel,playernum,computernum,playervalue,computervalue,roundlabel,ruleslabel,title;
   private RadioButton playe1,playe2,comp1,comp2,playervalx,playervalo,compvalx,compvalo;
   private TextField playertext,computertext,roundtext;
   private HBox hboxplaytext = new HBox(20);
   private HBox hboxplaynum= new HBox(40);
   private HBox hboxplayval= new HBox(40);
   private HBox hboxcomptext = new HBox(20);
   private HBox hboxcompnum= new HBox(40);
   private HBox hboxcompval = new HBox(40);
   private HBox hboxround= new HBox(40);
   private VBox vboxplay = new VBox(20);
   private VBox vboxcomp = new VBox(20);
   private HBox ruleshbox = new HBox(40);
   private Line line1 ;
   private Line line2;
   private Line line3;
   private Line line4;
   private Button startbutton,clear1,clear2,rulesbutton,mainpage;
   
   Option1Beforestart(){
	  
	   playernamelabel= new Label("Player Name : ");
	   playernamelabel.setTextFill(Color.WHITE);
	   playernamelabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
	   playernamelabel.setMinWidth(100);
	   
	   computerlabel= new Label("Computer Name : ");
	   computerlabel.setTextFill(Color.WHITE);
	   computerlabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
	   computerlabel.setMinWidth(100);
	   
	   playernum= new Label("Player Number :   ");
	   playernum.setTextFill(Color.WHITE);
	   playernum.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
	   playernum.setMinWidth(100);
	   
	   computernum= new Label("Computer Number :   ");
	   computernum.setTextFill(Color.WHITE);
	   computernum.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
	   computernum.setMinWidth(100);
	   
	   playervalue= new Label("Player Value :       ");
	   playervalue.setTextFill(Color.WHITE);
	   playervalue.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
	   playervalue.setMinWidth(100);
	   
	   computervalue= new Label("Computer Value :       ");
	   computervalue.setTextFill(Color.WHITE);
	   computervalue.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
	   computervalue.setMinWidth(100);
	   
	   
	   roundlabel= new Label(" Please Enter The Number Of Rounds :   ");
	   roundlabel.setTextFill(Color.WHITE);
	   roundlabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
	   roundlabel.setMinWidth(100);
	   
	   title= new Label(" Please , Before Start The Game Fill The Survey ! ");
	   title.setTextFill(Color.GREEN.brighter().brighter());
	   title.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   title.setMinWidth(100);
	   title.setLayoutX(300);
	   title.setLayoutY(0);
	   
	   
	   ruleslabel= new Label(" If You Want To See The Rules Of The Game Please Click On Rules :  ");
	   ruleslabel.setTextFill(Color.WHITE);
	   ruleslabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
	   ruleslabel.setMinWidth(100);
	   
	   playe1 = new RadioButton(" 1 ");
	   playe1.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   playe1.setTextFill(Color.WHITE);
	   playe1.setMinSize(50, 50);
	   
	   playe2 = new RadioButton(" 2 ");
	   playe2.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   playe2.setTextFill(Color.WHITE);
	   playe2.setMinSize(50, 50);
	   
	   comp1 = new RadioButton(" 1 ");
	   comp1.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   comp1.setTextFill(Color.WHITE);
	   comp1.setMinSize(50, 50); 
	   
	   comp2 = new RadioButton(" 2 ");
	   comp2.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   comp2.setTextFill(Color.WHITE);
	   comp2.setMinSize(50, 50); 
	   
	   
	   playervalx = new RadioButton(" X ");
	   playervalx.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   playervalx.setTextFill(Color.WHITE);
	   playervalx.setMinSize(50, 50); 
	   
	   playervalo = new RadioButton(" O ");
	   playervalo.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   playervalo.setTextFill(Color.WHITE);
	   playervalo.setMinSize(50, 50); 
	   
	
	   
	   compvalx = new RadioButton(" X ");
	   compvalx.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   compvalx.setTextFill(Color.WHITE);
	   compvalx.setMinSize(50, 50);
	   
	   compvalo = new RadioButton(" O ");
	   compvalo.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	   compvalo.setTextFill(Color.WHITE);
	   compvalo.setMinSize(50, 50);
	   
	   playertext= new TextField();
	   playertext.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
	   playertext.setMinWidth(300);
	   playertext.setMinHeight(40);
	   
	   computertext= new TextField();
	   computertext.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
	   computertext.setMinWidth(300);
	   computertext.setMinHeight(40);
	   
	   
	   roundtext= new TextField();
	   roundtext.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC, 20));
	   roundtext.setMaxWidth(100);
	   roundtext.setMinHeight(40);
	   
	   hboxplaytext.getChildren().addAll( playernamelabel,playertext);
	   
	   
	   hboxplaynum.getChildren().addAll(playernum,playe1,playe2);
	   
	   
	   hboxplayval.getChildren().addAll(playervalue,playervalx,playervalo);
	   
	   
	   hboxcomptext.getChildren().addAll(computerlabel,computertext);
	   
	   
	   hboxcompnum.getChildren().addAll(computernum,comp1,comp2);
	   
	   
	   hboxcompval.getChildren().addAll(computervalue,compvalx,compvalo);
	   
	   
	   
	   hboxround.getChildren().addAll(roundlabel,roundtext);
	   hboxround.setLayoutX(250);
	   hboxround.setLayoutY(400);
	   clear1= new Button(" Clear ");
	   clear1.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,25));
	   clear1.setMinSize(100, 50);
	   clear1.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"
		        );
		
	   clear1.setTextFill(Color.BLACK);
	   
	   clear2= new Button(" Clear ");
	   clear2.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,25));
	   clear2.setMinSize(100, 50);
	   clear2.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"
		        );
		
	   clear2.setTextFill(Color.BLACK);
	   
	   vboxplay.getChildren().addAll(hboxplaytext,hboxplaynum,hboxplayval,clear1);
	   vboxplay.setLayoutX(50);
	   vboxplay.setLayoutY(70);
	   
	   
	   vboxcomp.getChildren().addAll(hboxcomptext,hboxcompnum,hboxcompval,clear2);
	   vboxcomp.setLayoutX(675);
	   vboxcomp.setLayoutY(70);
	   
	   startbutton = new Button(" LET'S START ");
	   startbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,25));
	   startbutton.setMinSize(150, 50);
	   startbutton.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: red;"
		        );
		
	   startbutton.setTextFill(Color.BLACK);
	   
	   mainpage = new Button(" Main Page ");
	   mainpage.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,25));
	   mainpage.setMinSize(150, 50);
	   mainpage.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"
		        );
		
	   mainpage.setTextFill(Color.BLACK);
	   mainpage.setLayoutX(400);
	   mainpage.setLayoutY(600);
	   
	   startbutton.setLayoutX(700);
	   startbutton.setLayoutY(600);
	   rulesbutton = new Button(" Rules ");
	   rulesbutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,25));
	   rulesbutton.setMinSize(150, 50);
	   rulesbutton.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"
		        );
		
	   rulesbutton.setTextFill(Color.BLACK);
	   
	   
	   
	   line1 = new Line(625,50,625,350);
	   line1.setFill(Color.RED);
	   line1.setStroke(Color.RED);
	   line1.setStrokeWidth(5);
	   
	   
	   
	   line2 = new Line(0,350,1250,350);
	   line2.setFill(Color.RED);
	   line2.setStroke(Color.RED);
	   line2.setStrokeWidth(5);
	   
	   
	   line3 = new Line(0,500,1250,500);
	   line3.setFill(Color.RED);
	   line3.setStroke(Color.RED);
	   line3.setStrokeWidth(5);
	   
	   line4 = new Line(0,50,1250,50);
	   line4.setFill(Color.RED);
	   line4.setStroke(Color.RED);
	   line4.setStrokeWidth(5);
	   
	   Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/startback.png");
	   ImageView mg = new ImageView(m);
	   mg.setFitHeight(650);
	   mg.setFitWidth(1250);
	   ruleshbox.getChildren().addAll(ruleslabel,rulesbutton);
	   ruleshbox.setLayoutX(150);
	   ruleshbox.setLayoutY(520);
	   
	   op1gp.getChildren().add(mg);
	   op1gp.getChildren().addAll(line1,line2,line3,line4,vboxplay,vboxcomp,hboxround,ruleshbox,startbutton,mainpage,title);
	   
	   
   }

public Label getTitle() {
	return title;
}

public Line getLine4() {
	return line4;
}

public Button getMainpage() {
	return mainpage;
}

public void setTitle(Label title) {
	this.title = title;
}

public void setLine4(Line line4) {
	this.line4 = line4;
}

public void setMainpage(Button mainpage) {
	this.mainpage = mainpage;
}

public Stage getStage3() {
	return stage3;
}

public Group getOp1gp() {
	return op1gp;
}

public Label getPlayernamelabel() {
	return playernamelabel;
}

public Label getComputerlabel() {
	return computerlabel;
}

public Label getPlayernum() {
	return playernum;
}

public Label getComputernum() {
	return computernum;
}

public Label getPlayervalue() {
	return playervalue;
}

public Label getComputervalue() {
	return computervalue;
}

public Label getRoundlabel() {
	return roundlabel;
}

public Label getRuleslabel() {
	return ruleslabel;
}

public HBox getRuleshbox() {
	return ruleshbox;
}

public Button getRulesbutton() {
	return rulesbutton;
}

public void setRuleslabel(Label ruleslabel) {
	this.ruleslabel = ruleslabel;
}

public void setRuleshbox(HBox ruleshbox) {
	this.ruleshbox = ruleshbox;
}

public void setRulesbutton(Button rulesbutton) {
	this.rulesbutton = rulesbutton;
}

public RadioButton getPlaye1() {
	return playe1;
}

public RadioButton getPlaye2() {
	return playe2;
}

public RadioButton getComp1() {
	return comp1;
}

public RadioButton getComp2() {
	return comp2;
}

public RadioButton getPlayervalx() {
	return playervalx;
}

public RadioButton getPlayervalo() {
	return playervalo;
}

public RadioButton getCompvalx() {
	return compvalx;
}

public RadioButton getCompvalo() {
	return compvalo;
}

public TextField getPlayertext() {
	return playertext;
}

public TextField getComputertext() {
	return computertext;
}

public TextField getRoundtext() {
	return roundtext;
}

public HBox getHboxplaytext() {
	return hboxplaytext;
}

public HBox getHboxplaynum() {
	return hboxplaynum;
}

public HBox getHboxplayval() {
	return hboxplayval;
}

public HBox getHboxcomptext() {
	return hboxcomptext;
}

public HBox getHboxcompnum() {
	return hboxcompnum;
}

public HBox getHboxcompval() {
	return hboxcompval;
}

public HBox getHboxround() {
	return hboxround;
}

public VBox getVboxplay() {
	return vboxplay;
}

public VBox getVboxcomp() {
	return vboxcomp;
}

public Line getLine1() {
	return line1;
}

public Line getLine2() {
	return line2;
}

public Line getLine3() {
	return line3;
}

public Button getStartbutton() {
	return startbutton;
}

public void setStage3(Stage stage3) {
	this.stage3 = stage3;
}

public void setOp1gp(Group op1gp) {
	this.op1gp = op1gp;
}

public void setPlayernamelabel(Label playernamelabel) {
	this.playernamelabel = playernamelabel;
}

public void setComputerlabel(Label computerlabel) {
	this.computerlabel = computerlabel;
}

public void setPlayernum(Label playernum) {
	this.playernum = playernum;
}

public void setComputernum(Label computernum) {
	this.computernum = computernum;
}

public void setPlayervalue(Label playervalue) {
	this.playervalue = playervalue;
}

public void setComputervalue(Label computervalue) {
	this.computervalue = computervalue;
}

public void setRoundlabel(Label roundlabel) {
	this.roundlabel = roundlabel;
}


public void setPlaye1(RadioButton playe1) {
	this.playe1 = playe1;
}

public void setPlaye2(RadioButton playe2) {
	this.playe2 = playe2;
}

public void setComp1(RadioButton comp1) {
	this.comp1 = comp1;
}

public void setComp2(RadioButton comp2) {
	this.comp2 = comp2;
}

public void setPlayervalx(RadioButton playervalx) {
	this.playervalx = playervalx;
}

public void setPlayervalo(RadioButton playervalo) {
	this.playervalo = playervalo;
}

public void setCompvalx(RadioButton compvalx) {
	this.compvalx = compvalx;
}

public void setCompvalo(RadioButton compvalo) {
	this.compvalo = compvalo;
}

public void setPlayertext(TextField playertext) {
	this.playertext = playertext;
}

public void setComputertext(TextField computertext) {
	this.computertext = computertext;
}

public void setRoundtext(TextField roundtext) {
	this.roundtext = roundtext;
}

public void setHboxplaytext(HBox hboxplaytext) {
	this.hboxplaytext = hboxplaytext;
}

public void setHboxplaynum(HBox hboxplaynum) {
	this.hboxplaynum = hboxplaynum;
}

public void setHboxplayval(HBox hboxplayval) {
	this.hboxplayval = hboxplayval;
}

public void setHboxcomptext(HBox hboxcomptext) {
	this.hboxcomptext = hboxcomptext;
}

public void setHboxcompnum(HBox hboxcompnum) {
	this.hboxcompnum = hboxcompnum;
}

public void setHboxcompval(HBox hboxcompval) {
	this.hboxcompval = hboxcompval;
}

public void setHboxround(HBox hboxround) {
	this.hboxround = hboxround;
}

public void setVboxplay(VBox vboxplay) {
	this.vboxplay = vboxplay;
}

public void setVboxcomp(VBox vboxcomp) {
	this.vboxcomp = vboxcomp;
}

public void setLine1(Line line1) {
	this.line1 = line1;
}

public void setLine2(Line line2) {
	this.line2 = line2;
}

public void setLine3(Line line3) {
	this.line3 = line3;
}

public void setStartbutton(Button startbutton) {
	this.startbutton = startbutton;
}

public Button getClear1() {
	return clear1;
}

public Button getClear2() {
	return clear2;
}

public void setClear1(Button clear1) {
	this.clear1 = clear1;
}

public void setClear2(Button clear2) {
	this.clear2 = clear2;
}
   






}
