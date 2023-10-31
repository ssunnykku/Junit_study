## 테스트코드 학습 정리
> JUnit, AssertJ 학습 내용 정리
### YouTube 강의(테스트 코드 적용하기) 
#### 1. 테스트 코드 적용하기 (JUnit, TDD), 이론부분 학습 
  - url : https://youtu.be/SFVWo0Z5Ppo?si=9a-SJmJT7KmdKyqz
  - 정리 : [aroundHub](study/1/aroundHub.md)
#### 2. Java Unit Testing with JUnit (John)
  - url : https://www.youtube.com/watch?v=vZm0lHciFsQ
  - 코드 : [John 코드 경로](./src/test/java/study/TDD/John)
  - 요약 : 단위 테스트 한개로는 검증하지 못할 수 있다. 더 많은 단위 테스트를 추가해야 한다. 
  - 두 객체의 값 같은지 비교 : `assertEquals(expected, actual);`
  - 에러 검증 : `asertThrow(Class<T> expectedType, Executable executable)`
#### - 3. TDD, 테스트 관련 강의 및 시연
  - url : https://www.youtube.com/playlist?list=PLwouWTPuIjUj_QqgXlFsqjUwyC0-5dZ_q
  - 코드 : [exercise](./src/test/java/study/TDD/exercise/PasswordMeterTest.java)
  - 내용 정리 : [5. TDD 소개 및 시연](./study/3/5.TDD 소개 및 시연.md)
### 참고
- jUnit5 가이드 : https://junit.org/junit5/docs/current/user-guide/
