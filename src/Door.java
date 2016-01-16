import java.util.ArrayList;

public class Door extends Entity{
	public Item key;
	
	public static ArrayList<Door> doors = new ArrayList<Door>();
	public static Door door1a = new Door(3,32,(char) 0x2551, Item.masterKey);
	public static Door door1b = new Door(3,33,(char) 0x2551, Item.masterKey);
	public static Door door1c = new Door(3,34,(char) 0x2551, Item.masterKey);
	public static Door door101a = new Door(19,35,(char) 0x2550, Item.fitzKey);
	public static Door door101b = new Door(20,35,(char) 0x2550, Item.fitzKey);
	public static Door door102a = new Door(19,31,(char) 0x2550, Item.fitzKey);
	public static Door door102b = new Door(20,31,(char) 0x2550, Item.fitzKey);
	public static Door door103a = new Door(37,35,(char) 0x2550, Item.fitzKey);
	public static Door door103b = new Door(38,35,(char) 0x2550, Item.fitzKey);
	public static Door door104a = new Door(37,31,(char) 0x2550, Item.fitzKey);
	public static Door door104b = new Door(38,31,(char) 0x2550, Item.fitzKey);
	public static Door door105a = new Door(40,35,(char) 0x2550, Item.fitzKey);
	public static Door door105b = new Door(41,35,(char) 0x2550, Item.fitzKey);
	public static Door door106a = new Door(40,31,(char) 0x2550, Item.fitzKey);
	public static Door door106b = new Door(41,31,(char) 0x2550, Item.fitzKey);
	public static Door door107a = new Door(58,35,(char) 0x2550, Item.fitzKey);
	public static Door door107b = new Door(59,35,(char) 0x2550, Item.fitzKey);
	// washroom
	public static Door door2 = new Door(62,30,(char) 0x2551, Item.fitzKey);
	// lower foyer 
	public static Door door3a = new Door(58,23,(char) 0x2550, Item.fitzKey);
	public static Door door3b = new Door(59,23,(char) 0x2550, Item.fitzKey);
	public static Door door3c = new Door(60,23,(char) 0x2550, Item.fitzKey);
	public static Door door3d = new Door(61,23,(char) 0x2550, Item.fitzKey);
	// staff room
	public static Door door4a = new Door(58,17,(char) 0x2550, Item.fitzKey);
	public static Door door4b = new Door(59,17,(char) 0x2550, Item.fitzKey);
	// doors to turf
	public static Door door5a = new Door(52,16,(char) 0x2550, Item.fitzKey);
	public static Door door5b = new Door(53,16,(char) 0x2550, Item.fitzKey);
	public static Door door5c = new Door(54,16,(char) 0x2550, Item.fitzKey);
	public static Door door5d = new Door(55,16,(char) 0x2550, Item.fitzKey);
	public static Door door5e = new Door(56,16,(char) 0x2550, Item.fitzKey);
	// foyer stairs
	public static Door door6 = new Door(65,18,(char) 0x2551, Item.fitzKey);
	// maintenance closet opposite office
	public static Door door7a = new Door(69,23,(char) 0x2550, Item.fitzKey);
	public static Door door7b = new Door(70,23,(char) 0x2550, Item.fitzKey);
	// office
	public static Door door8a = new Door(76,26,(char) 0x2550, Item.fitzKey);
	public static Door door8b = new Door(77,26,(char) 0x2550, Item.fitzKey);
	// oleary office side
	public static Door door9a = new Door(87,26,(char) 0x2550, Item.fitzKey);
	public static Door door9b = new Door(88,26,(char) 0x2550, Item.fitzKey);
	// conference room 1
	//public static Door door10a = new Door(78,31,(char) 0x2550, Item.fitzKey);
	//public static Door door10b = new Door(79,31,(char) 0x2550, Item.fitzKey);
	// conference room 2
	public static Door door11a = new Door(81,31,(char) 0x2550, Item.fitzKey);
	public static Door door11b = new Door(82,31,(char) 0x2550, Item.fitzKey);
	// fitz office side
	//public static Door door12 = new Door(91,29,(char) 0x2551, Item.fitzKey);
	// fitz hall side
	public static Door door13 = new Door(96,29,(char) 0x2551, Item.fitzKey);
	// male teacher's washroom
	public static Door door14 = new Door(103,29,(char) 0x2551, Item.fitzKey);
	// female teacher's washroom
	public static Door door15 = new Door(103,25,(char) 0x2551, Item.fitzKey);
	// judo room
	public static Door door16 = new Door(96,36,(char) 0x2551, Item.fitzKey);
	// maintenance room
	public static Door door17 = new Door(103,36,(char) 0x2551, Item.fitzKey);
	// judo storage room
	public static Door door18 = new Door(96,42,(char) 0x2551, Item.fitzKey);
	// locker room
	public static Door door19 = new Door(103,42,(char) 0x2551, Item.fitzKey);
	// ms kaye area entrance
	public static Door door20a = new Door(99,43,(char) 0x2550, Item.fitzKey);
	public static Door door20b = new Door(100,43,(char) 0x2550, Item.fitzKey);
	public static Door door20c = new Door(101,43,(char) 0x2550, Item.fitzKey);
	public static Door door20d = new Door(102,43,(char) 0x2550, Item.fitzKey);
	// oleary hall side
	public static Door door21 = new Door(96,24,(char) 0x2551, Item.fitzKey);
	// ms kaye's room
	public static Door door22 = new Door(98,47,(char) 0x2551, Item.fitzKey);
	// storage room near ms kayes
	public static Door door23 = new Door(104,52,(char) 0x2551, Item.fitzKey);
	// electrical room near ms kayes
	public static Door door24 = new Door(104,54,(char) 0x2551, Item.fitzKey);
	// 112
	public static Door door112a = new Door(75,20,(char) 0x2550, Item.fitzKey);
	public static Door door112b = new Door(76,20,(char) 0x2550, Item.fitzKey);
	// 113
	public static Door door113a = new Door(89,20,(char) 0x2550, Item.fitzKey);
	public static Door door113b = new Door(90,20,(char) 0x2550, Item.fitzKey);
	// 114
	public static Door door114a = new Door(92,20,(char) 0x2550, Item.fitzKey);
	public static Door door114b = new Door(93,20,(char) 0x2550, Item.fitzKey);
	// ball hockey storage room
	public static Door door25a = new Door(115,20,(char) 0x2550, Item.fitzKey);
	public static Door door25b = new Door(116,20,(char) 0x2550, Item.fitzKey);
	// random closet
	public static Door door26a = new Door(104,23,(char) 0x2550, Item.fitzKey);
	public static Door door26b = new Door(105,23,(char) 0x2550, Item.fitzKey);
	// 114 office
	public static Door door27 = new Door(114,16,(char) 0x2551, Item.fitzKey);
	// 114 storage
	public static Door door28 = new Door(114,11,(char) 0x2551, Item.fitzKey);
	// male teacher's washroom
	public static Door door29 = new Door(124,33,(char) 0x2551, Item.fitzKey);
	// locker to bandom room
	public static Door door30 = new Door(123,42,(char) 0x2551, Item.fitzKey);
	// bandom room to maintenance
	public static Door door31a = new Door(124,43,(char) 0x2550, Item.fitzKey);
	public static Door door31b = new Door(125,43,(char) 0x2550, Item.fitzKey);
	// locker room to maintenance room
	public static Door door32a = new Door(104,41,(char) 0x2550, Item.fitzKey);
	public static Door door32b = new Door(105,41,(char) 0x2550, Item.fitzKey);
	// locker room to maintenance room
	public static Door door33a = new Door(106,43,(char) 0x2550, Item.fitzKey);
	public static Door door33b = new Door(107,43,(char) 0x2550, Item.fitzKey);
	// bandom room to band room
	public static Door door34a = new Door(128,40,(char) 0x2550, Item.fitzKey);
	public static Door door34b = new Door(129,40,(char) 0x2550, Item.fitzKey);
	// studio to bandom room
	public static Door door35 = new Door(130,42,(char) 0x2551, Item.fitzKey);
	// bandom room to band room
	public static Door door36a = new Door(147,40,(char) 0x2550, Item.fitzKey);
	public static Door door36b = new Door(148,40,(char) 0x2550, Item.fitzKey);
	// hall to band hall
	public static Door door37a = new Door(148,26,(char) 0x2550, Item.fitzKey);
	public static Door door37b = new Door(149,26,(char) 0x2550, Item.fitzKey);
	// band hall to gary
	public static Door door38 = new Door(143,27,(char) 0x2551, Item.fitzKey);
	// band hall to wader
	public static Door door39 = new Door(160,27,(char) 0x2551, Item.fitzKey);
	// hall to outside near chapel
	public static Door door40a = new Door(148,19,(char) 0x2550, Item.masterKey);
	public static Door door40b = new Door(149,19,(char) 0x2550, Item.masterKey);
	// washroom near band
	public static Door door41 = new Door(150,24,(char) 0x2551, Item.fitzKey);
	// door to chapel door area
	public static Door door42 = new Door(145,24,(char) 0x2551, Item.fitzKey);
	// door to practice room
	public static Door door43a = new Door(143,23,(char) 0x2550, Item.fitzKey);
	public static Door door43b = new Door(144,23,(char) 0x2550, Item.fitzKey);
	// door to english department
	public static Door door44 = new Door(129,22,(char) 0x2551, Item.fitzKey);
	// door to practice room
	public static Door door45a = new Door(123,20,(char) 0x2550, Item.fitzKey);
	public static Door door45b = new Door(124,20,(char) 0x2555, Item.fitzKey);

	public Door(int x, int y, char sprite){
		super(x, y, sprite);
		doors.add(this);
	}
	
	public Door(int x, int y, char sprite, Item key){
		this(x, y, sprite);
		this.key = key;
	}
	
	public static Door getDoor(int x, int y){
		for(int i = 0; i < doors.size(); i++){
			if(doors.get(i).x == x && doors.get(i).y == y){
				return doors.get(i);
			}
		}
		return null;
	}
}
