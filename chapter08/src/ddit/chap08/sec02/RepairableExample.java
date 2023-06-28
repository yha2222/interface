package ddit.chap08.sec02;

public class RepairableExample {

	public static void main(String[] args) {
		Tank tank = new Tank();
		
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(new DropShip());
		//scv.repair(new Marine()); 
		//repair 메소드는 Marine 전달받을 수 없음 부모 클래스 아니라서 upcasting 될 수 없음
		//호출 결과 따라서 수리 가능 여부 식별

	}

}
