package io.jimmyoak.kotlinworkshop.exercises

/*
Write a program to check if an establishment is open. Establishment has a name.
There are different openings for establishments:
    - Only a few days per year
    - Only weekends
    - Only weekdays
    - Only some weekdays

Create a pet shop which only opens on weekdays, and check if it's open on:
    - 13/03/2017, 14/03/2017, 29/03/2017, 07/04/2017 -> OPEN
    - 08/04/2017, 09/04/2017 -> CLOSE

Create a gun shop which only opens on Monday and Tuesday, and check if it's open on:
    - 13/03/2017, 14/03/2017 -> OPEN
    - 29/03/2017, 07/04/2017, 08/04/2017, 09/04/2017 -> CLOSE

Create a disco which only opens on weekends, and check if it's open on:
    - 08/04/2017, 09/04/2017 -> OPEN
    - 13/03/2017, 14/03/2017, 29/03/2017, 07/04/2017 -> CLOSE

Create a DDD Europe Conference which only opens 02/02/2017 - 05/02/2017, and check if it's open on:
    - 02/02/2017, 03/02/2017, 05/02/2017 -> OPEN
    - 08/04/2017, 02/04/2018 -> CLOSE
*/