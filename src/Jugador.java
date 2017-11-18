import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Jugador {
	
	private int x;
	private int y;
	private int dx;
	private int dy;
	private SpriteManager sm;
	private BufferedImage imagen;
	private boolean moveLeft;
	private boolean moveRight;
	private boolean moveUp;
	private boolean moveDown;
	private boolean noMovement;
	
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
		imagen = sm.subImage(0, 0, 79, 53);
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
