# sonarqubePractice

1) 빌드와 실행
- ./gradlew bootRun
- 또는 IDE에서 Spring Boot 애플리케이션 실행

2) 테스트용 엔드포인트
- http://localhost:8080/add?name={이름}
- http://localhost:8080/users

3) SonarQube 연습
- 로컬에 SonarQube 서버 띄우기 (docker run -d --name sonarqube -p 9000:9000 sonarqube:latest)
- SonarScanner 또는 Jenkins로 프로젝트 분석
- SonarLint를 IDE에 설치하면 실시간 문제 확인 가능
