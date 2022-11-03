| test nr | Vad som testas/krav  | Hur det testas | Testresultat |
| --- | --- | --- | --- |
| 1 | Registrera en användare  | Skriv  “1” i terminalen för att registrera en användare. Då kan du skriva ett användarnamn “hannah” och ett lösenord “hannah123”.  | ![test1](images/test1.png) |
| 2 | Registrera en användare som redan finns  | Skriv “1” i terminalen för att registrera en användare. Använd samma uppgifter som i test 1. Detta ska inte fungera för att man kan inte ha en användare med samma namn. | ![test2](images/test2.png) |
| 3 | Logga in en användare | Skriv “2” i terminalen för att logga in en användare.  Ange uppgifterna från test 1. | ![test3](images/test3.png) |
| 4 | Logga in en användare som inte finns | Skriv “2” i terminalen för att logga in en användare.  Ange felaktiga uppgifter som du vet inte finns. | ![test4](images/test4.png) |
| 5 | Logga in en användare med fel användarnamn | Skriv “2” i terminalen för att logga in en användare. Ange felaktiga uppgifter för användarnamnet, men använd lösenordet från test 1. | ![test5](images/test5.png) |
| 6 | Logga in en användare som finns, med fel lösenord  | Skriv “2” i terminalen för att logga in en användare. Ange felaktiga uppgifter för lösenordet, men använd användarnamnet från test 1. | ![test6](images/test6.png) |
| 7 | Logga in som en vanlig användare | Använd uppgifterna från test 1 för att logga in en användare. Om allt stämmer, så kommer du komma till en sida som heter “user Dashboard” | ![test7](images/test7.png) |
| 8 | Logga in som admin | Ange “admin” som användare namn och “admin123”, som lösenord. Då kommer du till en sida som heter “Admin Dahsboard” | ![test8](images/test8.png) |
| 9 | Visa användare information | Efter du har loggat in med uppgifterna av en registrerad användare, skriv “4” i terminalen för att see dina användare uppgifter. | ![test9](images/test9.png) |
| 10 | logga ut en användare  | Efter du har loggat in med uppgifterna av en registrerad användare, skriv “3” i terminalen för att logga ut. Efter det kommer du till startsidan. | ![test10](images/test10.png) |
| 11 | Visa alla registered användare, när man är inloggad som admin | Logga in som admin (med uppgifterna i test 8), sedan skriv “5” i terminalen, för att se uppgifter på alla registrerade användare. | ![test11](images/test11.png) |