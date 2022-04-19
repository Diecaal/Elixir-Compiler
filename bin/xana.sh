args="$@"
mvn clean compile exec:java -Dexec.mainClass="es.uniovi.dlp.commandline.CLI" -Dexec.args="$args" -q
