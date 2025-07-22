Kódelemzés
==========

Belső architekturájuknak a felrajzolása
---------------------------------------

Jetty architektúra
^^^^^^^^^^^^^^^^^^

.. uml::

   @startuml
   skinparam style strictuml
   skinparam shadowing true
   skinparam componentStyle rectangle
   skinparam defaultTextAlignment center

   cloud "Internet" as Internet

   rectangle "HTTP/1.1 Connector" as HTTP11
   rectangle "HTTP/2 Connector" as HTTP2

   rectangle "Jetty Server" as Jetty

   rectangle "WebApp Store" as Store
   rectangle "WebApp Catalog" as Catalog

   Internet --> HTTP11
   Internet --> HTTP2

   HTTP11 --> Jetty
   HTTP2 --> Jetty

   Jetty --> Store
   Jetty --> Catalog
   @enduml


Az architektúra elemei és kapcsolódásuk:

- **Internet**: A külső világot reprezentálja, amelyen keresztül a klienskérések érkeznek.
- **HTTP/1.1 Connector**: Egy kapcsolódási pont, amely a HTTP/1.1 protokollt kezeli. A felhasználói kéréseket fogadja be az internetről.
- **HTTP/2 Connector**: Egy modern, hatékonyabb kapcsolódási pont, amely a HTTP/2 protokollt kezeli, támogatva a multiplexálást és gyorsabb adatátvitelt.
- **Jetty Server**: A központi szerver komponens, amely feldolgozza a beérkező HTTP kéréseket, továbbítja azokat a belső komponenseknek, és előállítja a válaszokat.
- **WebApp Store**: Az alkalmazásokhoz tartozó erőforrásokat, fájlokat tároló komponens, amelyből a Jetty szükség esetén betöltheti az alkalmazás elemeit.
- **WebApp Catalog**: Az elérhető alkalmazások vagy modulok katalógusa, amely segíti a Jetty szervert az alkalmazások kezelésében.

**Kapcsolatok:**

- Az **Internet** kapcsolatot létesít a HTTP/1.1 és HTTP/2 Connectorokkal, amelyek a különböző protokollok szerint fogadják a kéréseket.
- Mindkét Connector továbbítja a beérkező kéréseket a **Jetty Server**-hez.
- A Jetty Server a kérések feldolgozása során a **WebApp Store** és **WebApp Catalog** komponenseket használja az alkalmazás elemeinek kiszolgálásához.


GlassFish architektúra
^^^^^^^^^^^^^^^^^^^^^^
.. uml::

   @startuml
   skinparam style strictuml
   skinparam shadowing true
   skinparam componentStyle rectangle
   skinparam defaultTextAlignment center

   cloud "Internet" as Internet

   rectangle "HTTP Connector\n(Grizzly)" as HTTP

   node "GlassFish Server" {
       rectangle "Web Container\n(Servets, JSP)" as Web
       rectangle "EJB Container\n(Enterprise Beans)" as EJB
       rectangle "Java EE Services\n(JTA, JMS, JPA, etc.)" as EE
   }

   database "Database" as DB
   folder "External Services" as External

   Internet --> HTTP
   HTTP --> Web
   Web --> EJB
   EJB --> EE
   EE --> DB
   EE --> External

   @enduml


Az architektúra elemei és kapcsolódásuk:

- **Internet**: A kliens oldali kérések forrása.
- **HTTP Connector (Grizzly)**: A GlassFish által használt HTTP-kapcsolódási pont, amely fogadja az internet felől érkező kéréseket.
- **GlassFish Server**: A fő szerver komponens, amely három fő alrendszerből áll:

  - **Web Container (Servlets, JSP)**: Kezeli a webkomponenseket, például servlet-eket és JSP-ket.

  - **EJB Container (Enterprise Beans)**: Kezeli az üzleti logikát tartalmazó Enterprise Java Beans komponenseket.

  - **Java EE Services (JTA, JMS, JPA, stb.)**: Szolgáltatásokat biztosít, mint tranzakciókezelés, üzenetküldés, perzisztencia.

- **Database**: Az adatbázis, amelyhez a Java EE szolgáltatások kapcsolódnak.
- **External Services**: Külső rendszerek vagy szolgáltatások, amelyek integrálhatók a GlassFish környezetbe.

**Kapcsolatok:**

- Az **Internet** kapcsolatot létesít a HTTP Connectorral.
- A HTTP Connector továbbítja a kéréseket a **Web Containernek**.
- A Web Container továbbítja a kéréseket az **EJB Containernek**.
- Az EJB Container hívja a **Java EE Services** komponenseket, amelyek kapcsolatban állnak az **adatbázissal** és **külső szolgáltatásokkal**.


Tomcat architektúrája
^^^^^^^^^^^^^^^^^^^^^

.. uml::

   @startuml
   skinparam style strictuml
   skinparam shadowing true
   skinparam componentStyle rectangle
   skinparam defaultTextAlignment center

   cloud "Internet" as Internet

   rectangle "HTTP Connector\n(Coyote)" as Coyote
   node "Tomcat Server" {
       rectangle "Engine" as Engine
       rectangle "Host" as Host
       rectangle "Context" as Context
       rectangle "Servlet Container" as Servlets
       rectangle "JSP Engine\n(Jasper)" as Jasper
   }

   Internet --> Coyote
   Coyote --> Engine
   Engine --> Host
   Host --> Context
   Context --> Servlets
   Context --> Jasper
   @enduml

Az architektúra elemei és kapcsolódásuk:

- **Internet**: A külső klienskérések forrása.
- **HTTP Connector (Coyote)**: Tomcat HTTP kapcsolatkezelő komponense, amely fogadja a bejövő kéréseket.
- **Tomcat Server**: A fő szerver komponens, amely a következő alrendszerekből áll:

  - **Engine**: A legfelső szintű komponens, amely a kérések feldolgozását irányítja.

  - **Host**: Egy konkrét virtuális hoszt, amely több kontextust (alkalmazást) tartalmaz.

  - **Context**: Egy adott webalkalmazás egysége.

  - **Servlet Container**: Kezeli a servlet-eket, amelyek feldolgozzák a HTTP kéréseket.

  - **JSP Engine (Jasper)**: A JSP-ket feldolgozó komponens.

**Kapcsolatok:**

- Az **Internet** kapcsolatot létesít a Coyote Connectorral.
- A Coyote Connector továbbítja a kéréseket az **Engine** komponensnek.
- Az Engine irányítja a kéréseket a **Host**, majd a **Context** komponens felé.
- A Context a kéréseket kiszolgálja a **Servlet Container** vagy **JSP Engine** segítségével.


Geronimo architektúrája
^^^^^^^^^^^^^^^^^^^^^^^

.. uml::

   @startuml
   skinparam style strictuml
   skinparam shadowing true
   skinparam componentStyle rectangle
   skinparam defaultTextAlignment center

   cloud "Internet" as Internet

   rectangle "HTTP Connector" as Connector

   node "Geronimo Server" {
       rectangle "Web Container\n(Servets, JSP)" as Web
       rectangle "EJB Container\n(Enterprise Beans)" as EJB
       rectangle "Java EE Services\n(JTA, JMS, JPA, etc.)" as EE
   }

   database "Database" as DB

   Internet --> Connector
   Connector --> Web
   Web --> EJB
   EJB --> EE
   EE --> DB
   @enduml

Az architektúra elemei és kapcsolódásuk:

- **Internet**: Klienskérések forrása.
- **HTTP Connector**: A Geronimo szerver HTTP-kapcsolati pontja.
- **Geronimo Server**: Szerverkomponens, mely az alábbiakat tartalmazza:

  - **Web Container (Servlets, JSP)**: Kezeli a webes komponenseket.

  - **EJB Container (Enterprise Beans)**: Kezeli az üzleti logikát tartalmazó Enterprise Beans komponenseket.

  - **Java EE Services (JTA, JMS, JPA, stb.)**: Szolgáltatásokat nyújt.

- **Database**: Az adatbázis backend.

**Kapcsolatok:**

- Az **Internet** kapcsolatot létesít a HTTP Connectorral.
- A Connector továbbítja a kéréseket a **Web Containernek**.
- A Web Container kommunikál az **EJB Containerrel**, amely a Java EE szolgáltatásokat használja.
- A Java EE szolgáltatások kapcsolatban állnak az **adatbázissal**.


WildFly (JBoss EAP) architektúrája
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. uml::

   @startuml
   skinparam style strictuml
   skinparam shadowing true
   skinparam componentStyle rectangle
   skinparam defaultTextAlignment center

   cloud "Internet" as Internet

   rectangle "HTTP Connector\n(Undertow)" as Connector

   node "WildFly Server" {
       rectangle "Management Console\n/ CLI" as Management
       rectangle "Web Subsystem\n(Servlets, JSP)" as WebSubsystem
       rectangle "EJB Container" as EJBContainer
       rectangle "Messaging Subsystem\n(JMS)" as Messaging
   }

   database "Database" as DB

   Internet --> Connector
   Connector --> WebSubsystem
   Connector --> EJBContainer
   Connector --> Messaging
   WebSubsystem --> DB
   EJBContainer --> DB
   Messaging --> DB
   Management --> WebSubsystem
   Management --> EJBContainer
   @enduml

Az architektúra elemei és kapcsolódásuk:

- **Internet**: Klienskérések forrása.
- **HTTP Connector (Undertow)**: WildFly által használt HTTP kapcsolatkezelő.
- **WildFly Server**: Fő szerver komponens, mely a következő alrendszereket tartalmazza:

  - **Management Console / CLI**: Adminisztrációs felület és parancssoros kliens.

  - **Web Subsystem (Servlets, JSP)**: Webalkalmazások kiszolgálása.

  - **EJB Container**: Enterprise Beans kezelés.

  - **Messaging Subsystem (JMS)**: Üzenetküldési szolgáltatások.

- **Database**: Adatbázis backend.

**Kapcsolatok:**

- Az **Internet** a Connectoron keresztül kapcsolódik a Web Subsystemhez, EJB Containerhez és Messaginghez.
- Mindhárom komponens kapcsolódik az adatbázishoz.
- A Management Console/CLI kapcsolatban áll a Web Subsystemmel és az EJB Containerral az adminisztráció során.


Oracle WebLogic architektúrája
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. uml::

   @startuml
   skinparam style strictuml
   skinparam shadowing true
   skinparam componentStyle rectangle
   skinparam defaultTextAlignment center

   cloud "Internet" as Internet

   rectangle "HTTP Channel" as HTTPChannel

   node "WebLogic Server" {
       rectangle "Web Container\n(Servets, JSP)" as WebContainer
       rectangle "Application Runtime\n(EJB, JMS, JPA)" as AppRuntime
       rectangle "Security & Transactions" as SecTran
   }

   folder "Admin Server" as Admin
   database "Database" as DB

   Internet --> HTTPChannel
   HTTPChannel --> WebContainer
   WebContainer --> AppRuntime
   AppRuntime --> SecTran
   SecTran --> DB
   Admin --> WebContainer
   Admin --> AppRuntime
   @enduml

Az architektúra elemei és kapcsolódásuk:

- **Internet**: Klienskérések forrása.
- **HTTP Channel**: WebLogic HTTP kapcsolatpontja.
- **WebLogic Server**: Szerverkomponens, amely tartalmazza:

  - **Web Container (Servlets, JSP)**: Webkomponensek kezelése.

  - **Application Runtime (EJB, JMS, JPA)**: Alkalmazásfutási környezet.

  - **Security & Transactions**: Biztonsági és tranzakciókezelési komponens.

- **Admin Server**: Adminisztrációs komponens.
- **Database**: Adatbázis backend.

**Kapcsolatok:**

- Az **Internet** a HTTP Channelon keresztül érkezik.
- A HTTP Channel továbbítja a kéréseket a Web Containernek.
- A Web Container kommunikál az Application Runtime komponenssel.
- Az Application Runtime kapcsolódik a Security & Transactions komponenshez.
- Ez utóbbi kapcsolatban áll az adatbázissal.
- Az Admin Server az adminisztráció során kapcsolódik a Web Containerhez és az Application Runtime-hoz.


IBM WebSphere architektúrája
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. uml::

   @startuml
   skinparam style strictuml
   skinparam shadowing true
   skinparam componentStyle rectangle
   skinparam defaultTextAlignment center

   cloud "Internet" as Internet

   rectangle "HTTP Endpoint" as HTTPSrv

   node "WebSphere Server" {
       rectangle "Web Container\n(Servlets, JSP, JSF)" as WebContainer
       rectangle "Business Logic\n(EJB, CDI)" as BusinessLogic
       rectangle "Integration Services\n(JMS, JPA, JTA)" as Integration
   }

   folder "Admin Console" as Admin
   database "Database" as DB

   Internet --> HTTPSrv
   HTTPSrv --> WebContainer
   WebContainer --> BusinessLogic
   BusinessLogic --> Integration
   Integration --> DB
   Admin --> WebContainer
   Admin --> BusinessLogic
   @enduml

Az architektúra elemei és kapcsolódásuk:

- **Internet**: Külső kérések forrása.
- **HTTP Endpoint**: WebSphere HTTP kapcsolatkezelő komponense.
- **WebSphere Server**: Szerverkomponens, amely a következő részekből áll:

  - **Web Container (Servlets, JSP, JSF)**: Webkomponensek kezelése.

  - **Business Logic (EJB, CDI)**: Üzleti logika kezelése.

  - **Integration Services (JMS, JPA, JTA)**: Integrációs szolgáltatások.

- **Admin Console**: Adminisztrációs felület.
- **Database**: Adatbázis backend.

**Kapcsolatok:**

- Az **Internet** a HTTP Endpointon keresztül érkezik.
- A HTTP Endpoint továbbítja a kéréseket a Web Containernek.
- A Web Container továbbítja azokat az üzleti logikát kezelő komponensnek.
- Az üzleti logika kapcsolatban áll az integrációs szolgáltatásokkal.
- Az integrációs szolgáltatások kapcsolódnak az adatbázishoz.
- Az Admin Console kapcsolódik a Web Containerhez és az üzleti logikához.


Konfigurációs lehetőségek (pl.: limitek, cache méretek)
-------------------------------------------------------

Eclipse Jetty
^^^^^^^^^^^^^

Jetty konfigurációját XML fájlokon keresztül vagy programozott módon is meg lehet adni. A fő konfigurációs fájl a `jetty.xml`.

**Főbb konfigurációs lehetőségek:**

- **Thread pool**: maxThreads, minThreads, idleTimeout
- **Request buffer size**, response buffer size
- **Session cache és timeout**

**Példa:**

.. code-block:: xml

    <Configure id="Server" class="org.eclipse.jetty.server.Server">
        <Set name="ThreadPool">
            <New class="org.eclipse.jetty.util.thread.QueuedThreadPool">
                <Set name="minThreads">10</Set>
                <Set name="maxThreads">200</Set>
                <Set name="idleTimeout">60000</Set>
            </New>
        </Set>
    </Configure>


GlassFish
^^^^^^^^^

GlassFish esetén a konfiguráció az admin konzolon keresztül vagy az `domain.xml` fájlban történik.

**Főbb konfigurációk:**

- **Thread pool limit**: `max-thread-pool-size`, `min-thread-pool-size`
- **HTTP listener tuning**
- **JVM memória beállítások**
- **Cache méretek (pl. EJB, JMS, Web)**

**Példa (domain.xml):**

.. code-block:: xml

    <thread-pool name="http-thread-pool" max-thread-pool-size="200" min-thread-pool-size="10"/>


Apache Tomcat
^^^^^^^^^^^^^

Tomcat konfigurációja főként a `server.xml` és `web.xml` fájlokban történik.

**Főbb beállítások:**

- **Connector szálkezelés**: `maxThreads`, `minSpareThreads`
- **Session timeout és cache**
- **JVM heap, PermGen, metaspace méretek**

**Példa (server.xml):**

.. code-block:: xml

    <Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443"
               maxThreads="150"
               minSpareThreads="25" />


Apache Geronimo
^^^^^^^^^^^^^^^

Geronimo konfigurációja XML fájlokon keresztül (pl. `config.xml`) és admin konzolon keresztül végezhető.

**Főbb beállítások:**

- **Thread pool** és **queue** limitek
- **Caching** beállítások (GBeans)
- **Web konténer tuning**

**Példa (részlet):**

.. code-block:: xml

    <gbean name="ThreadPool">
        <attribute name="coreThreads">10</attribute>
        <attribute name="maxThreads">200</attribute>
    </gbean>


Red Hat JBoss / WildFly
^^^^^^^^^^^^^^^^^^^^^^^

WildFly (korábban JBoss AS) konfigurációja a `standalone.xml` vagy `domain.xml` fájlban történik.

**Főbb konfigurációk:**

- **Thread pool**: `max-threads`, `core-threads`
- **Connection pool méretek**
- **JVM heap és GC beállítások**
- **Web és EJB cache**

**Példa:**

.. code-block:: xml

    <subsystem xmlns="urn:jboss:domain:threads:1.1">
        <thread-pool name="default">
            <max-threads count="200"/>
            <core-threads count="20"/>
        </thread-pool>
    </subsystem>


Oracle WebLogic
^^^^^^^^^^^^^^^

WebLogic Server beállításai a WebLogic Console-on vagy `config.xml` fájlban történnek.

**Főbb konfigurációk:**

- **Execute thread count**
- **Work Manager beállítások**
- **Cache tuning (Web, EJB)**
- **Connection pool size**


IBM WebSphere
^^^^^^^^^^^^^

WebSphere esetén a konfiguráció elsősorban az adminisztrációs konzolon (Admin Console) keresztül történik, de lehetőség van szkriptelésre is (wsadmin).

**Főbb konfigurációk:**

- **Thread pool méretek (WebContainer, ORB, JMS, stb.)**
- **Cache méretek (Web, dynacache)**
- **Session és connection pool beállítások**



Naplózás
--------

Eclipse Jetty
^^^^^^^^^^^^^

Jetty a Java util logging (JUL) rendszert, vagy külső SLF4J/Logback könyvtárakat támogat.

**Főbb jellemzők:**

- `start.ini` vagy `jetty-logging.properties` fájlban konfigurálható
- Támogatja a `Slf4jBridgeHandler` használatát is

**Példa:**

.. code-block:: properties

    org.eclipse.jetty.LEVEL=INFO
    org.eclipse.jetty.util.log.class=org.eclipse.jetty.util.log.StdErrLog


GlassFish
^^^^^^^^^

GlassFish a Java Logging (JUL) rendszert használja, amit a `logging.properties` fájl szabályoz.

**Konfiguráció:**

- `domain-dir/config/logging.properties`
- Admin Console-ból is módosítható
- Logfájlok: `server.log`, `error.log`

**Példa:**

.. code-block:: properties

    com.sun.enterprise.server.logging.GFFileHandler.level=FINE
    java.util.logging.ConsoleHandler.level=WARNING


Apache Tomcat
^^^^^^^^^^^^^

Tomcat a JUL-t és a `org.apache.juli` kiterjesztést használja.

**Konfiguráció:**

- `logging.properties` a `conf/` mappában
- Alternatíva: SLF4J + Logback

**Példa:**

.. code-block:: properties

    1catalina.org.apache.juli.FileHandler.level = FINE
    2localhost.org.apache.juli.FileHandler.directory = ${catalina.base}/logs
    java.util.logging.ConsoleHandler.level = INFO


Apache Geronimo
^^^^^^^^^^^^^^^

Geronimo az Apache Commons Logging-et (JCL) használja SLF4J vagy Log4j hátérrel.

**Beállítás:**

- `var/log/server.log`
- Konfigurációs fájl: `log4j.xml` vagy `log4j.properties`

Red Hat JBoss / WildFly
^^^^^^^^^^^^^^^^^^^^^^^

WildFly egy saját fejlesztésű loggolási alrendszert használ, amely SLF4J, Log4j és JUL átjárókat is tartalmaz.

**Konfiguráció:**

- `standalone.xml` vagy CLI (Command Line Interface)
- Több handler, filter, formatter állítható be

Oracle WebLogic
^^^^^^^^^^^^^^^

WebLogic a saját `WebLogic Logging Services` rendszert használja, de kompatibilis a Java Logging API-val.

**Naplók:**

- `AdminServer.log`, `ManagedServer.log`, `domain.log`

**Beállítások:**

- WebLogic Console → `Servers → Logging`
- Támogatja: stdout, rotating file, SNMP forwarding

IBM WebSphere
^^^^^^^^^^^^^

WebSphere a `High Performance Extensible Logging (HPEL)` rendszert használja.

**Főbb naplók:**

- `SystemOut.log`, `SystemErr.log`
- HPEL vagy klasszikus mód (váltható)

**Konfiguráció:**

- Admin Console → `Troubleshooting → Logs and trace`
- CLI (`wsadmin`) is használható


Kódmetrikák (Egyáltalán melyik mekkora méretű szoftver?)
--------------------------------------------------------

Alkalmazásszerver indítási folyamatát megvizsgálni (folyamatábra, gantt diagram, szekvencia diagram) - Ezekhez is jó, hogy ha tartoznak majd mérések.
-----------------------------------------------------------------------------------------------------------------------------------------------------