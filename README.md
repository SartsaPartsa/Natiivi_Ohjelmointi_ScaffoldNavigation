# Scaffold-Navigaatio
📱 Android — Scaffold and Navigation with Jetpack Compose

**Tekijä:** Sara Vehviläinen  
**Oppilaitos:** Oulun ammattikorkeakoulu  
**Kurssi:** Natiivi-ohjelmointi IN00CT07-3009  
**Lukukausi:** Syksy 2025

---

## 🧩 Tehtävän kuvaus
Tämän tehtävän tavoitteena on toteuttaa Android-sovellus, joka demonstroi `Scaffold`-rakenteen ja Jetpack Compose Navigation -kirjaston käyttöä. Sovellus rakentuu päänäkymästä ja muutamasta alanäkymästä, joiden välillä navigoidaan. Sovelluksessa hyödynnetään erilaisia `TopAppBar`-palkkeja eri näkymissä.

Tehtävä toimii johdantona seuraaviin aiheisiin:

*   `Scaffold`-komponentin käyttö
*   Jetpack Compose Navigation (`NavController`, `NavHost`)
*   Dynaamisten `TopAppBar`-komponenttien luonti
*   Navigaatiokuvakkeiden (`Menu`, `ArrowBack`) käyttö
*   Pudotusvalikon (`DropdownMenu`) lisääminen `TopAppBar`:iin

---

## ✨ Toiminnallisuus
*   **Päänäkymä:** Sisältää `MainTopAppBar`-komponentin, jossa on hampurilaiskuvake (menu) ja "lisää"-valikko.
*   **Navigointi:** "Lisää"-valikosta voi siirtyä "Info"- ja "Settings"-näytöille.
*   **Alinäkymät:** Käyttävät `ScreenTopBar`-komponenttia, jossa on takaisin-nuoli, jolla käyttäjä pääsee palaamaan edelliseen näkymään.

---

## 🛠️ Käytetyt teknologiat ja komponentit
*   Kotlin
*   Android Studio
*   Jetpack Compose
*   Material 3 -komponentit: `Scaffold`, `TopAppBar`, `NavController`, `NavHost`, `IconButton`, `Icon`, `Text`, `DropdownMenu`, `DropdownMenuItem`
*   Compose Navigation
*   State-hallinta: `remember`
*   Resource-hallinta: `Icons.Default.Menu`, `Icons.Default.MoreVert`, `Icons.AutoMirrored.Filled.ArrowBack`

---

## 🎯 Oppimistavoitteet
*   `Scaffold`-komponentin tehokas hyödyntäminen sovelluksen perusrakenteena.
*   Perusnavigaation toteuttaminen `NavController`- ja `NavHost`-komponenteilla.
*   Erilaisten yläpalkkien (`TopAppBar`) luominen ja käyttäminen eri näkymissä.
*   Pudotusvalikkojen (`DropdownMenu`) integrointi käyttöliittymään.
*   `NavController`-instanssin välittäminen ja käyttö eri `Composable`-funktioissa.

---

## 📚 Oppimisresurssit
### Jetpack Compose
*   **Virallinen Compose-dokumentaatio:** [developer.android.com/jetpack/compose](https://developer.android.com/jetpack/compose)
*   **Scaffold:** [developer.android.com/reference/kotlin/androidx/compose/material3/Scaffold](https://developer.android.com/reference/kotlin/androidx/compose/material3/Scaffold)
*   **Navigation:** [developer.android.com/jetpack/compose/navigation](https://developer.android.com/jetpack/compose/navigation)
*   **TopAppBar:** [developer.android.com/reference/kotlin/androidx/compose/material3/TopAppBar](https://developer.android.com/reference/kotlin/androidx/compose/material3/TopAppBar)

### Android-dokumentaatio:
*   **Virallinen Android-dokumentaatio:** [developer.android.com/docs](https://developer.android.com/docs)
*   **Android Studion käyttö:** [developer.android.com/studio/intro](https://developer.android.com/studio/intro)

### Kotlin:
*   **Kotlin-kielen virallinen dokumentaatio:** [kotlinlang.org/docs/home.html](https://kotlinlang.org/docs/home.html)