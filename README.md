# Redis & Spring Boot sample

### 프로젝트 구성

* Spring Boot 2.4
* Spring Web MVC
* Redis 6.2

### Redis Docker 구성 방법
* Redis Server Docker install and running 
```
# pull redis
sudo docker pull redis:6.2.1
# start container first time
sudo docker run --name my-redis -d -p 6379:6379 redis:6.2.1
```

* Redis Command Line Tool 설치 (Ubuntu)
```
# apt-get install redis-cli
sudo apt-get install redis-tool
# ping to server
redis-cli -h localhost -p 6379 ping
```

### Sample Code
 * Redis : net.gaeco.redisdemo.controller.RedisController

### Test URL
* Redis String 테스트 : http://localhost:8080/redis/string

### Docker CLI
```
# Docker compose 실행
sudo docker-compose -f docker-compose-dev.yml up
# Docker compose 이미지 삭제
sudo docker-compose -f docker-compose-dev.yml down
```