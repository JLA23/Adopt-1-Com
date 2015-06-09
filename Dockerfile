from debian 
#env http_proxy http://192.168.42.206:8123
#env https_proxy http://192.168.42.206:8123
run apt-get update && \
    apt-get install -y maven openjdk-7-jdk && \
    apt-get clean 
add pom.xml /srv/adopt-1-com/
workdir /srv/adopt-1-com/
run mvn install
add src /srv/adopt-1-com/src/
expose 8080
cmd mvn jetty:run
