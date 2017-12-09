kill -9 $(pgrep java)
cd devops
git pull
gradle clean
gradle bootRun