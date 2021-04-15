FROM adoptopenjdk/openjdk8
RUN echo "Asia/Shanghai" > /etc/timezone
WORKDIR /app
#https://hub.docker.com/r/hengyunabc/arthas/tags?page=1&ordering=last_updated
#COPY --from=hengyunabc/arthas:latest /opt/arthas /opt/arthas

RUN apt-get update \
  && apt-get install -y net-tools telnet inetutils-ping tcpdump
CMD java -jar demo-0.0.1-SNAPSHOT.jar