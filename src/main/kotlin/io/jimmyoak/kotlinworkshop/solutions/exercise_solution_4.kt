package io.jimmyoak.kotlinworkshop.exercises

import java.time.DayOfWeek
import java.time.LocalDate

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

interface Availability {
    fun opensOn(date: LocalDate): Boolean
}

open class ConcreteDaysOfWeekAvailability(vararg val daysOfWeek: DayOfWeek) : Availability {
    override fun opensOn(date: LocalDate) = daysOfWeek.contains(date.dayOfWeek)
}

class WeekdaysAvailability : ConcreteDaysOfWeekAvailability(
        DayOfWeek.MONDAY,
        DayOfWeek.TUESDAY,
        DayOfWeek.WEDNESDAY,
        DayOfWeek.THURSDAY,
        DayOfWeek.FRIDAY
)

class WeekendsAvailability : ConcreteDaysOfWeekAvailability(
        DayOfWeek.SATURDAY,
        DayOfWeek.SUNDAY
)

data class LimitedAvailability(val beginningDate: LocalDate, val endingDate: LocalDate) : Availability {
    override fun opensOn(date: LocalDate) = date in beginningDate..endingDate
}

class Establishment(val name: String, val availability: Availability) {
    fun opensOn(date: LocalDate) = availability.opensOn(date)
}

object EstablishmentPrinter {
    fun establishmentOpensOn(establishment: Establishment, date: LocalDate, shouldOpen: Boolean) {
        println("${establishment.name} on $date is "
                + (if (establishment.opensOn(date)) "OPEN" else "CLOSE")
                + (" and should be " + if (shouldOpen) "OPEN" else "CLOSE"))
    }
}

object ExerciseSolution4 {
    @JvmStatic fun main(args: Array<String>) {
        val petShop = Establishment("Pet Shop", WeekdaysAvailability())
        EstablishmentPrinter.establishmentOpensOn(petShop, LocalDate.parse("2017-03-13"), true)
        EstablishmentPrinter.establishmentOpensOn(petShop, LocalDate.parse("2017-03-14"), true)
        EstablishmentPrinter.establishmentOpensOn(petShop, LocalDate.parse("2017-03-29"), true)
        EstablishmentPrinter.establishmentOpensOn(petShop, LocalDate.parse("2017-04-07"), true)
        EstablishmentPrinter.establishmentOpensOn(petShop, LocalDate.parse("2017-04-08"), false)
        EstablishmentPrinter.establishmentOpensOn(petShop, LocalDate.parse("2017-04-09"), false)

        val gunShop = Establishment("Gun Shop", ConcreteDaysOfWeekAvailability(DayOfWeek.MONDAY, DayOfWeek.TUESDAY))
        EstablishmentPrinter.establishmentOpensOn(gunShop, LocalDate.parse("2017-03-13"), true)
        EstablishmentPrinter.establishmentOpensOn(gunShop, LocalDate.parse("2017-03-14"), true)
        EstablishmentPrinter.establishmentOpensOn(gunShop, LocalDate.parse("2017-03-29"), false)
        EstablishmentPrinter.establishmentOpensOn(gunShop, LocalDate.parse("2017-04-07"), false)
        EstablishmentPrinter.establishmentOpensOn(gunShop, LocalDate.parse("2017-04-08"), false)
        EstablishmentPrinter.establishmentOpensOn(gunShop, LocalDate.parse("2017-04-09"), false)

        val disco = Establishment("Disco", WeekendsAvailability())
        EstablishmentPrinter.establishmentOpensOn(disco, LocalDate.parse("2017-04-08"), true)
        EstablishmentPrinter.establishmentOpensOn(disco, LocalDate.parse("2017-04-09"), true)
        EstablishmentPrinter.establishmentOpensOn(disco, LocalDate.parse("2017-03-13"), false)
        EstablishmentPrinter.establishmentOpensOn(disco, LocalDate.parse("2017-03-14"), false)
        EstablishmentPrinter.establishmentOpensOn(disco, LocalDate.parse("2017-03-29"), false)
        EstablishmentPrinter.establishmentOpensOn(disco, LocalDate.parse("2017-04-07"), false)

        val conference = Establishment("DDD Europe Conference", LimitedAvailability(
                beginningDate = LocalDate.parse("2017-02-02"),
                endingDate = LocalDate.parse("2017-02-05")
        ))
        EstablishmentPrinter.establishmentOpensOn(conference, LocalDate.parse("2017-02-02"), true)
        EstablishmentPrinter.establishmentOpensOn(conference, LocalDate.parse("2017-02-03"), true)
        EstablishmentPrinter.establishmentOpensOn(conference, LocalDate.parse("2017-02-05"), true)
        EstablishmentPrinter.establishmentOpensOn(conference, LocalDate.parse("2017-04-08"), false)
        EstablishmentPrinter.establishmentOpensOn(conference, LocalDate.parse("2018-04-02"), false)
    }
}