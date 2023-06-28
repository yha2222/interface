package ddit.chap08.sec02;

public interface Repairable {
	//코드ㅡ 없는 인터페이스 => 오버라이드할 메서드 없음 implements만 해도 됨
}

class Unit{ //객체
	int hitPoint; //때린
	final int MAX_HP; //최대파워
	
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
	//GroundUnit(생성자O),Repairable(생성자X) - super => GroundUnit!
	Tank(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "TANK";
	}
}

class Marine extends GroundUnit {
	//Repairable 상속 안함 => SCV(Repairable실행하는 곳) 실행 못함
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
	SCV(){ //수리공장
		super(50);
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	public void repair(Repairable r) {
		//인터페이스 변수에 실제 객체 형성 - upcasting => r - 메소드 없음 => 유닛 객체?
		if(r instanceof Unit) {
			Unit u = (Unit)r;  //downcasting
			while(u.hitPoint != u.MAX_HP) { //쓰고 남은 파워량
				u.hitPoint++;    //채워서 MAX_HP와 같게 만들어줌 => 수리!
			}
			System.out.println(u + "의 수리가 완료되었습니다.");
		}
	}
}