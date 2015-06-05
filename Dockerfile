From debian
RUN apt-get update && apt-get install openjdk-0.1.7 maven && apt-get clean
ADD . /projet
CMD cd projet && mvn jetty:run
EXPOSE 8080