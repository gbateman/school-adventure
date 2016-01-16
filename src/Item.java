import java.util.ArrayList;

public class Item {
	public String name;
	public char sprite;
	public char standingOn;
	public static ArrayList<Item> items = new ArrayList<Item>();
	
	public static Item shirt = new Item("Shirt");
	public static Item pants = new Item("Pants");
	public static Item tie = new Item("Tie");
	public static Item belt = new Item("Belt");
	public static Item socks = new Item("Socks");
	public static Item shoes = new Item("Shoes");
	public static Item blazer = new Item("Blazer");
	public static Item laptop = new Item("Laptop");
	public static Item pen = new Item("Pen");
	public static Item pencil = new Item("Pencil");
	public static Item eraser = new Item("Eraser");
	public static Item phone = new Item("Phone");
	public static Item spade = new Item("Ace of Spades", (char)0x2660);
	public static Item heart = new Item("Ace of Hearts", (char)0x2661);
	public static Item fitzKey = new Item("Fitz's Key", (char)0x265D);
	public static Item masterKey = new Item("Master Key", (char)0x2657);
	public static Item trumpet = new Item("Trumpet", (char)0x265D);
	public static Item guitar = new Item("Guitar", (char)0x265D);
	public static Item violin = new Item("Violin", (char)0x265D);
	
	public Item(String name){
		this.name = name;
		items.add(this);
	}
	
	public Item(String name, char sprite){
		this(name);
		this.sprite = sprite;
	}
	
	public void removeFromMap(char[][] map, int x, int y){
		map[x][y] = standingOn;
	}
	
	public void addToMap(char[][] map, int x, int y){
		standingOn = map[x][y];
		map[x][y] = sprite;
	}
	
	public String toString(){
		return "(" + "Name: " + this.name + ", " + "Icon: " + this.sprite + ")";
	}
}
