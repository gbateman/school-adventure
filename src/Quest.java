import java.util.ArrayList;

public class Quest {
	public String message;
	public String completedMessage;
	public String description;
	public Item[] requirements;
	public Item[] rewards;
	public boolean completed;
	public ArrayList<Quest> quests = new ArrayList<Quest>();
	
//	public static Quest first = new Quest(
//			"Bring me an ace of spades!",
//			"Thank you for that ace of spades!",
//			"The guy in the first room is looking for an ace of spades.",
//			new Item[]{Item.spade},
//			new Item[]{Item.phone});
//	public static Quest second = new Quest(
//			"Bring me an ace of hearts!",
//			"Thank you for that ace of hearts!",
//			"The guy in the first room is looking for an ace of hearts.",
//			new Item[]{Item.heart},
//			new Item[]{Item.laptop});
//	public static Quest mariachi = new Quest(
//			"Right time right place",
//			"Thank you for that wonderful mariachi performance!",
//			"Fitz wants a mariachi band performance.",
//			new Item[]{Item.trumpet, Item.guitar, Item.violin},
//			new Item[]{Item.tie});
	public static Quest giveKey = new Quest(
			"",
			"Fitz: Take this key to most of the inner doors and try to find the way out.",
			"",
			new Item[]{},
			new Item[]{Item.fitzKey});
	
	public Quest(String message, String completedMessage, String description, Item[] requirements, Item[] rewards){
		this.message = message;
		this.completedMessage = completedMessage;
		this.description = description;
		this.requirements = requirements;
		this.rewards = rewards;
		this.completed = false;
		quests.add(this);
	}
	
	public boolean updateQuest(Player p){
		for(int i = 0; i < requirements.length; i++){
			if(!p.items.contains(requirements[i])){
				return false;
			}
		}
		for(int i = 0; i < requirements.length; i++){
			p.items.remove(requirements[i]);
		}
		for(int j = 0; j < rewards.length; j++){
			p.items.add(rewards[j]);
		}
		completed = true;
		return true;
	}
}
