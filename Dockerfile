FROM jetty:12.0.10-jre17
ARG JAVA_OPTIONS=""
ENV JAVA_OPTIONS="--add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED --add-modules=ee10-deploy,http ${JAVA_OPTIONS} "

USER root
RUN rm -rf /var/lib/jetty/webapps
ADD ./target/scala-3.3.3/errorhandlerrepro_3-0.1.0-SNAPSHOT.war /var/lib/jetty/webapps/ROOT.war
ADD ./config/ee10-deploy.ini /var/lib/jetty/start.d/ee10-deploy.ini

USER jetty
