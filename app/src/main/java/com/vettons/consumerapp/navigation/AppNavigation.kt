package com.vettons.consumerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.vettons.consumerapp.modules.auth.AuthNavigation
import com.vettons.consumerapp.modules.auth.screens.*

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "authentication") {
        navigation(startDestination = "welcome", route="authentication") {
            composable("welcome") { WelcomeScreen(navController = navController) }
            composable("email") { EmailScreen() }
            composable("signInPassword") { SignInPasswordScreen() }
            composable("signUpName") { SignUpNameScreen() }
            composable("signUpPassword") { SignUpPasswordScreen() }
            composable("signUpPhoneNo") { SignUpPhoneNoScreen() }
            composable("signUpOtp") { SignUpOtpScreen() }
            composable("resetPassword") { ResetPasswordScreen() }
            composable("forgotPassword") { ForgotPasswordScreen() }
        }
    }
}