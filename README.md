## 테스트코드 학습 정리
> JUnit Test 코드 및 학습 내용 정리
### 출처
- YouTube 강의(테스트 코드 적용하기) 
  - 테스트 코드 적용하기 (JUnit, TDD), 이론부분 학습 : https://youtu.be/SFVWo0Z5Ppo?si=9a-SJmJT7KmdKyqz
  - Java Unit Testing with JUnit (John) : https://www.youtube.com/watch?v=vZm0lHciFsQ
    - 요약 : 단위 테스트 한개로는 검증하지 못할 수 있다. 더 많은 단위 테스트를 추가해야 한다. 
    - 두 객체의 값 같은지 비교 : `assertEquals(expected, actual);`
    - 에러 검증 : `asertThrow(Class<T> expectedType, Executable executable)` 