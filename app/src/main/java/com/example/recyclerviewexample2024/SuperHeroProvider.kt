package com.example.recyclerviewexample2024

class SuperHeroProvider {
    companion object {

        val URL = "https://dam.org.es/ficheros/"
        // val URL = "https://cursokotlin.com/wp-content/uploads/2017/07/"

        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "KotlinMan",
                "Jetbrains",
                "AristiDevs",
                // "https://cursokotlin.com/wp-content/uploads/2020/09/Webp.net-compress-image.jpg"
                URL + "Webp.net-compress-image.jpg"
            ),
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                // "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
                URL + "spiderman.jpg"
            ),
            SuperHero(
                "Daredevil",
                "Marvel",
                "Matthew Michael Murdock",
                // "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
                URL + "daredevil.jpg"
            ),
            SuperHero(
                "Wolverine",
                "Marvel",
                "James Howlett",
                // "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"
                URL + "logan.jpeg"
            ),
            SuperHero(
                "Batman",
                "DC",
                "Bruce Wayne",
                // "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
                URL + "batman.jpg"
            ),
            SuperHero(
                "Thor",
                "Marvel",
                "Thor Odinson",
                // "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"
                URL + "thor.jpg"
            ),
            SuperHero(
                "Flash",
                "DC",
                "Jay Garrick",
                // "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"
                URL + "flash.png"
            ),
            SuperHero(
                "Green Lantern",
                "DC",
                "Alan Scott",
                // "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"
                URL + "green-lantern.jpg"
            ),
            SuperHero(
                "Wonder Woman",
                "DC",
                "Princess Diana",
                // "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"
                URL + "wonder_woman.jpg"
            )
        )
    }
}