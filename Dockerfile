from debian 
env http_proxy  http://cache.univ-lille1.fr:3128
env https_proxy http://cache.univ-lille1.fr:3128
run apt-get update && \
    apt-get install -y maven openjdk-7-jdk && \
    apt-get clean 
add pom.xml /srv/adopt-1-com/
add settings.xml /root/.m2/settings.xml
workdir /srv/adopt-1-com/
run mvn install
add src /srv/adopt-1-com/src/
expose 8080
cmd mvn jetty:run
