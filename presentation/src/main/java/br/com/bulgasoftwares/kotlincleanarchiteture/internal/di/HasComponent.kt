package br.com.bulgasoftwares.kotlincleanarchiteture.internal.di

/**
 * Interface representing a contract for clients that contains a component for dependency injection.
 */
interface HasComponent<C> {
    val component: C
}