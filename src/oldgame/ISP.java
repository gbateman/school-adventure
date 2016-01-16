package oldgame;
import java.awt.*;
import java.io.*;
import java.util.*;

public class ISP {
	//public static HashMap<Point,Tile> map;
	static Map map;
	
	// NEW STRUCTURE
	// Move map to its own object with a double arraylist to store tiles
	// and null tiles where there aren't any
	// Change printmap to a toString method
	// Add parameters for the visible section of the map

	public static void main(String[] args){
		map = new Map(5,5,"Descriptions.txt");
		System.out.println(map.toString());
	}
	
	
	/*public static void main(String[] args){
		map = new HashMap();
		makeMap();
		printMap(-1,-1,5,5);
	}
	
	public static void makeMap(){
		try {
			FileReader f = new FileReader("Descriptions.txt");
			BufferedReader br = new BufferedReader(f);
			
			String line;
			String[] splitLine;
			Point p;
			/*for(int i = 0; i < 5; i++){
				for(int j = 0; j < 5; j++){
					if((line = br.readLine()) != null){
						Point p = new Point(i,j);
						map.put(p, new Tile(line, p));
					}
				}
			}
			while((line = br.readLine()) != null){
				if(!line.substring(0,2).equals("//")){
					splitLine = line.split(",");
					p = new Point(Integer.parseInt(splitLine[0]),Integer.parseInt(splitLine[1]));
					map.put(p, new Tile(splitLine[2]/*,p));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void printMap(int x1, int y1, int x2, int y2){
		for(int i = x1; i <= x2; i++){
			for(int j = y1; j <= y2; j++){
				Tile temp = map.get(new Point(i,j));
				System.out.print(temp != null ? temp.getMapChar() : "-");
			}
			System.out.println();
		}
	}*/
}