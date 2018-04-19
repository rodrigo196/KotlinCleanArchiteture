package br.com.bulgasoftwares.domain.exception

/**
 * Interface to represent a wrapper around an [java.lang.Exception] to manage errors.
 */
interface ErrorBundle {
    val exception: Exception?

    val errorMessage: String?
}