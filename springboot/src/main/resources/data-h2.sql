insert into Brasseur (id,nom,pays) values (nextval('BRASSEUR_SEQ'),'Brew Dog','EC');
insert into Brasseur (id,nom,pays) values (nextval('BRASSEUR_SEQ'),'Molson Coors','CA');
insert into Brasseur (id,nom,pays) values (nextval('BRASSEUR_SEQ'),'Brasserie d Orval','BL');
insert into Brasseur (id,nom,pays) values (nextval('BRASSEUR_SEQ'),'Brouwerij Bosteels','BL');
insert into Biere(id,nom,degre,style,brasseur_id) values(nextval('BIERE_SEQ'),'Brew Dog Punk IPA',5.6,'IPA',1);
insert into Biere(id,nom,degre,style,brasseur_id) values(nextval('BIERE_SEQ'),'Molson Canadian Lager',5.0,'LAGER_BLONDE',2);
insert into Biere(id,nom,degre,style,brasseur_id) values(nextval('BIERE_SEQ'),'Orval',6.2,'TRAPPISTE',3);
insert into Biere(id,nom,degre,style,brasseur_id) values(nextval('BIERE_SEQ'),'Pauwel Kwak',8.0,'STRONG_ALE_BELGE',4);
insert into Biere(id,nom,degre,style,brasseur_id) values(nextval('BIERE_SEQ'),'Tripel Karmeliet',8.4,'BLONDE_BELGE',4);
insert into point_de_vente (id,nom,vente_En_Ligne) values(nextval('PDV_SEQ'),'Temple de la bière',true);
insert into point_de_vente (id,nom,vente_En_Ligne) values(nextval('PDV_SEQ'),'La Taverne',false);
insert into point_de_vente_Bieres values(1,1);
insert into point_de_vente_Bieres values(1,2);
insert into point_de_vente_Bieres values(1,3);
insert into point_de_vente_Bieres values(2,3);
insert into point_de_vente_Bieres values(2,4);
insert into point_de_vente_Bieres values(2,5);