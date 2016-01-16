import java.util.ArrayList;
import java.util.LinkedList;

public class NPC extends Entity{
	String name;
	ArrayList<String> messages;
	int messageCounter;
	ArrayList<Quest> quests;
	int questCounter;
	LinkedList<String> tempMessages;
	
	public static ArrayList<NPC> npcs = new ArrayList<NPC>();
//	public static NPC dale = new NPC("Dale", 5, 32, (char)0x263B).
//			addMessage("Hello!").addQuest(Quest.first).
//			addQuest(Quest.second).
//			addTempMessage("Woohoo!").
//			addTempMessage("Woohoo!").
//			addTempMessage("Woohoo!");
	public static NPC fitz = new NPC("Mr. Fitz", 94, 34, (char)0x263B).
			addMessage("Fitz: Please try to find the key to the outside.").
			addQuest(Quest.giveKey).
			addTempMessage("You: Mr. Fitz?? What are you doing here?").
			addTempMessage("Fitz: Let me tell you a story...").
			addTempMessage("Fitz: No, wrong time wrong place for that.").
			addTempMessage("Fitz: If I could say it in two brief statements, it would be that").
			addTempMessage("Fitz: one, we lost the keys to the outside").
			addTempMessage("Fitz: and two, we can't use the phones because of the storm.").
			addTempMessage("Fitz: So you're going to need to find the key or else we may all starve in here.")
			;
	public static NPC gary = new NPC("Gary", 94, 34, (char)0x263B).
			addMessage("Gary: Du Gat Du Gat Dweeeeeee.").
			//addQuest(Quest.giveMasterKey).
			addTempMessage("Gary: My dwag could find the master key better than you")
			;

	public NPC(String name, int x, int y, char sprite){
		super(x, y, sprite);
		
		this.name = name;
		
		this.messages = new ArrayList<String>();
		this.messageCounter = 0;
		
		this.quests = new ArrayList<Quest>();
		this.questCounter = 0;
		
		this.tempMessages = new LinkedList<String>();
		
		npcs.add(this);
	}
	
	public String getMessage(Player player){
		String output = "";
		if(!tempMessages.isEmpty()){
			return tempMessages.removeFirst();
		} else if(!quests.isEmpty()){
			for(int i = 0; i < quests.size(); i++){
				Quest q = quests.get(questCounter);
				if(q.updateQuest(player)){
					output = quests.get(questCounter).completedMessage;
					quests.remove(q);
					questCounter = 0;
					return output;
				}
			}
			output = quests.get(questCounter).message;
			questCounter = (questCounter + 1) % quests.size();
		} else {
			output = messages.get(messageCounter);
			messageCounter = (messageCounter + 1) % messages.size();
		}
		return output;
	}
	
	public NPC addTempMessage(String s){
		tempMessages.add(s);
		return this;
	}
	
	public NPC addMessage(String s){
		messages.add(s);
		return this;
	}
	
	public NPC addQuest(Quest q){
		quests.add(q);
		return this;
	}
	
	public static NPC getNPC(int x, int y){
		for(int i = 0; i < npcs.size(); i++){
			if(npcs.get(i).x == x && npcs.get(i).y == y){
				return npcs.get(i);
			}
		}
		return null;
	}
}
