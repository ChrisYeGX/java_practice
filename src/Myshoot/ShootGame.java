package Myshoot;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ShootGame {
	public static final int WIDTH =400;
	public static final int HEIGHT =654;
	public static BufferedImage background;
	public static BufferedImage hero0;
	public static BufferedImage airplane;
	public static BufferedImage hero1;
	public static BufferedImage gameover;
	public static BufferedImage pause;
	public static BufferedImage bee;
	public static BufferedImage bullet;
	public static BufferedImage start;
	static{  //º”‘ÿÕº∆¨◊ ‘¥
		try {
			background = 
				ImageIO.read(
						ShootGame.class.getResource("background.png"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));
			gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
			pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
			airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
			bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
			bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}
}
