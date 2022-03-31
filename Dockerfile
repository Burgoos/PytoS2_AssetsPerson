FROM adoptopenjdk/openjdk11
VOLUME /tmp
ADD ms_assetsperson.jar ms_assetsperson.jar
RUN bash -c 'touch /ms_assetsperson.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /ms_assetsperson.jar"]

