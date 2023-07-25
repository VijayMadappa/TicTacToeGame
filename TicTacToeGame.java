package com.tictaktoe;

import java.util.Scanner;

public class TicTacToeGame {
	
	static void displayBoard(char board[][]) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++)
			{
				System.out.print(board[i][j]);
			}
			
			System.out.println();
		}
		
	}
	
	static void insertMove(int pos, char board[][], char symbol) {
		
		Scanner scan= new Scanner(System.in);
		
		switch(pos) {
		
			case 1: if(board[0][0]==' ') {
							board[0][0]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			case 2: if(board[0][2]==' ') {
							board[0][2]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			case 3: if(board[0][4]==' ') {
							board[0][4]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			case 4: if(board[2][0]==' ') {
							board[2][0]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			case 5: if(board[2][2]==' ') {
							board[2][2]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			case 6: if(board[2][4]==' ') {
							board[2][4]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			case 7: if(board[4][0]==' ') {
							board[4][0]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			case 8: if(board[4][2]==' ') {
							board[4][2]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			case 9: if(board[4][4]==' ') {
							board[4][4]=symbol;
						}
					else {
						int position;
						System.out.println("Position is already filled \n+"
								+ "Kindly enter different position");
						position=scan.nextInt();
						insertMove(position,board,symbol);
					}
					break;
			
			default:
				System.out.println("Invalid input");
			
		}
		
	}
	
	static boolean checkStatus(char [][]board) {
		
		if(	(board[0][0]=='X' && board[0][2]=='X' && board[0][4]=='X')||
			(board[2][0]=='X' && board[2][2]=='X' && board[2][4]=='X')||
			(board[4][0]=='X' && board[4][2]=='X' && board[4][4]=='X')||
			(board[0][0]=='X' && board[2][0]=='X' && board[4][0]=='X')||
			(board[0][2]=='X' && board[2][2]=='X' && board[4][2]=='X')||
			(board[0][4]=='X' && board[2][4]=='X' && board[4][4]=='X')||
			(board[0][0]=='X' && board[2][2]=='X' && board[4][4]=='X')||
			(board[0][4]=='X' && board[2][2]=='X' && board[4][0]=='X')) {
			return true;
		}
		
		else if((board[0][0]=='O' && board[0][2]=='O' && board[0][4]=='O')||
				(board[2][0]=='O' && board[2][2]=='O' && board[2][4]=='O')||
				(board[4][0]=='O' && board[4][2]=='O' && board[4][4]=='O')||
				(board[0][0]=='O' && board[2][0]=='O' && board[4][0]=='O')||
				(board[0][2]=='O' && board[2][2]=='O' && board[4][2]=='O')||
				(board[0][4]=='O' && board[2][4]=='O' && board[4][4]=='O')||
				(board[0][0]=='O' && board[2][2]=='O' && board[4][4]=='O')||
				(board[0][4]=='O' && board[2][2]=='O' && board[4][0]=='O')) {
				return true;
			}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		String playerOne=" ";
		String playerTwo=" ";
		
		System.out.println("Enter playerOne name");
		playerOne= scan.nextLine();
		System.out.println("Enter playerTwo name");
		playerTwo= scan.nextLine();
		
		char board[][]= {
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}
				};
		System.out.println("Initial Board");
		displayBoard(board);
		
		System.out.println();
		
		int count =0;
		
		while (count >=0 && count <9) {
			if(count%2==0) {
				System.out.println(playerOne+" Enter play position(1-9) to insert X");
				int playerOnePosition = scan.nextInt();
				insertMove(playerOnePosition,board,'X');
				displayBoard(board);
				boolean status=false;
				if(count >4) {
					status=checkStatus(board);
					if(status ==true) {
						System.out.println(playerOne+ " is winner");
						break;
					}
				}
				count++;
			}
			else {
				System.out.println(playerTwo+" Enter play position(1-9) to insert O");
				int playerTwoPosition = scan.nextInt();
				insertMove(playerTwoPosition,board,'O');
				displayBoard(board);
				boolean status=false;
				status=checkStatus(board);
				
				if(count >4) {
				if(status ==true) {
					System.out.println(playerTwo+ " is winner");
					break;
					}
				}
				count++;
			}
			
			if(count >8) {
				System.out.println("Match Drawn");
			}
		}		

	}

}
