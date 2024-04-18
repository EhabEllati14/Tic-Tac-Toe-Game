package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class nextround {
	private BorderPane bord = new BorderPane();
	private Button next;
	private Label msg;

	nextround(){
		next = new Button("Next");
		next.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,35));
		next.setMinSize(150, 50);
		next.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: red;"
			        );
		
		msg= new Label("Please Press next for the next Round !");
		msg.setTextFill(Color.WHITE);
		msg.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
		msg.setMinWidth(100);
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/backwin.jpg");
		ImageView mg = new ImageView(m);
		mg.setFitHeight(300);
		mg.setFitWidth(300);
		bord.getChildren().add(mg);
		bord.setCenter(msg);
		bord.setAlignment(msg, Pos.CENTER);
		bord.setBottom(next);
		bord.setAlignment(next,Pos.CENTER);
		
	}

	public BorderPane getBord() {
		return bord;
	}

	public Button getNext() {
		return next;
	}

	public Label getMsg() {
		return msg;
	}

	public void setBord(BorderPane bord) {
		this.bord = bord;
	}

	public void setNext(Button next) {
		this.next = next;
	}

	public void setMsg(Label msg) {
		this.msg = msg;
	}
	
}
