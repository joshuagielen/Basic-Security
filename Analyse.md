# Visie en scope

**AppDev02**

**Groepsleden:** Nick Philippe, Simon Thaens, Joshua Gielen, Maurice Dalderup

## Visie

Het doel van de te ontwikkelen applicatie is het weergeven van evenementen vergemakkelijken. Het doelpubliek zijn studenten uit de regio Hasselt en Diepenbeek. De evenementen moeten op een overzichtelijke manier weergegeven worden zodat de studenten gemakkelijk kunnen zien welke evenementen er in de buurt plaatsvinden. We houden hierbij ook veiligheid en voorlichting in het achterhoofd.


### Huidige situatie

De opdrachtgever heeft op dit moment nog geen applicatie in deze aard. Er zijn wel al alternatieven te vinden op het internet waarmee onze opdrachtgever wil concurreren.

### Gewenste situatie

De applicatie zal in eerste instantie bestaan uit een responsive website. Dit wil zeggen dat hij zowel op desktops als op mobiele apparaten moeten werken. In een later stadium verschijnt er eventueel nog een mobiele app. Het is belangrijk dat de website dynamisch oogt en dat er regelmatig nieuwe informatie op de homepage komt te staan. De evenementenkalender moet ook direct toegankelijk zijn, net zoals het noodnummer 112. 


### Businessrequirements

De opdrachtgever wil de webapplicatie laten ontwikkelen om volgende redenen:
- Overzichtelijker evenementen kunnen weergeven die elk een score krijgen aan de hand van de Feestwijzer service.
- Studenten beter kunnen voorlichten over alcohol en drugs.
- Meer inzicht krijgen in het gedrag en de leefwereld van studenten en daardoor betere campagnes kunnen opzetten. 

## Belanghebbenden

### Eindgebruikers

#### CAD (Opdrachtgever)

In de eerste plaats heeft het CAD een groot belang bij deze applicatie. Hierdoor zullen ze in staat zijn om betere campagnes op te zetten die meer passen in de leefwereld van studenten. 

#### Studenten

De studenten van regio Hasselt en Diepenbeek zullen ook baat hebben bij deze applicatie. Evenementen vinden zal makkelijker zijn en er zullen enkele tools zijn voor vervoer, EHBO, ... 

### Gebruikersomgeving

De bedoeling is dat redelijk veel studenten gebruik zullen maken van deze applicatie. Het is belangrijk dat de website voor iedereen overzichtelijk is en makkelijk in gebruik. Hij moet ook vlot werken op zowel desktops als mobiele apparaten. 

### Overige belanghebbenden

#### Organisaties

De organisaties zullen ook belang hechten aan onze applicatie. Eens goedgekeurd kunnen zij hun evenementen toevoegen aan de kalender. Dit betekend extra reclame voor de organisaties alsook een manier om te zien welke score ze krijgen op hun evenementen. Dit zou dan kunnen leiden tot beter georganiseerde evenementen. 

## Systeemscope

### Omschrijving van het systeem

De belangrijkste functionaliteit van de applicatie is de evenementenkalender. Gebruikers kunnen hierin evenementen sorteren en filteren naargelang hun criteria. Ook kunnen ze de score zien van Fuifwijzer en is het mogelijk om enkele vervoersmogelijkheden te bekijken. Als een gebruiker zich aanmeldt voor een evenement zal hierover informatie verschijnen in de gebruiker zijn nieuwsfeed. 

### Positionering van het systeem

De webapplicatie zal via Azure gehost worden. Hierdoor is de applicatie meteen zeer schaalbaar. Voor de registratie van gebruikers gebruiken we de API van Facebook. Dit omdat de meeste studenten hierover beschikken en dit het registreren en inloggen vergemakkelijkt. 

### Globale gebruikersrequirements

- De gebruiker moet de evenementenkalender kunnen bekijken en evenementen kunnen sorteren/filteren.
- De gebruiker moet zich kunnen aanmelden voor evenementen en de vervoersmogelijkheden kunnen bekijken.
- De gebruiker moet zijn nieuwsfeed kunnen aanpassen.
- Organisaties moeten nieuwe evenementen kunnen toevoegen aan de kalender.
- Evenementen moeten automatisch een Fuifwijzer score krijgen aan de hand van enkele vragen die gesteld worden.
- De volledige applicatie moet responsive en schaalbaar zijn. 


### Niet-functionele requirements

- De uptime van de applicatie moet hoog zijn. Het is belangrijk dat gebruikers altijd gebruik kunnen maken van de applicatie.
- Gevoelige gegevens die verstuurd worden moeten afgeschermd worden voor onderschepping door derden. Dit is belangrijk voor het vertrouwen van de gebruiker.


## Voorlopige planning

### Risico's

- Er bestaat het risico dat organisatoren misbruik gaan maken van de kalender en dit puur voor reclamedoeleinden gaan gebruiken. Hierdoor moeten organisators goed gecontroleerd worden door een CAD medewerker voordat ze toegang krijgen tot alle functionaliteiten van de evenementenkalender. 

- Uitstelgedrag is een groot risico. We moeten zorgen dat we niet alles tot het laatste moment uitstellen en hierdoor eventueel in de problemen geraken.

- Onderschatten van de omvang van het project is ook een risico. Mede doordat we dit vak allemaal bissen. 


### Huidig kennisniveau

Onze volledige groep bist dit vak dus we weten waar we ons aan kunnen verwachten. De meerderheid heeft al kennis van REST-api's en dergelijke, dit zal dus geen probleem mogen vormen. 

### Plan van aanpak

Aan de hand van onze use cases (rekening houdend met feedback) zullen we samen een SCRUM-planning opstellen. Aan de hand hiervan weten we welke taken nog gedaan moeten worden, met welke taken we nog bezig zijn en welke taken al klaar zijn. Doormiddel van het gebruik van SCRUM kunnen we duidelijk de prioriteit en tijdsduur van elke taak zien. 


### Bronnen

- Pluralsight (www.pluralsight.com)
- Cursus Programming Advanced: .NET
- Cursus Web Advanced
- Azure (www.azure.microsoft.com)

#Context diagram

![Use case diagram](./STUFV_Context_diagram.png)

#Use case diagram

![Use case diagram](./STUFV_Use_case_overzicht.png)

#Overzicht van alle Use Cases

####UC-01: Registratie gebruiker
####UC-02: Registratie organisatie
####UC-03: Organisatie goedkeuren
####UC-04: Inloggen gebruiker
####UC-05: Inloggen organisatie
####UC-06: Evenement toevoegen
####UC-07: Opvragen evenementen
####UC-08: Evenementen sorteren/filteren
####UC-09: Aanwezigheid registreren
####UC-10: Route plannen
####UC-11: Carpoolen
####UC-12: Aanvragen BOB
####UC-13: Ingeven drank


---

# UC-01: Registratie gebruiker
**Actoren**: Gebruiker.

**Trigger**: Een niet-geregistreerde persoon wil gebruik maken van de evenementenkalender.

## Omschrijving
Nieuw account aanmaken voor de gebruiker.

## Precondities
1. De gebruiker is nog niet geregistreerd.

## Postcondities
1. De gebruiker is geregistreerd en kan inloggen.

## Normale flow
1.	De gebruiker geeft een gebruikersnaam in.
2.	Het systeem controleert in real-time of het account van de gebruiker al bestaat.
3.	De gebruiker geeft zijn wachtwoord in.
4.	De gebruiker geeft zijn wachtwoord een 2de keer in ter controle.
5.	Het systeem controleert of de wachtwoorden identiek zijn.
6.	De gebruiker geeft extra gegevens in (adres, telefoonnummer, naam, voornaam,...).
7.	De gebruiker klikt op "aanmaken".


## Alternatieve flow
/

## Uitzonderingen
2.	2a: De gebruiker bestaat al.
	1.	De gebruiker krijgt een foutmelding dat de gebruiker al bestaat.
5. 5a: Wachtwoorden zijn niet identiek.
	1.	De gebruiker krijgt een foutmelding dat het wachtwoord niet identiek is.
6. 6a: Formulier-validatie is niet geslaagd.
	1.	Het formulier is niet correct ingevuld, de gebruiker wordt hiervan op de hoogte gebracht. 


## Inclusief
/


---


# UC-02: Registratie organisatie
**Actoren**: Organisatie, CAD-medewerker.

**Trigger**: Niet-geregistreerde organisatie wil gebruik maken van de evenementenkalender.

## Omschrijving
Nieuw account aanmaken voor de organisatie.

## Precondities
1. De organisatie is nog niet geregistreerd.

## Postcondities
1. De organisatie heeft een aanvraag tot registratie verstuurd.

## Normale flow
1.	De organisatie geeft een gebruikersnaam in.
2.	Het systeem controleert in real-time of het account van de organisatie al bestaat.
3.	De organisatie geeft zijn wachtwoord in.
4.	De organisatie geeft zijn wachtwoord een 2de keer in ter controle.
5.	Het systeem controleert of de wachtwoorden identiek zijn.
6.	De organisatie geeft extra gegevens in (adres, telefoonnummer, naam, voornaam,...).
7.	De organisatie klikt op aanmaken.


## Alternatieve flow
/

## Uitzonderingen
2.	2a: De organisatie bestaat al.
	1.	De organisatie krijgt een foutmelding dat de organisatie al bestaat.
5. 5a: Wachtwoorden zijn niet identiek.
	1.	De organisatie krijgt een foutmelding dat het wachtwoord niet identiek is.
6. 6a: Formulier-validatie is niet geslaagd.
	1.	Het formulier is niet correct ingevuld, de organisatie wordt hiervan op de hoogte gebracht. 

## Inclusief
/


---


# UC-03: Organisatie goedkeuren
**Actoren**: CAD-medewerker, organisatie.  
**Trigger**: Organisatie doet poging tot registratie.

## Omschrijving
Aanvraag voor registratie wordt gecontroleerd en eventueel goedgekeurd.

## Precondities
1. De organisatie moet een aanvraag tot registratie hebben verstuurd.

## Postcondities
1. De organisatie is geregistreerd, goedgekeurd en kan vervolgens inloggen.

## Normale flow
1. 	De CAD-medewerker meldt zich aan op de desktop applicatie.
2.	De CAD-medewerker navigeert naar de binnengekomen aanvragen.
3.	De CAD-medewerker controleert de organisatie die zich heeft opgegeven.
4.	De CAD-medewerker keurt de organisatie goed.


## Alternatieve flow
/


## Uitzonderingen
4. 4a: De CAD-medewerker keurt de organisatie niet goed.
	1. De organisatie krijgt een melding dat ze niet goedgekeurd zijn.


## Inclusief
UC-02: Registratie organisatie.


---


# UC-04: Inloggen gebruiker
**Actoren**: Gebruiker.  
**Trigger**: Niet-ingelogde gebruiker wilt toegang tot de gebruiker functionaliteiten.

## Omschrijving
Inloggen van de gebruiker voor het gebruiken van bepaalde functionaliteiten.

## Precondities
1. De gebruiker is nog niet ingelogd en is geregistreerd.

## Postcondities
1. De gebruiker is ingelogd en kan bepaalde functionaliteiten benutten.

## Normale flow
1.	De gebruiker geeft zijn gebruikersnaam in.
2.	De gebuiker geeft zijn wachtwoord in.
3.	Het systeem controleert de gebruikersnaam en het wachtwoord.
4.	Het systeem geeft toegang tot bepaalde functionaliteiten die overeenstemmen met het gebruikersprofiel.


## Alternatieve flow
/

## Uitzonderingen
3. 3a: De gebruikersnaam of het wachtwoord is incorrect.
	1.	Het systeem geeft een gepaste foutmelding en geeft de gebruiker de mogelijkheid om zijn gegevens opnieuw in te geven
3. 3b: De gebruikersnaam of het wachtwoord is 3x incorrect
	1.	Het systeem geeft een gepaste foutmelding en geeft de gebruiker een verbod om voor een bepaalde tijd in te loggen

## Inclusief
UC-01 : registratie gebruiker.


---


#UC-05: Inloggen organisatie
**actoren: organisatie, CAD-medewerker
**triggers: niet ingelogde organisatie wil gebruik maken van de evenementenkalender. 

##omschrijving
Een organisatie wil inloggen op de evenementenkalender.

##precondities
1. De organisatie moet geregistreerd zijn en nog niet ingelogd. 
2. De registratie moet goedgekeurd zijn door een CAD-medewerker.

##postcondities
1. De organisatie is ingelogd op de evenementenkalender en kan activiteiten uitvoeren.

##normale flow
1. De organisatie geeft zijn gebruikersnaam in.
2. De organisatie geeft zijn wachtwoord in. 
3. De organisatie klikt op inloggen. 
4. Het systeem controleert de gebruikersnaam en het wachtwoord.
5. De organisatie wordt doorverwezen naar de evenementenkalender.


##alternatieve flow
/

##uitzonderingen
4. 4a: Gebruikersnaam of wachtwoord is onjuist.
	1. Het systeem toont een foutmelding op het scherm. De gebruiker kan zijn gebruikersnaam en wachtwoord opnieuw ingeven. 
4.	4b: De organisatie heeft nog geen goedkeuring gekregen van een CAD-medewerker.
	2. Het systeem toont een foutmelding(nog geen goedkeuring). 

##inclusief
UC-02: registratie organisatie.


---


#UC-06: Evenement toevoegen
**actoren: organisatie
**triggers: niet geregistreede organisatie wil een evenement toevoegen. 

##omschrijving
De organisatie kan via de webinterface een evenement toevoegen. die daarna zichtbaar wordt voor de gebruikers(studenten).

##precondities
1. De organisatie moet ingelogd zijn op het systeem.

##postcondities
1. De organisatie heeft een nieuw evenement toegevoegd aan de evenementenkalender.

##normale flow
1.	De organisatie is ingelogd op de evenementenkalender.
2.	De organisatie navigeert naar evenementen.
3. 	De organisatie klikt op nieuw evenement aanmaken. 
4.	De organisatie geeft alle info van het nieuwe evenement in.
5. 	De organisatie klikt op "nieuw evenement toevoegen".
6.	Het systeem controleert of het evenement al bestaat. Indien het niet bestaat, wordt het evenement toegevoegd.
7.	De organisatie wordt doorverwezen naar de geüpdatete evenementenkalender.


##alternatieve flow
/

##uitzonderingen
6.	6a: Het evenement bestaat al.
	1.	De organisatie krijgt een foutmelding dat het evenement al bestaat. De organisatie kan eventueel het evenement wijzigen of een nieuwe aanmaken. 

##inclusief
UC-05: Inloggen organisatie.


---


#UC-07: Opvragen evenementen
**actoren: Gebruiker
**triggers: Gebruiker vraagt overzicht op van evenementen.

##omschrijving
De gebruiker wilt een overzicht zien van alle evenementen en vraagt dit op via de applicatie.

##precondities
1. De gebruiker moet ingelogd en geregistreerd zijn.
2. Er moeten evenementen toegevoegd zijn om weer te geven.

##postcondities
1. De gebruiker krijgt een overzicht van alle evenementen.

##normale flow
1. De gebruiker is aangemeld.
2. De gebruiker navigeert naar de evenementenkalender.
3. De gebruiker krijgt een overzicht van alle evenementen. 

##alternatieve flow
3. 3a: Er zijn geen evenementen om weer te geven.
	1. De gebruiker krijgt een melding te zien dat er geen evenementen zijn.

##uitzonderingen
/

##inclusief
UC-05: Inloggen organisatie.


---


#UC-08: Evenementen sorteren/filteren
**actoren:gebruiker
**triggers: De gebruiker wil een overzicht zien.

##omschrijving
De gebruiker kan via een zoekfunctie, evenementen sortereren/filteren op basis van afstand, gemeente, aantal deelnemers, datum, ...

##precondities
1. De gebruiker moet geregistreerd en ingelogd zijn.
2. Er moeten evenementen zijn om weer te geven.

##postcondities
1. De gesorteerde/gefilterde evenementen zijn nu zichtbaar.

##normale flow
1.	De gebruiker navigeert naar evenementen.
2.	De gebruiker geeft in de zoekbalk zijn zoekcriteria in.
3.	De evenementen worden gesorteerd op basis van de zoekcriteria.
5.	De gesorteerde evenementen worden weergegeven.

##alternatieve flow
/

##uitzonderingen
3.	3a: De ingeven zoekcriteria vindt geen resultaten.
	1.	De gebruiker wordt op de hoogte gebracht door een melding, en kan opnieuw zoekcriteria ingeven. 

##inclusief
UC-05: Inloggen organisatie.


---


#UC-09: Aanwezigheid registreren
**actoren: gebruikers
**triggers: een niet-ingelogde gebruiker wil zijn aanwezigheid op een evenement registreren.

##omschrijving
Om bij te houden hoeveel mensen er zullen deelnemen aan een evenement, kunnen gebruikers hun aanwezigheid registreren voor een evenement.

##precondities
1. De gebruiker moet geregistreerd en ingelogd zijn, vooraleer hij zijn aanwezigheid kan registreren.

##postcondities
1. De gebruiker heeft zijn aanwezigheid registreert voor een evenement. 

##normale flow
1. De gebruiker navigeert naar de evenementenkalender.
2. De gebruiker kiest een evenement waarvoor hij zich wil registreren. 
3. De gebruiker klikt op "deelnemen aan evenement". 
4. Het systeem registreert de aanwezigheid van de gebruiker.
5. De gebruiker wordt terug doorverwezen naar het evenementenoverzicht. 

##alternatieve flow
/

##uitzonderingen
4. 4a: Het maximum aantal deelnemers is bereikt. 
	1. De gebruiker wordt op de hoogte gesteld dat het evenement volzet is. 

##inclusief
UC-05: Inloggen organisatie.


---


#UC-010: Route plannen
**actoren: Gebuiker
**triggers: De gebruiker wilt een route plannen.

##omschrijving
De gebruiker wilt een route plannen voor het vervoer naar het evenement.

##precondities
1. De gebruiker moet geregistreerd en ingelogd zijn.
2. De gebruiker moet een evenement beginlocatie en eindlocatie hebben om van te navigeren.

##postcondities
1. De gebruik krijgt een routebeschrijving.

##normale flow
1. De gebruiker navigeert naar de routeplanner.
2. De gebruiker geeft beginlocatie en eindlocatie in.
3. Het systeem berekend de route.
4. De gebruiker krijgt de snelste route te zien.

##alternatieve flow
2.	De gebruiker geeft een beginlocatie, tussenstop en eindlocatie op.
	2. 2a: De gebruiker geef 3 locaties op.
	3. 2b: Het systeem berekent een route met tussenstop.
	4. 2c: De gebruiker krijgt de snelste route te zien.

##uitzonderingen
3. 3a: De beginlocatie of eindlocatie bestaat niet of kan niet gevonden worden.
	1. Er wordt een foutmelding getoond dat de beginlocatie niet beschikbaar is.
	2. Er wordt een foutmelding getoond dat de eindlocatie niet beschikbaar is.

##inclusief
UC-05: Inloggen organisatie.


---


#UC-011: Carpoolen
**actoren: Gebruikers
**triggers: De gebruiker wilt BOB zijn.

##omschrijving
Een gebruiker stelt zijn auto open om meerdere gebruikers mee te nemen naar het evenement.

##precondities
1. De gebruiker moet geregistreerd en ingelogd zijn.
2. De gebruiker die moet een verdrag accepteren om BOB te zijn en mag dus niet drinken.

##postcondities
1. De gebruikers heeft zich geregistreed als vervoer.

##normale flow
1. De gebruiker navigeert naar het vervoer overzicht.
2. De gebruiker geeft zich op als BOB.
3. De gebruiker accepteerd andere gebruikers om mee te rijden.

##alternatieve flow
/

##uitzonderingen
3.	3a: De gebruiker accepteerd andere gebruikers niet.
	1. De andere gebruiker krijgt een melding te zien dat hij/zij niet geaccepteerd zijn.

##inclusief
UC-05: Inloggen organisatie.


---


#UC-12: Aanvragen BOB
**actoren: Gebruiker
**triggers: Een gebruiker wilt vervoer regelen met de auto.

##omschrijving
Een gebruiker die niet BOB is, wilt vervoer regelen met de auto.

##precondities
1. De gebruiker moet geregistreerd en ingelogd zijn.
2. Er moeten andere gebruikers zijn die zich opgegeven hebben als BOB.

##postcondities
1. De gebruiker heeft veilig vervoer van en naar het evenement.

##normale flow
1. De gebruiker navigeert naar het vervoer overzicht.
2. De gebruiker vraagt aan om mee te rijden met een BOB.
3. De gebruiker wordt geaccepteerd.

##alternatieve flow
/

##uitzonderingen
4.	4a: De gebruiker wordt niet geaccepteerd.
	1. De gebruiker krijgt een melding dat hij niet geaccepteerd wordt.

##inclusief
UC-05: Inloggen organisatie.


---


#UC-13: Ingeven drank
**actoren: Gebruiker
**triggers: De gebruiker heeft drank gekocht en wilt dit ingeven.

##omschrijving
De gebruiker heeft drank gekocht en wilt dit ingeven.

##precondities
1. De gebruiker moet geregistreerd en ingelogd zijn.
2. De gebruiker moet drank hebben gekocht om in te geven.

##postcondities
1. De gebruiker heeft zijn bierteller up-to-date gebracht.

##normale flow
1. De gebruiker navigeerd naar zijn bierteller.
2. De gebruiker geeft het soort drank, eenheid, alcoholpercentage en dergelijke in.
3. Het systeem update de weekscore en totale drankjes.

##alternatieve flow
3.	3a: De gebruiker heeft teveel drank op.
	1. Het systeem stuur een push melding met de mogelijke gevolgen. 

##uitzonderingen
/

##inclusief
UC-05: Inloggen organisatie


