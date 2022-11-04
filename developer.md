## Vision
Meningen med denna applikationen var att skapa en konsol applikation där slutanvändaren kan använda funktionaliteterna som finns i `SimpleAuth`. `SimpleAuth` ger en autentisering lösning för utvecklare att använda i sitt project. Med hjälp av `simpleAuth`, slipper man att skriva sin egen autesniering med en databas och säkerhet. 
 
Jag gjorde en enkel consol applikation för att demonstrera hur det skulle kunna se ut. Det är en applikation till anställda personer på en arbetsplats, där de har tillgång till sina uppgifter när de loggar in. Om man är administratör, har man ytterligare behörigheter, och det är att kunna se alla anställda i företaget. `SimpleAuth` kan även tänkas användas för spel, banker, sociala medier och liknande. Detta är bara en demonstration om hur `SimpleAuth` modulen kan fungera med en applikation. Denna applikationen är på version 1.0.0 och kan vidareutvecklas i framtiden.
 
## krav
Med denna exempel applikationen ska en slutavändare kunna:
1. Registrera en användare
2. Logga in på den registrerade användaren
3. När man är inloggade ska man kunna se sin "user dashboard", och då ska man få 2 alternativ
   1. Logga ut
   2. Se sina personliga uppgifter
4. Logga in som administratör
5. Om man är administratör så ska man komma till en sida som heter "admin dashboard", där ska man få 3 alternativ
   1. Logga ut
   2. Se sina personliga uppgifter
   3. Se alla anställda på företaget.
6. Autensiering krav
   1. Man ska inte kunna logga in med fel användarnamn
   2. Man ska inte kunna logga in med fel lösenord
   3. Man ska inte kunna logga in om användaren inte finns.
 
## Funktioner som kan tänkas implementeras i framtiden
 
SimpleAuth
  1. Byta användarnamn
  2. Skriva sitt för och efternamn
  3. Lägga till ett mobilnr
  4. Lägga till en email
 
EmployeeHome
1. Clock in
2. Clock out
3. Se sin lönspecifikation
4. Sjukanmälan
5. Semesterdagar
   
## Test
Alla tester är skrivna i [test.md](test.md).
 
 
## Beskrivning av kod: vad fungerar? vad fungerar inte?
Alla funktionerna i kraven fungerar. Det enda som inte fungerar är att logga in flera användare samtidigt, på flera olika datorer. Detta kan implementeras med session cookies i framtiden. För mer information om koden, kan du kolla på inline kommentarerna som finns i metoderna. En sträng regel för användarrollerna är inte tillagd ännu, det har bara blivit tillämpt manuelt. Dvs att vanliga användare kan skapa ett konto som innehåller "admin" och kanske få tillgång till admin behörigheter. Detta är något som kan utvecklas i framtiden.
 
## Changes made to SimpleAuth
1. Changed to `equals()` instead of `contains()` when comparing username and password to input data, because contain() would validate the user if they had a password similar to something in the database. I needed the credentials to be exact. [Check code here](SimpleAuth/src/controller/SimpleAuth.java), at method `checkCorrectCredentials()`
2. Changed nameList variable in simpleAuth to usernameDatabase
3. You can now have several registered users, and sign in to your account without any conflict. I solved this by searching if the username exists and if the username exists, I select its user object, and then compare the password written by the end user, to the one in the selected object. [Check code here](SimpleAuth/src/controller/SimpleAuth.java), at method `checkCorrectCredentials()`
