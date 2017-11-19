import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Jugador implements Runnable{
	
	private int x;
	private int y;
	private int dx;
	private int dy;
	private SpriteManager sm;
	private BufferedImage imagen;
	private volatile boolean moveLeft;
	private boolean moveRight;
	private volatile boolean moveUp;
	private boolean moveDown;
	private boolean noMovement;
	private int cont;
	private int i;
	
	public Jugador(int x, int y){
		
		this.x = x;
		this.y = y;
		dx = 1;
		dy = 1;
		moveLeft = false;
		moveRight = false;
		moveUp = false;
		moveDown = false;
		sm = new SpriteManager("/imagenes/soldierSpray.png");
		imagen = sm.subImage(1, 1, 79, 53);
		cont = 79;
		i = 0;
		Thread t = new Thread(this);
		t.start();
		//imagen = ImageManager.cargarImagen("/imagenes/soldier.jpg");
		
	}
	
	public void render(Graphics g){
		
		g.drawImage(imagen, x, y, null);
		
	}
	
	public void update(){
		
		if(moveUp){
			y -= dy;
		}
		if(moveDown){
			y += dy;
		}
		if(moveRight){
			x += dx;
		}
		if(moveLeft){
			x -= dx;
		}
		
	}
	
	public void run(){
		while(true){
		if(moveUp){
			System.out.println("Runing");
			imagen = sm.subImage(0 + cont * i, 159, 79, 53);
			i++;
			if(i == 3)
				i = 0;
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

	public boolean isMoveLeft() {
		return moveLeft;
	}

	public void setMoveLeft(boolean moveLeft) {
		this.moveLeft = moveLeft;
	}

	public boolean isMoveRight() {
		return moveRight;
	}

	public void setMoveRight(boolean moveRight) {
		this.moveRight = moveRight;
	}

	public boolean isMoveUp() {
		return moveUp;
	}

	public void setMoveUp(boolean moveUp) {
		this.moveUp = moveUp;
	}

	public boolean isMoveDown() {
		return moveDown;
	}

	public void setMoveDown(boolean moveDown) {
		this.moveDown = moveDown;
	}
	
	

}
