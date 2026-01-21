package com.agilanbu.skillup.di

import com.agilanbu.skillup.presentation.viewmodel.AuthViewModel
import dagger.Subcomponent

@Subcomponent
interface SkillUpComponent {
    //    fun inject(frag: FragementName)
    fun inject(vm: AuthViewModel)
}