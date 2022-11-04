## Vision
Meningen med denna applikationen var att skapa en consol applikation där slutanvändaren kan använda funktionaliteterna som finns i SimpleAuth. SimpleAuth ger en autensisering lösning för utvecklare att använda i sitt project. Med hjälp av simpleAuth, slipper man att skriva sin egen autesniering, och man kan fokusera på sin applikation. Jag gjorde en enkel consol applikation för att demonstrera hur det skulle kunna se ut. Det är en applikation till anställda personer på en arbetsplat, där de har tillgång till sinna uppgifter när de loggar in. Om man är administratör, har man ytterligare behörigheter, och det är att kunna se alla anställda i företaget. Simple auth kan även tänkas användas för spel, banker, sociala medier och liknande. Detta är bara en demonstation om hur simple auth modulen kan fungera med applikation. Denna applikationen är på version 1.0.0 och kan vidare utvecklas i framtiden.

## krav
Med denna exempel applikationen ska en slutavändare kunna 
1. registrera en användare
2. logga in på den registerade användaren
3. När  man är inloggas ska man kunna se sin "user dashboard", och då ska man få 2 alternativ
   1. logga ut
   2. se sina personliga uppgifter
4. Logga in som administratör
5. Om man är administratös så ska man komma till en sida som heter "admin dahsboard", där ska man fp 3 alternativ
   1. logga ut
   2. se sina personliga uppgifter
   3. se alla anställda på företaget.
6. Autheisier krav 
   1. man ska inte kunna logga in med fel användarnamn
   2. man ska inte kunna logga in med fel lössenord
   3. man ska inte kunna logga in om användaren inte finns.

## Funktioner som kan tänkas implementeras i framtiden 

SimpleAuth
  1. Byta sitt användarnamn
  2. Skriva sitt för och efternamn
  3. lägga till ett mobilnr 
  4. lägga till ett email

EmployeeHome
1. Clock in
2. Clock out
3. Se sin lön specifikation
4. Sjukanmälan 
5. semesterdagar
   
## Test
Alla tester har dokumenteras i [test.md](test.md).


## Beskrivning av kod: vad fungerar? vad fungerar inte?
Alla funktionerna i kraven fungerar. Det ända som inte fungerar är att logga in flera användare samtidigt, på flera olika datorer. Detta kan implementeras med session cookies i framiden.

## Changes made to SimpleAuth
1. Changed to `equals()` instead of contains() when compaing username and password to imput data, because, containse would validate user if they had a password similar to something in the databse. I needed the credentials to be exact. ( write method names here)
2. changed nameList in simpleAuth to usernameDatabas
3. You can now have several registered users, and log into your account. I solved this by searching if username exist. If the username exist, i select its user object, and then compare the password to the one in the selected object. (simple auth)