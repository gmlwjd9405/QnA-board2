#!/bin/bash
# deploy.sh를 백그라운드로 실행한 뒤, 로그나 기타 내용을 남기지 않음
/home/ubuntu/app/travis/deploy.sh > /dev/null 2> /dev/null < /dev/null &