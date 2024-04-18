package application;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class winscreen {
	
	private Group gp = new Group();
	private Button mainpage,done;
	private Label player1txt,player2txt, player1name,player2name,player1score,player2score;
	private VBox vbox1= new VBox(15);
	private VBox vbox2= new VBox(15);
	
	winscreen(){
		done = new Button("done");
		
		mainpage = new Button(" Main Page ");
		mainpage.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,18));
		mainpage.setMinSize(150, 50);
		mainpage.setStyle(
	            
				 "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;" 
	    );
		done.setTextFill(Color.BLACK);
		done.setLayoutX(300);
		done.setLayoutY(350);
		
		player1txt= new Label("Player 1");
		player1txt.setTextFill(Color.WHITE);
		player1txt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
		player1txt.setMinWidth(100);
		
		player2txt= new Label("Player 2");
		player2txt.setTextFill(Color.WHITE);
		player2txt.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
		player2txt.setMinWidth(100);
		
		player1name= new Label();
		player1name.setTextFill(Color.WHITE);
		player1name.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
		player1name.setMinWidth(100);
		
		player2name= new Label();
		player2name.setTextFill(Color.WHITE);
		player2name.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
		player2name.setMinWidth(100);
		
		player1score= new Label();
		player1score.setTextFill(Color.WHITE);
		player1score.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
		player1score.setMinWidth(100);
		
		player2score= new Label();
		player2score.setTextFill(Color.WHITE);
		player2score.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,25));
		player2score.setMinWidth(100);
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winfinal-removebg-preview.png");
		ImageView wintitle= new  ImageView(m);
		wintitle.setFitHeight(300);
		wintitle.setFitWidth(300);
		wintitle.setLayoutX(250);
		wintitle.setLayoutY(-60);
		
		
		Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/backwin.jpg");
		ImageView back = new ImageView(m2);
		back.setFitHeight(400);
		back.setFitWidth(800);
		
		
		
		
		
		
		vbox1.getChildren().addAll(player1txt,player1name,player1score);
		   vbox1.setStyle("-fx-padding: 10px; " +
                   "-fx-border-style: solid inside; " +
                   "-fx-border-width: 4px; " +
                   "-fx-border-insets: 5px; " +
                   "-fx-border-radius: 5px; " +
                   "-fx-border-color: white;");
		   vbox1.setLayoutX(50);
		   vbox1.setLayoutY(20);
		   
		   vbox2.getChildren().addAll(player2txt,player2name,player2score);
		   vbox2.setStyle("-fx-padding: 10px; " +
                   "-fx-border-style: solid inside; " +
                   "-fx-border-width: 4px; " +
                   "-fx-border-insets: 5px; " +
                   "-fx-border-radius: 5px; " +
                   "-fx-border-color: white;"); 
		   vbox2.setLayoutX(600);
		   vbox2.setLayoutY(20);
		   
		   gp.getChildren().addAll(back,wintitle,vbox1,vbox2);
	
	}
	

	public Label getPlayer1score() {
		return player1score;
	}


	public Label getPlayer2score() {
		return player2score;
	}


	public void setPlayer1score(Label player1score) {
		this.player1score = player1score;
	}


	public void setPlayer2score(Label player2score) {
		this.player2score = player2score;
	}


	public Group getGp() {
		return gp;
	}

	public Button getMainpage() {
		return mainpage;
	}

	public Label getPlayer1txt() {
		return player1txt;
	}

	public Label getPlayer2txt() {
		return player2txt;
	}

	public Label getPlayer1name() {
		return player1name;
	}

	public Label getPlayer2name() {
		return player2name;
	}

	public VBox getVbox1() {
		return vbox1;
	}

	public VBox getVbox2() {
		return vbox2;
	}

	public void setGp(Group gp) {
		this.gp = gp;
	}

	public void setMainpage(Button mainpage) {
		this.mainpage = mainpage;
	}

	public void setPlayer1txt(Label player1txt) {
		this.player1txt = player1txt;
	}

	public void setPlayer2txt(Label player2txt) {
		this.player2txt = player2txt;
	}

	public void setPlayer1name(Label player1name) {
		this.player1name = player1name;
	}

	public void setPlayer2name(Label player2name) {
		this.player2name = player2name;
	}

	public void setVbox1(VBox vbox1) {
		this.vbox1 = vbox1;
	}

	public void setVbox2(VBox vbox2) {
		this.vbox2 = vbox2;
	}


	public Button getDone() {
		return done;
	}


	public void setDone(Button done) {
		this.done = done;
	}
	
	
	

}
