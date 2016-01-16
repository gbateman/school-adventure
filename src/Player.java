import java.util.ArrayList;

public class Player extends Entity{
	ArrayList<Item> items;

	public Player(int x, int y, char sprite){
		super(x, y, sprite);
		this.items = new ArrayList<Item>();
	}
	
	public void giveBasicItems(){
		items.add(Item.shirt);
		items.add(Item.tie);
	}
}
