package com.codingame.starter.coderStrikeBack.vers1;

import java.util.Scanner;

public class Player {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		// game loop
		while (true) {
			int x = in.nextInt(); // x position of your pod
			int y = in.nextInt(); // y position of your pod
			int nextCheckpointX = in.nextInt(); // x position of the next check
												// point
			int nextCheckpointY = in.nextInt(); // y position of the next check
												// point

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");

			// Edit this line to output the target position
			// and thrust (0 <= thrust <= 100)
			// i.e.: "x y thrust"
			System.out.println(nextCheckpointY + " " + nextCheckpointY + " 100");

		}
	}
}
