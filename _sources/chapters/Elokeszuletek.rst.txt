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

Könyvek
-------

- *"Java EE 8 Application Development"* — David R. Heffelfinger  
  Átfogó kézikönyv a Java EE 8-hoz, tartalmaz alkalmazásszervereket is, köztük GlassFish és WildFly.

- *"Beginning Jakarta EE"* — A. White, R. Poskitt  
  Friss könyv, amely áttekinti a Jakarta EE (Java EE utódja) és az alkalmazásszerverek működését.

- *"JBoss at Work"* — Francesco Marchioni  
  Részletes JBoss (WildFly) szerver kezelési és fejlesztési útmutató.

- *"Oracle WebLogic Server 12c Administration Handbook"* — Sam Alapati  
  WebLogic szerverek kezeléséhez.

- *"IBM WebSphere Application Server Administration"* — Scott Vetter  
  WebSphere rendszeradminisztrációs kézikönyv.

Fontos cikkek, tanulmányok, blogok
----------------------------------

- **Oracle blog és dokumentáció** a WebLogic legfrissebb verzióiról és új funkciókról:  
  https://blogs.oracle.com/weblogic

- **Red Hat Developer blog** – rendszeresen frissül WildFly és JBoss EAP hírekkel:  
  https://developers.redhat.com/blog

- **Eclipse Foundation blog** – GlassFish és Jetty újdonságokról:  
  https://blog.eclipse.org/

- **InfoQ**, **DZone** – technikai cikkek és összehasonlító anyagok Java alkalmazásszerverekről:  
  - https://www.infoq.com/articles/java-application-server-comparison/  
  - https://dzone.com/articles/comparing-java-application-servers

Verziók, verziótörténet (fejlesztési történet elemzése)
--------------------------------------------------------------------------

Támogatott Java verziók, azon belül Java szabvány (Ezt érdemes lehet például táblázatos formában: sorokban feature-ök, oszlopokban alkalmazásszerverek.)
--------------------------------------------------------------------------------------------------------------------------------------------------------

Telepítéssel kapcsolatban beállítások, fájlok, jegyzékek (szerkezete, mérete)
-----------------------------------------------------------------------------

Fejlesztőkörnyezetek, egyéb eszközök (pl.: monitorozáshoz, konfigurációhoz, erőforrásfigyelés)
----------------------------------------------------------------------------------------------

Tipikus alkalmazási eseteket rendszerezni (statikus fájlkiszolgálás, Servlet, JSF, ...)
---------------------------------------------------------------------------------------

Átnézni a már meglévő, elérhető összehasonlításokat ("review", "vs")
--------------------------------------------------------------------
