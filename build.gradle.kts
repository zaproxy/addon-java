import org.zaproxy.gradle.addon.AddOnStatus
import org.zaproxy.gradle.addon.misc.ConvertMarkdownToHtml

plugins {
    `java-library`
    id("org.zaproxy.add-on") version "0.11.0"
    id("com.diffplug.spotless")
    id("org.zaproxy.common")
}

description = "A template for a 3rd party ZAP Java add-on."

zapAddOn {
    addOnId.set("addonjava")
    addOnName.set("A Template Java Add-on")
    zapVersion.set("2.15.0")
    addOnStatus.set(AddOnStatus.ALPHA)

    releaseLink.set("https://github.com/youruser/javaexample/compare/v@PREVIOUS_VERSION@...v@CURRENT_VERSION@")
    unreleasedLink.set("https://github.com/youruser/javaexample/compare/v@CURRENT_VERSION@...HEAD")

    manifest {
        author.set("ZAP Dev Team")
        url.set("https://www.zaproxy.org/docs/desktop/addons/addonjava/")
        repo.set("https://github.com/zaproxy/addon-java")
        changesFile.set(tasks.named<ConvertMarkdownToHtml>("generateManifestChanges").flatMap { it.html })
    }
}

java {
    val javaVersion = JavaVersion.VERSION_11
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

spotless {
    kotlinGradle {
        ktlint()
    }
}
