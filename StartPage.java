package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StartPage {
 private Label chooselabel;
 private Text txt,txtx,txto, blackStrokeTextx, blackStrokeTexto;
 private RadioButton option1,option2,option3;
 private Button mainpagebutton;
 private BorderPane bp = new BorderPane();
 private VBox vbox  = new VBox(10);
 StartPage(){
	 txtx= new Text("X");
	   txtx.setFont(Font.font(170));
	   txtx.setFill(Color.RED);
	   
	    blackStrokeTextx = new Text("X");
	     blackStrokeTextx.setFont(new Font(180));
	     blackStrokeTextx.setFill(Color.WHITE);
	     blackStrokeTextx.setTranslateX(1); // Adjust the shift to control the stroke thickness
	     blackStrokeTextx.setTranslateY(1);
	   
	   txto = new Text("O");
	   txto.setFont(Font.font(165));
	   txto.setFill(Color.RED);
	   
	    blackStrokeTexto = new Text("O");
	     blackStrokeTexto.setFont(new Font(180));
	     blackStrokeTexto.setFill(Color.WHITE);
	     blackStrokeTexto.setTranslateX(1); // Adjust the shift to control the stroke thickness
	     blackStrokeTexto.setTranslateY(1);
	 
	 
	 txt= new Text("First Welcome To The Tic-Tac-Toe Game ,, "+"\n"+"Please choose one of the options ! "+"\n"+"Have a nice day!");
	 txt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
     txt.setFill(Color.RED);
     
     
     
	 chooselabel = new Label(" Please Choose One Of The Options : ");
	 chooselabel.setStyle(
	    		"-fx-background-color: derive(#61a2b1,1.7);"+"-fx-background-color:white;" +
	            "-fx-background-insets: 0.5;" +
	            "-fx-padding: 5;" +
	            "-fx-background-radius: 100em; " +
	            "-fx-min-width: 1000px; " +
	            "-fx-min-height: 40px; " +
	            "-fx-max-width: 200px; " +
	            "-fx-border-width: 1;" +
	            "-fx-border-radius: 5;" +
	            "-fx-fill: black;" 
	    );


	  
	 chooselabel.setTextFill(Color.BLACK.brighter().brighter());
	 chooselabel.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 60));
	 chooselabel.setLayoutX(300);
	 chooselabel.setLayoutY(50);
	 
	 option1= new RadioButton("Computer Player Random and Person Player ! .                            ");
	 option1.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	 option1.setTextFill(Color.WHITE);
	 option1.setMinSize(50, 50);
		
	 
	 option2= new RadioButton("2 Persons Players .                                                                            ");
	 option2.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	 option2.setTextFill(Color.WHITE);
	 option2.setMinSize(50, 50);
	 
	 option3= new RadioButton("Computer Player (Minimax !) and Person Player ! (Hard Level) .");
	 option3.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,30));
	 option3.setTextFill(Color.WHITE);
	 option3.setMinSize(50, 50);
	 
	 
	 mainpagebutton= new Button(" Main Page ");
	 mainpagebutton.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	 mainpagebutton.setMinSize(150, 50);
	 mainpagebutton.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: white;"
		        );
	 
	 
	 vbox.getChildren().addAll(txt,option1,option2,option3);
	 Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/startback.png");
	 ImageView mg = new ImageView(m);
	 mg.setFitWidth(1250);
	 mg.setFitHeight(650);
	 vbox.setAlignment(Pos.CENTER);
	 bp.getChildren().add(mg);
	 bp.setTop(chooselabel);
	 bp.setAlignment(chooselabel, Pos.CENTER);
	 bp.setBottom(mainpagebutton);
	 bp.setAlignment(mainpagebutton, Pos.CENTER);
	// bp.setAlignment(vbox,Pos.CENTER);
	 bp.setCenter(vbox);
	 bp.setAlignment(vbox,Pos.CENTER);
	 bp.setLeft(txtx);
	 bp.setAlignment(txtx, Pos.CENTER);
	 bp.setRight(txto);
	 bp.setAlignment(txto, Pos.CENTER);
	 
	 
 }
public Text getTxtx() {
	return txtx;
}
public Text getTxto() {
	return txto;
}
public Text getBlackStrokeTextx() {
	return blackStrokeTextx;
}
public Text getBlackStrokeTexto() {
	return blackStrokeTexto;
}
public void setTxtx(Text txtx) {
	this.txtx = txtx;
}
public void setTxto(Text txto) {
	this.txto = txto;
}
public void setBlackStrokeTextx(Text blackStrokeTextx) {
	this.blackStrokeTextx = blackStrokeTextx;
}
public void setBlackStrokeTexto(Text blackStrokeTexto) {
	this.blackStrokeTexto = blackStrokeTexto;
}
public Label getChooselabel() {
	return chooselabel;
}
public Text getTxt() {
	return txt;
}
public RadioButton getOption1() {
	return option1;
}
public RadioButton getOption2() {
	return option2;
}
public RadioButton getOption3() {
	return option3;
}
public Button getMainpagebutton() {
	return mainpagebutton;
}
public BorderPane getBp() {
	return bp;
}
public VBox getVbox() {
	return vbox;
}
public void setChooselabel(Label chooselabel) {
	this.chooselabel = chooselabel;
}
public void setTxt(Text txt) {
	this.txt = txt;
}
public void setOption1(RadioButton option1) {
	this.option1 = option1;
}
public void setOption2(RadioButton option2) {
	this.option2 = option2;
}
public void setOption3(RadioButton option3) {
	this.option3 = option3;
}
public void setMainpagebutton(Button mainpagebutton) {
	this.mainpagebutton = mainpagebutton;
}
public void setBp(BorderPane bp) {
	this.bp = bp;
}
public void setVbox(VBox vbox) {
	this.vbox = vbox;
}	
}
