# Progmod2_Beadando_2023

Package-ek
-----

**Controller**

Ez a package összesen egyetlen osztályt, a ApiControllers-t tartalmaz, ahol a különböző requestek szerepelnek. Ezek mind kommunikálnak a Model réteggel, majd vissza adja a művelet eredményét.

***Requestek/Endpointok***

* @GetMapping(value = "/workers")
  * **GET** metódus az adatbázisból lekéri az összes dolgozó adatát, majd beolvasás után JSON fromátumban kiírja őket.
  
![GetMappingworkers](https://user-images.githubusercontent.com/118485894/212158742-4eb37b0a-f4e4-40b0-99f6-1da23d5b6a3e.png)


* @PostMapping(value = "/save")
  * **POST** metódus a Requestbodyból kapott paraméterek alapján létrehozza a Worker osztály egy példányát, majd azt menti az adatbázisba és erről visszajelzést ad.
 
![saveworker](https://user-images.githubusercontent.com/118485894/212159427-6da53ec6-2e22-4bc7-a5e5-45464d3f2f3b.png)


* @GetMapping(value = "/palettes")
  * **GET** metódus az adatbázisból lekéri az összes paletta adatát, majd beolvasás után JSON fromátumban kiírja őket.
  
![getpalettes](https://user-images.githubusercontent.com/118485894/212160358-a232de0b-e1e4-4b4c-a1b9-9bde13c8466c.png)
  
  
* @PostMapping(value = "/savepalettes")
  * **POST** metódus a Requestbodyból kapott paraméterek alapján létrehozza a Palettes osztály egy példányát, majd azt menti az adatbázisba és erről visszajelzést ad.

![savepalettes](https://user-images.githubusercontent.com/118485894/212160829-8987f3a8-40e5-4772-af9f-0540984d380e.png)


* @PutMapping(value = "/update/{i}")
  * **PUT** metódus a Requestbodyból kapott paraméterek alapján módosítja annak a dolgozónak az adatait melynek azonosító számát a PathVariable-ben megadunk és erről visszajelzést ad

![update](https://user-images.githubusercontent.com/118485894/212161545-7bdb98a7-077c-474d-bf19-adc0f53fa434.png)


* @PutMapping(value = "/update2/{i}")
  * **PUT** metódus a Requestbodyból kapott paraméterek alapján módosítja annak a paletta az adatait melynek azonosító számát a PathVariable-ben megadunk és erről visszajelzést ad

![update2](https://user-images.githubusercontent.com/118485894/212161898-1c47a38c-770f-4298-a41c-32387aca47f8.png)


* @DeleteMapping(value = "/delete/{id}")
  * **DELETE** metódus a PathVariable-ből kapott azaonosító szám alapján megekresi az adatbázisban a megfelelő dolgozót majd törli azt és minden adatát

![delete](https://user-images.githubusercontent.com/118485894/212162506-8d6ce6bc-6075-4482-b086-3614b029b3ad.png)


* @DeleteMapping(value = "/delete2/{id}")
  * **DELETE** metódus a PathVariable-ből kapott azaonosító szám alapján megekresi az adatbázisban a megfelelő palettát majd törli azt és minden adatát
  
![delete2](https://user-images.githubusercontent.com/118485894/212162668-98a91720-5128-44db-ae70-e761860f8b0d.png)
  
-----  
  
**Enum**

Ebben a packageben egyetlen osztály található ami a Nationality enum. Ezzel a dolgozó nemzetiségét lehet meghatározni.

Értkei:
* HUNGARIAN
* JAPANESE
* SWEDISH
* GERMAN
* BRITISH
* CHINESE
* AMERICAN
* FINNISH

-----

**Models**

* Palettes

* Workers

-----

**Repo**
