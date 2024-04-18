package application;	
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Main extends Application {

	public static int player1score;
	public static int player2score;
	public static int selectrounds;
	public static int currentround;
	public static char player1value;
	public static char player2value;
	public static String player1name;
	public static String player2name;
	public static int indexrow;
	public static int indexcolumns;
	public static int indexes=0;
	public static Integer maxvalues=Integer.MAX_VALUE;
	public static Integer minvalues=Integer.MIN_VALUE;
	public static int valgame=0;
	public static Button [] button = new Button[9];
	public static Square [][] values = new Square[3][3] ;
	public static boolean endGame=false;
	public static ArrayList<TableCellData> poslist = new ArrayList<>();

	Stage stage1 = new Stage();
	Stage stage2= new Stage();
	Stage stage3 = new Stage();
	Stage stage4 = new Stage();
	Stage stage5 = new Stage();
	Stage stage6 = new Stage();
	Stage stage7 = new Stage();
	
	
	
	MainPage mainpage = new MainPage();
	StartPage startpage= new StartPage();
	Option1Beforestart  op1screen = new Option1Beforestart();
	Game game = new Game();
	Possiblesprints pos= new Possiblesprints();
	winscreen wins= new winscreen();
	STOP stop = new STOP();
	
	Pane p = new Pane();
	Pane p2 = new Pane();
	Pane p3 = new Pane();
	
	Scene scene1 = new Scene(mainpage.getGp(),1250,650);
	Scene scene2 = new Scene(startpage.getBp(),1250,650);
	Scene scene3 = new Scene(op1screen.getOp1gp(),1250,650);
	Scene scene4 = new Scene(game.getGamegp(),1250,650);
	Scene scene5 = new Scene(wins.getGp(),800,400);
	Scene scene6 = new Scene(pos.getGppo(),600,400);
	Scene scene7 = new Scene(stop.getBorder(),800,300);
	
	
	 Color evenDarkerGray = Color.rgb(50, 50, 50); 
	@Override
	public void start(Stage primaryStage) {
		try {
			
			button[0]=new Button();
			button[0].setPrefHeight(157);
			button[0].setPrefWidth(191);
			button[0].setLayoutX(332);
			button[0].setLayoutY(5);
			button[0].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
		    button[0].setText(null);
		    button[0].setDisable(false);

	        // Additional style for button[0]
	        button[0].setStyle(button[0].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			
			button[1]=new Button();
			button[1].setPrefHeight(157);
			button[1].setPrefWidth(191);
			button[1].setLayoutX(530);
			button[1].setLayoutY(5);
			button[1].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
			button[1].setText(null);
			button[1].setDisable(false);
			 button[1].setStyle(button[1].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			button[2]= new Button();
			button[2].setPrefHeight(157);
			button[2].setPrefWidth(191);
			button[2].setLayoutX(730);
			button[2].setLayoutY(5);
			button[2].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
			button[2].setText(null);
			button[2].setDisable(false);
			 button[2].setStyle(button[2].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			button[3]= new Button();
			button[3].setPrefHeight(157);
			button[3].setPrefWidth(191);
			button[3].setLayoutX(332);
			button[3].setLayoutY(170);
			button[3].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
			button[3].setText(null);
			button[3].setDisable(false);
			 button[3].setStyle(button[3].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			button[4]= new Button();
			button[4].setPrefHeight(157);
			button[4].setPrefWidth(191);
			button[4].setLayoutX(530);
			button[4].setLayoutY(170);
			button[4].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
			button[4].setText(null);
			button[4].setDisable(false);
			 button[4].setStyle(button[4].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			button[5]= new Button();
			button[5].setPrefHeight(157);
			button[5].setPrefWidth(191);
			button[5].setLayoutX(730);
			button[5].setLayoutY(170);
			button[5].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
			button[5].setText(null);
			button[5].setDisable(false);
			 button[5].setStyle(button[5].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			button[6]= new Button();
			button[6].setPrefHeight(157);
			button[6].setPrefWidth(191);
			button[6].setLayoutX(332);
			button[6].setLayoutY(335);
			button[6].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
			button[6].setText(null);
			button[6].setDisable(false); 
			 button[6].setStyle(button[6].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			button[7]= new Button();
			button[7].setPrefHeight(157);
			button[7].setPrefWidth(191);
			button[7].setLayoutX(530);
			button[7].setLayoutY(335);
			button[7].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
			button[7].setText(null);
			button[7].setDisable(false);
			 button[7].setStyle(button[7].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			
			button[8]= new Button();
			button[8].setPrefHeight(157);
			button[8].setPrefWidth(191);
			button[8].setLayoutX(730);
			button[8].setLayoutY(335);
			button[8].setStyle("-fx-background-color: #" + evenDarkerGray.toString().substring(2) + "; -fx-text-fill: white;");
			button[8].setText(null);
			button[8].setDisable(false);
			 button[8].setStyle(button[8].getStyle() + "-fx-font-size: 60px;  -fx-text-fill: yellow;");
			
			 pos.getOk().setOnAction(e->{
				 stage6.close();
			 });
			 stop.getCont().setOnAction(e->{
				 stage7.close();
			 });
			 stop.getOk().setOnAction(e->{
				 indexes=0;
				   player1value=' ';
						player2value=' ';
						player1name="";
						player2name="";
						player1score=0;
						player2score=0;
						currentround=0;
						selectrounds=0;
						valgame=0;
						endGame=false;
						indexrow=0;
						indexcolumns=0;
						poslist.clear();
						for (int i = 0; i < values.length; i++) {
							for (int j = 0; j < values.length; j++) {
								values[i][j].setValue(' ');
								values[i][j].setVisit(false);
							}
						}
						
						for (int i = 0; i < button.length; i++) {
							button[i].setText(null);
							button[i].setDisable(false);
						}
						op1screen.getComp1().setSelected(false);
						op1screen.getComp2().setSelected(false);
						op1screen.getCompvalo().setSelected(false);
						op1screen.getCompvalx().setSelected(false);
						op1screen.getComputertext().setText(null);
						op1screen.getPlaye1().setSelected(false);
						op1screen.getPlaye2().setSelected(false);
						op1screen.getPlayervalx().setSelected(false);
						op1screen.getPlayervalo().setSelected(false);
						op1screen.getPlayertext().setText(null);
						startpage.getOption1().setSelected(false);
						startpage.getOption2().setSelected(false);
						startpage.getOption3().setSelected(false);
					    op1screen.getRoundtext().setText(null);
					    game.getScore1().setText(null);
					    game.getFrom().setText(null);
					    game.getTo().setText(null);
					    game.getScore2().setText(null);
						game.getName1().setText(null);
					    game.getName2().setText(null);
					    p2.getChildren().clear();
					    p.getChildren().clear();
					    p3.getChildren().clear();
					    game.getGamegp().getChildren().remove(p2);
					    game.getGamegp().getChildren().remove(p);
				    wins.getGp().getChildren().remove(p3);
				    wins.getPlayer1name().setText(null);
				    wins.getPlayer2name().setText(null);
				    wins.getPlayer2score().setText(null);
				    wins.getPlayer1score().setText(null);
				    stage5.close();
				    stage1.close();
				    stage2.close();
				    stage3.close();
				    stage4.close();
				    stage6.close();
				    stage7.close();
					stage1.setScene(scene1);
					stage1.show(); 
			 });
//			TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(3), mainpage.getTxto());
//			mainpage.getTxto().setTranslateY(-200);
//			   translateTransition.setToY(200);
//                 translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
//                 translateTransition.setAutoReverse(true);
//                  translateTransition.play();
//                  TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(3),mainpage.getBlackStrokeTexto());
//                  mainpage.getBlackStrokeTexto().setTranslateY(-200);
//      		        translateTransition1.setToY(200);
//                       translateTransition1.setCycleCount(TranslateTransition.INDEFINITE);
//                       translateTransition1.setAutoReverse(true);
//                        translateTransition1.play();
//                        TranslateTransition translateTransition2 = new TranslateTransition(Duration.seconds(3), mainpage.getTxtx());
//            			mainpage.getTxtx().setTranslateY(-200);
//            		        translateTransition2.setToY(200);
//                             translateTransition2.setCycleCount(TranslateTransition.INDEFINITE);
//                             translateTransition2.setAutoReverse(true);
//                              translateTransition2.play();
//                              TranslateTransition translateTransition3 = new TranslateTransition(Duration.seconds(3),mainpage.getBlackStrokeTextx());
//                              mainpage.getBlackStrokeTextx().setTranslateY(-200);
//                  		        translateTransition3.setToY(200);
//                                   translateTransition3.setCycleCount(TranslateTransition.INDEFINITE);
//                                   translateTransition3.setAutoReverse(true);
//                                    translateTransition3.play();
			stage1.setScene(scene1);
			stage1.show();
			game.getEndgame().setOnAction(e->{
				   player1value=' ';
					player2value=' ';
					player1name="";
					player2name="";
					player1score=0;
					player2score=0;
					currentround=0;
					selectrounds=0;
					valgame=0;
					endGame=false;
					indexrow=0;
					indexcolumns=0;
					poslist.clear();
					for (int i = 0; i < values.length; i++) {
						for (int j = 0; j < values.length; j++) {
							values[i][j].setValue(' ');
							values[i][j].setVisit(false);
						}
					}
					
					for (int i = 0; i < button.length; i++) {
						button[i].setText(null);
						button[i].setDisable(false);
					}
					op1screen.getComp1().setSelected(false);
					op1screen.getComp2().setSelected(false);
					op1screen.getCompvalo().setSelected(false);
					op1screen.getCompvalx().setSelected(false);
					op1screen.getComputertext().setText(null);
					op1screen.getPlaye1().setSelected(false);
					op1screen.getPlaye2().setSelected(false);
					op1screen.getPlayervalx().setSelected(false);
					op1screen.getPlayervalo().setSelected(false);
					op1screen.getPlayertext().setText(null);
					startpage.getOption1().setSelected(false);
					startpage.getOption2().setSelected(false);
					startpage.getOption3().setSelected(false);
				    op1screen.getRoundtext().setText(null);
				    game.getScore1().setText(null);
				    game.getFrom().setText(null);
				    game.getTo().setText(null);
				    game.getScore2().setText(null);
					game.getName1().setText(null);
				    game.getName2().setText(null);
				    p2.getChildren().clear();
				    p.getChildren().clear();
				    p3.getChildren().clear();
				    game.getGamegp().getChildren().remove(p2);
				    game.getGamegp().getChildren().remove(p);
			    wins.getGp().getChildren().remove(p3);
			    wins.getPlayer1name().setText(null);
			    wins.getPlayer2name().setText(null);
			    wins.getPlayer2score().setText(null);
			    wins.getPlayer1score().setText(null);
			    stage5.close();
			    stage1.close();
			    stage2.close();
			    stage3.close();
			    stage4.close();
			    stage6.close();
				stage1.setScene(scene1);
				stage1.show();
			});
			mainpage.getLetstart().setOnAction(e->{
				TranslateTransition translateTransition4 = new TranslateTransition(Duration.seconds(3), startpage.getTxto());
				startpage.getTxto().setTranslateY(-200);
				   translateTransition4.setToY(200);
	                 translateTransition4.setCycleCount(TranslateTransition.INDEFINITE);
	                 translateTransition4.setAutoReverse(true);
	                  translateTransition4.play();
	                  TranslateTransition translateTransition5 = new TranslateTransition(Duration.seconds(3),startpage.getBlackStrokeTexto());
	                  startpage.getBlackStrokeTexto().setTranslateY(-200);
	      		           translateTransition5.setToY(200);
	                       translateTransition5.setCycleCount(TranslateTransition.INDEFINITE);
	                       translateTransition5.setAutoReverse(true);
	                       translateTransition5.play();
	                        TranslateTransition translateTransition6 = new TranslateTransition(Duration.seconds(3), startpage.getTxtx());
	                        startpage.getTxtx().setTranslateY(-200);
	            		        translateTransition6.setToY(200);
	                            translateTransition6.setCycleCount(TranslateTransition.INDEFINITE);
	                            translateTransition6.setAutoReverse(true);
	                            translateTransition6.play();
	                              TranslateTransition translateTransition7 = new TranslateTransition(Duration.seconds(3),startpage.getBlackStrokeTextx());
	                              startpage.getBlackStrokeTextx().setTranslateY(-200);
	                  		           translateTransition7.setToY(200);
	                                   translateTransition7.setCycleCount(TranslateTransition.INDEFINITE);
	                                   translateTransition7.setAutoReverse(true);
	                                   translateTransition7.play();
				stage2.setScene(scene2);
				stage2.show();
			});
			
			startpage.getMainpagebutton().setOnAction(e->{
				stage2.close();
				stage1.setScene(scene1);
				op1screen.getComp2().setSelected(false);
				op1screen.getComp1().setSelected(false);
				op1screen.getPlaye1().setSelected(false);
				op1screen.getPlaye2().setSelected(false);
				op1screen.getCompvalo().setSelected(false);
				op1screen.getCompvalx().setSelected(false);
				op1screen.getPlayervalo().setSelected(false);
				op1screen.getPlayervalx().setSelected(false);
				startpage.getOption2().setSelected(false);
				startpage.getOption1().setSelected(false);
				startpage.getOption3().setSelected(false);
				stage1.show();
			});
			
			startpage.getOption1().setOnAction(e->{
				op1screen.getComputertext().setText(" Computer ");
				op1screen.getComputertext().setEditable(false);
				stage3.setScene(scene3);
				stage3.show();
				stage1.close();
				stage2.close();
				startpage.getOption2().setSelected(false);
				startpage.getOption3().setSelected(false);
			});
			
			startpage.getOption2().setOnAction(e->{
                 op1screen.getComputerlabel().setText("Player Name : ");
                 op1screen.getComputernum().setText("Player Number : ");
            op1screen.getComputervalue().setText("Player Value :     ");
            op1screen.getComputertext().setText(null);
             stage3.setScene(scene3);
             stage3.show();	
             stage1.close();
			stage2.close();
			
			startpage.getOption1().setSelected(false);
			startpage.getOption3().setSelected(false);
			
			});
			startpage.getOption3().setOnAction(e->{
				op1screen.getComputertext().setText(" Computer ");
				op1screen.getComputertext().setEditable(false);
				stage3.setScene(scene3);
				stage3.show();
				stage1.close();
				stage2.close();
				startpage.getOption1().setSelected(false);
				startpage.getOption2().setSelected(false);
			});
			op1screen.getMainpage().setOnAction(e->{
				stage1.setScene(scene1);
				stage1.show();
				op1screen.getComp2().setSelected(false);
				op1screen.getComp1().setSelected(false);
				op1screen.getPlaye1().setSelected(false);
				op1screen.getPlaye2().setSelected(false);
				op1screen.getCompvalo().setSelected(false);
				op1screen.getCompvalx().setSelected(false);
				op1screen.getPlayervalo().setSelected(false);
				op1screen.getPlayervalx().setSelected(false);
				startpage.getOption2().setSelected(false);
				startpage.getOption1().setSelected(false);
				startpage.getOption3().setSelected(false);
				stage3.close();
				
			});
			op1screen.getPlaye1().setOnAction(e->{
				if(op1screen.getPlaye1().isSelected()==true) {
				op1screen.getComp1().setSelected(false);
				op1screen.getPlaye2().setSelected(false);
				op1screen.getComp2().setSelected(true);
				}
				else {
					op1screen.getComp1().setSelected(false);
					op1screen.getPlaye2().setSelected(false);
					op1screen.getComp2().setSelected(false);
				}
			});
			op1screen.getPlaye2().setOnAction(e->{
				if(op1screen.getPlaye2().isSelected()==true) {
				op1screen.getComp2().setSelected(false);
				op1screen.getPlaye1().setSelected(false);
				op1screen.getComp1().setSelected(true);
				}
				else {
					op1screen.getComp2().setSelected(false);
					op1screen.getPlaye1().setSelected(false);
					op1screen.getComp1().setSelected(false);
				}
			});
			op1screen.getComp1().setOnAction(e->{
				if(op1screen.getComp1().isSelected()==true) {
				op1screen.getComp2().setSelected(false);
				op1screen.getPlaye1().setSelected(false);
				op1screen.getPlaye2().setSelected(true);
				}
				else{
					op1screen.getComp2().setSelected(false);
					op1screen.getPlaye1().setSelected(false);
					op1screen.getPlaye2().setSelected(false);
					
				}
			});
			op1screen.getComp2().setOnAction(e->{
				if(op1screen.getComp2().isSelected()==true) {
				op1screen.getComp1().setSelected(false);
				op1screen.getPlaye2().setSelected(false);
				op1screen.getPlaye1().setSelected(true);
				}
				else {
					op1screen.getComp1().setSelected(false);
					op1screen.getPlaye2().setSelected(false);
					op1screen.getPlaye1().setSelected(false);
				}
			});
			
			
			op1screen.getPlayervalx().setOnAction(e->{
				if(op1screen.getPlayervalx().isSelected()==true) {
				op1screen.getCompvalx().setSelected(false);
				op1screen.getPlayervalo().setSelected(false);
				op1screen.getCompvalo().setSelected(true);
				}
				else {
					op1screen.getCompvalx().setSelected(false);
					op1screen.getPlayervalo().setSelected(false);
					op1screen.getCompvalo().setSelected(false);
				}
			});
			op1screen.getPlayervalo().setOnAction(e->{
				if(op1screen.getPlayervalo().isSelected()==true) {
				op1screen.getCompvalo().setSelected(false);
				op1screen.getPlayervalx().setSelected(false);
				op1screen.getCompvalx().setSelected(true);
				}
				else {
					op1screen.getCompvalo().setSelected(false);
					op1screen.getPlayervalx().setSelected(false);
					op1screen.getCompvalx().setSelected(false);
				}
			});
			op1screen.getCompvalx().setOnAction(e->{
				if(op1screen.getCompvalx().isSelected()==true) {
				op1screen.getCompvalo().setSelected(false);
				op1screen.getPlayervalx().setSelected(false);
				op1screen.getPlayervalo().setSelected(true);
				}
				else{
					op1screen.getCompvalo().setSelected(false);
					op1screen.getPlayervalx().setSelected(false);
					op1screen.getPlayervalo().setSelected(false);
					
				}
			});
			op1screen.getCompvalo().setOnAction(e->{
				if(op1screen.getCompvalo().isSelected()==true) {
				op1screen.getCompvalx().setSelected(false);
				op1screen.getPlayervalo().setSelected(false);
				op1screen.getPlayervalx().setSelected(true);
				}
				else {
					op1screen.getCompvalx().setSelected(false);
					op1screen.getPlayervalo().setSelected(false);
					op1screen.getPlayervalx().setSelected(false);
				}
			});
			
			op1screen.getStartbutton().setOnAction(e->{
			     player1score=0;
				 player2score=0;
				 selectrounds=0;
				 currentround=0;
					stage4.setScene(scene4);
					stage4.show();
				if(startpage.getOption1().isSelected()==true) {
					if(op1screen.getPlaye1().isSelected()==true && op1screen.getPlayervalx().isSelected()==true) {
						Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
						ImageView mg1 = new ImageView(m1);
						mg1.setFitHeight(100);
						mg1.setFitWidth(100);
						mg1.setLayoutX(80);
						mg1.setLayoutY(370);
						Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
						ImageView mg2 = new ImageView(m2);
						mg2.setFitHeight(100);
						mg2.setFitWidth(100);
						mg2.setLayoutX(1000);
						mg2.setLayoutY(370);
						p.getChildren().addAll(mg1,mg2);
						game.getGamegp().getChildren().add(p);
					game.getName1().setText(op1screen.getPlayertext().getText());
					game.getName2().setText(op1screen.getComputertext().getText());
					game.getName1().setAlignment(Pos.CENTER);
					game.getName2().setAlignment(Pos.CENTER);
					}
					else if(op1screen.getPlaye1().isSelected()==true && op1screen.getPlayervalo().isSelected()==true) {
						game.getName1().setText(op1screen.getPlayertext().getText());
						game.getName2().setText(op1screen.getComputertext().getText());
						game.getName1().setAlignment(Pos.CENTER);
						game.getName2().setAlignment(Pos.CENTER);
						Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
						ImageView mg1 = new ImageView(m1);
						mg1.setFitHeight(100);
						mg1.setFitWidth(100);
						mg1.setLayoutX(80);
						mg1.setLayoutY(370);
						Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
						ImageView mg2 = new ImageView(m2);
						mg2.setFitHeight(100);
						mg2.setFitWidth(100);
						mg2.setLayoutX(1000);
						mg2.setLayoutY(370);
						p.getChildren().addAll(mg1,mg2);
						game.getGamegp().getChildren().add(p);
					}
					else if(op1screen.getPlaye2().isSelected()==true && op1screen.getPlayervalx().isSelected()==true) {
						game.getName1().setText(op1screen.getComputertext().getText());
						game.getName2().setText(op1screen.getPlayertext().getText());
						game.getName1().setAlignment(Pos.CENTER);
						game.getName2().setAlignment(Pos.CENTER);
						Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
						ImageView mg1 = new ImageView(m1);
						mg1.setFitHeight(100);
						mg1.setFitWidth(100);
						mg1.setLayoutX(80);
						mg1.setLayoutY(370);
						Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
						ImageView mg2 = new ImageView(m2);
						mg2.setFitHeight(100);
						mg2.setFitWidth(100);
						mg2.setLayoutX(1000);
						mg2.setLayoutY(370);
						p.getChildren().addAll(mg1,mg2);
						game.getGamegp().getChildren().add(p);
						
					}
					else if(op1screen.getPlaye2().isSelected()==true && op1screen.getPlayervalo().isSelected()==true) {
						game.getName1().setText(op1screen.getComputertext().getText());
						game.getName2().setText(op1screen.getPlayertext().getText());
						game.getName1().setAlignment(Pos.CENTER);
						game.getName2().setAlignment(Pos.CENTER);
						Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
						ImageView mg1 = new ImageView(m1);
						mg1.setFitHeight(100);
						mg1.setFitWidth(100);
						mg1.setLayoutX(80);
						mg1.setLayoutY(370);
						Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
						ImageView mg2 = new ImageView(m2);
						mg2.setFitHeight(100);
						mg2.setFitWidth(100);
						mg2.setLayoutX(1000);
						mg2.setLayoutY(370);
						p.getChildren().addAll(mg1,mg2);
						game.getGamegp().getChildren().add(p);
						
					}
				}
				else if(startpage.getOption2().isSelected()==true) {
					if(op1screen.getPlaye1().isSelected()==true && op1screen.getPlayervalx().isSelected()==true) {
						game.getName1().setText(op1screen.getPlayertext().getText());
						game.getName2().setText(op1screen.getComputertext().getText());
						game.getName1().setAlignment(Pos.CENTER);
						game.getName2().setAlignment(Pos.CENTER);
						Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
						ImageView mg1 = new ImageView(m1);
						mg1.setFitHeight(100);
						mg1.setFitWidth(100);
						mg1.setLayoutX(80);
						mg1.setLayoutY(370);
						Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
						ImageView mg2 = new ImageView(m2);
						mg2.setFitHeight(100);
						mg2.setFitWidth(100);
						mg2.setLayoutX(1000);
						mg2.setLayoutY(370);
						p.getChildren().addAll(mg1,mg2);
						game.getGamegp().getChildren().add(p);
						}
						else if(op1screen.getPlaye1().isSelected()==true && op1screen.getPlayervalo().isSelected()==true) {
							game.getName1().setText(op1screen.getPlayertext().getText());
							game.getName2().setText(op1screen.getComputertext().getText());
							game.getName1().setAlignment(Pos.CENTER);
							game.getName2().setAlignment(Pos.CENTER);
							Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
							ImageView mg1 = new ImageView(m1);
							mg1.setFitHeight(100);
							mg1.setFitWidth(100);
							mg1.setLayoutX(80);
							mg1.setLayoutY(370);
							Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
							ImageView mg2 = new ImageView(m2);
							mg2.setFitHeight(100);
							mg2.setFitWidth(100);
							mg2.setLayoutX(1000);
							mg2.setLayoutY(370);
							p.getChildren().addAll(mg1,mg2);
							game.getGamegp().getChildren().add(p);
						}
						else if(op1screen.getPlaye2().isSelected()==true && op1screen.getPlayervalx().isSelected()==true) {
							game.getName1().setText(op1screen.getComputertext().getText());
							game.getName2().setText(op1screen.getPlayertext().getText());
							game.getName1().setAlignment(Pos.CENTER);
							game.getName2().setAlignment(Pos.CENTER);
							Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
							ImageView mg1 = new ImageView(m1);
							mg1.setFitHeight(100);
							mg1.setFitWidth(100);
							mg1.setLayoutX(80);
							mg1.setLayoutY(370);
							Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
							ImageView mg2 = new ImageView(m2);
							mg2.setFitHeight(100);
							mg2.setFitWidth(100);
							mg2.setLayoutX(1000);
							mg2.setLayoutY(370);
							p.getChildren().addAll(mg1,mg2);
							game.getGamegp().getChildren().add(p);
						}
						else if(op1screen.getPlaye2().isSelected()==true && op1screen.getPlayervalo().isSelected()==true) {
							game.getName1().setText(op1screen.getComputertext().getText());
							game.getName2().setText(op1screen.getPlayertext().getText());
							game.getName1().setAlignment(Pos.CENTER);
							game.getName2().setAlignment(Pos.CENTER);
							Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
							ImageView mg1 = new ImageView(m1);
							mg1.setFitHeight(100);
							mg1.setFitWidth(100);
							mg1.setLayoutX(80);
							mg1.setLayoutY(370);
							Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
							ImageView mg2 = new ImageView(m2);
							mg2.setFitHeight(100);
							mg2.setFitWidth(100);
							mg2.setLayoutX(1000);
							mg2.setLayoutY(370);
							p.getChildren().addAll(mg1,mg2);
							game.getGamegp().getChildren().add(p);
						}
				}
				else if(startpage.getOption3().isSelected()==true) {
					if(op1screen.getPlaye1().isSelected()==true && op1screen.getPlayervalx().isSelected()==true) {
						game.getName1().setText(op1screen.getPlayertext().getText());
						game.getName2().setText(op1screen.getComputertext().getText());
						game.getName1().setAlignment(Pos.CENTER);
						game.getName2().setAlignment(Pos.CENTER);
						Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
						ImageView mg1 = new ImageView(m1);
						mg1.setFitHeight(100);
						mg1.setFitWidth(100);
						mg1.setLayoutX(80);
						mg1.setLayoutY(370);
						Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
						ImageView mg2 = new ImageView(m2);
						mg2.setFitHeight(100);
						mg2.setFitWidth(100);
						mg2.setLayoutX(1000);
						mg2.setLayoutY(370);
						p.getChildren().addAll(mg1,mg2);
						game.getGamegp().getChildren().add(p);
						}
						else if(op1screen.getPlaye1().isSelected()==true && op1screen.getPlayervalo().isSelected()==true) {
							game.getName1().setText(op1screen.getPlayertext().getText());
							game.getName2().setText(op1screen.getComputertext().getText());
							game.getName1().setAlignment(Pos.CENTER);
							game.getName2().setAlignment(Pos.CENTER);
							Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
							ImageView mg1 = new ImageView(m1);
							mg1.setFitHeight(100);
							mg1.setFitWidth(100);
							mg1.setLayoutX(80);
							mg1.setLayoutY(370);
							Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
							ImageView mg2 = new ImageView(m2);
							mg2.setFitHeight(100);
							mg2.setFitWidth(100);
							mg2.setLayoutX(1000);
							mg2.setLayoutY(370);
							p.getChildren().addAll(mg1,mg2);
							game.getGamegp().getChildren().add(p);
						}
						else if(op1screen.getPlaye2().isSelected()==true && op1screen.getPlayervalx().isSelected()==true) {
							game.getName1().setText(op1screen.getComputertext().getText());
							game.getName2().setText(op1screen.getPlayertext().getText());
							game.getName1().setAlignment(Pos.CENTER);
							game.getName2().setAlignment(Pos.CENTER);
							Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
							ImageView mg1 = new ImageView(m1);
							mg1.setFitHeight(100);
							mg1.setFitWidth(100);
							mg1.setLayoutX(80);
							mg1.setLayoutY(370);
							Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
							ImageView mg2 = new ImageView(m2);
							mg2.setFitHeight(100);
							mg2.setFitWidth(100);
							mg2.setLayoutX(1000);
							mg2.setLayoutY(370);
							p.getChildren().addAll(mg1,mg2);
							game.getGamegp().getChildren().add(p);
						}
						else if(op1screen.getPlaye2().isSelected()==true && op1screen.getPlayervalo().isSelected()==true) {
							game.getName1().setText(op1screen.getComputertext().getText());
							game.getName2().setText(op1screen.getPlayertext().getText());
							game.getName1().setAlignment(Pos.CENTER);
							game.getName2().setAlignment(Pos.CENTER);
							Image m1 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/XXXXX.png");
							ImageView mg1 = new ImageView(m1);
							mg1.setFitHeight(100);
							mg1.setFitWidth(100);
							mg1.setLayoutX(80);
							mg1.setLayoutY(370);
							Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/O.png");
							ImageView mg2 = new ImageView(m2);
							mg2.setFitHeight(100);
							mg2.setFitWidth(100);
							mg2.setLayoutX(1000);
							mg2.setLayoutY(370);
							p.getChildren().addAll(mg1,mg2);
							game.getGamegp().getChildren().add(p);
						}
				}
				
				game.getScore1().setText(String.valueOf(player1score));
				game.getScore1().setAlignment(Pos.CENTER);
				game.getScore2().setText(String.valueOf(player2score));
				game.getScore2().setAlignment(Pos.CENTER);
				selectrounds=Integer.parseInt(op1screen.getRoundtext().getText().trim());
				game.getTo().setText(String.valueOf(selectrounds).trim());
				game.getTo().setAlignment(Pos.CENTER);
				 currentround=1;
				 game.getFrom().setText(String.valueOf(currentround).trim());
				 game.getFrom().setAlignment(Pos.CENTER);
				 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
					game.getGamegp().getChildren().add(p2);
				if(op1screen.getPlaye1().isSelected()==true && op1screen.getPlaye2().isSelected()==false) {
					player1name=op1screen.getPlayertext().getText().trim();
					player2name=op1screen.getComputertext().getText().trim();
					if(op1screen.getPlayervalx().isSelected()==true&& op1screen.getPlayervalo().isSelected()==false) {
						player1value='X';
						player2value='O';
					}
					else {
						player2value='X';
						player1value='O';
					}
				}
				else {
					player2name=op1screen.getPlayertext().getText().trim();
					player1name=op1screen.getComputertext().getText().trim();
					if(op1screen.getPlayervalx().isSelected()==true&& op1screen.getPlayervalo().isSelected()==false) {
						player1value='O';
						player2value='X';
					}
					else {
						player2value='O';
						player1value='X';
					}
				}
				 System.out.println(" The Palyer 1 : "+player1name+" The value is : "+ player1value);
				 System.out.println(" The Palyer 2 : "+player2name+" The value is : "+ player2value);
				 
				 for (int i = 0; i < 3; i++) {
			            for (int j = 0; j < 3; j++) {
			            	values[i][j]= new Square(' ',false);	
			            }
				  }

				 
				 
				 if(startpage.getOption2().isSelected()==true) {
					 setup2ButtonActions();				
				 }

					if(startpage.getOption1().isSelected()==true) {
						System.out.println("option1");
						System.out.println("The Player 1 names is "+ player1name);
						if(player1name.equalsIgnoreCase("Computer"))	{
							System.out.println("I am Here ");
							   Random r = new Random();
							   int indexrandom=0;
							   for(;;){
								   System.out.println("ehab");
								  indexrandom=r.nextInt(9);
								  int row=indexrandom/3;
								  int column= indexrandom%3;
								  if(values[row][column].getValue()==' '&& values[row][column].isVisit()==false) {
									  break;
								  }
							   }
							   
							   int res=indexrandom;
							   int rowres=res/3;
							   int columnres=res%3;
							   values[rowres][columnres].setValue(player1value);
							   values[rowres][columnres].setVisit(true);
							   button[res].setText(String.valueOf(player1value));
							   button[res].setDisable(true);
							   valgame=1-valgame;
							 
						}
						  setup1ButtonActions();
					}

                       if(startpage.getOption3().isSelected()==true) {
						System.out.println("option3");
						if(player1name.equalsIgnoreCase("Computer")) {
					        valgame=0;
					        Random r = new Random();
							   int indexrandom=0;
							   for(;;){
								   System.out.println("ehab");
								  indexrandom=r.nextInt(9);
								  int row=indexrandom/3;
								  int column= indexrandom%3;
								  if(values[row][column].getValue()==' '&& values[row][column].isVisit()==false) {
									  break;
								  }
							   }
							   
							   int res=indexrandom;
							   int rowres=res/3;
							   int columnres=res%3;
							   values[rowres][columnres].setValue(player1value);
							   values[rowres][columnres].setVisit(true);
							   button[res].setText(String.valueOf(player1value));
							   button[res].setDisable(true);
//					        resultmoves();
//					      System.out.println("res 0 is "+indexrow);
//					      System.out.println("res 1 is "+indexcolumns);
//					      int row=indexrow;
//					      int column = indexcolumns;
//					      pos.getRowlabel().setText(String.valueOf(row));
//					      pos.getColuknlabel().setText(String.valueOf(column));
//					      pos.getTableView().getItems().setAll(poslist);
//					      pos.getTableView().refresh();
//					      poslist.clear();
//					      	stage6.setScene(scene6);
//					      	stage6.show();
//					      indexrow=0;
//					      indexcolumns=0;
//					      int numofcoumns=3;
//					      int index = (row* numofcoumns)+column;
//					      button[index].setText(String.valueOf(player1value));
//					      button[index].setDisable(true);
//					      values [row][column].setValue(player1value);
		           for (int i = 0; i < values.length; i++) {
		               for (int j = 0; j < values.length; j++) {
		                   System.out.print(values[i][j].getValue() +"  ");
		               }
		               System.out.println();
		           }
						valgame=1-valgame;
						}
						 setup3ButtonActions();
                       }
			});
			
			op1screen.getClear1().setOnAction(e->{
				op1screen.getPlaye1().setSelected(false);
				op1screen.getPlaye2().setSelected(false);
				op1screen.getPlayervalx().setSelected(false);
				op1screen.getPlayervalo().setSelected(false);
				op1screen.getPlayertext().setText(null);
			});
			
			op1screen.getClear2().setOnAction(e->{
				op1screen.getComp1().setSelected(false);
				op1screen.getComp2().setSelected(false);
				op1screen.getCompvalo().setSelected(false);
				op1screen.getCompvalx().setSelected(false);
				op1screen.getComputertext().setText(null);
			});
			
	
			
	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void setup1ButtonActions() {
	    for (int i = 0; i <= 8; i++) {
	        final int ind = i;
	        button[ind].setOnAction(ex -> handle1ButtonClick(ind));
	    }
	}
	
	private void setup2ButtonActions() {
	    for (int i = 0; i <= 8; i++) {
	        final int ind = i;
	        button[ind].setOnAction(ex -> handle2ButtonClick(ind));
	    }
	}
	
	
	private void setup3ButtonActions() {
		 for (int i = 0; i <= 8; i++) {
		        final int ind = i;
		        button[ind].setOnAction(ex -> handle3ButtonClick(ind));
		    }
	}

	  static void resultmoves() {
		  if(player1name.equalsIgnoreCase("Computer")) {
	       findmove(player1value);
	       
	        if (indexrow != -1 && indexcolumns != -1) {
	             System.out.println("--> res moves  (" + indexrow + "-->  " + indexcolumns + ")");

	           
	             for (int i = 0; i < 3; i++) {
	                 for (int j = 0; j < 3; j++) {
	                     if (isEmptyvalues(i, j)) {
	                         selectmove(i, j, player2value); 
	                         int finalOutcome = checkminandmax(player1value, false);
	                         TableCellData p = new TableCellData(i,j,gametree(finalOutcome));
	                         trynextmove(i, j);
	                         
	                         poslist.add(p);
	                         System.out.println("Outcome for (" + i + ", " + j + "): " + gametree(finalOutcome));
	                     }
	                 }
	             }
	         }
		  }
	    }
	  
	  static void resultmove2() {
		  if(player2name.equalsIgnoreCase("Computer")) {
	         findmove2(player2value);

	         if (indexrow != -1 && indexcolumns != -1) {
	             System.out.println("Best Move: (" + indexrow + ", " + indexcolumns + ")");

	             // Print the final outcome for each cell after the computer's move
	             for (int i = 0; i < 3; i++) {
	                 for (int j = 0; j < 3; j++) {
	                     if (isEmptyvalues(i, j)) {
	                         selectmove(i, j, player1value); // Assuming the human makes the next move
	                         int finalOutcome = checkminandmax2(player2value, false);
	                         TableCellData p = new TableCellData(i,j,gametree(finalOutcome));
	                         trynextmove(i, j);
	                       
	                         poslist.add(p);
	                         System.out.println("Outcome for (" + i + ", " + j + "): " + gametree(finalOutcome));
	                     }
	                 }
	             }
	         }
		  }
	  }
	  static String gametree(int outcome) {
		    if (outcome == 1) {
		        return "Computer Wins";
		    } else if (outcome == -1) {
		        return "Player Wins";
		    } else {
		        return "Draw !";
		    }
		}  
	    
	  
	  static void findmove(char cplay) {
		    int res;
		   if ( cplay == player1value) { 
			   res = minvalues;
			   } else {
				   res = maxvalues;
				   }                                                                                                                                                  
		    for (int i = 0; i< 3; i++) {
		        for (int j = 0; j < 3; j++) {
		            if (isEmptyvalues(i, j)) {
		                selectmove(i, j,  cplay);
		                int scoreaftercheck = checkminandmax(player2value, false);
		                trynextmove(i, j);
		                if (cplay == player1value  &&  scoreaftercheck > res) {
		                    res =  scoreaftercheck;
		                    indexrow= i;
		                    indexcolumns = j;
		                } else if (cplay == player2value  &&  scoreaftercheck < res) {
		                    res =  scoreaftercheck;
		                    indexrow= i;
			                indexcolumns = j;
		                }
		            }
		        }
		    }

		}
		private static boolean isEmptyvalues(int row, int columns) {
		    return values[row][columns].getValue() == ' ' &&  values[row][columns].isVisit()==false ;
		}
		private static void  selectmove(int row, int columns, char plaervalue) {
		    values[row][columns].setValue(plaervalue);
		    values[row][columns].setVisit(true);
		}
		private static void trynextmove(int row, int columns) {
		    values[row][columns].setValue(' ');
		    values[row][columns].setVisit(false);
		}

	    static void findmove2(char cplay) { 
	        int res; 
	        if (cplay == player2value) {
	        	res = minvalues;
	        } else { 
	        	res = maxvalues; 
	        	}

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (isEmptyvalues(i, j)) {
	                	selectmove(i, j,  cplay);
	                	int scoreaftercheck = checkminandmax2(player1value, false);
	                	 trynextmove(i, j);
	                	 if (cplay == player2value && scoreaftercheck > res) {
	                		    res = scoreaftercheck;
	                		    indexrow = i;
	                		    indexcolumns = j;
	                		} else if (cplay == player1value && scoreaftercheck < res) {
	                		    res = scoreaftercheck;
	                		    indexrow = i;
	                		    indexcolumns = j;
	                		}
	                }
	            }
	        }
	    }
	    static int checkminandmax(char cpay, boolean maxornot) {
	        char valwins = winornot();
	        
	        //Recursions stop statements !!!
	        
	        // static evaluation function !!!
	       
	        if (valwins == player1value) {
	        	// which its computer player 
	            return 1;
	        } else if (valwins == player2value) {
	        	// person player and its good to take it 
	            return -1;
	        } else if (isBoardFull(values)) {
	        	// theres no winner because board is full
	            return 0;
	        }
	        
	        
	        int bestoptionselect;
	        if (maxornot) {
	        	bestoptionselect= minvalues;
	        } else {
	        	bestoptionselect = maxvalues;
	        }
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (isEmptyvalues(i, j)) {
	                	selectmove(i, j, cpay);
	                	 char currturns;
	                     if (maxornot==true) {
	                    	 currturns = player2value;
	                     } else {
	                    	 currturns = player1value;
	                     }
	                     boolean negmax=(!(maxornot));
	                     // now we negate the false to turn the computer is the max !
	                     
	                    int scoreaftercheck = checkminandmax(currturns, negmax);
	                    trynextmove(i, j);
	                    if (maxornot==true) {
	                    	if (scoreaftercheck > bestoptionselect) {
	                    	    bestoptionselect = scoreaftercheck;
	                    	}
	                    } else {
	                    	// for human score
	                    	if (scoreaftercheck < bestoptionselect) {
	                    	    bestoptionselect = scoreaftercheck;
	                    	}
	                    }
	                }
	            }
	        }
	        return bestoptionselect;
	    }

	    static int checkminandmax2(char cpay, boolean maxornot) {
	        char valwins = winornot();
	        if (valwins == player2value) {
	            return 1;
	        } else if (valwins == player1value) {
	            return -1;
	        } else if (isBoardFull(values)) {
	            return 0;
	        }

	        int bestOptionSelect;

	        if (maxornot) {
	            bestOptionSelect = minvalues;
	        } else {
	            bestOptionSelect = maxvalues;
	        }  
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (isEmptyvalues(i, j)) {
	                    selectmove(i, j, cpay);
	                    char currturns;
	                    if (maxornot) {
	                    	currturns = player1value;
	                    } else {
	                    	currturns = player2value;
	                    }
	                    boolean negMax = !(maxornot);
	                   
	                    int scoreAfterCheck = checkminandmax2(currturns, negMax);

	                    trynextmove(i, j);
	                    if (maxornot) {
	                    	// if is the computer we take the max score!!
	                        if (scoreAfterCheck > bestOptionSelect) {
	                            bestOptionSelect = scoreAfterCheck;
	                        }
	                    } else {
	                        if (scoreAfterCheck < bestOptionSelect) {
	                            bestOptionSelect = scoreAfterCheck;
	                        }
	                    }
	                }
	            }
	        }
	        return bestOptionSelect;
	    }

	private void handle3ButtonClick(int ind) {
	if(valgame==0 && !(player1name.equalsIgnoreCase("Computer"))){
			values[(ind / 3)][ind % 3].setValue(player1value);
		       values[(ind / 3)][ind % 3].setVisit(true);
		       System.out.println("ind value is " + ind);
		       button[ind].setText(String.valueOf(player1value));
		       button[ind].setDisable(true);
		       endGame=iswinroundornot(values,valgame);
		       if(endGame==true) {
		    	   Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
		        	 for(int i =0;i<=8;i++) {
		        		 button[i].setText(null);
		        		 button[i].setDisable(false);
		        	 }
		        	 for(int i=0;i<=2;i++) {
		        		 for(int j=0;j<=2;j++) {
		        			 values[i][j].setValue(' ');
		        			 values[i][j].setVisit(false);
		        		 }
		        		 
		        	 }
		        
		        	p2.getChildren().clear();
		        	game.getGamegp().getChildren().remove(p2);
		        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
		        	 game.getGamegp().getChildren().add(p2);
		        	 game.getScore1().setText(String.valueOf(player1score));
						game.getScore1().setAlignment(Pos.CENTER);
						game.getScore2().setText(String.valueOf(player2score));
						game.getScore2().setAlignment(Pos.CENTER);
		        	 currentround++;
		        	 game.getFrom().setText(String.valueOf(currentround));
		        	 valgame=0;	
		    	    });
		    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
		    	    pauseTimeline.play();
		       }
		       else {
		    	   valgame=1;
		    	   if(isBoardFull(values)==false) {
		    		   valgame=1;
		    		if(player2name.equalsIgnoreCase("Computer"))	{
		    			 resultmove2();
					      System.out.println("res 0 is "+indexrow);
					      System.out.println("res 1 is "+indexcolumns);
					      int row=indexrow;
					      int column = indexcolumns;
					      pos.getRowlabel().setText(String.valueOf(row));
					      pos.getColuknlabel().setText(String.valueOf(column));
					      pos.getTableView().getItems().setAll(poslist);
					      pos.getTableView().refresh();
					      poslist.clear();
					      	stage6.setScene(scene6);
					      	stage6.show();
					      indexrow=0;
					      indexcolumns=0;
					      int numofcoumns=3;
					      int index = (row* numofcoumns)+column;
					      button[index].setText(String.valueOf(player2value));
					      button[index].setDisable(true);
					      values [row][column].setValue(player2value);
		           for (int i = 0; i < values.length; i++) {
		               for (int j = 0; j < values.length; j++) {
		                   System.out.print(values[i][j].getValue() +"  ");
		               }
		               System.out.println();
		           }
						   endGame=iswinroundornot(values,valgame);
						   if(endGame==true) {
							   Duration pauseDuration = Duration.seconds(2);
					    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
							 //  FadeTransition fadeOut = new FadeTransition(Duration.seconds(5), p2);
						      //  fadeOut.setFromValue(1.0);
						       // fadeOut.setToValue(0.0);
						     //   fadeOut.setAutoReverse(true);

						        // Set the cycle count (you can adjust this based on your needs)
						   //     fadeOut.setCycleCount(1);
						      
//							   p2.getChildren().clear();
//					        	 game.getGamegp().getChildren().remove(p2);
					        	 for(int i =0;i<=8;i++) {
					        		 button[i].setText(null);
					        		 button[i].setDisable(false);
					        	 }
					        	 for(int i=0;i<=2;i++) {
					        		 for(int j=0;j<=2;j++) {
					        			 values[i][j].setValue(' ');
					        			 values[i][j].setVisit(false);
					        		 }
					        		 
					        	 }
					        
					        	 p2.getChildren().clear();
					        	 game.getGamegp().getChildren().remove(p2);
					        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
					        	 game.getGamegp().getChildren().add(p2);
					        	 game.getScore1().setText(String.valueOf(player1score));
									game.getScore1().setAlignment(Pos.CENTER);
									game.getScore2().setText(String.valueOf(player2score));
									game.getScore2().setAlignment(Pos.CENTER);
					        	 currentround++;
					        	 game.getFrom().setText(String.valueOf(currentround));
					        	 valgame=0;
					    	    });
					    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
					    	    pauseTimeline.play();
					       }
						   else {
							   valgame=0; 
						   }
						   
	        		}  
		       }
		       }
		       
		       if(endGame==false && isBoardFull(values)==true) {
//		    	   FadeTransition fadeOut = new FadeTransition(Duration.seconds(5), p2);
//		           fadeOut.setFromValue(1.0);
//		           fadeOut.setToValue(0.0);
//		           fadeOut.setAutoReverse(true);

		           // Set the cycle count (you can adjust this based on your needs)
		         //  fadeOut.setCycleCount(1);
		           // Create a sequential transition
		          
//
//		        	 p2.getChildren().clear();
//		        	 game.getGamegp().getChildren().remove(p2);
		    	   Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
		        	 for(int i =0;i<=8;i++) {
		        		 button[i].setText(null);
		        		 button[i].setDisable(false);
		        	 }
		        	 for(int i=0;i<=2;i++) {
		        		 for(int j=0;j<=2;j++) {
		        			 values[i][j].setValue(' ');
		        			 values[i][j].setVisit(false);
		        		 }
		        	 }
		        	
		        		    p2.getChildren().clear();
		        		    game.getGamegp().getChildren().remove(p2);
		        		    p2.getChildren().addAll(button[0], button[1], button[2], button[3], button[4], button[5], button[6], button[7], button[8]);
		        		    game.getGamegp().getChildren().add(p2);

		        	 game.getScore1().setText(String.valueOf(player1score));
						game.getScore1().setAlignment(Pos.CENTER);
						game.getScore2().setText(String.valueOf(player2score));
						game.getScore2().setAlignment(Pos.CENTER);
						
		        	 currentround++;
		        	 game.getFrom().setText(String.valueOf(currentround));
		        	 valgame=0;	
		    	    });
		    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
		    	    pauseTimeline.play();
		       }
		       if (currentround >selectrounds) {
		    	   stage6.close();
		    	   stage6.close();
		        	 wins.getPlayer1name().setText(player1name);
		 	        wins.getPlayer2name().setText(player2name);
		 	        wins.getPlayer1score().setText(String.valueOf(player1score));
		 	        wins.getPlayer2score().setText(String.valueOf(player2score));
		 	        if(player1score>player2score) {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        }
		 	        else if(player1score<player2score) {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        }
		 	        else {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        	
		 	        }
		 	        player1value=' ';
					player2value=' ';
					player1name="";
					player2name="";
					player1score=0;
					player2score=0;
					currentround=0;
					selectrounds=0;
					valgame=0;
					endGame=false;
					indexrow=0;
					indexcolumns=0;
					poslist.clear();
					for (int i = 0; i < values.length; i++) {
						for (int j = 0; j < values.length; j++) {
							values[i][j].setValue(' ');
							values[i][j].setVisit(false);
						}
					}
					
					for (int i = 0; i < button.length; i++) {
						button[i].setText(null);
						button[i].setDisable(false);
					}
					op1screen.getComp1().setSelected(false);
					op1screen.getComp2().setSelected(false);
					op1screen.getCompvalo().setSelected(false);
					op1screen.getCompvalx().setSelected(false);
					op1screen.getComputertext().setText(null);
					op1screen.getPlaye1().setSelected(false);
					op1screen.getPlaye2().setSelected(false);
					op1screen.getPlayervalx().setSelected(false);
					op1screen.getPlayervalo().setSelected(false);
					op1screen.getPlayertext().setText(null);
					startpage.getOption1().setSelected(false);
					startpage.getOption2().setSelected(false);
					startpage.getOption3().setSelected(false);
				    op1screen.getRoundtext().setText(null);
				    game.getScore1().setText(null);
				    game.getFrom().setText(null);
				    game.getTo().setText(null);
				    game.getScore2().setText(null);
					game.getName1().setText(null);
				    game.getName2().setText(null);
				    p2.getChildren().clear();
				    p.getChildren().clear();
				    game.getGamegp().getChildren().remove(p2);
				    game.getGamegp().getChildren().remove(p);
		 	        	 stage5.setScene(scene5);
		 		          stage5.show();
		 	          
		 	        }
			
			
		}
		 if(valgame==1 && !(player2name.equalsIgnoreCase("Computer"))) {
			 System.out.println("Iam inside here");
				   values[(ind / 3)][ind % 3].setValue(player2value);
			       values[(ind / 3)][ind % 3].setVisit(true);
			       System.out.println("ind value is " + ind);
			       button[ind].setText(String.valueOf(player2value));
			       button[ind].setDisable(true);
			       endGame=iswinroundornot(values,valgame);
			       if(endGame==true) {
			    	   Duration pauseDuration = Duration.seconds(2);
			    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
			    	   p2.getChildren().clear();
			        	 game.getGamegp().getChildren().remove(p2);
			        	 for(int i =0;i<=8;i++) {
			        		 button[i].setText(null);
			        		 button[i].setDisable(false);
			        	 }
			        	 for(int i=0;i<=2;i++) {
			        		 for(int j=0;j<=2;j++) {
			        			 values[i][j].setValue(' ');
			        			 values[i][j].setVisit(false);
			        		 }
			        		 
			        	 }
			        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
			        	 game.getGamegp().getChildren().add(p2);
			        	 game.getScore1().setText(String.valueOf(player1score));
							game.getScore1().setAlignment(Pos.CENTER);
							game.getScore2().setText(String.valueOf(player2score));
							game.getScore2().setAlignment(Pos.CENTER);
			        	 currentround++;
			        	 game.getFrom().setText(String.valueOf(currentround));
			        	 valgame=0;
			        		if(player1name.equalsIgnoreCase("Computer"))	{
			        		       valgame=0;
			       		        Random r = new Random();
								   int indexrandom=0;
								   for(;;){
									   System.out.println("ehab");
									  indexrandom=r.nextInt(9);
									  int rowr=indexrandom/3;
									  int columnr= indexrandom%3;
									  if(values[rowr][columnr].getValue()==' '&& values[rowr][columnr].isVisit()==false) {
										  break;
									  }
								   }
								   
								   int res=indexrandom;
								   int rowres=res/3;
								   int columnres=res%3;
								   values[rowres][columnres].setValue(player1value);
								   values[rowres][columnres].setVisit(true);
								   button[res].setText(String.valueOf(player1value));
								   button[res].setDisable(true);
//			        		       resultmoves();
//								      System.out.println("res 0 is "+indexrow);
//								      System.out.println("res 1 is "+indexcolumns);
//								      int row=indexrow;
//								      int column = indexcolumns;
//								      pos.getRowlabel().setText(String.valueOf(row));
//								      pos.getColuknlabel().setText(String.valueOf(column));
//								      pos.getTableView().getItems().setAll(poslist);
//								      pos.getTableView().refresh();
//								      poslist.clear();
//								      	stage6.setScene(scene6);
//								      	stage6.show();
//								      indexrow=0;
//								      indexcolumns=0;
//								      int numofcoumns=3;
//								      int index = (row* numofcoumns)+column;
//								      button[index].setText(String.valueOf(player1value));
//								      button[index].setDisable(true);
//								      values [row][column].setValue(player1value);
					           for (int i = 0; i < values.length; i++) {
					               for (int j = 0; j < values.length; j++) {
					                   System.out.print(values[i][j].getValue() +"  ");
					               }
					               System.out.println();
					           }
									valgame=1-valgame;
			        		}	 
			       
			       });
			    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
			    	    pauseTimeline.play();
			       }
			       else {
			    		if(player1name.equalsIgnoreCase("Computer"))	{
			    		       valgame=0;
			    		       resultmoves();
							      System.out.println("res 0 is "+indexrow);
							      System.out.println("res 1 is "+indexcolumns);
							      int row=indexrow;
							      int column = indexcolumns;
							      pos.getRowlabel().setText(String.valueOf(row));
							      pos.getColuknlabel().setText(String.valueOf(column));
							      pos.getTableView().getItems().setAll(poslist);
							      pos.getTableView().refresh();
							      poslist.clear();
							      	stage6.setScene(scene6);
							      	stage6.show();
							      indexrow=0;
							      indexcolumns=0;
							      int numofcoumns=3;
							      int index = (row* numofcoumns)+column;
							      button[index].setText(String.valueOf(player1value));
							      button[index].setDisable(true);
							      values [row][column].setValue(player1value);
				           for (int i = 0; i < values.length; i++) {
				               for (int j = 0; j < values.length; j++) {
				                   System.out.print(values[i][j].getValue() +"  ");
				               }
				               System.out.println();
				           }
							   endGame=iswinroundornot(values,valgame);
							   if(endGame==true) {
								     Duration pauseDuration = Duration.seconds(2);
							    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
							    	    
						        	 for(int i =0;i<=8;i++) {
						        		 button[i].setText(null);
						        		 button[i].setDisable(false);
						        	 }
						        	 for(int i=0;i<=2;i++) {
						        		 for(int j=0;j<=2;j++) {
						        			 values[i][j].setValue(' ');
						        			 values[i][j].setVisit(false);
						        		 }
						        		 
						        	 }
						        	 p2.getChildren().clear();
						        	 game.getGamegp().getChildren().remove(p2);
						        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
						        	 game.getGamegp().getChildren().add(p2);
						        	 game.getScore1().setText(String.valueOf(player1score));
										game.getScore1().setAlignment(Pos.CENTER);
										game.getScore2().setText(String.valueOf(player2score));
										game.getScore2().setAlignment(Pos.CENTER);
						        	 currentround++;
						        	 game.getFrom().setText(String.valueOf(currentround));
						        	 valgame=0;
						        		if(player1name.equalsIgnoreCase("Computer"))	{
						        		       valgame=0;
						       		        Random r = new Random();
											   int indexrandom=0;
											   for(;;){
												   System.out.println("ehab");
												  indexrandom=r.nextInt(9);
												  int rowr=indexrandom/3;
												  int columnr= indexrandom%3;
												  if(values[rowr][columnr].getValue()==' '&& values[rowr][columnr].isVisit()==false) {
													  break;
												  }
											   }
											   
											   int res=indexrandom;
											   int rowres=res/3;
											   int columnres=res%3;
											   values[rowres][columnres].setValue(player1value);
											   values[rowres][columnres].setVisit(true);
											   button[res].setText(String.valueOf(player1value));
											   button[res].setDisable(true);
//						        		       resultmoves();
//											      System.out.println("res 0 is "+indexrow);
//											      System.out.println("res 1 is "+indexcolumns);
//											      int row2=indexrow;
//											      int column2 = indexcolumns;
//											      pos.getRowlabel().setText(String.valueOf(row));
//											      pos.getColuknlabel().setText(String.valueOf(column));
//											      pos.getTableView().getItems().setAll(poslist);
//											      pos.getTableView().refresh();
//											      poslist.clear();
//											      	stage6.setScene(scene6);
//											      	stage6.show();
//											      indexrow=0;
//											      indexcolumns=0;
//											      int numofcoumns2=3;
//											      int index2 = (row2* numofcoumns2)+column2;
//											      button[index2].setText(String.valueOf(player1value));
//											      button[index2].setDisable(true);
//											      values [row2][column2].setValue(player1value);
								           for (int i = 0; i < values.length; i++) {
								               for (int j = 0; j < values.length; j++) {
								                   System.out.print(values[i][j].getValue() +"  ");
								               }
								               System.out.println();
								           }
												valgame=1-valgame;
							   }
							   
							   });
							    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
							    	    pauseTimeline.play();
							   }
							   else {
								   valgame=1-valgame; 
							   }
							   
		        		}   
			       }
			       if(endGame==false && isBoardFull(values)==true) {
			    	   Duration pauseDuration = Duration.seconds(2);
			    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
			    	        // Code to execute after the pause
			    	       
			    	        p2.getChildren().clear();
				        	 game.getGamegp().getChildren().remove(p2);
				        	 for(int i =0;i<=8;i++) {
				        		 button[i].setText(null);
				        		 button[i].setDisable(false);
				        	 }
				        	 for(int i=0;i<=2;i++) {
				        		 for(int j=0;j<=2;j++) {
				        			 values[i][j].setValue(' ');
				        			 values[i][j].setVisit(false);
				        		 }
				        	 }
				        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
				        	 game.getGamegp().getChildren().add(p2);
				        	 game.getScore1().setText(String.valueOf(player1score));
								game.getScore1().setAlignment(Pos.CENTER);
								game.getScore2().setText(String.valueOf(player2score));
								game.getScore2().setAlignment(Pos.CENTER);
								
				        	 currentround++;
				        	 game.getFrom().setText(String.valueOf(currentround));
				        	 valgame=0;	
						        Random r = new Random();
								   int indexrandom=0;
								   for(;;){
									   System.out.println("ehab");
									  indexrandom=r.nextInt(9);
									  int rowr=indexrandom/3;
									  int columnr= indexrandom%3;
									  if(values[rowr][columnr].getValue()==' '&& values[rowr][columnr].isVisit()==false) {
										  break;
									  }
								   }
								   
								   int res=indexrandom;
								   int rowres=res/3;
								   int columnres=res%3;
								   values[rowres][columnres].setValue(player1value);
								   values[rowres][columnres].setVisit(true);
								   button[res].setText(String.valueOf(player1value));
								   button[res].setDisable(true);
//				        	 resultmoves();
//						      System.out.println("res 0 is "+indexrow);
//						      System.out.println("res 1 is "+indexcolumns);
//						      int row=indexrow;
//						      int column = indexcolumns;
//						      pos.getRowlabel().setText(String.valueOf(row));
//						      pos.getColuknlabel().setText(String.valueOf(column));
//						      pos.getTableView().getItems().setAll(poslist);
//						      pos.getTableView().refresh();
//						      poslist.clear();
//						      	stage6.setScene(scene6);
//						      	stage6.show();
//						      indexrow=0;
//						      indexcolumns=0;
//						      int numofcoumns=3;
//						      int index = (row* numofcoumns)+column;
//						      button[index].setText(String.valueOf(player1value));
//						      button[index].setDisable(true);
//						      values [row][column].setValue(player1value);
			           for (int i = 0; i < values.length; i++) {
			               for (int j = 0; j < values.length; j++) {
			                   System.out.print(values[i][j].getValue() +"  ");
			               }
			               System.out.println();
			           }
							valgame=1-valgame;

			    	    });

			    	    // Create the Timeline and play it
			    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
			    	    pauseTimeline.play();
			    	   
			        	
			        }
			       if (currentround >selectrounds) {
			    	   stage6.close();
			        	 wins.getPlayer1name().setText(player1name);
			 	        wins.getPlayer2name().setText(player2name);
			 	        wins.getPlayer1score().setText(String.valueOf(player1score));
			 	        wins.getPlayer2score().setText(String.valueOf(player2score));
			 	        if(player1score>player2score) {
			 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
			 	        	ImageView win= new ImageView(m);
			 	        	win.setLayoutX(0);
			 	        	win.setLayoutY(200);
			 	        	win.setFitHeight(200);
			 	        	win.setFitWidth(300);
			 	        	
			 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
			 	        	ImageView lose= new ImageView(m2);
			 	        	lose.setLayoutX(500);
			 	        	lose.setLayoutY(200);
			 	        	lose.setFitHeight(200);
			 	        	lose.setFitWidth(300);
			 	        	p3.getChildren().addAll(lose,win);
			 	        	wins.getGp().getChildren().add(p3);	
			 	        }
			 	        else if(player1score<player2score) {
			 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
			 	        	ImageView win= new ImageView(m);
			 	        	win.setLayoutX(0);
			 	        	win.setLayoutY(200);
			 	        	win.setFitHeight(200);
			 	        	win.setFitWidth(300);
			 	        	
			 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
			 	        	ImageView lose= new ImageView(m2);
			 	        	lose.setLayoutX(500);
			 	        	lose.setLayoutY(200);
			 	        	lose.setFitHeight(200);
			 	        	lose.setFitWidth(300);
			 	        	p3.getChildren().addAll(lose,win);
			 	        	wins.getGp().getChildren().add(p3);	
			 	        }
			 	        else {
			 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
			 	        	ImageView win= new ImageView(m);
			 	        	win.setLayoutX(0);
			 	        	win.setLayoutY(200);
			 	        	win.setFitHeight(200);
			 	        	win.setFitWidth(300);
			 	        	
			 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
			 	        	ImageView lose= new ImageView(m2);
			 	        	lose.setLayoutX(500);
			 	        	lose.setLayoutY(200);
			 	        	lose.setFitHeight(200);
			 	        	lose.setFitWidth(300);
			 	        	p3.getChildren().addAll(lose,win);
			 	        	wins.getGp().getChildren().add(p3);	
			 	        	
			 	        }    
			 	       player1value=' ';
						player2value=' ';
						player1name="";
						player2name="";
						player1score=0;
						player2score=0;
						currentround=0;
						selectrounds=0;
						valgame=0;
						endGame=false;
						indexrow=0;
						indexcolumns=0;
						poslist.clear();
						for (int i = 0; i < values.length; i++) {
							for (int j = 0; j < values.length; j++) {
								values[i][j].setValue(' ');
								values[i][j].setVisit(false);
							}
						}
						
						for (int i = 0; i < button.length; i++) {
							button[i].setText(null);
							button[i].setDisable(false);
						}
						op1screen.getComp1().setSelected(false);
						op1screen.getComp2().setSelected(false);
						op1screen.getCompvalo().setSelected(false);
						op1screen.getCompvalx().setSelected(false);
						op1screen.getComputertext().setText(null);
						op1screen.getPlaye1().setSelected(false);
						op1screen.getPlaye2().setSelected(false);
						op1screen.getPlayervalx().setSelected(false);
						op1screen.getPlayervalo().setSelected(false);
						op1screen.getPlayertext().setText(null);
						startpage.getOption1().setSelected(false);
						startpage.getOption2().setSelected(false);
						startpage.getOption3().setSelected(false);
					    op1screen.getRoundtext().setText(null);
					    game.getScore1().setText(null);
					    game.getFrom().setText(null);
					    game.getTo().setText(null);
					    game.getScore2().setText(null);
						game.getName1().setText(null);
					    game.getName2().setText(null);
					    p2.getChildren().clear();
					    p.getChildren().clear();
					    game.getGamegp().getChildren().remove(p2);
					    game.getGamegp().getChildren().remove(p);
			 	        	 stage5.setScene(scene5);
			 		          stage5.show();
			 	          
			 	        }
			       
			       
			       
				
			}
		
	}

	private void handle1ButtonClick(int ind) {
		if(valgame==0 && !(player1name.equalsIgnoreCase("Computer"))){
			values[(ind / 3)][ind % 3].setValue(player1value);
		       values[(ind / 3)][ind % 3].setVisit(true);
		       System.out.println("ind value is " + ind);
		       button[ind].setText(String.valueOf(player1value));
		       button[ind].setDisable(true);
		       endGame=iswinroundornot(values,valgame);
		       if(endGame==true) {
		    	   Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
//		    	   FadeTransition fadeOut = new FadeTransition(Duration.seconds(5), p2);
//		           fadeOut.setFromValue(1.0);
//		           fadeOut.setToValue(0.0);
//		           fadeOut.setAutoReverse(true);

		           // Set the cycle count (you can adjust this based on your needs)
//		           fadeOut.setCycleCount(1);
//		    	   p2.getChildren().clear();
//		        	 game.getGamegp().getChildren().remove(p2);
		        	 for(int i =0;i<=8;i++) {
		        		 button[i].setText(null);
		        		 button[i].setDisable(false);
		        	 }
		        	 for(int i=0;i<=2;i++) {
		        		 for(int j=0;j<=2;j++) {
		        			 values[i][j].setValue(' ');
		        			 values[i][j].setVisit(false);
		        		 }
		        		 
		        	 }
		        	p2.getChildren().clear();
		        	game.getGamegp().getChildren().remove(p2);
		        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
		        	 game.getGamegp().getChildren().add(p2);
		        	 game.getScore1().setText(String.valueOf(player1score));
						game.getScore1().setAlignment(Pos.CENTER);
						game.getScore2().setText(String.valueOf(player2score));
						game.getScore2().setAlignment(Pos.CENTER);
		        	 currentround++;
		        	 game.getFrom().setText(String.valueOf(currentround));
		        	 valgame=0;	 
		    	    });

		    	    // Create the Timeline and play it
		    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
		    	    pauseTimeline.play();
		    	   
		        	
		        }
		       else {
		    	   valgame=1;
		    	   if(isBoardFull(values)==false) {
		    		   valgame=1;
		    		if(player2name.equalsIgnoreCase("Computer"))	{
	        			System.out.println("I am Here ");
						   Random r = new Random();
						   int indexrandom=0;
						   for(;;){
							   System.out.println("ehab1 1 1 11");
							  indexrandom=r.nextInt(9);
							  int row=indexrandom/3;
							  int column= indexrandom%3;
							  if(values[row][column].getValue()==' '&& values[row][column].isVisit()==false) {
								  break;
							  }
						   }
						   System.out.println("Selected computer randomly "+indexrandom);
						   int res=indexrandom;
						   int rowres=res/3;
						   int columnres=res%3;
						   values[rowres][columnres].setValue(player2value);
						   values[rowres][columnres].setVisit(true);
						   button[res].setText(String.valueOf(player2value));
						   button[res].setDisable(true);
						   endGame=iswinroundornot(values,valgame);
						   if(endGame==true) {
							   Duration pauseDuration = Duration.seconds(2);
					    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
//							   FadeTransition fadeOut = new FadeTransition(Duration.seconds(5), p2);
//						        fadeOut.setFromValue(1.0);
//						        fadeOut.setToValue(0.0);
//						        fadeOut.setAutoReverse(true);
//
//						        // Set the cycle count (you can adjust this based on your needs)
//						        fadeOut.setCycleCount(1);
						      
//							   p2.getChildren().clear();
//					        	 game.getGamegp().getChildren().remove(p2);
					        	 for(int i =0;i<=8;i++) {
					        		 button[i].setText(null);
					        		 button[i].setDisable(false);
					        	 }
					        	 for(int i=0;i<=2;i++) {
					        		 for(int j=0;j<=2;j++) {
					        			 values[i][j].setValue(' ');
					        			 values[i][j].setVisit(false);
					        		 }
					        		 
					        	 }
					        	 p2.getChildren().clear();
					        	 game.getGamegp().getChildren().remove(p2);
					        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
					        	 game.getGamegp().getChildren().add(p2);
					        	 game.getScore1().setText(String.valueOf(player1score));
									game.getScore1().setAlignment(Pos.CENTER);
									game.getScore2().setText(String.valueOf(player2score));
									game.getScore2().setAlignment(Pos.CENTER);
					        	 currentround++;
					        	 game.getFrom().setText(String.valueOf(currentround));
					        	 valgame=0;
					        		
					    	    });

					    	    // Create the Timeline and play it
					    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
					    	    pauseTimeline.play();
					    	   
					        	
					        }
						   else {
							   valgame=0; 
						   }
						   
	        		}  
		       }
		       }
		       
		       if(endGame==false && isBoardFull(values)==true) {
		    	   Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
//		    	   FadeTransition fadeOut = new FadeTransition(Duration.seconds(5), p2);
//		           fadeOut.setFromValue(1.0);
//		           fadeOut.setToValue(0.0);
//		           fadeOut.setAutoReverse(true);
//
//		           // Set the cycle count (you can adjust this based on your needs)
//		           fadeOut.setCycleCount(1);
		           // Create a sequential transition
		          
//
//		        	 p2.getChildren().clear();
//		        	 game.getGamegp().getChildren().remove(p2);
		        	 for(int i =0;i<=8;i++) {
		        		 button[i].setText(null);
		        		 button[i].setDisable(false);
		        	 }
		        	 for(int i=0;i<=2;i++) {
		        		 for(int j=0;j<=2;j++) {
		        			 values[i][j].setValue(' ');
		        			 values[i][j].setVisit(false);
		        		 }
		        	 }
		        	 p2.getChildren().clear();
		        	 game.getGamegp().getChildren().remove(p2);
		        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
		        	 game.getGamegp().getChildren().add(p2);
		        	 game.getScore1().setText(String.valueOf(player1score));
						game.getScore1().setAlignment(Pos.CENTER);
						game.getScore2().setText(String.valueOf(player2score));
						game.getScore2().setAlignment(Pos.CENTER);
						
		        	 currentround++;
		        	 game.getFrom().setText(String.valueOf(currentround));
		        	 valgame=0;	
		    	    });

		    	    // Create the Timeline and play it
		    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
		    	    pauseTimeline.play();
		    	   
		        	
		        }
		       if(player1score>player2score  && currentround > (selectrounds/2)+1 && indexes ==0) {
		    	   stop.getWinlabel().setText("The Player Win is : "+player1name);
		    	  stage7.setScene(scene7);
		    	  stage7.show();
		    	  indexes=1;
		    	  
		       }
		       else if( player1score<player2score && currentround > (selectrounds/2)+1 &&indexes==0 ){
		    	   stop.getWinlabel().setText("The Player Win is : "+player2name);
		    	   stage7.setScene(scene7);
			    	  stage7.show();
			    	  indexes=1;
		       }
		       
		       if (currentround >selectrounds) {
		    	   
		        	 wins.getPlayer1name().setText(player1name);
		 	        wins.getPlayer2name().setText(player2name);
		 	        wins.getPlayer1score().setText(String.valueOf(player1score));
		 	        wins.getPlayer2score().setText(String.valueOf(player2score));
		 	        if(player1score>player2score) {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        }
		 	        else if(player1score<player2score) {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        }
		 	        else {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        	
		 	        }
		 	       player1value=' ';
					player2value=' ';
					player1name="";
					player2name="";
					player1score=0;
					player2score=0;
					currentround=0;
					selectrounds=0;
					valgame=0;
					endGame=false;
					indexrow=0;
					indexcolumns=0;
					poslist.clear();
					for (int i = 0; i < values.length; i++) {
						for (int j = 0; j < values.length; j++) {
							values[i][j].setValue(' ');
							values[i][j].setVisit(false);
						}
					}
					
					for (int i = 0; i < button.length; i++) {
						button[i].setText(null);
						button[i].setDisable(false);
					}
					op1screen.getComp1().setSelected(false);
					op1screen.getComp2().setSelected(false);
					op1screen.getCompvalo().setSelected(false);
					op1screen.getCompvalx().setSelected(false);
					op1screen.getComputertext().setText(null);
					op1screen.getPlaye1().setSelected(false);
					op1screen.getPlaye2().setSelected(false);
					op1screen.getPlayervalx().setSelected(false);
					op1screen.getPlayervalo().setSelected(false);
					op1screen.getPlayertext().setText(null);
					startpage.getOption1().setSelected(false);
					startpage.getOption2().setSelected(false);
					startpage.getOption3().setSelected(false);
				    op1screen.getRoundtext().setText(null);
				    game.getScore1().setText(null);
				    game.getFrom().setText(null);
				    game.getTo().setText(null);
				    game.getScore2().setText(null);
					game.getName1().setText(null);
				    game.getName2().setText(null);
				    p2.getChildren().clear();
				    p.getChildren().clear();
				    game.getGamegp().getChildren().remove(p2);
				    game.getGamegp().getChildren().remove(p);
		 	        	 stage5.setScene(scene5);
		 		          stage5.show();
		 	          
		 	        }
			
			
		}
	 if(valgame==1 && !(player2name.equalsIgnoreCase("Computer"))) {
		 System.out.println("Iam inside here");
			   values[(ind / 3)][ind % 3].setValue(player2value);
		       values[(ind / 3)][ind % 3].setVisit(true);
		       System.out.println("ind value is " + ind);
		       button[ind].setText(String.valueOf(player2value));
		       button[ind].setDisable(true);
		       endGame=iswinroundornot(values,valgame);
		       if(endGame==true) {
		    	   Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
		    	   p2.getChildren().clear();
		        	 game.getGamegp().getChildren().remove(p2);
		        	 for(int i =0;i<=8;i++) {
		        		 button[i].setText(null);
		        		 button[i].setDisable(false);
		        	 }
		        	 for(int i=0;i<=2;i++) {
		        		 for(int j=0;j<=2;j++) {
		        			 values[i][j].setValue(' ');
		        			 values[i][j].setVisit(false);
		        		 }
		        		 
		        	 }
		        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
		        	 game.getGamegp().getChildren().add(p2);
		        	 game.getScore1().setText(String.valueOf(player1score));
						game.getScore1().setAlignment(Pos.CENTER);
						game.getScore2().setText(String.valueOf(player2score));
						game.getScore2().setAlignment(Pos.CENTER);
		        	 currentround++;
		        	 game.getFrom().setText(String.valueOf(currentround));
		        	 valgame=0;
		        		if(player1name.equalsIgnoreCase("Computer"))	{
		        			System.out.println("I am Here ");
							   Random r = new Random();
							   int indexrandom=0;
							   for(;;){
								  indexrandom=r.nextInt(9);
								  int row=indexrandom/3;
								  int column= indexrandom%3;
								  if(values[row][column].getValue()==' '&& values[row][column].isVisit()==false) {
									  break;
								  }
							   }
							   
							   int res=indexrandom;
							   System.out.println("Selected computer randomly "+indexrandom);
							   int rowres=res/3;
							   int columnres=res%3;
							   values[rowres][columnres].setValue(player1value);
							   values[rowres][columnres].setVisit(true);
							   button[res].setText(String.valueOf(player1value));
							   button[res].setDisable(true);
							  // endGame=iswinroundornot(values,valgame);
							   valgame=1-valgame;
		        		}	 
		       	    });

		    	    // Create the Timeline and play it
		    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
		    	    pauseTimeline.play();
		    	   
		        	
		        }
		       else {
		    		if(player1name.equalsIgnoreCase("Computer"))	{
		    			valgame=0;
	        			System.out.println("I am Here ");
						   Random r = new Random();
						   int indexrandom=0;
						   for(;;){
							   System.out.println("ehab");
							  indexrandom=r.nextInt(9);
							  int row=indexrandom/3;
							  int column= indexrandom%3;
							  if(values[row][column].getValue()==' '&& values[row][column].isVisit()==false) {
								  break;
							  }
						   }
						   System.out.println("Selected computer randomly "+indexrandom);
						   int res=indexrandom;
						   int rowres=res/3;
						   int columnres=res%3;
						   values[rowres][columnres].setValue(player1value);
						   values[rowres][columnres].setVisit(true);
						   button[res].setText(String.valueOf(player1value));
						   button[res].setDisable(true);
						   endGame=iswinroundornot(values,valgame);
						   if(endGame==true) {
							   Duration pauseDuration = Duration.seconds(2);
					    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
							   p2.getChildren().clear();
					        	 game.getGamegp().getChildren().remove(p2);
					        	 for(int i =0;i<=8;i++) {
					        		 button[i].setText(null);
					        		 button[i].setDisable(false);
					        	 }
					        	 for(int i=0;i<=2;i++) {
					        		 for(int j=0;j<=2;j++) {
					        			 values[i][j].setValue(' ');
					        			 values[i][j].setVisit(false);
					        		 }
					        		 
					        	 }
					        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
					        	 game.getGamegp().getChildren().add(p2);
					        	 game.getScore1().setText(String.valueOf(player1score));
									game.getScore1().setAlignment(Pos.CENTER);
									game.getScore2().setText(String.valueOf(player2score));
									game.getScore2().setAlignment(Pos.CENTER);
					        	 currentround++;
					        	 game.getFrom().setText(String.valueOf(currentround));
					        	 valgame=0;
					        		if(player1name.equalsIgnoreCase("Computer"))	{
					        			System.out.println("I am Here ");
										   Random r2 = new Random();
										   int indexrandom2=0;
										   for(;;){
											  indexrandom2=r2.nextInt(9);
											  int row2=indexrandom2/3;
											  int column2= indexrandom2%3;
											  if(values[row2][column2].getValue()==' '&& values[row2][column2].isVisit()==false) {
												  break;
											  }
										   }
										   System.out.println("Selected computer randomly "+indexrandom2);
										   int res2=indexrandom2;
										   int rowres2=res2/3;
										   int columnres2=res2%3;
										   values[rowres2][columnres2].setValue(player1value);
										   values[rowres2][columnres2].setVisit(true);
										   button[res2].setText(String.valueOf(player1value));
										   button[res2].setDisable(true);
										   valgame=1-valgame;
						   }
					       	    });

					    	    // Create the Timeline and play it
					    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
					    	    pauseTimeline.play();
					    	   
					        	
					        }
						   else {
							   valgame=1-valgame; 
						   }
						   
	        		}   
		       }
		       if(endGame==false && isBoardFull(values)==true) {
		    	   Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
		        	 p2.getChildren().clear();
		        	 game.getGamegp().getChildren().remove(p2);
		        	 for(int i =0;i<=8;i++) {
		        		 button[i].setText(null);
		        		 button[i].setDisable(false);
		        	 }
		        	 for(int i=0;i<=2;i++) {
		        		 for(int j=0;j<=2;j++) {
		        			 values[i][j].setValue(' ');
		        			 values[i][j].setVisit(false);
		        		 }
		        	 }
		        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
		        	 game.getGamegp().getChildren().add(p2);
		        	 game.getScore1().setText(String.valueOf(player1score));
						game.getScore1().setAlignment(Pos.CENTER);
						game.getScore2().setText(String.valueOf(player2score));
						game.getScore2().setAlignment(Pos.CENTER);
						
		        	 currentround++;
		        	 game.getFrom().setText(String.valueOf(currentround));
		        	 valgame=0;	
		        	 Random r2 = new Random();
					   int indexrandom2=0;
					   for(;;){
						  indexrandom2=r2.nextInt(9);
						  int row2=indexrandom2/3;
						  int column2= indexrandom2%3;
						  if(values[row2][column2].getValue()==' '&& values[row2][column2].isVisit()==false) {
							  break;
						  }
					   }
					   System.out.println("Selected computer randomly "+indexrandom2);
					   int res2=indexrandom2;
					   int rowres2=res2/3;
					   int columnres2=res2%3;
					   values[rowres2][columnres2].setValue(player1value);
					   values[rowres2][columnres2].setVisit(true);
					   button[res2].setText(String.valueOf(player1value));
					   button[res2].setDisable(true);
					   valgame=1-valgame;	 
		       	    });

		    	    // Create the Timeline and play it
		    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
		    	    pauseTimeline.play();
		    	   
		        	
		        }
		       
		       if(player1score>player2score  && currentround > (selectrounds/2)+1 && indexes==0) {
		    	   stop.getWinlabel().setText("The Player Win is "+player1name);
			    	  stage7.setScene(scene7);
			    	  stage7.show();
			    	  indexes=1;
			    	  
			       }
			       else if( player1score<player2score && currentround > (selectrounds/2)+1 && indexes==0){
			    	   stop.getWinlabel().setText("The Player Win is "+player2name);
			    	   stage7.setScene(scene7);
				    	  stage7.show();
				    	  indexes=1;
			       }
		      
		       if (currentround >selectrounds) {
		        	 wins.getPlayer1name().setText(player1name);
		 	        wins.getPlayer2name().setText(player2name);
		 	        wins.getPlayer1score().setText(String.valueOf(player1score));
		 	        wins.getPlayer2score().setText(String.valueOf(player2score));
		 	        if(player1score>player2score) {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        }
		 	        else if(player1score<player2score) {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        }
		 	        else {
		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView win= new ImageView(m);
		 	        	win.setLayoutX(0);
		 	        	win.setLayoutY(200);
		 	        	win.setFitHeight(200);
		 	        	win.setFitWidth(300);
		 	        	
		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
		 	        	ImageView lose= new ImageView(m2);
		 	        	lose.setLayoutX(500);
		 	        	lose.setLayoutY(200);
		 	        	lose.setFitHeight(200);
		 	        	lose.setFitWidth(300);
		 	        	p3.getChildren().addAll(lose,win);
		 	        	wins.getGp().getChildren().add(p3);	
		 	        	
		 	        }
		 	       player1value=' ';
					player2value=' ';
					player1name="";
					player2name="";
					player1score=0;
					player2score=0;
					currentround=0;
					selectrounds=0;
					valgame=0;
					endGame=false;
					indexrow=0;
					indexcolumns=0;
					poslist.clear();
					for (int i = 0; i < values.length; i++) {
						for (int j = 0; j < values.length; j++) {
							values[i][j].setValue(' ');
							values[i][j].setVisit(false);
						}
					}
					
					for (int i = 0; i < button.length; i++) {
						button[i].setText(null);
						button[i].setDisable(false);
					}
					op1screen.getComp1().setSelected(false);
					op1screen.getComp2().setSelected(false);
					op1screen.getCompvalo().setSelected(false);
					op1screen.getCompvalx().setSelected(false);
					op1screen.getComputertext().setText(null);
					op1screen.getPlaye1().setSelected(false);
					op1screen.getPlaye2().setSelected(false);
					op1screen.getPlayervalx().setSelected(false);
					op1screen.getPlayervalo().setSelected(false);
					op1screen.getPlayertext().setText(null);
					startpage.getOption1().setSelected(false);
					startpage.getOption2().setSelected(false);
					startpage.getOption3().setSelected(false);
				    op1screen.getRoundtext().setText(null);
				    game.getScore1().setText(null);
				    game.getFrom().setText(null);
				    game.getTo().setText(null);
				    game.getScore2().setText(null);
					game.getName1().setText(null);
				    game.getName2().setText(null);
				    p2.getChildren().clear();
				    p.getChildren().clear();
				    game.getGamegp().getChildren().remove(p2);
				    game.getGamegp().getChildren().remove(p);
		 	        	 stage5.setScene(scene5);
		 		          stage5.show();
		 	          
		 	        }
		       
		       
		       
			
		}
		
		
	}
	
	
	private void handle2ButtonClick(int ind) {
	    if (valgame == 0) {
	        values[(ind / 3)][ind % 3].setValue(player1value);
	        System.out.println("ind value is " + ind);
	        button[ind].setText(String.valueOf(player1value));
	        button[ind].setDisable(true);
	       
	         endGame=iswinroundornot(values,valgame);
	         if(endGame==true) {
	        	   Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
	        	 p2.getChildren().clear();
	        	 game.getGamegp().getChildren().remove(p2);
	        	 for(int i =0;i<=8;i++) {
	        		 button[i].setText(null);
	        		 button[i].setDisable(false);
	        	 }
	        	 for(int i=0;i<=2;i++) {
	        		 for(int j=0;j<=2;j++) {
	        			 values[i][j].setValue(' ');
	        			 values[i][j].setVisit(false);
	        		 }
	        	 }
	        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
	        	 game.getGamegp().getChildren().add(p2);
	        	 game.getScore1().setText(String.valueOf(player1score));
					game.getScore1().setAlignment(Pos.CENTER);
					game.getScore2().setText(String.valueOf(player2score));
					game.getScore2().setAlignment(Pos.CENTER);
	        	 currentround++;
	        	 game.getFrom().setText(String.valueOf(currentround));
	        	 valgame=0;
		       	    });

				    	    // Create the Timeline and play it
				    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
				    	    pauseTimeline.play();
				    	   
				        	
				        }
	         else {
	        	 valgame = 1 - valgame;
	        }
	         if(endGame==false && isBoardFull(values)==true) {
	       	   Duration pauseDuration = Duration.seconds(2);
	    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
	        	 p2.getChildren().clear();
	        	 game.getGamegp().getChildren().remove(p2);
	        	 for(int i =0;i<=8;i++) {
	        		 button[i].setText(null);
	        		 button[i].setDisable(false);
	        	 }
	        	 for(int i=0;i<=2;i++) {
	        		 for(int j=0;j<=2;j++) {
	        			 values[i][j].setValue(' ');
	        			 values[i][j].setVisit(false);
	        		 }
	        	 }
	        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
	        	 game.getGamegp().getChildren().add(p2);
	        	 game.getScore1().setText(String.valueOf(player1score));
					game.getScore1().setAlignment(Pos.CENTER);
					game.getScore2().setText(String.valueOf(player2score));
					game.getScore2().setAlignment(Pos.CENTER);
					
	        	 currentround++;
	        	 game.getFrom().setText(String.valueOf(currentround));
	        	 valgame=0;	
	    	    });

	    	    // Create the Timeline and play it
	    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
	    	    pauseTimeline.play();
	    	   
	        	
	        }
	         
	       
	        if (currentround >selectrounds) {
	        	 wins.getPlayer1name().setText(player1name);
	 	        wins.getPlayer2name().setText(player2name);
	 	        wins.getPlayer1score().setText(String.valueOf(player1score));
	 	        wins.getPlayer2score().setText(String.valueOf(player2score));
	 	        if(player1score>player2score) {
	 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
	 	        	ImageView win= new ImageView(m);
	 	        	win.setLayoutX(0);
	 	        	win.setLayoutY(200);
	 	        	win.setFitHeight(200);
	 	        	win.setFitWidth(300);
	 	        	
	 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
	 	        	ImageView lose= new ImageView(m2);
	 	        	lose.setLayoutX(500);
	 	        	lose.setLayoutY(200);
	 	        	lose.setFitHeight(200);
	 	        	lose.setFitWidth(300);
	 	        	p3.getChildren().addAll(lose,win);
	 	        	wins.getGp().getChildren().add(p3);	
	 	        }
	 	        else if(player1score<player2score) {
	 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
	 	        	ImageView win= new ImageView(m);
	 	        	win.setLayoutX(0);
	 	        	win.setLayoutY(200);
	 	        	win.setFitHeight(200);
	 	        	win.setFitWidth(300);
	 	        	
	 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
	 	        	ImageView lose= new ImageView(m2);
	 	        	lose.setLayoutX(500);
	 	        	lose.setLayoutY(200);
	 	        	lose.setFitHeight(200);
	 	        	lose.setFitWidth(300);
	 	        	p3.getChildren().addAll(lose,win);
	 	        	wins.getGp().getChildren().add(p3);	
	 	        }
	 	        else {
	 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
	 	        	ImageView win= new ImageView(m);
	 	        	win.setLayoutX(0);
	 	        	win.setLayoutY(200);
	 	        	win.setFitHeight(200);
	 	        	win.setFitWidth(300);
	 	        	
	 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
	 	        	ImageView lose= new ImageView(m2);
	 	        	lose.setLayoutX(500);
	 	        	lose.setLayoutY(200);
	 	        	lose.setFitHeight(200);
	 	        	lose.setFitWidth(300);
	 	        	p3.getChildren().addAll(lose,win);
	 	        	wins.getGp().getChildren().add(p3);	
	 	        	
	 	        }
	 	       player1value=' ';
				player2value=' ';
				player1name="";
				player2name="";
				player1score=0;
				player2score=0;
				currentround=0;
				selectrounds=0;
				valgame=0;
				endGame=false;
				indexrow=0;
				indexcolumns=0;
				poslist.clear();
				for (int i = 0; i < values.length; i++) {
					for (int j = 0; j < values.length; j++) {
						values[i][j].setValue(' ');
						values[i][j].setVisit(false);
					}
				}
				
				for (int i = 0; i < button.length; i++) {
					button[i].setText(null);
					button[i].setDisable(false);
				}
				op1screen.getComp1().setSelected(false);
				op1screen.getComp2().setSelected(false);
				op1screen.getCompvalo().setSelected(false);
				op1screen.getCompvalx().setSelected(false);
				op1screen.getComputertext().setText(null);
				op1screen.getPlaye1().setSelected(false);
				op1screen.getPlaye2().setSelected(false);
				op1screen.getPlayervalx().setSelected(false);
				op1screen.getPlayervalo().setSelected(false);
				op1screen.getPlayertext().setText(null);
				startpage.getOption1().setSelected(false);
				startpage.getOption2().setSelected(false);
				startpage.getOption3().setSelected(false);
			    op1screen.getRoundtext().setText(null);
			    game.getScore1().setText(null);
			    game.getFrom().setText(null);
			    game.getTo().setText(null);
			    game.getScore2().setText(null);
				game.getName1().setText(null);
			    game.getName2().setText(null);
			    p2.getChildren().clear();
			    p.getChildren().clear();
			    game.getGamegp().getChildren().remove(p2);
			    game.getGamegp().getChildren().remove(p);
	 	        
	 	        	 stage5.setScene(scene5);
	 		          stage5.show();
	 	          
	 	        } 
	            
	        
	       
	    } else {
	        values[(ind / 3)][ind % 3].setValue(player2value);
	        System.out.println("ind value is " + ind);
	        button[ind].setText(String.valueOf(player2value));
	        button[ind].setDisable(true);
	        endGame=iswinroundornot(values,valgame);
	        if(endGame==true) {
	        	 Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
	        	 p2.getChildren().clear();
	        	 game.getGamegp().getChildren().remove(p2);
	        	 for(int i =0;i<=8;i++) {
	        		 button[i].setText(null);
	        		 button[i].setDisable(false);
	        	 }
	        	 for(int i=0;i<=2;i++) {
	        		 for(int j=0;j<=2;j++) {
	        			 values[i][j].setValue(' ');
	        			 values[i][j].setVisit(false);
	        		 }
	        	 }
	        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
	        	 game.getGamegp().getChildren().add(p2);
	        	 game.getScore1().setText(String.valueOf(player1score));
					game.getScore1().setAlignment(Pos.CENTER);
					game.getScore2().setText(String.valueOf(player2score));
					game.getScore2().setAlignment(Pos.CENTER);
					
	        	 currentround++;
	        	 game.getFrom().setText(String.valueOf(currentround));
	        	 valgame=0;
	        	 
		       	    });

		    	    // Create the Timeline and play it
		    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
		    	    pauseTimeline.play();
		    	   
		        	
		        }
	        else {
	        	 valgame = 1 - valgame;
	        }
	       
	        if(endGame==false && isBoardFull(values)==true) {
	        	 Duration pauseDuration = Duration.seconds(2);
		    	    KeyFrame pauseKeyFrame = new KeyFrame(pauseDuration, event -> {
	        	 p2.getChildren().clear();
	        	 game.getGamegp().getChildren().remove(p2);
	        	 for(int i =0;i<=8;i++) {
	        		 button[i].setText(null);
	        		 button[i].setDisable(false);
	        	 }
	        	 for(int i=0;i<=2;i++) {
	        		 for(int j=0;j<=2;j++) {
	        			 values[i][j].setValue(' ');
	        			 values[i][j].setVisit(false);
	        		 }
	        	 }
	        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
	        	 game.getGamegp().getChildren().add(p2);
	        	 game.getScore1().setText(String.valueOf(player1score));
					game.getScore1().setAlignment(Pos.CENTER);
					game.getScore2().setText(String.valueOf(player2score));
					game.getScore2().setAlignment(Pos.CENTER);
					
	        	 currentround++;
	        	 game.getFrom().setText(String.valueOf(currentround));
	        	 valgame=0;	
		       	    });

				    	    // Create the Timeline and play it
				    	    Timeline pauseTimeline = new Timeline(pauseKeyFrame);
				    	    pauseTimeline.play();
				    	   
				        	
				        }
	        if (currentround > selectrounds) {
	        	 wins.getPlayer1name().setText(player1name);
	 	        wins.getPlayer2name().setText(player2name);
	 	        wins.getPlayer1score().setText("Score : "+String.valueOf(player1score));
	 	        wins.getPlayer2score().setText("Score : "+String.valueOf(player2score));
	 	        if(player1score>player2score) {
	 	        	System.out.println("here 1");
	 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
	 	        	ImageView win= new ImageView(m);
	 	        	win.setLayoutX(0);
	 	        	win.setLayoutY(200);
	 	        	win.setFitHeight(200);
	 	        	win.setFitWidth(300);
	 	        	
	 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
	 	        	ImageView lose= new ImageView(m2);
	 	        	lose.setLayoutX(500);
	 	        	lose.setLayoutY(200);
	 	        	lose.setFitHeight(200);
	 	        	lose.setFitWidth(300);
	 	        	p3.getChildren().addAll(lose,win);
	 	        	wins.getGp().getChildren().add(p3);	
	 	        }
	 	        else if(player1score<player2score) {
	 	        	System.out.println("here 2");
	 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
	 	        	ImageView win= new ImageView(m);
	 	        	win.setLayoutX(0);
	 	        	win.setLayoutY(200);
	 	        	win.setFitHeight(200);
	 	        	win.setFitWidth(300);
	 	        	
	 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
	 	        	ImageView lose= new ImageView(m2);
	 	        	lose.setLayoutX(500);
	 	        	lose.setLayoutY(200);
	 	        	lose.setFitHeight(200);
	 	        	lose.setFitWidth(300);
	 	        	p3.getChildren().addAll(lose,win);
	 	        	wins.getGp().getChildren().add(p3);	
	 	        }
	 	        else {
	 	        	System.out.println("here 3");
	 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
	 	        	ImageView win= new ImageView(m);
	 	        	win.setLayoutX(0);
	 	        	win.setLayoutY(200);
	 	        	win.setFitHeight(200);
	 	        	win.setFitWidth(300);
	 	        	
	 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
	 	        	ImageView lose= new ImageView(m2);
	 	        	lose.setLayoutX(500);
	 	        	lose.setLayoutY(200);
	 	        	lose.setFitHeight(200);
	 	        	lose.setFitWidth(300);
	 	        	p3.getChildren().addAll(lose,win);
	 	        	wins.getGp().getChildren().add(p3);	
	 	        	
	 	        }
	 	       player1value=' ';
				player2value=' ';
				player1name="";
				player2name="";
				player1score=0;
				player2score=0;
				currentround=0;
				selectrounds=0;
				valgame=0;
				endGame=false;
				indexrow=0;
				indexcolumns=0;
				poslist.clear();
				for (int i = 0; i < values.length; i++) {
					for (int j = 0; j < values.length; j++) {
						values[i][j].setValue(' ');
						values[i][j].setVisit(false);
					}
				}
				
				for (int i = 0; i < button.length; i++) {
					button[i].setText(null);
					button[i].setDisable(false);
				}
				op1screen.getComp1().setSelected(false);
				op1screen.getComp2().setSelected(false);
				op1screen.getCompvalo().setSelected(false);
				op1screen.getCompvalx().setSelected(false);
				op1screen.getComputertext().setText(null);
				op1screen.getPlaye1().setSelected(false);
				op1screen.getPlaye2().setSelected(false);
				op1screen.getPlayervalx().setSelected(false);
				op1screen.getPlayervalo().setSelected(false);
				op1screen.getPlayertext().setText(null);
				startpage.getOption1().setSelected(false);
				startpage.getOption2().setSelected(false);
				startpage.getOption3().setSelected(false);
			    op1screen.getRoundtext().setText(null);
			    game.getScore1().setText(null);
			    game.getFrom().setText(null);
			    game.getTo().setText(null);
			    game.getScore2().setText(null);
				game.getName1().setText(null);
			    game.getName2().setText(null);
			    p2.getChildren().clear();
			    p.getChildren().clear();
			    game.getGamegp().getChildren().remove(p2);
			    game.getGamegp().getChildren().remove(p);
	 	        	 stage5.setScene(scene5);
	 		          stage5.show();
	 	          
	 	        } 
	       
	    }
	}
	
	
	
	
   private static boolean iswinroundornot (Square[][] square,int valgame) {
	   // to win you must have the same row or the same column in this case we have 6 cases 
	  
		   if(valgame==0) {
			   for(int k=0;k<3;k++) {
		   if((square[k][0].getValue() == player1value && square[k][1].getValue() == player1value && square[k][2].getValue() == player1value) ||
		            (square[0][k].getValue() ==player1value && square[1][k].getValue() == player1value && square[2][k].getValue() == player1value)) {
				 player1score=player1score+1 ; 

			   return true;
			   
		   }
			   }
	   }
		   else {
			   for(int k=0;k<3;k++) {
			   if((square[k][0].getValue() == player2value && square[k][1].getValue() == player2value && square[k][2].getValue() == player2value) ||
			            (square[0][k].getValue() ==player2value && square[1][k].getValue() == player2value && square[2][k].getValue() == player2value)) {
					 player2score=player2score+1 ;
				   return true;
				   
			   }
			   
		   }
	   
	} 
		   if(valgame==0) {
	   if ((square[0][0].getValue() == player1value && square[1][1].getValue() == player1value && square[2][2].getValue() == player1value) ||
		        (square[0][2].getValue() == player1value && square[1][1].getValue() == player1value && square[2][0].getValue() == player1value)) {
		  
				 player1score=player1score+1 ; 
				 return true;
			   }  
		    }
	else {
		if ((square[0][0].getValue() == player2value && square[1][1].getValue() == player2value && square[2][2].getValue() == player2value) ||
		        (square[0][2].getValue() == player2value && square[1][1].getValue() == player2value && square[2][0].getValue() == player2value)) {
		  
				   player2score=player2score+1 ; 
				   return true;
			   }	
	}
	return false;  
   }
   
   
   
	static char winornot() {
        for (int i = 0; i < 3; i++) {
            if (values[i][0].getValue() == values[i][1].getValue() && values[i][1].getValue() == values[i][2].getValue() && values[i][0].getValue() != ' ') {
                return values[i][0].getValue();
            }
            if (values[0][i].getValue() == values[1][i].getValue() && values[1][i].getValue() == values[2][i].getValue() && values[0][i].getValue() != ' ') {
                return values[0][i].getValue();
            }
        }
        if (values[0][0].getValue() == values[1][1].getValue() && values[1][1].getValue() == values[2][2].getValue() && values[0][0].getValue() != ' ') {
            return values[0][0].getValue();
        }
        if (values[0][2].getValue() == values[1][1].getValue() && values[1][1].getValue() == values[2][0].getValue() && values[0][2].getValue() != ' ') {
            return values[0][2].getValue();
        }
        return ' ';
    }
   
 
   
   
   public static boolean isBoardFull(Square[][] board) {
       // Assuming board is a 3x3 array representing the Tic Tac Toe board
       for (Square[] row : board) {
           for (Square cell : row) {
               if (cell.getValue() == ' ') {
                   return false; // Found an empty cell, board is not full
               }
           }
       }
       return true; // All cells are filled, board is full
   }

	
	public static void main(String[] args) {
		launch(args);
	}
}


//static int[] makeComputerMove() {
//       char currentPlayerValue = (valgame == 0) ? player1value : player2value;
//       int[] bestMove = minimax(currentPlayerValue);
//      return bestMove; 
//   }
//
//
//
//static int minimaxHelper(char playerValue, boolean isMaximizingPlayer) {
//   char winner = checkWinner();
//
//   if (winner == player1value) {
//       return (playerValue == player1value) ? -1 : 1;
//   } else if (winner == player2value) {
//       return (playerValue == player2value) ? 1 : -1;
//   } else if (isBoardFull(values)) {
//       return 0;
//   }
//
//   char currentPlayerValue = (playerValue == player1value) ? player1value : player2value;
//
//   if (isMaximizingPlayer) {
//       int bestScore = Integer.MIN_VALUE;
//       for (int i = 0; i < 3; i++) {
//           for (int j = 0; j < 3; j++) {
//               if (values[i][j].getValue() == ' ') {
//                   values[i][j].setValue(currentPlayerValue); 
//                   int score = minimaxHelper(currentPlayerValue, false);
//                  values[i][j].setValue(' ');
//                   bestScore = Math.max(score, bestScore);
//               }
//           }
//       }
//       return bestScore;
//   } else {
//       int bestScore = Integer.MAX_VALUE;
//       for (int i = 0; i < 3; i++) {
//           for (int j = 0; j < 3; j++) {
//               if (values[i][j].getValue() == ' ') {
//                   values[i][j].setValue(currentPlayerValue);
//                   int score = minimaxHelper(currentPlayerValue, true);
//                   values[i][j].setValue(' ');
//                   bestScore = Math.min(score, bestScore);
//               }
//           }
//       }
//       return bestScore;
//   }
//}




///////////////////////
//
//private void handle3ButtonClick(int ind) {
//	 if(valgame==1 && !(player2name.equalsIgnoreCase("Computer Player"))) {
//		 System.out.println("Iam inside here");
//			   values[(ind / 3)][ind % 3].setValue(player2value);
//		       values[(ind / 3)][ind % 3].setVisit(true);
//		       System.out.println("ind value is " + ind);
//		       button[ind].setText(String.valueOf(player2value));
//		       button[ind].setDisable(true);
//		       endGame=iswinroundornot(values,valgame);
//		       if(endGame==true) {
//		    	   p2.getChildren().clear();
//		        	 game.getGamegp().getChildren().remove(p2);
//		        	 for(int i =0;i<=8;i++) {
//		        		 button[i].setText(null);
//		        		 button[i].setDisable(false);
//		        	 }
//		        	 for(int i=0;i<=2;i++) {
//		        		 for(int j=0;j<=2;j++) {
//		        			 values[i][j].setValue(' ');
//		        			 values[i][j].setVisit(false);
//		        		 }
//		        		 
//		        	 }
//		        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
//		        	 game.getGamegp().getChildren().add(p2);
//		        	 game.getScore1().setText(String.valueOf(player1score));
//						game.getScore1().setAlignment(Pos.CENTER);
//						game.getScore2().setText(String.valueOf(player2score));
//						game.getScore2().setAlignment(Pos.CENTER);
//		        	 currentround++;
//		        	 game.getFrom().setText(String.valueOf(currentround));
//		        	 valgame=0;
//		        		if(player1name.equalsIgnoreCase("Computer Player"))	{
//		        		int[] bestres=tryNextMove(values);
//							   values[rowres][columnres].setValue(player1value);
//							   values[rowres][columnres].setVisit(true);
//							   button[res].setText(String.valueOf(player1value));
//							   button[res].setDisable(true);
//							  // endGame=iswinroundornot(values,valgame);
//							   valgame=1-valgame;
//		        		}	 
//		       }
//		       else {
//		    		if(player1name.equalsIgnoreCase("Computer Player"))	{
//		    			valgame=0;
//	        			System.out.println("I am Here ");
//						   Random r = new Random();
//						   int indexrandom=0;
//						   for(;;){
//							   System.out.println("ehab");
//							  indexrandom=r.nextInt(9);
//							  int row=indexrandom/3;
//							  int column= indexrandom%3;
//							  if(values[row][column].getValue()==' '&& values[row][column].isVisit()==false) {
//								  break;
//							  }
//						   }
//						   System.out.println("Selected computer randomly "+indexrandom);
//						   int res=indexrandom;
//						   int rowres=res/3;
//						   int columnres=res%3;
//						   values[rowres][columnres].setValue(player1value);
//						   values[rowres][columnres].setVisit(true);
//						   button[res].setText(String.valueOf(player1value));
//						   button[res].setDisable(true);
//						   endGame=iswinroundornot(values,valgame);
//						   if(endGame==true) {
//							   p2.getChildren().clear();
//					        	 game.getGamegp().getChildren().remove(p2);
//					        	 for(int i =0;i<=8;i++) {
//					        		 button[i].setText(null);
//					        		 button[i].setDisable(false);
//					        	 }
//					        	 for(int i=0;i<=2;i++) {
//					        		 for(int j=0;j<=2;j++) {
//					        			 values[i][j].setValue(' ');
//					        			 values[i][j].setVisit(false);
//					        		 }
//					        		 
//					        	 }
//					        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
//					        	 game.getGamegp().getChildren().add(p2);
//					        	 game.getScore1().setText(String.valueOf(player1score));
//									game.getScore1().setAlignment(Pos.CENTER);
//									game.getScore2().setText(String.valueOf(player2score));
//									game.getScore2().setAlignment(Pos.CENTER);
//					        	 currentround++;
//					        	 game.getFrom().setText(String.valueOf(currentround));
//					        	 valgame=0;
//					        		if(player1name.equalsIgnoreCase("Computer Player"))	{
//					        			System.out.println("I am Here ");
//										   Random r2 = new Random();
//										   int indexrandom2=0;
//										   for(;;){
//											  indexrandom2=r2.nextInt(9);
//											  int row2=indexrandom2/3;
//											  int column2= indexrandom2%3;
//											  if(values[row2][column2].getValue()==' '&& values[row2][column2].isVisit()==false) {
//												  break;
//											  }
//										   }
//										   System.out.println("Selected computer randomly "+indexrandom2);
//										   int res2=indexrandom2;
//										   int rowres2=res2/3;
//										   int columnres2=res2%3;
//										   values[rowres2][columnres2].setValue(player1value);
//										   values[rowres2][columnres2].setVisit(true);
//										   button[res2].setText(String.valueOf(player1value));
//										   button[res2].setDisable(true);
//										   valgame=1-valgame;
//						   }
//						   }
//						   else {
//							   valgame=1-valgame; 
//						   }
//						   
//	        		}   
//		       }
//		       if(endGame==false && isBoardFull(values)==true) {
//		        	 p2.getChildren().clear();
//		        	 game.getGamegp().getChildren().remove(p2);
//		        	 for(int i =0;i<=8;i++) {
//		        		 button[i].setText(null);
//		        		 button[i].setDisable(false);
//		        	 }
//		        	 for(int i=0;i<=2;i++) {
//		        		 for(int j=0;j<=2;j++) {
//		        			 values[i][j].setValue(' ');
//		        			 values[i][j].setVisit(false);
//		        		 }
//		        	 }
//		        	 p2.getChildren().addAll(button[0],button[1],button[2],button[3],button[4],button[5],button[6],button[7],button[8]);
//		        	 game.getGamegp().getChildren().add(p2);
//		        	 game.getScore1().setText(String.valueOf(player1score));
//						game.getScore1().setAlignment(Pos.CENTER);
//						game.getScore2().setText(String.valueOf(player2score));
//						game.getScore2().setAlignment(Pos.CENTER);
//						
//		        	 currentround++;
//		        	 game.getFrom().setText(String.valueOf(currentround));
//		        	 valgame=0;	
//		        	 Random r2 = new Random();
//					   int indexrandom2=0;
//					   for(;;){
//						  indexrandom2=r2.nextInt(9);
//						  int row2=indexrandom2/3;
//						  int column2= indexrandom2%3;
//						  if(values[row2][column2].getValue()==' '&& values[row2][column2].isVisit()==false) {
//							  break;
//						  }
//					   }
//					   System.out.println("Selected computer randomly "+indexrandom2);
//					   int res2=indexrandom2;
//					   int rowres2=res2/3;
//					   int columnres2=res2%3;
//					   values[rowres2][columnres2].setValue(player1value);
//					   values[rowres2][columnres2].setVisit(true);
//					   button[res2].setText(String.valueOf(player1value));
//					   button[res2].setDisable(true);
//					   valgame=1-valgame;	 
//		        }
//		       if (currentround >selectrounds) {
//		        	 wins.getPlayer1name().setText(player1name);
//		 	        wins.getPlayer2name().setText(player2name);
//		 	        wins.getPlayer1score().setText(String.valueOf(player1score));
//		 	        wins.getPlayer2score().setText(String.valueOf(player2score));
//		 	        if(player1score>player2score) {
//		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
//		 	        	ImageView win= new ImageView(m);
//		 	        	win.setLayoutX(0);
//		 	        	win.setLayoutY(200);
//		 	        	win.setFitHeight(200);
//		 	        	win.setFitWidth(300);
//		 	        	
//		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
//		 	        	ImageView lose= new ImageView(m2);
//		 	        	lose.setLayoutX(500);
//		 	        	lose.setLayoutY(200);
//		 	        	lose.setFitHeight(200);
//		 	        	lose.setFitWidth(300);
//		 	        	p3.getChildren().addAll(lose,win);
//		 	        	wins.getGp().getChildren().add(p3);	
//		 	        }
//		 	        else if(player1score<player2score) {
//		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/application/loseplayer-removebg-preview.png");
//		 	        	ImageView win= new ImageView(m);
//		 	        	win.setLayoutX(0);
//		 	        	win.setLayoutY(200);
//		 	        	win.setFitHeight(200);
//		 	        	win.setFitWidth(300);
//		 	        	
//		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
//		 	        	ImageView lose= new ImageView(m2);
//		 	        	lose.setLayoutX(500);
//		 	        	lose.setLayoutY(200);
//		 	        	lose.setFitHeight(200);
//		 	        	lose.setFitWidth(300);
//		 	        	p3.getChildren().addAll(lose,win);
//		 	        	wins.getGp().getChildren().add(p3);	
//		 	        }
//		 	        else {
//		 	        	Image m = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
//		 	        	ImageView win= new ImageView(m);
//		 	        	win.setLayoutX(0);
//		 	        	win.setLayoutY(200);
//		 	        	win.setFitHeight(200);
//		 	        	win.setFitWidth(300);
//		 	        	
//		 	        	Image m2 = new Image("file:///C:/Users/Ehab/eclipse-workspace/DijekstrasProject4/src/winplayer-removebg-preview.png");
//		 	        	ImageView lose= new ImageView(m2);
//		 	        	lose.setLayoutX(500);
//		 	        	lose.setLayoutY(200);
//		 	        	lose.setFitHeight(200);
//		 	        	lose.setFitWidth(300);
//		 	        	p3.getChildren().addAll(lose,win);
//		 	        	wins.getGp().getChildren().add(p3);	
//		 	        	
//		 	        }
//		 	        	 stage5.setScene(scene5);
//		 		          stage5.show();
//		 	          
//		 	        }
//		       
//		       
//		       
//			
//		}
//	
//}
////////////////////////////////////////////	static int[] minimax(char playerValue) {
//int[] bestMove = new int[]{-1, -1};
//int bestScore = (playerValue == player1value) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
//
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        if (values[i][j].getValue() == ' ') {
//            values[i][j].setValue(playerValue); 
//            int score = minimaxHelper(playerValue, false);
//            values[i][j].setValue(' ');
//
//            if ((playerValue == player1value && score > bestScore) || (playerValue == player2value && score < bestScore)) {
//                bestScore = score;
//                bestMove[0] = i;
//                bestMove[1] = j;
//            }
//        }
//    }
//}
//
//return bestMove;
//}
//
//static int minimaxHelper(char playerValue, boolean isMaximizingPlayer) {
//char winner = checkWinner();
//
//if (winner == player1value) {
//    return (playerValue == player1value) ? 1 : -1; // Change the scores to make AI aggressive
//} else if (winner == player2value) {
//    return (playerValue == player2value) ? -1 : 1; // Change the scores to make AI aggressive
//} else if (isBoardFull(values)) {
//    return 0;
//}
//
//char currentPlayerValue = (playerValue == player1value) ? player1value : player2value;
//
//if (isMaximizingPlayer) {
//    int bestScore = Integer.MIN_VALUE;
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            if (values[i][j].getValue() == ' ') {
//                values[i][j].setValue(currentPlayerValue); 
//                int score = minimaxHelper(currentPlayerValue, false);
//               values[i][j].setValue(' ');
//                bestScore = Math.max(score, bestScore);
//            }
//        }
//    }
//    return bestScore;
//} else {
//    int bestScore = Integer.MAX_VALUE;
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            if (values[i][j].getValue() == ' ') {
//                values[i][j].setValue(currentPlayerValue);
//                int score = minimaxHelper(currentPlayerValue, true);
//                values[i][j].setValue(' ');
//                bestScore = Math.min(score, bestScore);
//            }
//        }
//    }
//    return bestScore;
//}
//}
	///////////////////////
//
//
//static int[] minimax(char playerValue) {
//    int[] bestMove = new int[]{-1, -1};
//    int bestScore = (playerValue == player1value) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
//
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            if (values[i][j].getValue() == ' ') {
//                values[i][j].setValue(playerValue); 
//                int score = minimaxHelper(playerValue, false);
//                values[i][j].setValue(' ');
//
//                if ((playerValue == player1value && score > bestScore) || (playerValue == player2value && score < bestScore)) {
//                    bestScore = score;
//                    bestMove[0] = i;
//                    bestMove[1] = j;
//                }
//            }
//        }
//    }
//
//    return bestMove;
//}
//
//


//static int minimaxHelper2(char playerValue, boolean isMaximizingPlayer) {
//    char winner = checkWinner();
//
//    if (winner == player2value) {
//        return 1;
//    } else if (winner == player1value) {
//        return -1;
//    } else if (isBoardFull(values)) {
//        return 0;
//    }
//
//    if (isMaximizingPlayer) {
//        int bestScore = Integer.MIN_VALUE;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (values[i][j].getValue() == ' ') {
//                	  values[i][j].setValue(player2value);
//                	      values[i][j].setVisit(true);
//                    int score = minimaxHelper(player1value, false);
//                         values[i][j].setValue(' ');
//                             values[i][j].setVisit(false);
//                    bestScore = Math.max(score, bestScore);
//                }
//            }
//        }
//        return bestScore;
//    } else {
//        int bestScore = Integer.MAX_VALUE;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (values[i][j].getValue() == ' ') {
//                	values[i][j].setValue(player1value);
//                	 values[i][j].setVisit(true);
//                    int score = minimaxHelper(player2value, true);
//                    values[i][j].setValue(' ');
//                    values[i][j].setVisit(false);
//                    bestScore = Math.min(score, bestScore);
//                }
//            }
//        }
//        return bestScore;
//    }
//}



//static int[] minimax(char playerValue) {
//    int[] bestMove = new int[]{-1, -1};
//    
//    int bestScore;
//
//    if (playerValue == player1value) {
//        bestScore = Integer.MIN_VALUE;
//    } else {
//        bestScore = Integer.MAX_VALUE;
//    }
//
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            if (values[i][j].getValue() == ' ') {
//            	values[i][j].setValue(playerValue);
//            	 values[i][j].setVisit(true);
//                int score = minimaxHelper(player2value, false);
//                values[i][j].setValue(' ');
//                values[i][j].setVisit(false);
//
//                if ((playerValue == player1value && score > bestScore) || (playerValue == player2value && score < bestScore)) {
//                    bestScore = score;
//                    bestMove[0] = i;
//                    bestMove[1] = j;
//                }
//            }
//        }
//    }
//
//    return bestMove;
//}
//=============================


//static int checkminandmax2(char cpay, boolean maxornot) {
//	 char valwins = winornot();
//
//    if (valwins == player2value) {
//        return 1;
//    } else if (valwins == player1value) {
//        return -1;
//    } else if (isBoardFull(values)) {
//        return 0;
//    }
//    int bestoptionselect;
//    if (maxornot) {
//    	bestoptionselect= minvalues;
//    } else {
//    	bestoptionselect = maxvalues;
//    }
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            if (isEmptyvalues(i, j)) {
//            	selectmove(i, j, cpay);
//            	 char current;
//                 if (maxornot==true) {
//                     current = player1value;
//                 } else {
//                     current = player2value;
//                 }
//                 boolean negmax=(!(maxornot));
//                int scoreaftercheck = checkminandmax2(current, negmax);
//                trynextmove(i, j);
//               
//                if (maxornot==true) {
//                	 
//                	if (scoreaftercheck > bestoptionselect) {
//                	    bestoptionselect = scoreaftercheck;
//                	}
//                } else {
//                	
//                	if (scoreaftercheck < bestoptionselect) {
//                	    bestoptionselect = scoreaftercheck;
//                	}
//                }
//            }
//        }
//    }
//    return bestoptionselect;
//}
//============================
//static int checkminandmax(char playerValue, boolean isMaximizingPlayer) {
//char winner = winornot();
//if (winner == player1value) {
//    return 1;
//} else if (winner == player2value) {
//    return -1;
//} else if (isBoardFull(values)) {
//    return 0;
//}
//if (isMaximizingPlayer) {
//    int bestScore = Integer.MIN_VALUE;
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            if (values[i][j].getValue() == ' ') {
//            	  values[i][j].setValue(player1value);
//            	      values[i][j].setVisit(true);
//                int score = checkminandmax(player2value, false);
//                     values[i][j].setValue(' ');
//                         values[i][j].setVisit(false);
//                bestScore = Math.max(score, bestScore);
//            }
//        }
//    }
//    return bestScore;
//} else {
//    int bestScore = Integer.MAX_VALUE;
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            if (values[i][j].getValue() == ' ') {
//            	values[i][j].setValue(player2value);
//            	 values[i][j].setVisit(true);
//                int score = checkminandmax(player1value, true);
//                values[i][j].setValue(' ');
//                values[i][j].setVisit(false);
//                bestScore = Math.min(score, bestScore);
//            }
//        }
//    }
//    return bestScore;
//}
//}

