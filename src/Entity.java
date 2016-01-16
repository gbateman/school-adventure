
public class Entity {
	int x;
	int y;
	char sprite;
	char standingOn;

	public Entity(int x, int y, char sprite){
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}
	
	public void removeFromMap(char[][] map){
		map[x][y] = standingOn;
	}
	
	public void addToMap(char[][] map){
		standingOn = map[x][y];
		map[x][y] = sprite;
	}
}
