package br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.components

import br.com.bulgasoftwares.domain.repository.PodcastRepository
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.PerActivity
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.modules.PodcastModule
import dagger.Component

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [PodcastModule::class])
internal interface PodcastComponent {
    fun podcastRepository() : PodcastRepository
}