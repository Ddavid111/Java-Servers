Előkészületek
=============

Gyártó/fejlesztő, licensz, kiadások
-----------------------------------

Eclipse Jetty
~~~~~~~~~~~~~

**Fejlesztő:** Eclipse Foundation

**Licensz:** Apache License 2.0  

**Főbb kiadások:**

- Jetty 9 (2013): servlet 3.1 támogatás
- Jetty 10 (2020): Java 11+
- Jetty 11 (2020): modulárisabb architektúra, Jakarta EE támogatás
- Jetty 12 (2023): Java 17+, Servlet 6.0

Eclipse GlassFish
~~~~~~~~~~~~~~~~~

**Fejlesztő:** Oracle (korábban), most Eclipse Foundation (Eclipse GlassFish) 

**Licensz:** Eclipse Public License 2.0 and GPL2 with GNU Classpath Exception
  
**Főbb kiadások:**

- GlassFish 4: Java EE 7
- GlassFish 5: Java EE 8
- GlassFish 6: Jakarta EE 9
- GlassFish 7: Jakarta EE 10 támogatás (2023)

Apache Tomcat
~~~~~~~~~~~~~

**Fejlesztő:** Apache Software Foundation

**Licensz:** Apache License 2.0  

**Főbb kiadások:**

- Tomcat 9.x: Servlet 4.0
- Tomcat 10.0.x: átállás a `javax` csomagról `jakarta`-ra
- Tomcat 11.0.x: támogatja a Servlet 6.1 specifikációt, valamint a Java 17 és annál újabb verziókat.

Apache Geronimo
~~~~~~~~~~~~~~~

**Fejlesztő:** Apache Software Foundation

**Licensz:** Apache License 2.0

**Főbb kiadások:**

- Geronimo 2.x: Java EE 5 és 6 támogatás
- Legfrissebb kiadás 3.x (korlátozott aktivitás)

Red Hat JBoss / WildFly
~~~~~~~~~~~~~~~~~~~~~~~

**Fejlesztők:** JBoss, Red Hat

**Licensz:** 	GNU Lesser General Public License

**Főbb kiadások:**

- JBoss AS 7: utolsó kiadás a JBoss név alatt
- WildFly 8–30+: Java EE / Jakarta EE támogatás, Quarkus kompatibilitás
- WildFly 30 (2024): Jakarta EE 10, Java 21 támogatás

Oracle WebLogic
~~~~~~~~~~~~~~~

**Fejlesztő:** Oracle Corporation

**Licensz:** Zárt forráskódú, kereskedelmi

**Főbb kiadások:**

- WebLogic Server 12c: Java EE 6 / 7
- WebLogic Server 14c: Jakarta EE 8
- WebLogic Server 21.x: újabb Java és Kubernetes integráció

IBM WebSphere
~~~~~~~~~~~~~

**Fejlesztő:** IBM

**Licensz:** Kereskedelmi

**Főbb kiadások:**

- WebSphere Application Server (WAS): teljes Java EE implementáció
- WebSphere Liberty: könnyűsúlyú, modularizált szerver, Jakarta EE kompatibilis

Szakirodalmaknak utánanézni: Hivatalos weboldalak/referenciák, könyvek, cikkek
------------------------------------------------------------------------------

Hivatalos weboldalak és dokumentációk
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

- **Eclipse Jetty**: https://www.eclipse.org/jetty/
- **GlassFish**: https://projects.eclipse.org/projects/ee4j.glassfish
- **Apache Tomcat**: https://tomcat.apache.org/
- **Apache Geronimo**: https://geronimo.apache.org/
- **Red Hat JBoss / WildFly**:
 
  - https://access.redhat.com/products/red-hat-jboss-enterprise-application-platform
  - https://www.wildfly.org/
- **Oracle WebLogic**: https://www.oracle.com/middleware/technologies/weblogic.html
- **IBM WebSphere**: https://www.ibm.com/products/websphere-application-server

Fontos cikkek
~~~~~~~~~~~~~

- Áttekintés a leggyakoribb Java EE alkalmazásszerverekről, összehasonlítás funkcionalitás és teljesítmény alapján.
  https://medium.com/@niranjangirheindia/java-ee-application-servers-tomcat-glassfish-weblogic-wildfly-73399aaa4928

- Részletes lista különféle alkalmazásszerverekről – nemcsak Java – rövid jellemzéssel.
  https://en.wikipedia.org/wiki/List_of_application_servers  
  
- Gyakorlati útmutató a Java Servlet-alapú webalkalmazások hatékonyabbá tételéhez.
  https://medium.com/@youngjun_kim/optimizing-java-servlets-for-high-performance-web-applications-ce95d4e6ccaa  
  

- Teljesítmény és skálázhatóság szempontú összehasonlítás több Java alkalmazásszerver között.  
  https://www.deployhq.com/blog/comparing-java-application-servers-performance-scalability-and-deployment-strategies  
  
- Mérésen alapuló riport servlet-technológiák válaszidejéről és terhelhetőségéről.
  https://www.webperformance.com/library/reports/ServletReport/  
  

- Oktatási célú dokumentum, részletesen tárgyalja a Java alapú webtechnológiákat, servlet, JSP, stb.
  https://www.ms.sapientia.ro/~manyi/teaching/java/java_web_technologiak.pdf  
  
- Jegyzet egyetemi kurzushoz, webes Java alkalmazások architektúrája, példák, módszerek.
  https://geik.uni-miskolc.hu/data/subjects_pdf/GEIAL333-B_Web-es_alkalmazasok_Java.pdf  

Verziók, verziótörténet (fejlesztési történet elemzése)
-------------------------------------------------------

.. csv-table:: Alkalmazásszerverek verziótörténete
   :header: "Alkalmazásszerver", "Verzió", "Megjegyzés"
   :widths: 20, 15, 65

   "Eclipse Jetty", "6 (2006)", "Aszinkron API (Continuation)"
   "Eclipse Jetty", "9 (2013)", "Servlet 3.1, WebSocket, HTTP/2"
   "Eclipse Jetty", "10 (2021)", "Java 11+, moduláris felépítés"
   "Eclipse Jetty", "11 (2021)", "`jakarta`, Servlet 5.0"
   "Eclipse Jetty", "12 (2023)", "Java 17+, Servlet 6.0"

   "GlassFish", "3.x (2009)", "Java EE 6, moduláris architektúra (HK2)"
   "GlassFish", "4.x (2013)", "Java EE 7, WebSocket és JSON-P"
   "GlassFish", "5.x (2017)", "Java EE 8"
   "GlassFish", "6.x (2020)", "Jakarta EE 9, `jakarta` váltás"
   "GlassFish", "7.x (2022)", "Jakarta EE 10 támogatás"

   "Apache Tomcat", "8.x (2014)", "Servlet 3.1, non-blocking IO"
   "Apache Tomcat", "9.x (2018)", "Servlet 4.0, HTTP/2, Java 8+"
   "Apache Tomcat", "10.x (2021)", "`jakarta`, Servlet 5.0"
   "Apache Tomcat", "11.x (2024)", "Servlet 6.0, Java 21"

   "Apache Geronimo", "2.x (2008)", "Java EE 5/6, GBean alapú architektúra"
   "Apache Geronimo", "3.x (2012)", "Java EE 6 implementáció"

   "JBoss / WildFly", "AS 7 (2011)", "Gyorsabb indulás, új moduláris felépítés"
   "WildFly", "8 (2014)", "Java EE 7 támogatás, új név JBoss helyett"
   "WildFly", "20+ (2021–)", "Jakarta EE 9+, Java 11/17, MicroProfile"
   "WildFly", "30 (2024)", "Jakarta EE 10, Java 21"

   "Oracle WebLogic", "12c (2012)", "Java EE 6–7 támogatás"
   "Oracle WebLogic", "14c (2020)", "Jakarta EE 8 kompatibilitás"
   "Oracle WebLogic", "21.x (2023)", "Java 17+, Kubernetes integráció"

   "IBM WebSphere", "8.5 (2012)", "Java EE 6 támogatás, klasszikus WAS"
   "WebSphere Liberty", "20.x–24.x", "Moduláris, Jakarta EE 10, Java 17+, MicroProfile"


Támogatott Java verziók, azon belül Java szabvány (Ezt érdemes lehet például táblázatos formában: sorokban feature-ök, oszlopokban alkalmazásszerverek.)
--------------------------------------------------------------------------------------------------------------------------------------------------------
.. csv-table:: Java verziók és Java EE/Jakarta EE támogatás
   :header: "Feature", "Jetty", "GlassFish", "WildFly / JBoss EAP", "Tomcat", "Geronimo", "WebLogic", "WebSphere"
   :widths: 22, 13, 13, 13, 13, 13, 13, 13

   "Legfrissebb Java futási környezet", "Java 17+ (Jetty 12)", "JDK 11–17 (GlassFish 7)", "Java 11–17 (WildFly 36)", "Java 8+ (Tomcat 11+)", "Java 6–8 (legutóbbi 3.0)", "Java 11+ (WebLogic 14.1.1)", "Java 6–11 / 8+ (Liberty)"
   "Jakarta EE teljes (Full) támogatás", "EE8–11 Full", "Java EE 8 / Jakarta EE 9.1–10", "Jakarta EE 8–10 Full", "—", "Java EE 6 Full (3.0)", "Java EE 8 Full", "Java EE 7/8 Full"
   "Jakarta EE Web Profile támogatás", "EE8–11 Web", "Web + Full", "Web + Full", "Servlet/JSP támogatás", "WebProfile (Java EE 6)", "Implicit WebProfile része", "WebProfile + Full (Liberty)"
   "Servlet spec verzió", "Servlet 4.0–6+", "Servlet 4.0", "Servlet 4.0+", "Servlet 4/5/6 (Tomcat 9–11)", "Servlet 3.0", "Servlet 4.0+", "Servlet 3.0–4.0+"
   "HTTP/2 támogatás", "Igen (Jetty 9.4+)", "Részleges / proxyn keresztül", "Igen (WildFly 10+)", "Igen (Tomcat 8.5+)", "Nem natívan (proxyval megoldható)", "Igen (WebLogic 12.2.1+)", "Igen (WebSphere Liberty, 2017+)"
   "JSP", "3.1", "3.1", "3.1", "3.1", "2.2", "2.3", "3.1"


Telepítéssel kapcsolatban beállítások, fájlok, jegyzékek (szerkezete, mérete)
-----------------------------------------------------------------------------

Eclipse Jetty
~~~~~~~~~~~~~
A Jetty egy könnyű, moduláris alkalmazásszerver, amely különösen jól használható beágyazott rendszerekben vagy microservice-alkalmazásokban.

**Telepítés és beállítás:**
- A Jetty letölthető `jetty-distribution` formájában (.zip vagy .tar.gz), majd kicsomagolható pl. `/opt/jetty` könyvtárba.

- Konfigurálása moduláris: a `start.ini` vagy `start.d/*.ini` fájlokban történik.

- A Jetty két fontos környezeti változót használ: ``JETTY_HOME`` (alap Jetty könyvtár) és ``JETTY_BASE`` (egyedi konfigurációs példányok).

**Fájlszerkezet:**
::

    jetty/
      ├── bin/
      ├── lib/
      ├── modules/
      ├── start.d/
      ├── etc/
      └── webapps/

**Átlagos méret:** kb. 30–80 MB alapszinten (modulok növelhetik)

**JSP és HTTP/2 támogatás:**

- JSP külön modulban érhető el (jetty-jsp).

- HTTP/2 támogatott a `http2` modul engedélyezésével.

GlassFish
~~~~~~~~~
A GlassFish a Java EE / Jakarta EE referenciaimplementációja.

**Telepítés és beállítás:**

- Telepítés önkicsomagoló `.sh` vagy `.zip` formátumból.

- Konfigurálás az `asadmin` parancssori eszközzel történik.

- Alapértelmezett domain: ``domain1``.

**Fájlszerkezet:**
::

    glassfish/
      ├── bin/
      ├── glassfish/
      │   ├── domains/
      │   ├── lib/
      │   └── modules/
      └── javadb/

**Átlagos méret:** kb. 150–400 MB

**JSP és HTTP/2 támogatás:**

- JSP támogatott.

- HTTP/2 csak reverse proxy-n keresztül érhető el (nem natív).

WildFly / JBoss EAP
~~~~~~~~~~~~~~~~~~~
A WildFly (korábban JBoss AS) egy Red Hat által támogatott alkalmazásszerver. Nyílt forráskódú, a JBoss EAP az enterprise verziója.

**Telepítés és beállítás:**

- ZIP archívumból telepíthető (`wildfly-<ver>.Final.zip`).

- Konfigurálás: `standalone.xml` vagy `domain.xml` fájlokon keresztül.

- Indítás: `bin/standalone.sh` (vagy `domain.sh`).

**Fájlszerkezet:**
::

    wildfly/
      ├── bin/
      ├── modules/
      ├── standalone/
      │   ├── configuration/
      │   ├── deployments/
      │   └── log/
      └── domain/

**Átlagos méret:** kb. 250–600 MB

**JSP és HTTP/2 támogatás:**

- JSP támogatott.

- HTTP/2 támogatott (modulok és TLS konfiguráció szükséges).

Apache Tomcat
~~~~~~~~~~~~~
A Tomcat egy népszerű, könnyű servlet konténer. Nem teljes Java EE szerver, de támogatja a legtöbb webes Java technológiát.

**Telepítés és beállítás:**

- ZIP vagy Windows telepítőcsomag formájában elérhető.

- Konfigurálás a `conf/server.xml` fájlban történik.

- WAR fájlokat a `webapps` könyvtárba kell másolni.

**Fájlszerkezet:**
::

    tomcat/
      ├── bin/
      ├── conf/
      ├── lib/
      ├── logs/
      ├── webapps/
      └── work/

**Átlagos méret:** kb. 150–300 MB

**JSP és HTTP/2 támogatás:**

- JSP támogatott (beépített Jasper motor).

- HTTP/2 támogatott a megfelelő connector konfigurálásával.

Apache Geronimo
---------------
Könyvtárstruktúra:

::

    geronimo/
      ├── bin/
      ├── lib/
      ├── deploy/
      ├── var/
      ├── usr/
      └── etc/

- Fő konfigurációs fájl: `config.xml` és egyéb XML fájlok
- Telepítés kb. 150-250 MB között
- Konfiguráció XML alapú, olvasható, áttekinthető
- Alkalmazások a `deploy/` könyvtárba kerülnek

Oracle WebLogic
~~~~~~~~~~~~~~~
A WebLogic egy vállalati Java EE szerver, amelyet az Oracle fejleszt és támogat.

**Telepítés és beállítás:**

- Installer futtatása: `java -jar fmw_*.jar`.

- Domain konfiguráció grafikus vagy parancssori eszközzel.

- Admin Console webes kezelőfelületen elérhető.

**Fájlszerkezet:**
::

    oracle/
      ├── middleware/
          ├── wlserver/
          │   └── server/
          │       └── lib/
          └── user_projects/
              └── domains/
                  └── base_domain/

**Átlagos méret:** 800 MB–1,5 GB (telepítéstől függően)

**JSP és HTTP/2 támogatás:**

- JSP támogatott.

- HTTP/2 natív módon nem, csak proxyval.

IBM WebSphere (Liberty)
~~~~~~~~~~~~~~~~~~~~~~~
A WebSphere Liberty egy könnyűsúlyú, moduláris alkalmazásszerver az IBM-től, amely konténeres környezetben is kiválóan működik.

**Telepítés és beállítás:**

- Telepítés JAR-ból (`java -jar wlp-runtime.jar`).

- Modulok telepítése: `bin/installUtility install <feature>`.

- Alapértelmezett szerver: `defaultServer`.

**Fájlszerkezet:**
::

    wlp/
      ├── bin/
      ├── lib/
      ├── usr/
          └── servers/
              └── defaultServer/
                  ├── server.xml
                  ├── dropins/
                  ├── apps/
                  └── logs/

**Átlagos méret:** 200–300 MB + modulok

**JSP és HTTP/2 támogatás:**

- JSP támogatott (modulként).

- HTTP/2 támogatott (HTTPS + feature: `servlet-4.0`).

Fejlesztőkörnyezetek, egyéb eszközök (pl.: monitorozáshoz, konfigurációhoz, erőforrásfigyelés)
----------------------------------------------------------------------------------------------

Eclipse Jetty
~~~~~~~~~~~~~
**Fejlesztéshez ajánlott eszközök:**

- **Eclipse IDE**: Jetty integrálható a WTP pluginnel vagy Maven-en keresztül beágyazottként.

- **IntelliJ IDEA**: támogatja a Jetty-t Maven/Gradle projektekhez.

**Konfigurációs eszközök:**

- Manuális szerkesztés: `start.ini`, `start.d/*.ini`, XML fájlok

- Jetty XML konfigurációs séma: testreszabható modulonként

**Monitorozás, menedzsment:**

- JMX támogatott

- Harmadik féltől származó eszközök: Prometheus, Micrometer, VisualVM

**Megjegyzés:** Jetty nem tartalmaz webes admin felületet.

GlassFish
~~~~~~~~~
**Fejlesztéshez ajánlott eszközök:**

- **NetBeans**: natív GlassFish integráció (Java EE projektek)

- **Eclipse IDE**: GlassFish Tools (Eclipse Marketplace-en keresztül)

- **IntelliJ IDEA Ultimate**: beépített támogatás EAR/WAR deploymenthez

**Konfigurációs eszközök:**

- **Admin Console**: webes UI (`http://localhost:4848`)

- **asadmin**: parancssoros eszköz domain konfigurációhoz

**Monitorozás, menedzsment:**

- Webes admin felület

- JMX, SNMP támogatás

- Integrálható: Prometheus exporter, VisualVM, Java Mission Control

WildFly / JBoss EAP
~~~~~~~~~~~~~~~~~~~
**Fejlesztéshez ajánlott eszközök:**

- **IntelliJ IDEA Ultimate**: JBoss/WildFly szerverindítás, remote deploy

- **Eclipse IDE + JBoss Tools**: teljeskörű fejlesztői integráció

- **NetBeans**: alapvető WildFly támogatás

**Konfigurációs eszközök:**

- **CLI**: `jboss-cli.sh` (szerver konfigurálása parancssorból)

- **Admin Console**: webes kezelőfelület (`http://localhost:9990`)

- YAML és XML konfiguráció `standalone.xml`, `domain.xml`

**Monitorozás, menedzsment:**

- Webes admin felület, JMX, CLI

- Beépített audit- és logolási funkciók

- Prometheus exporter, Grafana dashboard támogatott

Apache Tomcat
~~~~~~~~~~~~~
**Fejlesztéshez ajánlott eszközök:**

- **IntelliJ IDEA** (Community/Ultimate): WAR deploy, debug

- **Eclipse IDE**: WTP plugin Tomcat támogatással

- **NetBeans**: egyszerű integráció Tomcat-hez

**Konfigurációs eszközök:**

- `conf/server.xml` fájl kézi szerkesztéssel

- Minimális webes felület (`/manager` és `/host-manager`)

**Monitorozás, menedzsment:**

- Web Manager App (basic autentikációval)

- JMX, VisualVM

- Tomcat Manager REST API

Apache Geronimo
~~~~~~~~~~~~~~~

**Fejlesztéshez ajánlott eszközök:**  

- Támogatott az Eclipse (korábban külön Geronimo plugin is elérhető volt), valamint NetBeans-en keresztül is integrálható volt a telepített szerver.

**Konfigurációs eszközök**

- XML-alapú konfiguráció (`config.xml`), fájlszinten szerkeszthető.

- CLI lehetőségek is voltak, de nem annyira kifinomult, mint pl. `asadmin` vagy `jboss-cli`.

**Monitorozás és naplózás**

- Beépített **JMX támogatás**, integrálható JConsole vagy más JMX-kompatibilis eszközzel.

- Alap naplózás: `var/log/` mappában található, `log4j` alapú konfigurációval.

- A Geronimo rendelkezik saját **web alapú admin felülettel** (korábbi verziókban a `http://localhost:8080/console` címen érhető el).

- Innen telepíthetőek WAR/JAR/EAR fájlok, valamint konfigurálhatóak adatforrások, biztonsági beállítások stb.

Oracle WebLogic
~~~~~~~~~~~~~~~
**Fejlesztéshez ajánlott eszközök:**

- **Oracle JDeveloper**: natív támogatás WebLogic deployhoz

- **IntelliJ IDEA Ultimate**: WebLogic integráció

- **Eclipse IDE**: Oracle Enterprise Pack for Eclipse

**Konfigurációs eszközök:**

- **WebLogic Console**: grafikus admin felület (`http://localhost:7001/console`)

- WLST (WebLogic Scripting Tool): Python-szerű szkriptnyelv konfigurációhoz

- XML alapú `config.xml` és deployment descriptor fájlok

**Monitorozás, menedzsment:**

- Web Console, JMX, WLDF (WebLogic Diagnostic Framework)

- Enterprise Manager (OEM) integráció

- Támogatja a Prometheus exportert (kiegészítővel)

IBM WebSphere (Liberty)
~~~~~~~~~~~~~~~~~~~~~~~
**Fejlesztéshez ajánlott eszközök:**

- **Eclipse IDE + WebSphere Developer Tools**

- **IntelliJ IDEA Ultimate**

- **Maven / Gradle**: támogatott build és deployment

**Konfigurációs eszközök:**

- XML alapú `server.xml` fájl a `usr/servers/<name>/` könyvtárban

- **Admin Center (web UI)**: elérhető fejlesztői módokban

- `server.bat` vagy `server script` CLI konfigurációhoz

**Monitorozás, menedzsment:**

- Web Admin Center (GUI), REST API

- JMX, OpenTelemetry támogatás

- Kibővíthető: Prometheus, Grafana, Micrometer, ELK Stack



Tipikus alkalmazási eseteket rendszerezni (statikus fájlkiszolgálás, Servlet, JSF, ...)
---------------------------------------------------------------------------------------

Az alábbi táblázat az egyes Java EE/Jakarta EE alkalmazásszerverek által leggyakrabban támogatott vagy használt alkalmazási eseteket rendszerezi.

.. csv-table:: Alkalmazási esetek támogatottsága alkalmazásszerverenként
   :header: "Alkalmazási típus", "Jetty", "GlassFish", "WildFly / JBoss", "Tomcat", "Geronimo", "WebLogic", "WebSphere"
   :widths: 25, 13, 13, 13, 13, 13, 13, 13

   "Statikus fájlok kiszolgálása", "Igen", "Igen", "Igen", "Igen", "Igen", "Igen", "Igen"
   "Servlet-alapú webapp", "Igen", "Igen", "Igen", "Igen", "Igen", "Igen", "Igen"
   "JSP alapú webapp", "Igen", "Igen", "Igen", "Igen", "Igen", "Igen", "Igen"
   "JSF (JavaServer Faces)", "Nem natívan", "Igen", "Igen", "Nem", "Igen", "Igen", "Igen"
   "REST API (JAX-RS)", "Külső lib-kel", "Igen", "Igen", "Külső lib-kel", "Igen", "Igen", "Igen"
   "SOAP szolgáltatás (JAX-WS)", "Nem", "Igen", "Igen", "Nem", "Igen", "Igen", "Igen"
   "EJB (Enterprise Java Beans)", "Nem", "Igen", "Igen", "Nem", "Igen", "Igen", "Igen"
   "CDI (Context and Dependency Injection)", "Nem", "Igen", "Igen", "Nem", "Igen", "Igen", "Igen"
   "WebSocket", "Igen", "Igen", "Igen", "Igen", "Nem", "Igen", "Igen"
   "Szerver-oldali komponensmodell (pl. JSF + EJB)", "Nem", "Igen", "Igen", "Nem", "Igen", "Igen", "Igen"
   "Microservice architektúra (pl. REST + CDI)", "Igen (lightweight)", "Korlátozott", "Igen", "Korlátozott", "Nem", "Korlátozott", "Igen (Liberty)"
   "Nagyvállalati alkalmazás (monolitikus EAR)", "Nem", "Igen", "Igen", "Nem", "Igen", "Igen", "Igen"
   "Admin felület integráció", "Nem", "Igen", "Igen", "Opcionális", "Igen", "Igen", "Igen"
