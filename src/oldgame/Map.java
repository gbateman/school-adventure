package oldgame;
import java.awt.Point;
import java.io.*;
import java.util.ArrayList;

public class Map {
	private ArrayList<Tile> tiles;
	private int width, height;

	public Map(int width, int height){
		this.width = width;
		this.height = height;
		tiles = new ArrayList<Tile>(width*height);
		for(int j = 0; j < height; j++){
			for(int i = 0; i < width; i++){
				tiles.add(new Tile().setNorth(j > 0 ? tiles.get(get1DCoord(i, j-1)) : null).setWest(i > 0 ? tiles.get(get1DCoord(i-1, j)) : null));
			}
		}
	}
	
	public Map(int width, int height, ArrayList<Tile> tiles){
		this(width, height);
		for(int i = 0; i < tiles.size(); i++){
			this.tiles.add(tiles.get(i));
		}
	}
	
	public Map(int width, int height, String file){
		this(width, height);
		try {
			FileReader f = new FileReader(file);
			BufferedReader br = new BufferedReader(f);
			
			String line;
			String[] splitLine;
			while((line = br.readLine()) != null){
				if(!line.substring(0,2).equals("//")){
					splitLine = line.split(",");
					addTile(Integer.parseInt(splitLine[0]), Integer.parseInt(splitLine[1]), new Tile(splitLine[2]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Tile> getTiles(){
		return tiles;
	}
	
	public Tile addTile(int x, int y, Tile t){
		return tiles.set(y * width + x, t);
	}
	
	public String toString(){
		String output = "";
		for(int i = 0; i < tiles.size(); i++){
			output += String.format("%d, %d: %s%n", get2DCoords(i).x, get2DCoords(i).y, tiles.get(i).toString());
		}
		return output;
	}
	
	private Point get2DCoords(int i){
		return new Point(i/width, i%width);
	}
	
	private int get1DCoord(int x, int y){
		return y*width+x;
	}
}
