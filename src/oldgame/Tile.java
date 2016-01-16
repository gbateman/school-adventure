package oldgame;
import java.awt.*;

public class Tile {
	private boolean explored;
	private String description;
	private Tile north, east, south, west;
	
	public Tile(){
		this.explored = false;
	}

	public Tile(String description){
		this();
		this.description = description;
	}
	
	public Tile(String description, Tile north, Tile west){
		this(description);
		this.north = north;
		this.east = west;
	}
	
	public Tile(String description, Tile north, Tile east, Tile south, Tile west){
		this(description, north, west);
		this.south = south;
		this.east = east;
	}
	/*
	// sets tile in a direction where 0,1,2,3 => N, E, S, W
	public void setDirection(int dir, Tile t){
		switch(dir){
			case 0:
				north = t;
				break;
			case 1:
				east = t;
				break;
			case 2:
				south = t;
				break;
			case 3:
				west = t;
				break;
		}
	}*/
	
	public String getDescription(){
		return description;
	}
	
	public Tile getNorth() {
		return north;
	}

	public Tile setNorth(Tile north) {
		this.north = north;
		return this;
	}

	public Tile getEast() {
		return east;
	}

	public Tile setEast(Tile east) {
		this.east = east;
		return this;
	}

	public Tile getSouth() {
		return south;
	}

	public Tile setSouth(Tile south) {
		this.south = south;
		return this;
	}

	public Tile getWest() {
		return west;
	}

	public Tile setWest(Tile west) {
		this.west = west;
		return this;
	}

	public boolean isExplored(){
		return explored;
	}
	
	public void setToExplored(){
		explored = true;
	}
	
	public char getMapChar(){
		if(!this.explored){
			return 'X';
		}
		return 'O';
	}
	
	public String toString(){
		return "description=" + description;
	}
}