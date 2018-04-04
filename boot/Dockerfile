FROM centos:7

ARG VERSION=1.0-SNAPSHOT

ENV JAVA_HOME /etc/alternatives/jre
ENV APP_HOME /opt/boot

RUN yum update -y && \
    yum install -y \
       java-1.8.0-openjdk java-1.8.0-openjdk-devel git && \
    yum clean all
    
WORKDIR $APP_HOME

VOLUME /tmp

ADD target/boot-$VERSION.jar $APP_HOME/app.jar

ADD docker-entrypoint.sh $APP_HOME

EXPOSE 8081

ENTRYPOINT ["/opt/boot/docker-entrypoint.sh"]
