## JUnit LifeCycle Annotation
> Junit5는 아래와 같은 테스트 라이프 사이클을 가지고 있다.

| Annotation | Description                                         |
|------------|:----------------------------------------------------|
| @Test      | 테스트용 메소드를 표현하는 어노테이션                                |
| @BeforEach | 각 테스트 메소드가 시작되기 전에 실행되어야 하는 메소드를 표현                 |
| @AfterEach | 각 테스트 메소드가 시작된 후 실행되어야 하는 메소드를 표현                   |
| @BeforeAll | 테스트 시작 전에 실행되어야 하는 메소드를 표현 (static 처리가 필요한 메소드에 사용) |
| @AfterAll  | 테스트 종료 후에 실행되어야 하는 메소드를 표현 (static 처리가 필요한 메소드에 사용) |
----
## Main Annotation

### SpringBootTest (SpringBoot 제공)
- 통합 테스트 용도로 사용됨
- @SpringBootApplication을 찾아가 하위의 모든 Bean을 스캔하여 로드함
- 그 후 Test용 Application Context를 만들어 Bean을 추가하고, MockBean을 찾아 교체
  - Aplication 클래스를 찾아가 로드를 해서 모든 Bean이 로드될 수 있게 해준다.

### @ExtendWith(JUnit4)
- Junit4에서 @RunWith로 사용되던 어노테이션이 ExtendWith로 변경됨
- @ExtendWith는 메인으로 실행될 Class를 지정할 수 있음
- @SpringBootTest는 기본적으로 @ExtendWith가 추가되어 있음

