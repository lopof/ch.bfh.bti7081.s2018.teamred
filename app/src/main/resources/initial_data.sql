SET SCHEMA PUBLIC
INSERT INTO PATIENT VALUES(1,'John','$2a$10$0sBvnIiQ0n.CSnKZZjJVeObahwfL195nMrRglNVLlH1S.bLvalKGq', '$2a$10$0sBvnIiQ0n.CSnKZZjJVeO','Appleseed','John',NULL,NULL)
INSERT INTO PATIENT VALUES(2,'Jane','$2a$10$gEdiLwYmqcJnXwy5e4xI8.zh0WFmAS8KYqjPRETdTlO7cilHDW5aW', '$2a$10$gEdiLwYmqcJnXwy5e4xI8.','Appleseed','Jane',NULL,NULL)
INSERT INTO LEVELLIBRARY VALUES(1,2)
INSERT INTO LEVELLIBRARY VALUES(2,1)
INSERT INTO LEVEL VALUES(1,FALSE,0,2,'Level 1','open',1)
INSERT INTO LEVEL VALUES(2,FALSE,1,4,'Level 2','closed',1)
INSERT INTO LEVEL VALUES(3,FALSE,2,6,'Level 3','closed',1)
INSERT INTO LEVEL VALUES(4,FALSE,3,8,'Level 4','closed',1)
INSERT INTO LEVEL VALUES(5,FALSE,4,10,'Level 5','closed',1)
INSERT INTO LEVEL VALUES(6,FALSE,6,12,'Level 6','closed',1)
INSERT INTO CHALLENGE VALUES(1,0,'Ins Migros gehen und auf alles Antworten, was die Verkäuferin fragt. Vorher noch eine Frage zu einem Produkt stellen',1,'Migros',1)
INSERT INTO CHALLENGE VALUES(2,0,'Einen Spaziergang an einem belebten Ort machen. Zur Auswahl: Monbijou Park, Gurten, Altstadt und Bärenpark',1,'Park',1)
INSERT INTO CHALLENGE VALUES(3,0,'Ein Take Away aufsuchen im Bahnhof und das Bestellte bei den Tischen im Bahnhof essen.',1,'Essen im Bahnhof',2)
INSERT INTO CHALLENGE VALUES(4,0,'Mit einem Freund an der Bar etwas trinken. Nicht unter der Woche, sollte Freitag oder Samstag Abend gemacht werden. Bei möglichkeit Small Talk mit jemandem Unbekannten',2,'Bar',2)
INSERT INTO CHALLENGE VALUES(5,0,'Bei einem Pizzalieferant ein Pizza Prosciutto bestellen und liefern lassen. Persönlich in empfang nehmen und Trinkgeld geben.',2,'Pizza bestellten',2)
INSERT INTO CHALLENGE VALUES(6,0,'Einen Bekannten anrufen, den ich schon lange nicht mehr gesehen habe. Nachfragen wie es im Leben läuft und abmachen zu einem treffen',2,'Bekannten Anrufen',2)
INSERT INTO CHALLENGE VALUES(7,0,'Auch wenn der Weg bekannt ist, eine fremde Person fragen ob sie weiss wo ich entlang muss damit ich zum Bärenpark komme.',2,'Nach dem Weg fragen',3)
INSERT INTO CHALLENGE VALUES(8,0,'Einen grossen Vanilla Cream Frappuccino im Starbucks bestellen und dort an einem Tisch trinken. Dabei Notizen machen, warum ich mich unwohl fühle. Abgesehen von den unzähligen Hipster.',3,'Starbucks',3)
INSERT INTO CHALLENGE VALUES(9,0,'Bei einem Stand mitmachen an dem für Wohltätige Zwecke Geld gesammelt wird. Im Minimum 50 Leute ansprechen und einen Erfolg ausweisen können.',5,'Rettet die Wale',3)
INSERT INTO CHALLENGE VALUES(10,0,'An einem Samstag Abend in eine Disco gehen. Mindestens eine Frau ansprechen und nach ihrer Telefonnummer fragen. Falls sie nur 079 rausrückt: Nicht nachhacken.',3,'Disco',3)
INSERT INTO CHALLENGE VALUES(11,0,'Jemanden, der etwas meiner Meinung nach etwas unangebrachtes macht, Kritisieren und auffordern damit aufzuhören.',5,'Jemanden Kritisieren',3)
INSERT INTO CHALLENGE VALUES(12,0,'Für ein Musical vorsprechen.',5,'Musical',3)
INSERT INTO CHALLENGE VALUES(13,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',4,'Challenge XY 1',4)
INSERT INTO CHALLENGE VALUES(14,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',3,'Challenge XY 2',4)
INSERT INTO CHALLENGE VALUES(15,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',3,'Challenge XY 3',4)
INSERT INTO CHALLENGE VALUES(16,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',4,'Challenge XY 4',4)
INSERT INTO CHALLENGE VALUES(17,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',4,'Challenge XY 5',4)
INSERT INTO CHALLENGE VALUES(18,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',3,'Challenge XY 6',4)
INSERT INTO CHALLENGE VALUES(19,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 7',4)
INSERT INTO CHALLENGE VALUES(20,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 8',5)
INSERT INTO CHALLENGE VALUES(21,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 9',5)
INSERT INTO CHALLENGE VALUES(22,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 10',5)
INSERT INTO CHALLENGE VALUES(23,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',4,'Challenge XY 11',5)
INSERT INTO CHALLENGE VALUES(24,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 12',5)
INSERT INTO CHALLENGE VALUES(25,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 13',5)
INSERT INTO CHALLENGE VALUES(26,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 14',6)
INSERT INTO CHALLENGE VALUES(27,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 15',6)
INSERT INTO CHALLENGE VALUES(28,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 16',6)
INSERT INTO CHALLENGE VALUES(29,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 17',6)
INSERT INTO CHALLENGE VALUES(30,0,'Beisspieltext für eine Challenge. Dieser darf maximal 200 Zeichen lang sein.',5,'Challenge XY 18',6)
INSERT INTO TEST VALUES(1,'aaa','aaa')
INSERT INTO TEST VALUES(1,'bbb','bbb')
INSERT INTO TEST VALUES(1,'ccc','ccc')
INSERT INTO JOURNALLIBRARY VALUES(1,2)
INSERT INTO JOURNALLIBRARY VALUES(2,1)
INSERT INTO JOURNALENTRY VALUES(1,'2018-06-13 00:00:00.000000','Test','test title',2)
INSERT INTO JOURNALENTRY VALUES(2,'2018-06-13 00:00:00.000000','Heute war sehr ein guter Tag! Ich fühlte mich super und bin sogar ein paar Stunden nach draussen gegangen!','Super Tag!',1)
INSERT INTO JOURNALENTRY VALUES(3,'2018-06-15 00:00:00.000000','Heute war nicht so gut. Ich fühlte mich nicht in der Lage, nach draussen zu gehen.','Sehr schwierig heute..',1)