kill -9 $(pgrep tomcat)
git pull
gradle clean
gradle bootRun &