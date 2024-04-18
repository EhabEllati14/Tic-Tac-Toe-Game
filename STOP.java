package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class STOP {
	
   private BorderPane border = new BorderPane();
   private HBox hbox = new HBox(40);
   private Button ok,cont;
   private Label msg,winlabel;

   STOP(){
	   ok = new Button("Stop");
	   ok.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	   ok.setMinSize(150, 50);
	   ok.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );
	   ok.setTextFill(Color.WHITE);
	   
	   cont = new Button(" Continue ");
	   cont.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
	   cont.setMinSize(150, 50);
	   cont.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;" 
	    );
	   cont.setTextFill(Color.WHITE);
	   
	   hbox.getChildren().addAll(ok,cont);
	   hbox.setAlignment(Pos.CENTER);
	   
	   msg= new Label("Are You Want To continue The Game ?");
	   msg.setTextFill(Color.WHITE);
	   msg.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
	   msg.setMinWidth(100);
	   
	   winlabel = new Label();
	   winlabel.setTextFill(Color.WHITE);
	   winlabel.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
	   winlabel.setMinWidth(100);
	   
	   
	   Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/stopimg.jpg");
	   ImageView mg = new ImageView(m);
	   mg.setFitHeight(300);
	   mg.setFitWidth(800);
	   
	  border.getChildren().add(mg);
	  border.setCenter(msg);
	  border.setAlignment(msg, Pos.CENTER);
	  
	  border.setBottom(hbox);
	  border.setAlignment(hbox, Pos.CENTER);
		   
   }
   

public Label getWinlabel() {
	return winlabel;
}


public void setWinlabel(Label winlabel) {
	this.winlabel = winlabel;
}


public BorderPane getBorder() {
	return border;
}

public HBox getHbox() {
	return hbox;
}

public Button getOk() {
	return ok;
}

public Button getCont() {
	return cont;
}

public Label getMsg() {
	return msg;
}

public void setBorder(BorderPane border) {
	this.border = border;
}

public void setHbox(HBox hbox) {
	this.hbox = hbox;
}

public void setOk(Button ok) {
	this.ok = ok;
}

public void setCont(Button cont) {
	this.cont = cont;
}

public void setMsg(Label msg) {
	this.msg = msg;
}
   

}
