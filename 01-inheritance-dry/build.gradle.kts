plugins { 
    java 
    application
    checkstyle
    }
repositories { mavenCentral() } // Configura Gradle per cercare e scaricare da Maven Central

application { // Configurazione dell'esecuzione, la main class è sufficiente
    mainClass.set("it.unibo.inheritance.test.TestBankAccount")
}