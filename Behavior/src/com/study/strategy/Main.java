package com.study.strategy;

public class Main {
	public static void main(String[] args) {
		Moving bus = new Bus();
		bus.move();
		
		Moving train = new Train();
		train.move();
		
		train.setStrategy(new LoadStrategy());
		train.move();
	}
}




/*
	장점
	1. 컨텍스트 코드의 변경 없이 새로운 전략을 추가할 수 있습니다.
	2. 요구사항이 변경 됐을때 기존 코드의 변화 없이 요구사항을 충족할 수 있습니다.
	
	단점
	1. 적용되는 로직이 짧은 경우 보기에 따라 복잡해보일 수 있습니다.
	2. 구현을 위해 클라이언트와 전략 사이에 강력한 내부 의존성이 있습니다.
	3. 전략 및 동작의 변경이 소프트웨어의 사용 및 운영에 중요하거나 필수적인 경우에만 해야합니다.
	
	사용하기 좋은 상황
	1. 랜덤한 로직을 테스트 한다거나, Mock오브젝트를 생성하여 Controller를 테스트 하는 경우 등 다양한 경우에서 유용하게 사용됩니다.
	2. 환율을 다르게 적용하여 계산하기, 해쉬값을 생성할때 알고리즘을 다르게 적용하여 생성하기와 같은 전략이 있을 수 있다.
*/