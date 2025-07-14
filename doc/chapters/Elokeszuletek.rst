Előkészületek
=============

Gyártó/fejlesztő, licensz, kiadások
-----------------------------------

Eclipse Jetty
-------------

**Fejlesztő:** Eclipse Foundation

**Licensz:** Apache License 2.0  

**Főbb kiadások:**

- Jetty 9 (2013): servlet 3.1 támogatás
- Jetty 10 (2021): Java 11+
- Jetty 11 (2021): modulárisabb architektúra, Jakarta EE támogatás
- Jetty 12 (2023): Java 17+, Servlet 6.0

GlassFish
---------

**Fejlesztő:** Oracle (korábban), most Eclipse Foundation (Eclipse GlassFish) 

**Licensz:** Eclipse Public License 2.0 and GPL2 with GNU Classpath Exception
  
**Főbb kiadások:**

- GlassFish 4: Java EE 7
- GlassFish 5: Java EE 8
- GlassFish 6: Jakarta EE 9
- GlassFish 7: Jakarta EE 10 támogatás (2023)

Apache Tomcat
-------------

**Fejlesztő:** Apache Software Foundation

**Licensz:** Apache License 2.0  

**Főbb kiadások:**

- Tomcat 8.x: Servlet 3.1, JSP 2.3
- Tomcat 9.x: Servlet 4.0
- Tomcat 10.x: átállás a `javax.*` csomagról `jakarta.*`-ra
- Tomcat 11 (tervezés alatt): Servlet 6.0, Java 21 támogatás

Apache Geronimo
---------------

**Fejlesztő:** Apache Software Foundation

**Licensz:** Apache License 2.0

**Főbb kiadások:**

- Geronimo 2.x: Java EE 5 és 6 támogatás
- Legfrissebb kiadás 3.x (korlátozott aktivitás)

Red Hat JBoss / WildFly
-----------------------

**Fejlesztők:** JBoss, Red Hat

**Licensz:** LGPL v2.1  

**Főbb kiadások:**

- JBoss AS 7: utolsó kiadás a JBoss név alatt
- WildFly 8–30+: Java EE / Jakarta EE támogatás, Quarkus kompatibilitás
- WildFly 30 (2024): Jakarta EE 10, Java 21 támogatás

Oracle WebLogic
---------------

**Fejlesztő:** Oracle Corporation

**Licensz:** Zárt forráskódú, kereskedelmi

**Főbb kiadások:**

- WebLogic Server 12c: Java EE 6 / 7
- WebLogic Server 14c: Jakarta EE 8
- WebLogic Server 21.x: újabb Java és Kubernetes integráció

IBM WebSphere
-------------

**Fejlesztő:** IBM

**Licensz:** Kereskedelmi

**Főbb kiadások:**

- WebSphere Application Server (WAS): teljes Java EE implementáció
- WebSphere Liberty: könnyűsúlyú, modularizált szerver, Jakarta EE kompatibilis

Szakirodalmaknak utánanézni: Hivatalos weboldalak/referenciák, könyvek, cikkek
------------------------------------------------------------------------------

Hivatalos weboldalak és dokumentációk
-------------------------------------

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
-------------

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
--------------------------------------------------------------------------

.. csv-table:: Alkalmazásszerverek verziótörténete
   :header: "Alkalmazásszerver", "Verzió", "Megjegyzés"
   :widths: 20, 15, 65

   "Eclipse Jetty", "6 (2006)", "Aszinkron API (Continuation)"
   "Eclipse Jetty", "9 (2013)", "Servlet 3.1, WebSocket, HTTP/2"
   "Eclipse Jetty", "10 (2021)", "Java 11+, moduláris felépítés"
   "Eclipse Jetty", "11 (2021)", "`jakarta.*`, Servlet 5.0"
   "Eclipse Jetty", "12 (2023)", "Java 17+, Servlet 6.0, HTTP/3 előkészítés"

   "GlassFish", "3.x (2009)", "Java EE 6, moduláris architektúra (HK2)"
   "GlassFish", "4.x (2013)", "Java EE 7, WebSocket és JSON-P"
   "GlassFish", "5.x (2017)", "Java EE 8"
   "GlassFish", "6.x (2020)", "Jakarta EE 9, `jakarta.*` váltás"
   "GlassFish", "7.x (2023)", "Jakarta EE 10 támogatás"

   "Apache Tomcat", "8.x (2014)", "Servlet 3.1, non-blocking IO"
   "Apache Tomcat", "9.x (2018)", "Servlet 4.0, HTTP/2, Java 8+"
   "Apache Tomcat", "10.x (2021)", "`jakarta.*`, Servlet 5.0"
   "Apache Tomcat", "11.x (2024)", "Servlet 6.0, Java 21 (kísérleti)"

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

.. csv-table:: Java EE / Jakarta EE támogatás alkalmazásszerverenként
   :header: "Specifikáció", "Apache Tomcat", "Eclipse Jetty", "GlassFish", "JBoss / WildFly", "WebLogic", "WebSphere"
   :widths: 20, 15, 15, 15, 15, 15, 15

   "Java Servlet",       "igen", "igen", "igen", "igen", "igen", "igen"
   "JSP",                "igen", "igen", "igen", "igen", "igen", "igen"
   "JSF",                "nem",  "nem",  "igen", "igen", "igen", "igen"
   "JPA",                "nem",  "nem",  "igen", "igen", "igen", "igen"
   "EJB",                "nem",  "nem",  "igen", "igen", "igen", "igen"
   "JMS",                "nem",  "nem",  "igen", "igen", "igen", "igen"
   "CDI",                "nem",  "nem",  "igen", "igen", "igen", "igen"
   "JTA",                "nem",  "nem",  "igen", "igen", "igen", "igen"
   "Jakarta EE 8",       "nem",  "részleges", "igen", "igen", "igen", "igen"
   "Jakarta EE 9 / 10",  "nem",  "igen (Jetty 11)", "igen", "igen", "igen", "igen"
   "Java SE 8",          "igen", "igen", "igen", "igen", "igen", "igen"
   "Java SE 11",         "igen", "igen", "igen", "igen", "igen", "igen"
   "Java SE 17+",        "igen", "igen", "igen", "igen", "igen", "igen"


Telepítéssel kapcsolatban beállítások, fájlok, jegyzékek (szerkezete, mérete)
-----------------------------------------------------------------------------

Fejlesztőkörnyezetek, egyéb eszközök (pl.: monitorozáshoz, konfigurációhoz, erőforrásfigyelés)
----------------------------------------------------------------------------------------------

Tipikus alkalmazási eseteket rendszerezni (statikus fájlkiszolgálás, Servlet, JSF, ...)
---------------------------------------------------------------------------------------

Átnézni a már meglévő, elérhető összehasonlításokat ("review", "vs")
--------------------------------------------------------------------
