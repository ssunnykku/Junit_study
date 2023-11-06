## AssertAll
- 그룹화하기

### 1. Using Multiple Assertions
```java
User user = new User("baeldung", "support@baeldung.com", false);
assertEquals("admin", user.getUsername(), "Username should be admin");
assertEquals("admin@baeldung.com", user.getEmail(), "Email should be admin@baeldung.com");
assertTrue(user.getActivated(), "User should be activated");
```
- 위 예제는 모든 assert가 실패하는 예제이지만 테스트를 실행하면 첫번 째 assertion만 실패한다.

```
org.opentest4j.AssertionFailedError: Username should be admin ==> 
Expected :admin
Actual   :baeldung
```

### 2. AssertAll()

```java
User user = new User("baeldung", "support@baeldung.com", false);
assertAll(
  "Grouped Assertions of User",
  () -> assertEquals("admin", user.getUsername(), "Username should be admin"),
  () -> assertEquals("admin@baeldung.com", user.getEmail(), "Email should be admin@baeldung.com"),
  () -> assertTrue(user.getActivated(), "User should be activated")
);
```
- 모든 assertion이 실행되며 오류가 MultipleFailuresError 메시지에 보고된다.
- AssertAll()은  AssertionError 만 처리한다.
- . 어설션이 일반적인 AssertionError 대신 예외로 끝나는 경우 실행이 즉시 중지되고 오류 출력은 MultipleFailuresError가 아니라 예외와 관련되어 처리된다.
```
org.opentest4j.MultipleFailuresError: Grouped Assertions of User (3 failures)
org.opentest4j.AssertionFailedError: Username should be admin ==> expected: <admin> but was: <baeldung>
org.opentest4j.AssertionFailedError: Email should be admin@baeldung.com ==> expected: <admin@baeldung.com> but was: <support@baeldung.com>
org.opentest4j.AssertionFailedError: User should be activated ==> expected: <true> but was: <false>
```

