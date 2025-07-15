Kódelemzés
==========

Belső architekturájuknak a felrajzolása
---------------------------------------

Jetty architektúra (PlantUML)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. uml::

   @startuml JettyArchitecture
   skinparam componentStyle rectangle

   [Client] --> [HTTP Connector]
   [HTTP Connector] --> [Jetty Server Core]
   [Jetty Server Core] --> [Servlet Container]
   [Jetty Server Core] --> [WebSocket Handler]
   [Jetty Server Core] --> [Deployment Manager]
   [Servlet Container] --> [WebApp: WAR]
   [WebApp: WAR] --> [JSP Engine]
   [WebApp: WAR] --> [Static Content]
   [Deployment Manager] --> [start.d / modules / etc]

   note right of [Deployment Manager]
     Modulok és konfigurációs fájlok
   end note

   @enduml


Konfigurációs lehetőségek (pl.: limitek, cache méretek)
-------------------------------------------------------

Naplózás
--------

Kódmetrikák (Egyáltalán melyik mekkora méretű szoftver?)
--------------------------------------------------------

Alkalmazásszerver indítási folyamatát megvizsgálni (folyamatábra, gantt diagram, szekvencia diagram) - Ezekhez is jó, hogy ha tartoznak majd mérések.
-----------------------------------------------------------------------------------------------------------------------------------------------------