package application;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Game {
	private Label player1,player2,scoreplayer1,scoreplayer2,name1,name2,score1,score2,round,from,to,bet,select1,select2;
	private VBox vbox1 = new VBox(20);
	private VBox vbox2 = new VBox(20);
	private HBox hbox = new HBox(20);
	private Button endgame;
	private Group gamegp = new Group();
	private GridPane grid = new GridPane();
	Game(){
//		 Color evenDarkerGray = Color.rgb(50, 50, 50); // RGB values for an even darker gray
//	       
//		 but1= new Button("Ehab ");
//		 but1.setPrefHeight(157);
//	     but1.setPrefWidth(191);
//	     but1.setLayoutX(332);
//	     but1.setLayoutY(5);
//	     
//	   //  but1.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
//	     
//			but2= new Button();
//			 but2.setPrefHeight(157);
//		     but2.setPrefWidth(191);
//		     but2.setLayoutX(530);
//		     but2.setLayoutY(5);
//		    // but2.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");

		     
//				 but3= new Button();
//				 but3.setPrefHeight(157);
//			     but3.setPrefWidth(191);
//			     but3.setLayoutX(730);
//			     but3.setLayoutY(5);
//			     but3.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");

			     
//					 but4= new Button();
//					 but4.setPrefHeight(157);
//				     but4.setPrefWidth(191);
//				     but4.setLayoutX(332);
//				     but4.setLayoutY(170);
//				     but4.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
				     
//						 but5= new Button();
//						 but5.setPrefHeight(157);
//					     but5.setPrefWidth(191);
//					     but5.setLayoutX(530);
//					     but5.setLayoutY(170);
//					     but5.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
					     
//							 but6= new Button();
//							 but6.setPrefHeight(157);
//						     but6.setPrefWidth(191);
//						     but6.setLayoutX(730);
//						     but6.setLayoutY(170);
//						     but6.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
						     
//								 but7= new Button();
//								 but7.setPrefHeight(157);
//							     but7.setPrefWidth(191);
//							     but7.setLayoutX(332);
//							     but7.setLayoutY(335);
//							     but7.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
//							     
//									 but8= new Button();
//									 but8.setPrefHeight(157);
//								     but8.setPrefWidth(191);
//								     but8.setLayoutX(530);
//								     but8.setLayoutY(335);
//								     but8.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
								     
//										 but9= new Button();
//										 but9.setPrefHeight(157);
//									     but9.setPrefWidth(191);
//									     but9.setLayoutX(730);
//									     but9.setLayoutY(335);
//									     but9.setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
									     
									     
		player1= new Label(" Player 1 ");
		player1.setTextFill(Color.WHITE);
		player1.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
		player1.setMinWidth(100);
		
		player2= new Label(" Player 2 ");
		player2.setTextFill(Color.WHITE);
		player2.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
		player2.setMinWidth(100);
		
		select1= new Label(" Select Value ");
		select1.setTextFill(Color.WHITE);
		select1.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
		select1.setMinWidth(100);
		
		select2= new Label(" Select Value ");
		select2.setTextFill(Color.WHITE);
		select2.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
		select2.setMinWidth(100);
		
		scoreplayer1= new Label(" Score ");
		scoreplayer1.setTextFill(Color.WHITE);
		scoreplayer1.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
		scoreplayer1.setMinWidth(100);
		
		scoreplayer2= new Label(" Score ");
		scoreplayer2.setTextFill(Color.WHITE);
		scoreplayer2.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,35));
		scoreplayer2.setMinWidth(100);
		
		name1=new Label();
		name1.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,25));
		name1.setMinSize(150, 50);
		name1.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 300px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;"
			        );
		name1.setTextFill(Color.BLACK);
		
		
		name2=new Label();
		name2.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,25));
		name2.setMinSize(150, 50);
		name2.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 300px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;"
			        );
		name2.setTextFill(Color.BLACK);
		
		score1=new Label();
		score1.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,40));
		score1.setMinSize(150, 50);
		score1.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;"
			        );
		score1.setTextFill(Color.BLACK);
		
		score2=new Label();
		score2.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,40));
		score2.setMinSize(150, 50);
		score2.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;"
			        );
		score2.setTextFill(Color.BLACK);
		
		
		
		score2=new Label();
		score2.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,40));
		score2.setMinSize(150, 50);
		score2.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;"
			        );
		score2.setTextFill(Color.BLACK);
		
		
		
//		round=new Label("Round");
//		round.setTextFill(Color.WHITE);
//		round.setFont(Font.font("BankGothic LT BT", FontWeight.BOLD, FontPosture.ITALIC,40));
//		round.setMinWidth(100);
		round= new Label(" Round : ");
		round.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,40));
		round.setMinSize(150, 50);
		round.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;"
			        );
		round.setTextFill(Color.BLACK);	
		
		from=new Label();
		from.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,60));
		from.setMinSize(150, 50);
		from.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 150px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;"
			        );
		from.setTextFill(Color.BLACK);	
		
		to=new Label();
		to.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,60));
		to.setMinSize(150, 50);
		to.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 150px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: white;"
			        );
		to.setTextFill(Color.BLACK);	
		
		bet=new Label(" / ");
		bet.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,60));
		bet.setMinSize(100, 50);
		bet.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 100px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: black;"
			        );
		bet.setTextFill(Color.YELLOW);	
		
		vbox1.getChildren().addAll(player1,name1,scoreplayer1,score1,select1);
		vbox1.setLayoutX(20);
		vbox1.setLayoutY(20);
		
		vbox2.getChildren().addAll(player2,name2,scoreplayer2,score2,select2);
		vbox2.setLayoutX(940);
		vbox2.setLayoutY(20);
		
		Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/startback.png");
		ImageView mg = new ImageView(m);
		mg.setFitHeight(650);
		mg.setFitWidth(1250);
		
		hbox.getChildren().addAll(round,from,bet,to);
		hbox.setLayoutX(300);
		hbox.setLayoutY(550);
		endgame= new Button(" End Game ");
		endgame.setFont(Font.font("BankGothic LT BT", FontWeight.SEMI_BOLD, FontPosture.ITALIC,35));
		endgame.setMinSize(150, 50);
		endgame.setStyle(
			        "-fx-background-radius: 10em; " +
			                "-fx-min-width: 200px; " +
			                "-fx-min-height: 50px; " +
			                "-fx-max-width: 250px; " +
			                "-fx-max-height: 150px; " +"-fx-background-color: red;"
			        );
		 
		endgame.setTextFill(Color.BLACK);
		endgame.setLayoutX(1000);
		endgame.setLayoutY(550);
		
		
		Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/X%26OBOARD.jpg");
		ImageView mg2 = new ImageView(m2);
		mg2.setFitHeight(500);
		mg2.setFitWidth(600);
		mg2.setLayoutX(325);
		mg2.setLayoutY(0);
		gamegp.getChildren().addAll(mg,mg2,hbox,vbox1,vbox2,endgame);
	
	}

	public Label getPlayer1() {
		return player1;
	}

	public Label getPlayer2() {
		return player2;
	}

	public Label getScoreplayer1() {
		return scoreplayer1;
	}

	public Label getScoreplayer2() {
		return scoreplayer2;
	}

	public Label getName1() {
		return name1;
	}

	public Label getName2() {
		return name2;
	}

	public Label getScore1() {
		return score1;
	}

	public Label getScore2() {
		return score2;
	}

	public Label getRound() {
		return round;
	}

	public Label getFrom() {
		return from;
	}

	public Label getTo() {
		return to;
	}

	public Label getBet() {
		return bet;
	}

	public VBox getVbox1() {
		return vbox1;
	}

	public VBox getVbox2() {
		return vbox2;
	}

	public HBox getHbox() {
		return hbox;
	}

	public Button getEndgame() {
		return endgame;
	}

	public Group getGamegp() {
		return gamegp;
	}

	public void setPlayer1(Label player1) {
		this.player1 = player1;
	}

	public void setPlayer2(Label player2) {
		this.player2 = player2;
	}

	public void setScoreplayer1(Label scoreplayer1) {
		this.scoreplayer1 = scoreplayer1;
	}

	public void setScoreplayer2(Label scoreplayer2) {
		this.scoreplayer2 = scoreplayer2;
	}

	public void setName1(Label name1) {
		this.name1 = name1;
	}

	public void setName2(Label name2) {
		this.name2 = name2;
	}

	public void setScore1(Label score1) {
		this.score1 = score1;
	}

	public void setScore2(Label score2) {
		this.score2 = score2;
	}

	public void setRound(Label round) {
		this.round = round;
	}

	public void setFrom(Label from) {
		this.from = from;
	}

	public void setTo(Label to) {
		this.to = to;
	}

	public void setBet(Label bet) {
		this.bet = bet;
	}

	public void setVbox1(VBox vbox1) {
		this.vbox1 = vbox1;
	}

	public void setVbox2(VBox vbox2) {
		this.vbox2 = vbox2;
	}

	public void setHbox(HBox hbox) {
		this.hbox = hbox;
	}

	public void setEndgame(Button endgame) {
		this.endgame = endgame;
	}

	public void setGamegp(Group gamegp) {
		this.gamegp = gamegp;
	}

	public Label getSelect1() {
		return select1;
	}

	public Label getSelect2() {
		return select2;
	}


	public GridPane getGrid() {
		return grid;
	}

	public void setSelect1(Label select1) {
		this.select1 = select1;
	}

	public void setSelect2(Label select2) {
		this.select2 = select2;
	}

	public void setGrid(GridPane grid) {
		this.grid = grid;
	}

}
