## 1단계 구현 기능

### 팀 등록

POST /teams

```json
{
  "name": "team name",
  "manager": "team manager name"
}
``` 

### 직원 등록 기능

POST /employees

```json
{
  "name": "직원 name",
  "teamName": "team name",
  "role": "MANAGER" or "MEMBER",
  "birthday": "2000-01-01",
  "workStartDate": "2024-01-01"
}
```

### 팀 조회 기능

GET /teams

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

GET /employees

```json
[
  {
    "name": "직원 name",
    "teamName": "team name",
    "role": "MANAGER" or "MEMBER",
    "birthday": "2000-01-01",
    "workStartDate": "2024-01-01"
  }, ...
]
```

---

## SQL 스키마

team

```mysql
CREATE TABLE teams (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
```

employees
```mysql
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    isManager BOOLEAN NOT NULL,
    workStartDate DATE NOT NULL,
    birthday DATE NOT NULL,
    teamId INT,
    FOREIGN KEY (teamId) REFERENCES teams(id)
);
```