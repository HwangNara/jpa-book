# Chapt 4
## Sequence 전략
- IDENTITY
  - 기본 키 생성을 데이터베이스에 위임
  - ex) MySQL, PostgreSQL, SQL Server, DB2 ...
  - 데이터베이스에 값을 저장하고 나서야 기본 키 값을 구할 수 있을 때 사용
- SEQUENCE
  - 데이터베이스 시퀀스를 사용해서 기본 키를 할당
  - ex) Oracle, PostgreSQL, DB2, H2 ...
- TABLE
  - 키 생성 테이블을 사용
  - ex) 모든 데이터 베이스
  - 이름과 값으로 사용할 컬럼을 만들어 시퀀스를 흉내

