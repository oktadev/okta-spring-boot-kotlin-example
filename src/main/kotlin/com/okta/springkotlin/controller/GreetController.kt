package com.okta.springkotlin.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetController {

    @GetMapping("/greet")
    fun greet(@AuthenticationPrincipal user: OidcUser): String {
        val capitalizedName = user.givenName.capitalize()
        return "Hello, $capitalizedName!"
    }

    fun String.capitalize(): String {
        return when {
            this.isEmpty() -> this
            this.length == 1 -> this.toUpperCase()
            else -> this[0].toTitleCase() + this.substring(1).toLowerCase()
        }
    }

}