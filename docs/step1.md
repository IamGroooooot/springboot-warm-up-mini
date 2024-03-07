## 1단계 구현 기능

### 팀 등록

회사 팀 등록 기능을 만든다.

필수 정보

- 팀 이름

### 직원 등록 기능

직원을 등록할 수 있어야 한다.

필수 정보

- 직원 이름
- 팀의 매니저 여부
- 회사에 들어온 일자
- 생일

### 팀 조회 기능

모든 팀의 정보를 한번에 조회할 수 있어야 한다.

```json
[
  {
    "name": "team name",
    "manager": "team manager name",
    "memberCount": 3
  }, ...
]
```

### 직원 조회 기능

모든 직원의 정보를 한 번에 조회할 수 있다.

```json
[
  {
    "name": "직원 name",
    "teamName": "team name",
    "role": "MANAGER" or "MEMBER",
    "birthday": "2000-01-01",
    "workStartDate": "2024-01-01"
  }, ...
]
```
