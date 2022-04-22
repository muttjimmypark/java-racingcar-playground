### 수업내용
1. 기능 요구사항
   1. 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
   2. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
   3. 자동차 이름은 쉼표(,)를 기준으로 구분한다.
   4. 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
   5. 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
#
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
    1. inputCarsName : 자동차 이름을 입력받는 기능. [1-1]에서 verify하여 false를 받으면 재입력 요구
    2. getLap : 시도횟수를 입력받는 기능
    3. printRacingStart : "실행결과" 문장 출력
    4. printRacingStatus : 경주 상황을 출력 (getName, getMileage 사용)
    5. printRacingWinner : 최종 우승자를 출력한다
####
3. Application : main 실행부
    1. UserInterface.inputCarsName -> Car.verifyName -> Car.생성자 -> List<Car> Cars
    2. getLap
    3. initializeMileage
    4. 입력받은 시도 횟수 만큼 아래 내용을 반복
       1. getVelocity -> stackMileage
       2. List<Car> -> printRacingStatus
    5. printRacingWinner