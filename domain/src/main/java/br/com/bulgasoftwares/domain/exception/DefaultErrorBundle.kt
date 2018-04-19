package br.com.bulgasoftwares.domain.exception

/**
 * Wrapper around Exceptions used to manage default errors.
 */
class DefaultErrorBundle(override val exception: Exception?) : ErrorBundle {

    override val errorMessage: String?
        get() = if (exception != null) this.exception.message else DEFAULT_ERROR_MSG

    companion object {

        private const val DEFAULT_ERROR_MSG = "Unknown error"
    }
}