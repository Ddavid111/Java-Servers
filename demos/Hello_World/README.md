# Java Hello World Server Demos (Servlet alapú)

Ez a jegyzék egyszerű **"Hello World"** alkalmazásokat tartalmaz, négy különböző Java alkalmazásszerverre implementálva. Minden példa `HttpServlet` segítségével ír ki egy egyszerű üzenetet (`Hello, World!`) a böngészőbe.

## Projektek

| Mappa                 | Szerver         | Típus         | Port    | Megjegyzés                      |
|---------------------- |-----------------|---------------|---------|---------------------------------|
| `jetty-demo`          | Jetty (embedded)| Fat JAR       | `8080`  | Önállóan futtatható             |
| `tomcat-demo`         | Apache Tomcat   | WAR deploy    | `8080`  | WAR fájl deploy szükséges       |
| `glassfish-demo`      | GlassFish       | WAR deploy    | `8080`  | Jakarta EE 10 kompatibilis      |
| `wildfly-demo`        | WildFly / JBoss | WAR deploy    | `8080`  | Jakarta EE támogatással         |

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