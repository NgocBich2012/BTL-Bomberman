package uet.oop.bomberman.level;

import uet.oop.bomberman.Game;

public class Coordinates {
	//tile là t?a ?? s? nguyên t??ng ?ng v?i t?a ?? c?a ??i t??ng trong m?ng _map
	//t?a ?? Pixel là t?a ?? s? th?p phân t??ng ?ng v?i t?a ?? ???c hi?n th? trong Game
	public static int pixelToTile(double i) {
		return (int)(i / Game.TILES_SIZE);
	}
	
	public static int tileToPixel(int i) {
		return i * Game.TILES_SIZE;
	}
	
	public static int tileToPixel(double i) {
		return (int)(i * Game.TILES_SIZE);
	}
	
	
}
