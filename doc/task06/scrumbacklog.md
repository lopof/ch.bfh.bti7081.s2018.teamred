# Scrum backlog
## Project team
Name | GitHub Alias | Function
--- | --- | --- 
Thomas Baumann | lopof | Developer
Frédéric Lehmann | frediLehmann | Developer
Severin Thalmann | manfred00 | Developer
Ismael Riedo | riedoi | Developer
Fridolin Zurlinden | ifrido | Developer
Roland Roccaro | MehrLinard | Developer
Tobias Weissert | supertoub | Developer/ Scrummaster
Jürgen Vogel, | | Product Owner

## Product Backlog
ID | Storyname | Description | Priority | Effort plan original | Effort plan updated | Effort acutal | Status
--- | --- | --- | --- | --- | --- | --- | ---
 1 | Challenge Board | Als Patient möchte ich auf einer Seite eine Übersicht aller Challenges mit ihrer Beschreibung, ihrem Status und den verfügbaren Levels sehen, so dass er sich einen Überblick über alle seine Challenges machen kann. | High | 63 | - | - | Done
 2 | Journal | Als Patient möchte ich die Möglichkeit haben einen Journaleintrag zu einem Erlebnis oder einer Challenge zu erfassen, damit er seinen aktuellen Heilungsprozess dokumentieren kann. | Medium | 80 | - | - | Open
 3 | Statistik | Als Arzt möchte ich die Möglichkeit haben eine Auswertung aller abgeschlossenen Challenges eines Patienten darzustellen, sodass er den aktuellen Fortschritt eines Patienten besser bewerten kann. | Low | 10 | - | - | Open
 4 | Challenges verwalten | Als Patient möchte ich Möglichkeit haben neue Challenges für sich zu erfassen, bestehende Challenges zu bearbeiten oder abzuschliessen und zu bewerten, sodass der Patient lernt sich seinen Ängsten zu stellen . | High | 57  | - | - | Open
## Sprint Backlog
ID | Sprint | Name | Description | Components | Owner | Reviewer | Priority | Effort plan original | Effort plan updated | Effort actual | Status
--- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---
1.1 | 1 | Projektsetup |  Projektsetup so wie erstellen des globalen CSS.| | TWE | FLE | High | 3 | - | - | Done
1.2 | 1 | Package und Klassen setup | Packages und Klassen gemäss UML erstellen. | | FLE | TWE | High | 3 | - | - | Done
1.3 | 1 | Farbschema CSS |  | | TWE | RRO | Low | 3 | - | - | Done
1.4 | 1 | Font/Icon Schema |  | | TWE | RRO | Low | 3 | - | - | Done
1.5 | 1 | Level Layout | Das Layout für die Level übersicht erstellen. | <ul><li>Challengebaord</li></ul> | FLE | TWE | High | 3 | - | - | Done
1.6 | 1 | Level List | Levels erstellen und auf dem Level Layout darstellen. | <ul><li>Challengebaord</li></ul> | FLE | IRI | High | 3 | - | - | Done
1.7 | 1 | Level Details | Die Levels werden mit den Challenges verknüpft, damit man wenn man auf ein Level klickt die jeweiligen Challenges ersichtlich werden. | <ul><li>Challengebaord</li></ul> | IRI | FLE | High | 3 | - | - | Done
1.8 | 1 | Minimale Funktionalität für die Level | Damit man weiss welches Level aktiv und passiv ist, werden sie anhand des Attributes entsprechend angezeigt.  | <ul><li>Challengebaord</li></ul> | IRI | FLE | High | 3 | - | - | Done
1.9 | 1 | Challenge Layout (Aktiv/Abgeschlossen) | Die Challanges werden an der richtigen Ort platziert anhand ihres Status (Aktiv/Abgeschlossen). | <ul><li>Challengeboard</li><li>Challengdetail</li></ul> | IRI | FZU | High | 3 | - | - | Done
1.10 | 1 | Challenge Aktiv |  | <ul><li>Challengeboard</li><li>Challengdetail</li></ul> | TBA | STH | High | 3 | - | - | Done
1.11 | 1 | Challenge Abgeschlossen |  | <ul><li>Challengeboard</li><li>Challengdetail</li></ul> | TBA | STH | High | 3 | - | - | Done
1.12 | 1 | Funktionalität für Challenges aktivieren/abzuschliessen |  | <ul><li>Challengeboard</li><li>Challengdetail</li></ul> | TBA | STH | High | 3 | - | - | Done
1.13 | 1 | Startseite Layout |  | <ul><li>Startview</li></ul> | STH | RRO | Medium | 3 | - | - | Done
1.14 | 1 | Funktionalität Startseite (Butons/Links) |  | <ul><li>Startview</li></ul> | STH | RRO | Medium | 3 | - | - | Done
1.15 | 1 | Loginseite Layout | Hinzufügen der Funktionalität, Passwortprüfung, Fehlermeldungen, Weitergabe eines Loginobjekts an Startseite | <ul><li>Loginview</li></ul> | RRO | STH | Low | 3 | - | - | Done
1.16 | 1 | Challenge Aktiv | Die aktive Challenge wird grün angezeigt. Funktionalität bei klick auf Challenge. | <ul><li>Challengeboard</li><li>Challengdetail</li></ul> | TBA | STH | High | 3 | - | - | Done
1.17 | 1 | Challenge Abgeschlossen | Die abgeschlossene Challenge wird ausgegraut angezeigt. Funktionalität bei klick auf Challenge. | <ul><li>Challengeboard</li><li>Challengdetail</li></ul> | TBA | STH | High | 3 | - | - | Done
1.18 | 1 | Funktionalität für Challenges aktivieren/abzuschliessen | Jede aktive Challenge kann mit einem klick als abgeschlossen markiert werden. Damit wird sie von der aktiv Spalte in die Abgeschlossene verschoben. | <ul><li>Challengeboard</li><li>Challengdetail</li></ul> | TBA | STH | High | 3 | - | - | Done
1.19 | 1 | Startseite Layout | Erstellen der Startview in der, der User auswählen kann ob er auf das Challengeboard oder auf das Journalboard springen möchte. | <ul><li>Startview</li></ul> | STH | RRO | Medium | 3 | - | - | Done
1.20 | 1 | Funktionalität Startseite (Butons/Links) | Bei Klick auf Challenge wird die Challengeboardview angezeigt. Welcome Message mit dem Namen des Users. | <ul><li>Startview</li></ul> | STH | RRO | Medium | 3 | - | - | Open
1.21 | 1 | Loginseite Layout |  | <ul><li>Loginview</li></ul> | RRO | STH | Low | 3 | - | - | Done
1.17 | 1 | Maven Infrastructure Setup | Die Infrastrukturkomponenten (Datenbank und Applikationsserver) sollen mit Hilfe von Maven automatisiert gestartet werden um so das Testen und Demonstrieren der Entwickelten einfacher zu machen. | | FZU | TWE | High | 3 | - | - | Done
1.18 | 1 | Database Setup | Evaluieren und vorbereiten einer Lösung für einen Datenbankserver und die Einbindung in die Entwicklungsumgebung. Die Datenbank soll beim starten mit Beispielwerten befüllt werden, so dass die Entwickler die Anbindung testen können. | | FZU | IRI | High | 3 | - | - | Done
1.19 | 1 | App-Server Setup | Evaluieren und vorbereiten einer Lösung für einen Applikationsserver und die Einbindung in die Entwicklungsumgebung. | | FZU | IRI | High | 3 | - | - | Done
1.20 | 1 | Reserve |  |  |  |  |  | 6 | - | - | Open

## Burndown Chart
Sprint | Time of record | Remaining effort | Remaining resources
--- | --- | --- | ---
    |     |     |
    |     |     |
    |     |     |
    |     |     |
    |     |     |
    |     |     |