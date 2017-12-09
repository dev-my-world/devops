kill -9 $(pgrep tomcat)
cd devops
git pull
gradle clean
gradle bootRun