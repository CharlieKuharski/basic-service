
FROM fiadliel/java8-jre:8u131

VOLUME /tmp
ADD build/libs/app.jar app.jar
ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

