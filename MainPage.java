package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.util.Duration;

public class MainPage {
   private Label titlemain;
   private Button close,letstart,info;
   private Group gp =new Group();
   private HBox hb = new HBox(100);
   private Text txtx,txto,blackStrokeTextx,blackStrokeTexto,tic,tac,toe,game;
   
   MainPage(){
	   txtx= new Text("X");
	   txtx.setFont(Font.font(170));
	   txtx.setFill(Color.RED);
	   txtx.setLayoutX(100);
	   txtx.setLayoutY(400);
	   
	   tic= new Text("Tic");
	   tic.setFont(Font.font(140));
	   tic.setFill(Color.RED);
	   tic.setLayoutX(530);
	   tic.setLayoutY(130);
	   
	   tac= new Text("Tac");
	   tac.setFont(Font.font(140));
	   tac.setFill(Color.RED);
	   tac.setLayoutX(250);
	   tac.setLayoutY(130);
	   
	   toe= new Text("Toe");
	   toe.setFont(Font.font(140));
	   toe.setFill(Color.RED);
	   toe.setLayoutX(770);
	   toe.setLayoutY(130);
	   
	    blackStrokeTextx = new Text("X");
	     blackStrokeTextx.setFont(new Font(180));
	     blackStrokeTextx.setFill(Color.WHITE);
	     blackStrokeTextx.setTranslateX(1); // Adjust the shift to control the stroke thickness
	     blackStrokeTextx.setTranslateY(1);
	     blackStrokeTextx.setLayoutX(100);
	     blackStrokeTextx.setLayoutY(400);
	   
	   txto = new Text("O");
	   txto.setFont(Font.font(165));
	   txto.setFill(Color.RED);
	   txto.setLayoutX(1050);
	   txto.setLayoutY(400);
	   
	    blackStrokeTexto = new Text("O");
	     blackStrokeTexto.setFont(new Font(180));
	     blackStrokeTexto.setFill(Color.WHITE);
	     blackStrokeTexto.setTranslateX(1); // Adjust the shift to control the stroke thickness
	     blackStrokeTexto.setTranslateY(1);
	     blackStrokeTexto.setLayoutX(1050);
	     blackStrokeTexto.setLayoutY(400);
	   
	   titlemain= new Label(" Tic - Tac - Toe  Game  ");
	   titlemain.setStyle(
	    		"-fx-background-color: derive(#61a2b1,1.7);"+"-fx-background-color:white;" +
	            "-fx-background-insets: 0.5;" +
	            "-fx-padding: 5;" +
	            "-fx-background-radius: 100em; " +
	            "-fx-min-width: 650px; " +
	            "-fx-min-height: 40px; " +
	            "-fx-max-width: 200px; " +
	            "-fx-border-width: 1;" +
	            "-fx-border-radius: 5;" +
	            "-fx-fill: black;" 
	    );


	  
	   titlemain.setTextFill(Color.BLACK.brighter().brighter());
	   titlemain.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 60));
	  // titlemain.setLayoutX(300);
	  // titlemain.setLayoutY(50);
	   
	   
	    info = new Button("Information");
		info.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		info.setMinSize(150, 50);
		info.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );
		info.setTextFill(Color.WHITE);
		
		
		close = new Button(" Close ");
		close.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		close.setMinSize(150, 50);
		close.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );
		close.setTextFill(Color.WHITE);
		
		
		letstart = new Button("Lets Start");
		letstart.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		letstart.setMinSize(150, 50);
		letstart.setStyle(
		        "-fx-background-radius: 10em; " +
		                "-fx-min-width: 200px; " +
		                "-fx-min-height: 50px; " +
		                "-fx-max-width: 250px; " +
		                "-fx-max-height: 150px; " +"-fx-background-color: black;"
		        );
		
		letstart.setTextFill(Color.WHITE);
		
		hb.getChildren().addAll(info,letstart,close);
		hb.setLayoutX(250);
		hb.setLayoutY(600);
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/86436880ada36acc9bb6e431a6c73f76.gif");
		ImageView mg = new ImageView(m);
		mg.setFitHeight(750);
		mg.setFitWidth(1250);

//		  Timeline timeline = new Timeline(
//	               new KeyFrame(Duration.millis(100), event -> {
//	                    // Update the frame
//	                    mg.setPreserveRatio(true);
//	                    mg.setSmooth(true);
//	                })
//	        );
//	        timeline.setCycleCount(Timeline.INDEFINITE);
//	        timeline.play();
		//,blackStrokeTextx,blackStrokeTexto,txtx,txto
		gp.getChildren().addAll(mg,hb, tic,toe,tac);
		
		
		
		
	   
   }
   
   


public Text getBlackStrokeTextx() {
	return blackStrokeTextx;
}




public Text getBlackStrokeTexto() {
	return blackStrokeTexto;
}




public void setBlackStrokeTextx(Text blackStrokeTextx) {
	this.blackStrokeTextx = blackStrokeTextx;
}




public void setBlackStrokeTexto(Text blackStrokeTexto) {
	this.blackStrokeTexto = blackStrokeTexto;
}




public Text getTxtx() {
	return txtx;
}



public Text getTxto() {
	return txto;
}



public void setTxtx(Text txtx) {
	this.txtx = txtx;
}



public void setTxto(Text txto) {
	this.txto = txto;
}



public Label getTitlemain() {
	return titlemain;
}


public Button getClose() {
	return close;
}


public Button getLetstart() {
	return letstart;
}


public Button getInfo() {
	return info;
}


public Group getGp() {
	return gp;
}


public HBox getHb() {
	return hb;
}


public void setTitlemain(Label titlemain) {
	this.titlemain = titlemain;
}


public void setClose(Button close) {
	this.close = close;
}


public void setLetstart(Button letstart) {
	this.letstart = letstart;
}


public void setInfo(Button info) {
	this.info = info;
}


public void setGp(Group gp) {
	this.gp = gp;
}


public void setHb(HBox hb) {
	this.hb = hb;
}
   
}
