# Java REST Server Demos

Ez a jegyzék négy különböző Java alkalmazásszerverre készített egyszerű, **Servlet-alapú** REST API példákat tartalmaz. Céljuk bemutatni, hogyan lehet HTTP REST végpontokat létrehozni Jetty, Tomcat, GlassFish és WildFly környezetekben `HttpServlet` használatával.

## Projektek

| Mappa                 | Szerver         | Típus         | Port    | Megjegyzés                      |
|-----------------------|-----------------|---------------|---------|---------------------------------|
| `jetty-rest-demo`     | Jetty (embedded)| Fat JAR       | `8080`  | Futtatható önállóan Java-ból    |
| `tomcat-rest-demo`    | Apache Tomcat   | WAR deploy    | `8080`  | WAR fájl deploy szükséges       |
| `glassfish-rest-demo` | GlassFish       | WAR deploy    | `8080`  | Jakarta EE szabványos           |
| `wildfly-rest-demo`   | WildFly / JBoss | WAR deploy    | `8080`  | JAX-RS annotáció alapú példa    |

---

## Használat

### 1. Előfeltételek

- Java 17+
- Apache Maven 3.6+
- Telepített alkalmazásszerver (kivéve Jetty)

### 2. Build

Menj a kívánt mappába:

```bash
cd jetty-rest-demo
mvn clean package
