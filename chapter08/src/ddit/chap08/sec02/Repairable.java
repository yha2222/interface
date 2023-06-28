package ddit.chap08.sec02;

public interface Repairable {
	//�ڵ�� ���� �������̽� => �������̵��� �޼��� ���� implements�� �ص� ��
}

class Unit{ //��ü
	int hitPoint; //����
	final int MAX_HP; //�ִ��Ŀ�
	
	Unit(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable { 
	//GroundUnit(������O),Repairable(������X) - super => GroundUnit!
	Tank(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "TANK";
	}
}

class Marine extends GroundUnit {
	//Repairable ��� ���� => SCV(Repairable�����ϴ� ��) ���� ����
	Marine(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "MARINE";
	}
}

class DropShip extends GroundUnit implements Repairable {
	DropShip(){
		super(200);
	}
	
	@Override
	public String toString() {
		return "DROPSHIP";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV(){ //��������
		super(50);
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	public void repair(Repairable r) {
		//�������̽� ������ ���� ��ü ���� - upcasting => r - �޼ҵ� ���� => ���� ��ü?
		if(r instanceof Unit) {
			Unit u = (Unit)r;  //downcasting
			while(u.hitPoint != u.MAX_HP) { //���� ���� �Ŀ���
				u.hitPoint++;    //ä���� MAX_HP�� ���� ������� => ����!
			}
			System.out.println(u + "�� ������ �Ϸ�Ǿ����ϴ�.");
		}
	}
}