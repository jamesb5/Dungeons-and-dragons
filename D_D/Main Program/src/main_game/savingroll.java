package main_game;

import java.util.Scanner;

public class savingroll {
	
	stats s = new stats();
	String savingname;
	boolean strength;
	boolean constitution;
	boolean dexterity;
	boolean intelligence;
	boolean wisdom;
	boolean charisma;
	int savethrow;
	public savingroll(){
		
	}
	public int strsave(int opposingsave, boolean indomitable, boolean indomitable2, boolean indomitable3){
		savingname = "Strength";
		int saved20 = s.d20.roll();
		savethrow = saved20 + s.getmodifier(s.strength);
		if (strength = true){
			savethrow = savethrow + s.getmodifier(s.strength);
			System.out.print("Your Strength saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Strength modifier = " + s.getmodifier(s.strength) + ", + proficentcy bonus = " + s.getmodifier(s.strength) + ")");
		}
		else{
			System.out.print("Your Strength saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Strength modifier = " + s.getmodifier(s.strength) + ")");
		}
		if (savethrow >= opposingsave){
			System.out.print("You are a strong dude");
		}
		else if(savethrow < opposingsave){
			System.out.print("You gotta get swole!");
			if (indomitable = true){
				Scanner input = new Scanner(System.in);
				System.out.println("You can use your indomitable to reroll.");
				System.out.println("Do you wish to use your ability to reroll?");
				System.out.println("'yes' or 'no'?");
				String choise;
				choise = input.nextLine();
				if(choise.equals("yes")){
					System.out.println("You use indomitable to reroll");
					strsave(opposingsave, indomitable, indomitable2, indomitable3);
					if (indomitable = true){
						if (indomitable2 = false){
							if (indomitable3 = false){
								indomitable = false;
								System.out.println("You have now ran out of indomitable ability");
							}
							else if (indomitable3 = true){
								indomitable = true;
								indomitable3 = false;
								System.out.println("You have one more use of the indomitable ability");
							}
						}
						else if (indomitable2 = true){
							indomitable = true;
							indomitable2 = false;
							System.out.println("You have two more use of the indomitable ability");
						}
				}
			}
				else if(choise.equals("no")){
					System.out.println("You dont use indomitable to reroll");
				}
				input.close();}
	}
		return savethrow;
		}
	public int consave(int opposingsave, boolean indomitable, boolean indomitable2, boolean indomitable3){
		savingname = "Constitution";
		int saved20 = s.d20.roll();
		savethrow = saved20 + s.getmodifier(s.constitution);
		if (constitution = true){
			savethrow = savethrow + s.getmodifier(s.constitution);
			System.out.print("Your Constitution saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Constitution modifier = " + s.getmodifier(s.constitution) + ", + proficentcy bonus = " + s.getmodifier(s.constitution) + ")");
			if (savethrow >= opposingsave){
				System.out.print("You are a strong dude");
			}
			else if (savethrow < opposingsave){
				System.out.print("You gotta get swole!");
				if (indomitable = true){
					Scanner input = new Scanner(System.in);
					System.out.println("You can use your indomitable to reroll.");
					System.out.println("Do you wish to use your ability to reroll?");
					System.out.println("'yes' or 'no'?");
					String choise;
					choise = input.nextLine();
					if(choise.equals("yes")){
						System.out.println("You use indomitable to reroll");
						consave(opposingsave, indomitable, indomitable2, indomitable3);
						if (indomitable = true){
							if (indomitable2 = false){
								if (indomitable3 = false){
									indomitable = false;
									System.out.println("You have now ran out of indomitable ability");
								}
								else if (indomitable3 = true){
									indomitable = true;
									indomitable3 = false;
									System.out.println("You have one more use of the indomitable ability");
								}
							}
							else if (indomitable2 = true){
								indomitable = true;
								indomitable2 = false;
								System.out.println("You have two more use of the indomitable ability");
							}
					}
				}
					else if(choise.equals("no")){
						System.out.println("You dont use indomitable to reroll");
					}
					input.close();}		
		}
		else{
		System.out.print("Your Constitution saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Constitution modifier = " + s.getmodifier(s.constitution) + ")");
		}
		}
		return savethrow;}
	public int dexsave(int opposingsave, boolean indomitable, boolean indomitable2, boolean indomitable3){
		savingname = "Dexterity";
		int saved20 = s.d20.roll();
		savethrow = saved20 + s.getmodifier(s.dexterity);
		if (dexterity = true){
			savethrow = savethrow + s.getmodifier(s.dexterity);
			System.out.print("Your Dexterity saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Dexterity modifier = " + s.getmodifier(s.dexterity) + ", + proficentcy bonus = " + s.getmodifier(s.dexterity) + ")");
			if (savethrow >= opposingsave){
				System.out.print("You are a strong dude");
			}
			else if (savethrow < opposingsave){
				System.out.print("You gotta get swole!");
				if (indomitable = true){
					Scanner input = new Scanner(System.in);
					System.out.println("You can use your indomitable to reroll.");
					System.out.println("Do you wish to use your ability to reroll?");
					System.out.println("'yes' or 'no'?");
					String choise;
					choise = input.nextLine();
					if(choise.equals("yes")){
						System.out.println("You use indomitable to reroll");
						dexsave(opposingsave, indomitable, indomitable2, indomitable3);
						if (indomitable = true){
							if (indomitable2 = false){
								if (indomitable3 = false){
									indomitable = false;
									System.out.println("You have now ran out of indomitable ability");
								}
								else if (indomitable3 = true){
									indomitable = true;
									indomitable3 = false;
									System.out.println("You have one more use of the indomitable ability");
								}
							}
							else if (indomitable2 = true){
								indomitable = true;
								indomitable2 = false;
								System.out.println("You have two more use of the indomitable ability");
							}
					}
				}
					else if(choise.equals("no")){
						System.out.println("You dont use indomitable to reroll");
					}
					input.close();}
		}
		else{
		System.out.print("Your Dexterity saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Dexterity modifier = " + s.getmodifier(s.dexterity) + ")");
		}
		}
		return savethrow;}
	
	public int intelsave(int opposingsave, boolean indomitable, boolean indomitable2, boolean indomitable3){
		savingname = "Intelligence";
		int saved20 = s.d20.roll();
		savethrow = saved20 + s.getmodifier(s.intelligence);
		if (intelligence = true){
			savethrow = savethrow + s.getmodifier(s.intelligence);
			System.out.print("Your Intelligence saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Intelligence modifier = " + s.getmodifier(s.intelligence) + ", + proficentcy bonus = " + s.getmodifier(s.intelligence) + ")");
			if (savethrow >= opposingsave){
				System.out.print("You are a strong dude");
			}
			else if (savethrow < opposingsave){
				System.out.print("You gotta get swole!");
				if (indomitable = true){
					Scanner input = new Scanner(System.in);
					System.out.println("You can use your indomitable to reroll.");
					System.out.println("Do you wish to use your ability to reroll?");
					System.out.println("'yes' or 'no'?");
					String choise;
					choise = input.nextLine();
					if(choise.equals("yes")){
						System.out.println("You use indomitable to reroll");
						intelsave(opposingsave, indomitable, indomitable2, indomitable3);
						if (indomitable = true){
							if (indomitable2 = false){
								if (indomitable3 = false){
									indomitable = false;
									System.out.println("You have now ran out of indomitable ability");
								}
								else if (indomitable3 = true){
									indomitable = true;
									indomitable3 = false;
									System.out.println("You have one more use of the indomitable ability");
								}
							}
							else if (indomitable2 = true){
								indomitable = true;
								indomitable2 = false;
								System.out.println("You have two more use of the indomitable ability");
							}
					}
				}
					else if(choise.equals("no")){
						System.out.println("You dont use indomitable to reroll");
					}
					input.close();}
		}
		else{
		System.out.print("Your Intelligence saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Intelligence modifier = " + s.getmodifier(s.intelligence) + ")");
		}
		}
		return savethrow;}
	public int wissave(int opposingsave, boolean indomitable, boolean indomitable2, boolean indomitable3){
		savingname = "Wisdom";
		int saved20 = s.d20.roll();
		savethrow = saved20 + s.getmodifier(s.wisdom);
		if (wisdom = true){
			savethrow = savethrow + s.getmodifier(s.wisdom);
			System.out.print("Your Wisdom saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Wisdom modifier = " + s.getmodifier(s.wisdom) + ", + proficentcy bonus = " + s.getmodifier(s.wisdom) + ")");
			if (savethrow >= opposingsave){
				System.out.print("You are a strong dude");
			}
			else if (savethrow < opposingsave){
				System.out.print("You gotta get swole!");
				if (indomitable = true){
					Scanner input = new Scanner(System.in);
					System.out.println("You can use your indomitable to reroll.");
					System.out.println("Do you wish to use your ability to reroll?");
					System.out.println("'yes' or 'no'?");
					String choise;
					choise = input.nextLine();
					if(choise.equals("yes")){
						System.out.println("You use indomitable to reroll");
						wissave(opposingsave, indomitable, indomitable2, indomitable3);
						if (indomitable = true){
							if (indomitable2 = false){
								if (indomitable3 = false){
									indomitable = false;
									System.out.println("You have now ran out of indomitable ability");
								}
								else if (indomitable3 = true){
									indomitable = true;
									indomitable3 = false;
									System.out.println("You have one more use of the indomitable ability");
								}
							}
							else if (indomitable2 = true){
								indomitable = true;
								indomitable2 = false;
								System.out.println("You have two more use of the indomitable ability");
							}
					}
				}
					else if(choise.equals("no")){
						System.out.println("You dont use indomitable to reroll");
					}
					input.close();}
		}
		else{
		System.out.print("Your Wisdom saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Wisdom modifier = " + s.getmodifier(s.wisdom) + ")");
		}
		}
		return savethrow;}
	public int chasave(int opposingsave, boolean indomitable, boolean indomitable2, boolean indomitable3){
		savingname = "Charisma";
		int saved20 = s.d20.roll();
		savethrow = saved20 + s.getmodifier(s.charisma);
		if (charisma = true){
			savethrow = savethrow + s.getmodifier(s.charisma);
			System.out.print("Your Charisma saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Charisma modifier = " + s.getmodifier(s.charisma) + ", + proficentcy bonus = " + s.getmodifier(s.charisma) + ")");
			if (savethrow >= opposingsave){
				System.out.print("You are a strong dude");
			}
			else if (savethrow < opposingsave){
				System.out.print("You gotta get swole!");
				if (indomitable = true){
					Scanner input = new Scanner(System.in);
					System.out.println("You can use your indomitable to reroll.");
					System.out.println("Do you wish to use your ability to reroll?");
					System.out.println("'yes' or 'no'?");
					String choise;
					choise = input.nextLine();
					if(choise.equals("yes")){
						System.out.println("You use indomitable to reroll");
						chasave(opposingsave, indomitable, indomitable2, indomitable3);
						if (indomitable = true){
							if (indomitable2 = false){
								if (indomitable3 = false){
									indomitable = false;
									System.out.println("You have now ran out of indomitable ability");
								}
								else if (indomitable3 = true){
									indomitable = true;
									indomitable3 = false;
									System.out.println("You have one more use of the indomitable ability");
								}
							}
							else if (indomitable2 = true){
								indomitable = true;
								indomitable2 = false;
								System.out.println("You have two more use of the indomitable ability");
							}
					}
				}
					else if(choise.equals("no")){
						System.out.println("You dont use indomitable to reroll");
					}
					input.close();}
		}
		System.out.print("Your Charisma saving throw is " + savethrow + " (D20 roll = " + saved20 + ", + Charisma modifier = " + s.getmodifier(s.charisma) + ")");
		}
		return savethrow;}
}
