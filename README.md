### 구현할 기능 목록
1. Car
   1. verifyName (static) : 이름이 5자를 초과하지 않도록 함
   2. 생성자 : 생성시 이름을 받도록 함
   3. getName : 이름 값을 반환
   4. getVelocity : 0~9사이 random값을 반환
   5. getMileage : 주행거리(mileage)값을 반환
   6. stackMileage : 주행거리를 1씩 증가
   7. initializeMileage : 주행거리를 1로 초기화
####
2. UserInterface
    1. getCarsName : 자동차 이름을 입력받는 기능. [1-1]에서 verify하여 false를 받으면 재입력 요구
    2. printRacingStart : "실행결과" 문장 출력
    3. printRacingStatus : 경주 상황을 출력 (getName, getMileage 사용)
    4. printRacingWinner : 최종 우승자를 출력한다
####
3. Application : main 실행부
    1. UserInterface.getCarsName -> Car.verifyName -> Car.생성자 -> List<Car> Cars
    2. initializeMileage
    3. 입력받은 시도 횟수 만큼 아래 내용을 반복 
       1. getVelocity -> stackMileage
       2. List<Car> -> printRacingStatus
    4. printRacingWinner