package ddit.chap08.sec02;

public class RepairableExample {

	public static void main(String[] args) {
		Tank tank = new Tank();
		
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(new DropShip());
		//scv.repair(new Marine()); 
		//repair �޼ҵ�� Marine ���޹��� �� ���� �θ� Ŭ���� �ƴ϶� upcasting �� �� ����
		//ȣ�� ��� ���� ���� ���� ���� �ĺ�

	}

}
