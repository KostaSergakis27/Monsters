package monsters.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView appView;
	//private MarshmallowMonster myMonster;
	private MarshmallowMonster mySecondMonster;
	
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		//myMonster = new MarshmallowMonster("Derf", 1);
		mySecondMonster = new MarshmallowMonster("Fluffy", 3.0, 2.0, 2, 3, 1, true);
	}
	
	
	public void start()
	{
		appView.displayInformation();
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return mySecondMonster;
	}
}
