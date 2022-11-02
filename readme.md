### manual



### changes made to SimpleAuth
  1. Changed to `equals()` instead of `contains()` when compaing username and password to imput data, because, containse would validate user if they had a password similar to something in the databse. I needed the credentials to be exact. ( write method names here)
  2. changed nameList in simpleAuth to usernameDatabase