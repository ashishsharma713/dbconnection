CREATE TABLE color1 (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  parentId INT NOT NULL,
  name VARCHAR(250) NOT NULL,
  color VARCHAR(250) DEFAULT NULL
);

Insert into color(id,color,created_on,name,parent_Id) values(1,'red','2020-06-18','Warrior',0);

Insert into color(id,color,created_on,name,parent_Id) values(2,'green','2020-06-18','Wizard',0);
Insert into color(id,color,created_on,name,parent_Id) values(3,'white','2020-06-18','Priest',0);
Insert into color(id,color,created_on,name,parent_Id) values(4,'yellow','2020-06-18','Rogue',0);
Insert into color(id,color,created_on,name,parent_Id) values(5,'blue','2020-06-18','Fighter',1);
Insert into color(id,color,created_on,name,parent_Id) values(6,'lightblue','2020-06-18','Paladin',1);
Insert into color(id,color,created_on,name,parent_Id) values(7,'lightgreen','2020-06-18','Ranger',1);
Insert into color(id,color,created_on,name,parent_Id) values(8,'grey','2020-06-18','Mage',2);
Insert into color(id,color,created_on,name,parent_Id) values(9,'lightgrey','2020-06-18','Specialist wizard',2);
Insert into color(id,color,created_on,name,parent_Id) values(10,'red','2020-06-18','Cleric',3);
Insert into color(id,color,created_on,name,parent_Id) values(11,'green','2020-06-18','Druid',3);
Insert into color(id,color,created_on,name,parent_Id) values(12,'white','2020-06-18','Priest Of Specific Mythos',3);
Insert into color(id,color,created_on,name,parent_Id) values(13,'yellow','2020-06-18','Thief',4);
Insert into color(id,color,created_on,name,parent_Id) values(14,'blue','2020-06-18','Bard',4);
Insert into color(id,color,created_on,name,parent_Id) values(15,'light blue','2020-06-18','Assasin',13);






